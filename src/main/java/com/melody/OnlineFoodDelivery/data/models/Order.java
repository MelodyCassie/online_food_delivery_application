package com.melody.OnlineFoodDelivery.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User customer;
    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;
    private String totalAmount;
    private String orderStatus;
    private Date createDate;
    @ManyToOne
    private Address deliverAddress;
    @OneToMany
    private List<OrderItem> items;
//    private Payment payment;
    private int totalItem;
    private int totalPrice;



}
