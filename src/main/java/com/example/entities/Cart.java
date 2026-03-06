package com.example.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "carts")
@Getter
@Setter
public class Cart {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long countryId;
    
    @Column(name = "package_price")
    private String country;

    @Column(name = "party_size")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "status")
    @UpdateTimestamp
    private Date lastUpdate;

    @Column(name = "order_tracking_number")
    private;

    @Column(name = "create_date")
    private;

    @Column(name = "last_update")
    private;

    @Column(name = "customer_id")
    private;
}
