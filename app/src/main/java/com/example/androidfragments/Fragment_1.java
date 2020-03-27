package com.example.androidfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Fragment_1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_1, container, false);
    }
    public void changeFragment(View view){
        Fragment fragment;
        if (view == view.findViewById(R.id.btnFragment1)){
            fragment = new Fragment_1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefault,fragment);
            ft.commit();
        }
        if (view == view.findViewById(R.id.btnFragmetn2)){
            fragment = new Fragment_2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefault,fragment);
            ft.commit();
        }
    }
}