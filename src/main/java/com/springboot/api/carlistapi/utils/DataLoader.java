package com.springboot.api.carlistapi.utils;

import com.springboot.api.carlistapi.models.Car;
import com.springboot.api.carlistapi.repositories.CarRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.context.CompilationAndWeavingContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataLoader implements CommandLineRunner {

    private final CarRespository carRespository;
    @Override
    public void run(String... args) throws Exception {
        log.info("Loading data...");

        carRespository.saveAll(getCarList());

        log.info("Data loaded!");
    }

    private List<Car> getCarList() {

        var car1 = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .year(1967)
                .build();

        var car2 = Car.builder()
                .brand("Ford")
                .model("Fusion")
                .year(2019)
                .build();

        var car3 = Car.builder()
                .brand("Chevrolet")
                .model("Camaro")
                .year(1969)
                .build();

        var car4 = Car.builder()
                .brand("Chevrolet")
                .model("Cruze")
                .year(2019)
                .build();

        return List.of(car1, car2, car3, car4);
    }
}
