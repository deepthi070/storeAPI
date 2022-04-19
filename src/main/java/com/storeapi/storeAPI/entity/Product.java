package com.storeapi.storeAPI.entity;

import javax.persistence.*;


@Entity
@Table(name = "productapi")
public class Product {

    @Id
    @Column(name = "p_name")
    private String prodName;
    @Column(name = "p_price")
    private Integer prodPrice;
    @Column(name = "p_quantity")
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="catId")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product() {
    }

    public Product(String prodName, Integer prodPrice, Integer quantity, Category category) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.quantity = quantity;
        this.category = category;
    }


}
