package com.example.carparking;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LeaveParkingActivity extends AppCompatActivity {

    private EditText carDetailsEditText, parkingSlotEditText;
    private Button leaveParkingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_parking);

        carDetailsEditText = findViewById(R.id.carDetailsEditText);
        parkingSlotEditText = findViewById(R.id.parkingSlotEditText);
        leaveParkingButton = findViewById(R.id.leaveParkingButton);

        leaveParkingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get car details and parking slot number
                String carDetails = carDetailsEditText.getText().toString();
                String parkingSlot = parkingSlotEditText.getText().toString();

                // Calculate parking fee
                double parkingFee = calculateParkingFee(parkingSlot);

                // Show confirmation dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(LeaveParkingActivity.this);
                builder.setTitle("Leave Parking");
                builder.setMessage("Are you sure you want to leave parking slot " + parkingSlot + " with car details " + carDetails + " and pay a parking fee of " + parkingFee + " ?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Perform payment process
                        performPayment(parkingFee);
                    }
                });
                builder.setNegativeButton("No", null);
                builder.show();
            }
        });
    }

    private double calculateParkingFee(String parkingSlot) {
        // TODO: Implement parking fee calculation logic based on parking slot
        return 10.00;
    }

    private void performPayment(double parkingFee) {
        // TODO: Implement payment process logic
        Toast.makeText(this, "Payment successful", Toast.LENGTH_SHORT).show();

        // Return to main activity
        Intent intent = new Intent(LeaveParkingActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
