package com.example.dell.recycler;

/**
 * Created by dell on 2018/3/28 0028.
 */

public class Square {
    private String name;
    private int imageid;
    private String address;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Square(String name, int imageid, String address, int price) {
        this.name = name;
        this.imageid = imageid;
        this.address = address;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Square(String name, int imageid, String address) {

        this.name = name;
        this.imageid = imageid;
        this.address = address;
    }

    public Square(String name, int imageid){
        this.name=name;
        this.imageid=imageid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
