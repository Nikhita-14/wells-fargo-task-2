package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    // No-args constructor for JPA
    protected Portfolio() {}

    // Parameterized constructor
    public Portfolio(String name, String description, Client client) {
        this.name = name;
        this.description = description;
        this.client = client;
    }

    // Getters and Setters
    public Long getPortfolioId() { return portfolioId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}
