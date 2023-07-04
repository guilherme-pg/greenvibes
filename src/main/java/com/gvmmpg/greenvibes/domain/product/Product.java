package com.gvmmpg.greenvibes.domain.product;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product_name;
    private String product_type;
    private String product_materials;
    private String product_dimensions;
    private String product_model;
    private Integer product_year;
    private Integer product_weight;
    private String product_description;
    // private FOTO product_photo;

    public Product(ProductRegister data) {
        this.product_name = data.product_name();
        this.product_type = data.product_type();
        this.product_materials = data.product_materials();
        this.product_dimensions = data.product_dimensions();
        this.product_model = data.product_model();
        this.product_year = data.product_year();
        this.product_weight = data.product_weight();
        this.product_description = data.product_description();
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_name='" + product_name + '\'' +
                ", product_type='" + product_type + '\'' +
                ", product_materials='" + product_materials + '\'' +
                ", product_dimensions='" + product_dimensions + '\'' +
                ", product_model='" + product_model + '\'' +
                ", product_year=" + product_year +
                ", product_weight=" + product_weight +
                ", product_description='" + product_description + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }
    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public String getProduct_materials() {
        return product_materials;
    }

    public String getProduct_dimensions() {
        return product_dimensions;
    }

    public String getProduct_model() {
        return product_model;
    }

    public Integer getProduct_year() {
        return product_year;
    }

    public Integer getProduct_weight() {
        return product_weight;
    }

    public String getProduct_description() {
        return product_description;
    }
}
