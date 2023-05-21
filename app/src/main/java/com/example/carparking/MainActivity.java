package com.example.carparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button viewParkingSlotsButton;
    private Button leaveParkingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewParkingSlotsButton = findViewById(R.id.viewParkingSlotsButton);
        leaveParkingButton = findViewById(R.id.leaveParkingButton);

        viewParkingSlotsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToViewParkingSlotsPage();
            }
        });

        leaveParkingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLeaveParkingPage();
            }
        });
    }

    private void navigateToViewParkingSlotsPage() {
        Intent intent = new Intent(MainActivity.this, ViewParkingSlotsActivity.class);
        startActivity(intent);
    }

    private void navigateToLeaveParkingPage() {
        Intent intent = new Intent(MainActivity.this, LeaveParkingActivity.class);
        startActivity(intent);
    }
}
