package com.api.rentcar.cars.domain.persistence;

import com.api.rentcar.cars.domain.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
