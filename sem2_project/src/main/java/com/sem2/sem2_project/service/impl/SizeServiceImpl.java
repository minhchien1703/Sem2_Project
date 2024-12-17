package com.sem2.sem2_project.service.impl;

import com.sem2.sem2_project.dto.request.SizeRequest;
import com.sem2.sem2_project.dto.response.SizeResponse;
import com.sem2.sem2_project.mappper.BasicMapper;
import com.sem2.sem2_project.model.Size;
import com.sem2.sem2_project.repository.SizeRepository;
import com.sem2.sem2_project.service.SizeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {
    private final SizeRepository sizeRepository;

    public SizeServiceImpl(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    @Override
    public String saveSize(SizeRequest request) {
        Size size = BasicMapper.INSTANCE.mapToSize(request);
        sizeRepository.save(size);
        return "Saved";
    }

    @Override
    public String deleteSize(int id) {
        Size size = sizeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Size not found"));
        sizeRepository.delete(size);
        return "Deleted";
    }

    @Override
    public List<SizeResponse> getAllSizes() {
        List<Size> sizes = sizeRepository.findAll();
        return BasicMapper.INSTANCE.toSizeResponseList(sizes);
    }
}
