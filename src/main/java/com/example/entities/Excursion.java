package com.example.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Excursion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long countryId;
    
    @Column(name = "package_price")
    private String;

    @Column(name = "party_size")
    private BigDecimal;

    @Column(name = "order_tracking_number")
    private String;

    @Column(name = "create_date")
    private Date;

    @Column(name = "last_update")
    private Date;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    private Set<CartItem> cartItems = new HashSet<>();
    

}
