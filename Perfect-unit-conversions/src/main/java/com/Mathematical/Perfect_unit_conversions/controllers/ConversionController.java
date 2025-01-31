package com.Mathematical.Perfect_unit_conversions.controllers;


import com.Mathematical.Perfect_unit_conversions.dtos.request.*;
import com.Mathematical.Perfect_unit_conversions.dtos.response.*;
import com.Mathematical.Perfect_unit_conversions.sevices.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")

public class ConversionController {

    @Autowired
    private ConversionService conversionService;


    @PostMapping("/length-conversion")
    public ResponseEntity<?> lengthConversion(@RequestBody CalculateLengthRequest request){
        try{
            CalculateLengthResponse response = conversionService.calculateLength(request);
            System.out.println("Received Request: " + request.getConvertFrom() + " to " + request.getConvertTo() + " value: " + request.getEntryValue());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            System.err.println("Unexpected Error: " + e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/area-conversions")
    public ResponseEntity<?> areaConversion(@RequestBody CalculateAreaRequest request){
        try{
            CalculateAreaResponse response = conversionService.calculateArea(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/volume-conversions")
    public ResponseEntity<?> volumeConversion(@RequestBody CalculateVolumeRequest request){
        try{
            CalculateVolumeResponse response = conversionService.calculateVolume(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/time-conversions")
    public ResponseEntity<?> timeConversion(@RequestBody CalculateTimeRequest request){
        try{
            CalculateTimeResponse response = conversionService.calculateTime(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/temperature-conversions")
    public ResponseEntity<?> temperatureConversion(@RequestBody CalculateTemperatureRequest request){
        try{
            CalculateTemperatureResponse response = conversionService.calculateTemperature(request);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
