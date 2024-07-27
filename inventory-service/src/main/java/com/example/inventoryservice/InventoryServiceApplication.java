package com.example.inventoryservice;

import com.example.inventory_service.module.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class InventoryServiceApplication {

	public static void main(String[] args) {SpringApplication.run(InventoryServiceApplication.class,args);
    @Bean

        public CommandLineRunner loadData(InventoryRepository inevntoryRepository) {
            return  arg -> {
                Inventory inventory = new Inventory();
                inventory.setSkucode("iphone_13");
                inventory.setQuantity(100);

                Inventory inventory1 = new Inventory();
                inventory1.setSkucode("iphone_13_red");
                inventory1.setQuantity(10);


                inventoryRepository.save(inventory);
                inventoryRepository.save(inventory1);


            };

        }

    }


