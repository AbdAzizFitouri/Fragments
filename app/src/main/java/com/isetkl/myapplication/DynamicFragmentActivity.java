package com.isetkl.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.isetkl.myapplication.fragments.MyDynamicFragment;

public class DynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MyDynamicFragment()).commit();
    }
}
