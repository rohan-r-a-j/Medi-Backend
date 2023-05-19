package com.emedical.springboot.emedical.dto;
/*
Code by Team A of Java3-
Rohan, Vidisha, Yash, Kunal, Shivam, Anmol
*/
import com.emedical.springboot.emedical.entity.Address;
import com.emedical.springboot.emedical.entity.Customer;
import com.emedical.springboot.emedical.entity.Order;
import com.emedical.springboot.emedical.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private  Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
