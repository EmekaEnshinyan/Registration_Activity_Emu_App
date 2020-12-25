package com.example.android_layout_register_exercise;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerAdapter {
    Spinner spinner;
    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.spinnerCountry, android.R.layout.simple_spinner_item);

    private SpinnerAdapter() {
        spinner = (Spinner) spinner.findViewById(R.id.spinnerCountry);
    }
// Specify the layout to use when the list of choices appears
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
spinner.setAdapter(adapter);
}
