package com.example.frag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class frag1 extends Fragment {


    public frag1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater l, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= l.inflate(R.layout.fragment_frag1, container, false);
        return  v;
    }


}
