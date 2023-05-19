package com.emedical.springboot.emedical.service;

import com.emedical.springboot.emedical.dao.CustomerRepository;
import com.emedical.springboot.emedical.dto.Purchase;
import com.emedical.springboot.emedical.dto.PurchaseResponse;
import com.emedical.springboot.emedical.entity.Customer;
import com.emedical.springboot.emedical.entity.Order;
import com.emedical.springboot.emedical.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements  CheckoutService {

    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve the order info from dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        // populate order with order items
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        // populate order with billing and shipping address
order.setBillingAddress(purchase.getBillingAddress());
order.setShippingAddress(purchase.getShippingAddress());

        // populate customer with order
Customer customer = purchase.getCustomer();
customer.add(order);

        // save to the databse
customerRepository.save(customer);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);
    }

   // We want a unique id that is hard to guess and random
    private String generateOrderTrackingNumber() {
// Standardized methods for generating unique IDs for our order tracking number
        // generate a random UUID(Universally Unique IDentifer) number
return UUID.randomUUID().toString();

    }
}
