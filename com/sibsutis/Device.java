package com.sibsutis;

public abstract class Device {
    private int id;
    private int price;
    private String ip;

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
    public String getIp() {
        return ip;
    }
    public String print() {
        return "id: " + id + ", price: " + price + ", ip: " + ip;
    }
    public String getDeviceType() {
        return "Device"; 
    }
}