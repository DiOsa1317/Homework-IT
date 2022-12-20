package com.samsung.model;

public class Character {
public double balance=0.5;
public int reputation=10;
public int health = 35;

    public double getBalance() {
        return balance;
    }

    public int getReputation() {
        return reputation;
    }

    public int getHealth() {
        return health;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
