package com.example.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Vacation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long countryId;
    
    @Column(name = "package_price")
    private String;

    @Column(name = "party_size")
    private String;

    @Column(name = "status")
    private BigDecimal;

    @Column(name = "order_tracking_number")
    private String;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date;

    @Column(name = "last_update")
    private Date;

    @OneToMany(mappedBy = "vacation", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems = new HashSet<>();

    @OneToMany(mappedBy = "vacation", cascade = CascadeType.ALL)
    private Set<Excursion> excursions = new HashSet<>();

}
