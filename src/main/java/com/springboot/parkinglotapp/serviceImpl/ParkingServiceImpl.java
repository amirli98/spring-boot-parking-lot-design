package com.springboot.parkinglotapp.serviceImpl;

import com.springboot.parkinglotapp.model.VehicleDto;
import com.springboot.parkinglotapp.repository.ParkingLotRepository;
import com.springboot.parkinglotapp.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParkingServiceImpl implements ParkingService {
    @Autowired
    ParkingLotRepository repository;


    @Override
    public List<VehicleDto> getAllVehicles() {
        return repository.findAll();
    }

    @Override
    public String park(VehicleDto vehicleDto) {
        if(vehicleDto.getId()>0 && vehicleDto.getId()<10)
            repository.save(vehicleDto);
        else
            throw new IllegalArgumentException("Provide id between 1 and 10");
        return "Parked";
    }

    @Override
    public String unPark(Long id) {
        if(id>0 && id<10)
            repository.deleteById(id);
        else
            throw new IllegalArgumentException("Provide id between 1 and 10");
        return "Unparked";
    }
}
