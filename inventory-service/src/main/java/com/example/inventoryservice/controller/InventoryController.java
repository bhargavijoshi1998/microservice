package com.example.inventoryservice.controller;

import com.example.inventory_service.service.InventoryService;
import com.example.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController
    {
        private final InventoryService inventoryService;


        @GetMapping("/{sku-code}")
            @ResponseStatus(HttpStatus.OK)
            public boolean isInStock (@PathVariable("sku-code") String skuCode) {

                return inventoryService.isInstock(skuCode);
            }


    }

