package com.example.inventoryservice.repository;

import com.example.inventory_service.module.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long>{
    Optional findByskuCode();
}
