package com.example.demo.repository;

import com.example.demo.model.Equipments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipmentRepository extends JpaRepository<Equipments, Long> {
    Optional<Equipments> findByUserAndStatus(String user, Boolean status);
}
