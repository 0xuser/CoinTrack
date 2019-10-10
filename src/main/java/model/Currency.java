package com.mati;

public class Currency {
    private int id_currency;
    private String symbol;
    private String name;
    private double price;
    private double marketcap;
    private double volume;
    private double change;

    public Currency(int id_currency, String symbol, String name, double price, double marketcap, double volume, double change) {
        this.id_currency = id_currency;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.marketcap = marketcap;
        this.volume = volume;
        this.change = change;
    }

    public int getId_currency() {
        return id_currency;
    }

    public void setId_currency(int id_currency) {
        this.id_currency = id_currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(double marketcap) {
        this.marketcap = marketcap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id_currency=" + id_currency +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", marketcap=" + marketcap +
                ", volume=" + volume +
                ", change=" + change +
                '}';
    }
}
