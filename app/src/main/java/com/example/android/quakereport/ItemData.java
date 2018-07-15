package com.example.android.quakereport;

import java.util.ArrayList;

import javax.sql.DataSource;

public class ItemData extends ArrayList<Item> {

    private ArrayList<Item> DataSource = new ArrayList<>();
    // Initializing list view with the custom adapter
    // Create a fake list of earthquake locations.


    public ArrayList<Item> getDataSource() {
        DataSource.add(new Item("1.0", "San Francisco", "06/09/2020"));
        DataSource.add(new Item("1.0", "London", "06/09/2020"));
        DataSource.add(new Item("1.0", "Tokyo", "06/09/2020"));
        DataSource.add(new Item("1.0", "Mexico City", "06/09/2020"));
        DataSource.add(new Item("1.0", "Rio de Janeiro", "06/09/2020"));
        DataSource.add(new Item("1.0", "Paris", "06/09/2020"));
        DataSource.add(new Item("1.0", "San Francisco", "06/09/2020"));
        DataSource.add(new Item("1.0", "London", "06/09/2020"));
        DataSource.add(new Item("1.0", "Tokyo", "06/09/2020"));
        DataSource.add(new Item("1.0", "Mexico City", "06/09/2020"));
        DataSource.add(new Item("1.0", "Rio de Janeiro", "06/09/2020"));
        DataSource.add(new Item("1.0", "Paris", "06/09/2020"));
        return DataSource;
    }
}