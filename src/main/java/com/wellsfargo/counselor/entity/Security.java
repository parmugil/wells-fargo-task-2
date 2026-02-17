package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityiD ;

    @Column(nullable = false)
    @ManyToMany
    @PrimaryKeyJoinColumn
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private String quantity;



}
