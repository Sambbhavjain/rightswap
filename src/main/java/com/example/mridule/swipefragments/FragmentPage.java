package com.example.mridule.swipefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mridule on 30/12/19.
 */

public class FragmentPage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view;
        Bundle bundle=getArguments();
        int pageNumber=bundle.getInt("pageNumber");

        view=inflater.inflate(R.layout.page_fragment_layout,container,false);
        TextView textView=(TextView)view.findViewById(R.id.pageNumber);
        textView.setText(Integer.toString(pageNumber));
        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
