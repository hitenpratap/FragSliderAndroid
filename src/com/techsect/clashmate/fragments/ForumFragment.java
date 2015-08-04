package com.techsect.clashmate.fragments;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.techsect.clashmate.R;
import com.techsect.clashmate.commons.Constants;

/**
 * Created by hitenpratap on 4/8/15.
 */
public class ForumFragment extends Fragment {

    public ForumFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_forum, container, false);

        String htmlText = "<p>\n" +
                "                    Discussion forum is a place where users can interact with each other to discuss their problems. If you are already\n" +
                "                    a <b>ClashMate</b> user then you might be familiarized with it. If not then take a look at it now on ClashMate web platform\n" +
                "                    until we launch this feature here on mobile app too.\n" +
                "                </p>\n" +
                "                <h4>Thanks for all your support and keep flying with ClashMate.</h4>";
        TextView t = (TextView) rootView.findViewById(R.id.txtLabel);
        t.setText(Html.fromHtml(htmlText));
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), Constants.montserratFontPath);
        t.setTypeface(tf);
        return rootView;
    }
}
