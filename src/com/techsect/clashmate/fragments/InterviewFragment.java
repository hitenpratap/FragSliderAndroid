package com.techsect.clashmate.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.techsect.clashmate.R;

/**
 * Created by hitenpratap on 4/8/15.
 */
public class InterviewFragment extends Fragment {

    public InterviewFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_interview, container, false);

        return rootView;
    }
}
