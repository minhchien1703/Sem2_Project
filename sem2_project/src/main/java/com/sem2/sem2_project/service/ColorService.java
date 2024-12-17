package com.sem2.sem2_project.service;

import com.sem2.sem2_project.dto.request.ColorRequest;
import com.sem2.sem2_project.dto.response.ColorResponse;

import java.util.List;

public interface ColorService {

    public String saveColor(ColorRequest request);

    public String deleteColor(int id);

    public List<ColorResponse> getAllColors();
}
