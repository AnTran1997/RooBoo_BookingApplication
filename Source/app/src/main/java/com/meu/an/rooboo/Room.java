package com.meu.an.rooboo;

/**
 * Created by Admin on 11/23/2018.
 */

public class Room {
    // địa chỉ, ảnh bìa, tên, giá tiền, số người bình luận, tiện ích 1, tiện ích 2, tiện ích 3, tiện ích 4, tiện ích 5, số tiện ích 5, tiện ích 6, số tiện ích 6)

    private String address;
    private int imageHotel;
    private String nameHotel;
    private String price;
    private String comment;
    private int tienich1;
    private int tienich2;
    private int tienich3;
    private int tienich4;
    private int tienich5;
    private String bed;
    private int tienich6;
    private String bath;
    private String txtRating;
    private double rating;

    public Room(String address, int imageHotel, String nameHotel, String price, String comment, int tienich1, int tienich2, int tienich3, int tienich4, int tienich5, String bed, int tienich6, String bath, String txtRating, double rating) {
        this.address = address;
        this.imageHotel = imageHotel;
        this.nameHotel = nameHotel;
        this.price = price;
        this.comment = comment;
        this.tienich1 = tienich1;
        this.tienich2 = tienich2;
        this.tienich3 = tienich3;
        this.tienich4 = tienich4;
        this.tienich5 = tienich5;
        this.bed = bed;
        this.tienich6 = tienich6;
        this.bath = bath;
        this.txtRating = txtRating;
        this.rating = rating;
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

    public int getTienich1() {
        return tienich1;
    }

    public void setTienich1(int tienich1) {
        this.tienich1 = tienich1;
    }

    public int getTienich2() {
        return tienich2;
    }

    public void setTienich2(int tienich2) {
        this.tienich2 = tienich2;
    }

    public int getTienich3() {
        return tienich3;
    }

    public void setTienich3(int tienich3) {
        this.tienich3 = tienich3;
    }

    public int getTienich4() {
        return tienich4;
    }

    public void setTienich4(int tienich4) {
        this.tienich4 = tienich4;
    }

    public int getTienich5() {
        return tienich5;
    }

    public void setTienich5(int tienich5) {
        this.tienich5 = tienich5;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public int getTienich6() {
        return tienich6;
    }

    public void setTienich6(int tienich6) {
        this.tienich6 = tienich6;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getTxtRating() {
        return txtRating;
    }

    public void setTxtRating(String txtRating) {
        this.txtRating = txtRating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
