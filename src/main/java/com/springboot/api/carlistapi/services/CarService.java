package com.springboot.api.carlistapi.services;

import com.springboot.api.carlistapi.models.dto.CarResult;
import com.springboot.api.carlistapi.repositories.CarRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRespository carRespository;

    public List<CarResult> getAllCars(){
        return carRespository.findAll()
                .stream()
                .map(CarResult::from)
                .collect(Collectors.toList());
    }
}
