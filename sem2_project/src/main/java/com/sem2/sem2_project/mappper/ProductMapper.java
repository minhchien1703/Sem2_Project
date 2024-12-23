package com.sem2.sem2_project.mappper;

import com.sem2.sem2_project.dto.request.ProductRequest;
import com.sem2.sem2_project.dto.response.ProductResponse;
import com.sem2.sem2_project.model.*;
import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.repository.*;
import jakarta.annotation.PostConstruct;
import lombok.Setter;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Mapper(componentModel = "spring")
@Setter
public abstract class ProductMapper {
    CategoryRepository categoryRepository;
    SizeRepository sizeRepository;
    ColorRepository colorRepository;
    MaterialRepository materialRepository;
    RoomRepository roomRepository;
    ImageRepository imageRepository;
    private static ProductMapper INSTANCE ;

    @Autowired
    public void setCategory(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Autowired
    public void setSizeRepository(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    @Autowired
    public void setColorRepository(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @Autowired
    public void setMaterialRepository(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @Autowired
    public void setRoomRepository(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Autowired
    public void setImageRepository(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @PostConstruct // After Spring initialization
    public void storeStaticInstance() {
        INSTANCE = this; // Store the Spring-managed instance
    }

    public static ProductMapper getInstance() {
        return INSTANCE;
    }

    @Mapping(target="category", source = "categoryId", qualifiedByName = "mapCategory")
    @Mapping(target="size", source = "sizeId", qualifiedByName = "mapSize")
    @Mapping(target="color", source = "colorId", qualifiedByName = "mapColor")
    @Mapping(target="material", source = "materialId", qualifiedByName = "mapMaterial")
    @Mapping(target="rooms", source = "roomsIds", qualifiedByName = "mapRooms")
    public abstract Product toProduct(ProductRequest productRequest);

    @Mapping(target="category", source = "categoryId", qualifiedByName = "mapCategory")
    @Mapping(target="size", source = "sizeId", qualifiedByName = "mapSize")
    @Mapping(target="color", source = "colorId", qualifiedByName = "mapColor")
    @Mapping(target="material", source = "materialId", qualifiedByName = "mapMaterial")
    @Mapping(target="rooms", source = "roomsIds", qualifiedByName = "mapRooms")
    public abstract Product updateProductFromDto(ProductRequest productRequest, @MappingTarget Product product);

    public abstract ProductResponse toProductResponse (Product product);

    public abstract List<ProductResponse> toProductResponseList(List<Product> productList);

    @Named("mapCategory")
    Category mapCategory(int categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Category not found with id"+categoryId));
    }

    @Named("mapSize")
    Size mapSize(int sizeId) {
        return sizeRepository.findById(sizeId).orElseThrow(() -> new RuntimeException("Size not found "));
    }

    @Named("mapColor")
    Color mapColor(int colorId) {
        return colorRepository.findById(colorId).orElseThrow(() -> new RuntimeException("Color not found"));
    }

    @Named("mapMaterial")
    Material mapMaterial(int materialId) {
        return materialRepository.findById(materialId).orElseThrow(() -> new RuntimeException("Material not found"));
    }

    @Named("mapRooms")
    Set<Room> mapRooms(List<Integer> roomsIds) {
        Set<Room> rooms = new HashSet<>();
        for (int roomId : roomsIds) {
            Room room = roomRepository.findById(roomId).orElseThrow(() -> new RuntimeException("Room not found with id: " + roomId));
            rooms.add(room);
        }
        return rooms;
    }




}
