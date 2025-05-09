package com.data.java_web_session04.Ex08;

public class Revenue {
    private String month;
    private double amount;

    public Revenue(String month, double amount) {
        this.month = month;
        this.amount = amount;
    }

    public String getMonth() { return month; }
    public double getAmount() { return amount; }
}