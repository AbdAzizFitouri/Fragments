package com.isetkl.myapplication.fragments;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.isetkl.myapplication.R;

public class MyDynamicFragment extends Fragment {

    public MyDynamicFragment(){

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_my_dynamic,container,false);
    }

    }

