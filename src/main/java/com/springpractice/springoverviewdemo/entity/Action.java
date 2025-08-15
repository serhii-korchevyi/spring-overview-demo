package com.springpractice.springoverviewdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="action")
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="round_id")
    private int roundId;
    
    @Column(name="action_id")
    private int actionId;
    
    @Column(name="action_type")
    private String actionType;
    
    @Column(name="amount")
    private Double amount;
    
    public Action(){}

    public Action(int roundId, int actionId, String actionType, Double amount) {
        this.roundId = roundId;
        this.actionId = actionId;
        this.actionType = actionType;
        this.amount = amount;
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

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", roundId=" + roundId +
                ", actionId=" + actionId +
                ", actionType='" + actionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
