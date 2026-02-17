package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    public long getPortfolioiD() {
        return portfolioiD;
    }

    public void setPortfolioiD(long portfolioiD) {
        this.portfolioiD = portfolioiD;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Id
    @GeneratedValue
    private long portfolioiD ;

    @Column(nullable = false)
    @ManyToMany
    @PrimaryKeyJoinColumn
    private long clientId;

    public Portfolio(long portfolioiD, long clientId, Date creationDate) {
        this.portfolioiD = portfolioiD;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    @Column(nullable = false)
    private Date creationDate;
}
