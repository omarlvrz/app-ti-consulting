package com.oalvarez.appticonsulting1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oalvarez.appticonsulting1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiqDetalleFragment extends Fragment {


    public LiqDetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liq_detalle, container, false);
    }

}
