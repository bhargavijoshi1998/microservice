package com.example.order_service.service;

import com.example.order_service.dto.OrderRequest;
import com.example.order_service.dto.OrderlineItemsDto;
import com.example.order_service.model.Order;
import com.example.order_service.model.OrderlineItems;
import com.example.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
@Service
@RequiredArgsConstructor
public class OrderService {
    private  final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderlineItems> orderLineItems = orderRequest.getOrderlineItemsDtoList()

                .stream()
                .map( this::mapToDto)
                .toList();

        order.setOrderlineItemslist(orderLineItems);
        orderRepository.save(order);
    }

    private OrderlineItems mapToDto(OrderlineItemsDto orderlineItemsDto) {
    OrderlineItems orderLineItems = new OrderlineItems();
     orderLineItems.setPrice(orderlineItemsDto.getPrice());
      orderLineItems.setQuantity(orderLineItems.getQuantity());
        orderLineItems.setSkuCode(orderLineItems.getSkuCode());
      return orderLineItems;

}
    }
