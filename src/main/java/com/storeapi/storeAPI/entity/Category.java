package com.storeapi.storeAPI.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoryapi")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")
    private Integer catId;

    @Column(name = "c_name")
    private String catName;

    @Column(name = "c_desc")
    private String catDesc;

    @Column(name = "archive")
    private boolean archive;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> product;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public Category() {
    }

    public Category(Integer catId, String catName, String catDesc, boolean archive, List<Product> product) {
        this.catId = catId;
        this.catName = catName;
        this.catDesc = catDesc;
        this.archive = archive;
        this.product = product;
    }
}
