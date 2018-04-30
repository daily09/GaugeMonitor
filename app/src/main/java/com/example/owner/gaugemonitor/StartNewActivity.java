package com.example.owner.gaugemonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class StartNewActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private EditText
    private Button userRerun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_new);
    }
}
