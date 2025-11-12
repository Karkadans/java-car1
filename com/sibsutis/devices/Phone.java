package com.sibsutis.devices;

public class Phone { 
    private int id;
    private int price;
    private String ip;

    public Phone(int id, int price) {
        this.id = id;
        this.price = price;
    }
    public Phone(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    public String getDeviceType() {
        return "Phone";
    }
    @Override  
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Phone phone = (Phone) obj;
        return id == phone.id && 
               price == phone.price && 
               java.util.Objects.equals(ip, phone.ip);
    }
    @Override
    public int hashCode() { 
        return java.util.Objects.hash(id, price, ip);
    }
}
