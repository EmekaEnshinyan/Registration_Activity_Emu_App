package com.example.android_layout_register_exercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android_layout_register_exercise.R;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText txtName, txtEmail, txtPassword, txtPasswordReenter;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale, rbOther;
    private CheckBox chkAgree;
    private Button btnRegister, btnImage;
    private Spinner spinnerCountries;
    private TextView txtNameWarn, txtEmailWarn, txtPasswordWarn, txtPasswordReenterWarn;
    private ConstraintLayout parent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize all UI elements
        initViews();


        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "image button", Toast.LENGTH_SHORT).show();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initRegister();
            }

        });
    }
    //checks if user has entered all the relevant data
    private void initRegister() {
        Log.d(TAG, "initRegister Started:");

        if (validateData()) {
            if (chkAgree.isChecked()) {
                //showSnackBar();
            } else
                Toast.makeText(MainActivity.this, "Please agree to the terms", Toast.LENGTH_SHORT).show();
        }
    }
    //shows snackBar
    private void showSnackBar(){
                Log.d(TAG, "showSnackBar: Started");
                txtNameWarn.setVisibility(View.GONE);
                txtEmailWarn.setVisibility(View.GONE);
                txtPasswordWarn.setVisibility(View.GONE);
                txtPasswordReenterWarn.setVisibility(View.GONE);
                Snackbar.make(parent, "User Registered", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Dismiss", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    }).show();
            }
    //ensures that btnRegister will work only if all relevant info are inputted correctly
    private boolean validateData() {
        Log.d(TAG, "initRegister");
        if (txtName.getText().toString().equals("")) {
            txtNameWarn.setVisibility(View.VISIBLE);
            txtNameWarn.setText("Enter your name");
            return false;
        }
        if (txtEmail.getText().toString().equals("")) {
            txtEmailWarn.setVisibility(View.VISIBLE);
            txtEmailWarn.setText("Please enter your email");
            return false;
        }
        if (txtPassword.getText().toString().equals("")) {
            txtPasswordWarn.setVisibility(View.VISIBLE);
            txtPasswordWarn.setText("please enter your password");
            return false;
        }
        if (txtPasswordReenter.getText().toString().equals("")) {
            txtPasswordReenterWarn.setVisibility(View.VISIBLE);
            txtPasswordReenterWarn.setText("Please reenter your password");
            return false;
        }
        if (txtPassword.getText() != txtPasswordReenter.getText()) {
            txtPasswordReenterWarn.setVisibility(View.VISIBLE);
            txtPasswordReenterWarn.setText("Make sure both passwords match");
            return false;
        }
        return true;
    }
        //all vies set to be initialized
        private void initViews () {
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

            spinnerCountries = findViewById(R.id.spinnerCountries);

            parent = findViewById(R.id.parent);

        }

    }
