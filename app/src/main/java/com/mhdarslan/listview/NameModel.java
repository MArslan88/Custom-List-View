package com.mhdarslan.listview;

public class NameModel {
    // the resource ID for the imageView
    private int ivNumbersImageId;

    // TextView 1
    private String mNumberInDigit;

    // TextView 1
    private String mNumbersInText;

    public NameModel(int ivNumbersImageId, String mNumberInDigit, String mNumbersInText) {
        this.ivNumbersImageId = ivNumbersImageId;
        this.mNumberInDigit = mNumberInDigit;
        this.mNumbersInText = mNumbersInText;
    }

    public int getIvNumbersImageId() {
        return ivNumbersImageId;
    }

    public String getmNumberInDigit() {
        return mNumberInDigit;
    }

    public String getmNumbersInText() {
        return mNumbersInText;
    }
}
