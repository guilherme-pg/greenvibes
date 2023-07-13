package com.gvmmpg.greenvibes.domain.product;

import jakarta.persistence.*;

import java.sql.Blob;

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
    private Double product_price;
    private Integer product_stock;
    // @Lob
    // private Blob product_image;

    public Product(ProductRegister data) {
        this.product_name = data.product_name();
        this.product_type = data.product_type();
        this.product_materials = data.product_materials();
        this.product_dimensions = data.product_dimensions();
        this.product_model = data.product_model();
        this.product_year = data.product_year();
        this.product_weight = data.product_weight();
        this.product_description = data.product_description();
        this.product_price = data.product_price();
        this.product_stock = data.product_stock();
        // this.product_image = data.product_image();
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
                ", product_price=" + product_price +
                ", product_stock=" + product_stock +
                '}';
    }

    // GETTERS
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
    public Double getProduct_price() {
        return product_price;
    }
    public Integer getProduct_stock() {
        return product_stock;
    }
    // public Blob getProduct_image() {return product_image;}

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
    public void setProduct_materials(String product_materials) {
        this.product_materials = product_materials;
    }
    public void setProduct_dimensions(String product_dimensions) {
        this.product_dimensions = product_dimensions;
    }
    public void setProduct_model(String product_model) {
        this.product_model = product_model;
    }
    public void setProduct_year(Integer product_year) {
        this.product_year = product_year;
    }
    public void setProduct_weight(Integer product_weight) {
        this.product_weight = product_weight;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }
    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }
    // public void setProduct_image(Blob product_image) {this.product_image = product_image;}
}
