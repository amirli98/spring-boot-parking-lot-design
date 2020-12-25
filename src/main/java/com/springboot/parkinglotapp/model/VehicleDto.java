package com.springboot.parkinglotapp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class VehicleDto {

    @Id
    @Column
    private Long id;

    @Column
    private String vehicleNumber;

    @Column
    private String ownerName;
}
