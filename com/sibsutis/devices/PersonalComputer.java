package com.sibsutis.devices;

public class PersonalComputer {
    private int id;
    private int price;
    private String ip;

    public PersonalComputer(int id, int price) {
        this.id = id;
        this.price = price;
    }
    public PersonalComputer(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    public String getDeviceType() {
        return "PersonalComputer";
    }
    @Override 
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonalComputer pc = (PersonalComputer) obj;
        return id == pc.id && 
               price == pc.price && 
               java.util.Objects.equals(ip, pc.ip);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, price, ip);
    }
}
