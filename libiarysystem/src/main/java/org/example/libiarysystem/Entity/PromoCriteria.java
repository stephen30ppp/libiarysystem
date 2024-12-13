package org.example.libiarysystem.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "promo_criteria")
@Data
public class PromoCriteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String conditionType;
    private String conditionValue;

    @ManyToOne
    @JoinColumn(name = "promo_id", nullable = false)
    private Promo promo;
}
