package com.example.android.breadit;

/**
 * Created by emmanuel on 7/5/18.
 */

public class Product {
    private int id;
    private String NameOfBakery, Address;
    private int map;
    private int image;

    public Product(String nameOfBakery, String address, int image, int map) {
        this.id = id;
        NameOfBakery = nameOfBakery;
        Address = address;
        this.map = map;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getNameOfBakery() {
        return NameOfBakery;
    }

    public String getAddress(){return Address;}

    public int getMap(){return map;}



    public int getImage() {
        return image;
    }
}
