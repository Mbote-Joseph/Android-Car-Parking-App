package com.example.carparking;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class ParkingSlotsAdapter extends RecyclerView.Adapter<ParkingSlotsAdapter.ParkingSlotViewHolder> {

    private List<ParkingSlot> parkingSlots;

    public ParkingSlotsAdapter() {
        // Fetch the parking slots data and set it to the parkingSlots list
    }

    @NonNull
    @Override
    public ParkingSlotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parking_slot_item, parent, false);
        return new ParkingSlotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParkingSlotViewHolder holder, int position) {
        ParkingSlot parkingSlot = parkingSlots.get(position);
        holder.parkingSlotTextView.setText(parkingSlot.getName());
    }

    @Override
    public int getItemCount() {
        return parkingSlots == null ? 0 : parkingSlots.size();
    }
    class ParkingSlotViewHolder extends RecyclerView.ViewHolder {

    TextView parkingSlotTextView;

    public ParkingSlotViewHolder(@NonNull View itemView) {
        super(itemView);
        parkingSlotTextView = itemView.findViewById(R.id.parkingSlotTextView);
    }
}

}

