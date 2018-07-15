/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {
    /**
     * Udacity Earthquake App using RecyclerView
     *
     * thanks to sources:
     *      http://www.sanktips.com/2017/11/15/android-recyclerview-with-custom-adapter-example/
     *          - a simple RecyclerView with Custom Adatpre
     *      https://github.com/TheBaileyBrew/Angry_Nerds_Demo_Recycler
     *          - for code to get data from ItemData.getDataSource
     *
     *     JAVA Classes:
     *          EarthquakeActivity = main app that evokes recycler and displays data
     *          Item = structure of data - magnitude, place and data - all strings for simplicity
     *          ItemArrayAdapter = custom array adapter to 'hold' recycle data
     *          ItemData = actual 'database'
     *     XML
     *          earthquake_activity = RecyclerView
     *          list_item_view = TextViews of data
     */

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    List<Item> dataBase;  //earthquake records  - Item is class that defines data structure (schema)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);   //'root' XML with RecyclerView

        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setHasFixedSize(true);

        //define which type of layout to use - Linear, Grid etc..
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //call your custom class and return ArrayList data
        ItemData dataList = new ItemData();
        if (dataList.getDataSource() != null) {
            dataBase = dataList.getDataSource();
        } else {
            dataBase = new ArrayList<>();
        }

        adapter = new ItemArrayAdapter(this, dataBase);

        recyclerView.setAdapter(adapter);

    }
}