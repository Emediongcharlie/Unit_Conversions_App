package com.Mathematical.Perfect_unit_conversions.controllers;


import com.Mathematical.Perfect_unit_conversions.dtos.request.CalculateLengthRequest;
import com.Mathematical.Perfect_unit_conversions.dtos.response.CalculateLengthResponse;
import com.Mathematical.Perfect_unit_conversions.sevices.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ConversionController {

    @Autowired
    private ConversionService conversionService;


    @PostMapping("/length-conversion")
    public ResponseEntity<?> lengthConversion(@RequestBody CalculateLengthRequest request){
        try{
            CalculateLengthResponse response = conversionService.calculateLength(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
