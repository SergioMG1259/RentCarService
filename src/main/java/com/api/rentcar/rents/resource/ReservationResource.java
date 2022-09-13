package com.api.rentcar.rents.resource;

import com.api.rentcar.cars.resource.CarResource;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationResource {
    private Long id;
    private Date reserveDate;
    private Date returnDate;
    private Double mount;
    private int status;
    private CarResource car;
}
