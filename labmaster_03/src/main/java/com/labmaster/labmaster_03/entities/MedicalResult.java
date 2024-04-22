package com.labmaster.labmaster_03.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "med_results")
@Data
public class MedicalResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String testType;
    private String result;

    private LocalDateTime dateTime;

}
