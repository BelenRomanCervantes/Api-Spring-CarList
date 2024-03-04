package com.springboot.api.carlistapi.controllers;

import com.springboot.api.carlistapi.models.dto.CarResult;
import com.springboot.api.carlistapi.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    public final CarService carService;

    @GetMapping
    public List<CarResult> getAllCars(){
        return carService.getAllCars();
    }
}
