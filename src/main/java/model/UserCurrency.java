package com.mati;

public class UserCurrency {
    private int id_usercurrency;
    private int id_currency;
    private double quantity;

    public UserCurrency(int id_usercurrency, int id_currency, double quantity) {
        this.id_usercurrency = id_usercurrency;
        this.id_currency = id_currency;
        this.quantity = quantity;
    }

    public int getId_usercurrency() {
        return id_usercurrency;
    }

    public void setId_usercurrency(int id_usercurrency) {
        this.id_usercurrency = id_usercurrency;
    }

    public int getId_currency() {
        return id_currency;
    }

    public void setId_currency(int id_currency) {
        this.id_currency = id_currency;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "UserCurrency{" +
                "id_usercurrency=" + id_usercurrency +
                ", id_currency=" + id_currency +
                ", quantity=" + quantity +
                '}';
    }
}
