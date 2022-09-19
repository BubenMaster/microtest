package com.yoj.awsapp.microtest.order;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
//@Table(name = "shipping_addresses")
public class PhysicalAddress {
    // TODO: 19.09.2022 bind to a table

 //   @Column(name = "city")
    private String city;

  //  @Column(name = "street")
    private String street;

  //  @Column(name = "house")
    private int house;

 //   @Column(name = "apartment")
    private int apartment;
}
