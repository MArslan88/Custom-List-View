package com.mhdarslan.listview;

public class NameModel {
    // the resource ID for the imageView
    private int imageId;

    // TextView 1
    private String firstNameText;

    // TextView 1
    private String secondNameText;

    public NameModel(int imageId, String firstNameText, String secondNameText) {
        this.imageId = imageId;
        this.firstNameText = firstNameText;
        this.secondNameText = secondNameText;
    }

    public int getImageId() {
        return imageId;
    }

    public String getFirstNameText() {
        return firstNameText;
    }

    public String getSecondNameText() {
        return secondNameText;
    }
}
