package com.example.registerui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.example.android_layout_register_exercise.R;

public class MainActivity extends AppCompatActivity {

    private EditText txtName, txtEmail, txtPassword, txtPasswordReenter;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale, rbOther;
    private CheckBox chkAgree;
    private Button btnRegister, btnImage;
    private Spinner spinnerC;
    private ConstraintLayout parent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();






    }

    private void initViews(){
        Log.d(TAG, "initViews: Started");
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        txtPasswordReenter = findViewById(R.id.txtPasswordReenter);

        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);

        chkAgree = findViewById(R.id.chkAgree);

        btnImage = findViewById(R.id.btnImage);
        btnRegister = findViewById(R.id.btnRegister);

        parent = findViewById(R.id.parent);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerCountries);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}