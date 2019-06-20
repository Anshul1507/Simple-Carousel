package com.practice.testingcarousel;


import android.support.v7.widget.CardView;

public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    float getPageWidth();

    CardView getCardViewAt(int position);

    int getCount();
}
