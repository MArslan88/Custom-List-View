package com.mhdarslan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        arrayList.add(new NameModel(R.mipmap.ic_launcher_round, "Danish", "Nisar"));
        arrayList.add(new NameModel(R.mipmap.ic_launcher_round, "Tanzeel", "Khalique"));
        arrayList.add(new NameModel(R.mipmap.ic_launcher_round, "Noman", "Mukhtar"));


        // Now create the instance of the NameAdapter and pass
        // the context and arrayList created above
        NameAdapter nameArrayAdapter = new NameAdapter(this, arrayList);

        // create the instance of the ListView to set the nameArrayAdapter
        ListView mainListView = findViewById(R.id.mainListView);

        // set the nameArrayAdapter for ListView
        mainListView.setAdapter(nameArrayAdapter);

        // item click listener
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String fName = arrayList.get(position).getFirstNameText().toString();
                String sName = arrayList.get(position).getSecondNameText().toString();
                Toast.makeText(MainActivity.this,fName+ " " +sName , Toast.LENGTH_SHORT).show();
            }
        });
    }
}