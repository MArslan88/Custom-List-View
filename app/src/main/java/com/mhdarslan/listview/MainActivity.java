package com.mhdarslan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a arraylist of the type NameModel
        final ArrayList<NameModel> arrayList = new ArrayList<NameModel>();

        // add all the values from 1 to 15 to the arrayList
        // the items are of the type NameModel
        arrayList.add(new NameModel(R.mipmap.ic_launcher_round, "Muhammad", "Arslan"));


        // Now create the instance of the NameAdapter and pass
        // the context and arrayList created above
        NameAdapter nameArrayAdapter = new NameAdapter(this, arrayList);

        // create the instance of the ListView to set the nameArrayAdapter
        ListView mainListView = findViewById(R.id.mainListView);

        // set the nameArrayAdapter for ListView
        mainListView.setAdapter(nameArrayAdapter);
    }
}