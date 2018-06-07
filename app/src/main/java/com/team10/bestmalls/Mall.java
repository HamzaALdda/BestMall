package com.team10.bestmalls;

public class Mall {

    private int id;
    private String title;
    private String descripton;
    private String state;
    private String city;
    private int zip;
    private String adress;
    private int image;
    private double latitude;
    private double longitude;

    public Mall(int id, String title, String descripton, String state, String city, int zip, String adress, int image, double latitude, double longitude) {
        this.id = id;
        this.title = title;
        this.descripton = descripton;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.adress = adress;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescripton() {
        return descripton;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public String getAdress() {
        return adress;
    }

    public int getImage() {
        return image;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }



}
