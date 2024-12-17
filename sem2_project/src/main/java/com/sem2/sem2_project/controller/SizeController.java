package com.sem2.sem2_project.controller;

import com.sem2.sem2_project.dto.request.SizeRequest;
import com.sem2.sem2_project.dto.response.SizeResponse;
import com.sem2.sem2_project.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/size")
@RequiredArgsConstructor
public class SizeController {
    private final SizeService sizeService;

    @PostMapping("/save")
    public String saveSize(@RequestBody SizeRequest request){
        return sizeService.saveSize(request);
    }

    @DeleteMapping("/del")
    public String deleteSize(@RequestParam int id){
        return sizeService.deleteSize(id);
    }

    @GetMapping
    public ResponseEntity<List<SizeResponse>> getAllSizes(){
        return ResponseEntity.ok(sizeService.getAllSizes());
    }

}
