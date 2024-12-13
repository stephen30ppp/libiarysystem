package org.example.libiarysystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    private BigDecimal price;
    private Integer stockQuantity;
    private Integer restockThreshold;
    private Boolean isDeleted;
}
