package com.emedical.springboot.emedical.dto;

/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/
// using this class to send back a java object as JSON

import lombok.Data;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;
}
