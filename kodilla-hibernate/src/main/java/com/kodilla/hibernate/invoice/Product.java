package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product {
    private int Id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Id
    @Column(name = "product_id", unique = true)
    @GeneratedValue
    @NotNull
    public int getId() {
        return Id;
    }

    @Column(name = "name")
    @NotNull
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }
}
