package com.devsuperior.desafio.componentesinjecaodependencia.services;

import com.devsuperior.desafio.componentesinjecaodependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shippingService.shipment(order);
    }

}
