package com.example.part1_travel_app.Data;

import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.part1_travel_app.Entities.Travel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class TravelDataSource {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    myRef.setValue("Hello, World!");
    TravelDataSource travelDataSource = null;
    // Read from the database
    myRef.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            // This method is called once with the initial value and again
            // whenever data at this location is updated.
            String value = dataSnapshot.getValue(String.class);
            Log.d(TAG, "Value is: " + value);
        }

        @Override
        public void onCancelled(DatabaseError error) {
            // Failed to read value
            Log.w(TAG, "Failed to read value.", error.toException());
        }
    });





    //TODO  synchronized
    public TravelDataSource() {
//        if(travelDataSource == null)
//        {
//            ravelDataSource = new ..
//        }
    }

    public void setValue(LiveData<Boolean> )
    {

    }


}
