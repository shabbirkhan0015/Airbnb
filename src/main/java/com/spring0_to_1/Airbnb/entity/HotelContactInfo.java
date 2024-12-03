package com.spring0_to_1.Airbnb.entity;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class HotelContactInfo {

    private String address;
    private String phoneNumber;
    private String email;
    private String location;

}
