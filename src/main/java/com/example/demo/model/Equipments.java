package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "equipments", schema = "public")
public class Equipments {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "equipment_name")
    private String equipmentName;

    @Column(name = "desc")
    private String desc;

    @Column(name = "status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "type_id", insertable = false, updatable = false)
    private Types type;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Users user;
}