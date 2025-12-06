package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne(optional = false)
    @JoinColumn(name="clientId")
    private Client client;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    // constructors
    protected Portfolio () {}

    public Portfolio (Client client, LocalDateTime creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    // getters and setters

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
