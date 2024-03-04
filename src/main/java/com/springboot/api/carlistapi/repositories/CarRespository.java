package com.springboot.api.carlistapi.repositories;

import com.springboot.api.carlistapi.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRespository extends JpaRepository<Car, Long> {
}
