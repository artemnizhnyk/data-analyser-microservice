package com.artemnizhnyk.dataanalysismicroservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "data")
@Entity
public class Data extends BaseEntity {

    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MeasurementType measurementType;

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }

}
