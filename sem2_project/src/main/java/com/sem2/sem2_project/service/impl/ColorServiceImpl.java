package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.ColorRequest;
import com.sem2.sem2_project.dto.response.ColorResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Color;
import com.sem2.sem2_project.repository.ColorRepository;
import com.sem2.sem2_project.service.ColorService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ColorServiceImpl implements ColorService {
    private final ColorRepository colorRepository;

    @Override
    public String saveColor(ColorRequest request) {
        Color color = BasicMapper.INSTANCE.mapToColor(request);
        colorRepository.save(color);
        return "Saved";
    }

    @Override
    public String deleteColor(int id) {
        Color color = colorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No color found"));
        colorRepository.delete(color);
        return "Deleted";
    }
    @Override
    public List<ColorResponse> getAllColors() {
        List<Color> colors = colorRepository.findAll();
        return BasicMapper.INSTANCE.toColorResponseList(colors);
    }
}
