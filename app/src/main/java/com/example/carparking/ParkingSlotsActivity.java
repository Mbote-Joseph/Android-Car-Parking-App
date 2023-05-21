package com.example.carparking;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class ParkingSlotsActivity extends AppCompatActivity {

    private RecyclerView parkingSlotsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_slots);

        parkingSlotsRecyclerView = findViewById(R.id.parkingSlotsRecyclerView);

        // Set up the RecyclerView with a LinearLayoutManager and adapter
        parkingSlotsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ParkingSlotsAdapter adapter = new ParkingSlotsAdapter();
        parkingSlotsRecyclerView.setAdapter(adapter);

        // You need to implement the logic to fetch available parking slots and set the data to the adapter
    }
}
