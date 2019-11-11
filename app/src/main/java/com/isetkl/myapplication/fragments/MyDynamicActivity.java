package com.isetkl.myapplication.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isetkl.myapplication.R;

public class MyDynamicActivity extends Fragment {

    public MyDynamicActivity(){

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.dynamic_fragment,container,false);
    }

    }

