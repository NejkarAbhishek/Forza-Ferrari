package com.zoomcar.backend.repository;

import com.zoomcar.backend.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {}