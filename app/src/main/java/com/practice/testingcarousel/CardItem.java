package com.practice.testingcarousel;


public class CardItem {

    private int mTextResource;
    private int mTitleResource;
    private int mImage;

    public CardItem(int title, int text,int image) {
        mTitleResource = title;
        mImage = image;
        mTextResource = text;
    }

    public int getImage() {
        return mImage;
    }
    public int getText() {
        return mTextResource;
    }

    public int getTitle() {
        return mTitleResource;
    }
}
