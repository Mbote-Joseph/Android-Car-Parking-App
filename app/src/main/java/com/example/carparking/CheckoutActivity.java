package com.example.carparking;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckoutActivity extends AppCompatActivity {

    private TextView parkingFeeTextView;
    private TextView parkingSlotNameTextView;
    private Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        parkingFeeTextView = findViewById(R.id.parkingFeeTextView);
        parkingSlotNameTextView = findViewById(R.id.parkingSlotNameTextView);
        payButton = findViewById(R.id.payButton);

        int parkingFee = getIntent().getIntExtra("parkingFee", 0);
        String parkingSlotName = getIntent().getStringExtra("parkingSlotName");

        parkingFeeTextView.setText(String.format("Parking Fee: %d", parkingFee));
        parkingSlotNameTextView.setText(String.format("Parking Slot: %s", parkingSlotName));

        payButton.setOnClickListener(v -> {
            // Add your payment processing logic here
        });
    }
}
