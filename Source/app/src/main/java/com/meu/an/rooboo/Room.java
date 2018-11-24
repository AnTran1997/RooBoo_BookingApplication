package com.meu.an.rooboo;

/**
 * Created by Admin on 11/23/2018.
 */

public class Room {
    private String address;
    private int imageHotel;
    private String nameHotel;
    private String price;
    private String comment;
    private String bed;
    private String bath;

    public Room(String address, int imageHotel, String nameHotel, String price, String comment, String bed, String bath) {
        this.address = address;
        this.imageHotel = imageHotel;
        this.nameHotel = nameHotel;
        this.price = price;
        this.comment = comment;
        this.bed = bed;
        this.bath = bath;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageHotel() {
        return imageHotel;
    }

    public void setImageHotel(int imageHotel) {
        this.imageHotel = imageHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }
}
