package com.example.order_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="t_order_line_items")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderlineItems {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;



}
