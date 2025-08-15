package com.springpractice.springoverviewdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="round")
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="round_id")
    private int roundId;

    @Column(name="amount")
    private Double amount;

    public Round(int roundId, Double amount) {
        this.roundId = roundId;
        this.amount = amount;
    }

    public Round() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Round{" +
                "id=" + id +
                ", roundId=" + roundId +
                ", amount=" + amount +
                '}';
    }
}
