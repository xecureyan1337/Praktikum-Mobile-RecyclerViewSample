package com.example.recyclerviewsample;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewsample.R;

import java.util.ArrayList;

import lat.pam.recyclerviewsample.CustomAdapter;
import lat.pam.samplerecyclerview.ItemsViewModel;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting the RecyclerView by its ID
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // This creates a vertical layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // ArrayList of class ItemsViewModel
        ArrayList<ItemsViewModel> data = new ArrayList<>();

        // This loop will create 20 views containing the image with the count of view
        for (int i = 1; i <= 20; i++) {
            data.add(new ItemsViewModel("Item " + i));
        }

        // This will pass the ArrayList to our Adapter
        CustomAdapter adapter = new CustomAdapter(data);
        Log.d("test string", "Jumlah data: " + data.size());

        // Setting the Adapter with the RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
