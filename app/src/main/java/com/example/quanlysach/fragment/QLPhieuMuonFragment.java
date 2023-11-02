package com.example.quanlysach.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanlysach.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class QLPhieuMuonFragment extends Fragment {

    RecyclerView recyclerQLPhieuMuon;
    FloatingActionButton floatAdd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_qlphieu_muon, container, false);

       recyclerQLPhieuMuon=view.findViewById(R.id.recyclerQLPhieuMuon);
       floatAdd=view.findViewById(R.id.floatAdd);

       return view;
    }
}