package com.hospitalmanagement.assetmanagement.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_LIST")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity;
    private String buyTime;

    @JsonProperty("isWorking")
    private boolean isWorking;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
}
