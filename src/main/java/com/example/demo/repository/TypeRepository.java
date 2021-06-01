package com.example.demo.repository;

import com.example.demo.model.Types;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Types, Long> {
    Optional<Types> findByTypeName(String typeName);
}
