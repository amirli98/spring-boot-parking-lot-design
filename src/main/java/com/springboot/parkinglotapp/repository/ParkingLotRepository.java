package com.springboot.parkinglotapp.repository;

import com.springboot.parkinglotapp.model.VehicleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ParkingLotRepository extends JpaRepository<VehicleDto, Serializable> {

}
