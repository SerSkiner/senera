package com.ua.senera.model;

public class Review {

    private String name;
    private String city;
    private String text;

    public Review(String name, String city, String text) {
        this.name = name;
        this.city = city;
        this.text = text;
    }

    public Review() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



}
