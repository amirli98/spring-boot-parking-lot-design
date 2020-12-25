package com.springboot.parkinglotapp.service;

import com.springboot.parkinglotapp.model.VehicleDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  interface ParkingService {
    public  List<VehicleDto> getAllVehicles();
    public  String park(VehicleDto vehicleDto);
    public abstract String unPark(Long id);
}
