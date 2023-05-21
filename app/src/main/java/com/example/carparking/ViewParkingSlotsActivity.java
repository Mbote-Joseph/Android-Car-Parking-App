package com.example.carparking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewParkingSlotsActivity extends AppCompatActivity {

    private ListView parkingSlotsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_parking_slots);

        parkingSlotsListView = findViewById(R.id.parkingSlotsListView);

        ArrayList<String> parkingSlots = new ArrayList<>();
        parkingSlots.add("Parking Slot 1");
        parkingSlots.add("Parking Slot 2");
        parkingSlots.add("Parking Slot 3");
        parkingSlots.add("Parking Slot 4");
        parkingSlots.add("Parking Slot 5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                parkingSlots
        );

        parkingSlotsListView.setAdapter(adapter);

        // Handle item click events
        parkingSlotsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedParkingSlot = parkingSlots.get(position);
                Toast.makeText(ViewParkingSlotsActivity.this, "Selected: " + selectedParkingSlot, Toast.LENGTH_SHORT).show();

                // Perform any action you want on the selected parking slot, e.g., navigate to a new activity or update the UI
            }
        });
    }
}
