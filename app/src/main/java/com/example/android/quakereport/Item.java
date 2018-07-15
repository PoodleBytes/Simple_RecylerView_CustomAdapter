package com.example.android.quakereport;

public class Item {

    private String Mag;
    private String Place;
    private String Date;

    public Item(String Mag, String Place, String Date) {
        this.Mag = Mag;
        this.Place = Place;
        this.Date = Date;
    }

    public String getMag() {
        return Mag;
    }

    public String getPlace() {
        return Place;
    }

    public String getDate() {
        return Date;
    }
}
