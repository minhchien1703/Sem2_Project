package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.SizeRequest;
import com.sem2.sem2_project.dto.response.SizeResponse;

import java.util.List;

public interface SizeService {
    String saveSize(SizeRequest request);

    String deleteSize(int id);

    List<SizeResponse> getAllSizes();
}
