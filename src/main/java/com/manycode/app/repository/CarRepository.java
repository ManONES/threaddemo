package com.manycode.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manycode.app.model.Car;

public interface CarRepository  extends JpaRepository<Car, Long> {

}
