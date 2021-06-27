package com.example.gridviewlayout;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPlaceHolder {

    ImageView imageView;
    TextView text ;
    ViewPlaceHolder(View view){

        imageView = view.findViewById(R.id.imageView);
        text = view.findViewById(R.id.countryName);
    }
}
