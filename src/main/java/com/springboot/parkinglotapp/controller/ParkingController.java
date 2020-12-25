package com.springboot.parkinglotapp.controller;


import com.springboot.parkinglotapp.model.VehicleDto;
import com.springboot.parkinglotapp.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parkinglot")
public class ParkingController {


   private final ParkingService parkingService;

   @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping(value = "/parkingInfo",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<VehicleDto> getAllVehicles()
    {
        return parkingService.getAllVehicles();
    };
}
