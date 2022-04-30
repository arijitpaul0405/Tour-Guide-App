package com.arijitpaul.tourguide.CustomClass;

public class WordClass {

    private int image;
    private String title;
    private String info;
    private boolean isDisplay;

    public WordClass(int image, String title, String info, boolean isDisplay) {
        this.image = image;
        this.title = title;
        this.info = info;
        this.isDisplay = isDisplay;
    }

    public WordClass(String title, boolean isDisplay) {
        this.title = title;
        this.isDisplay = isDisplay;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public boolean isDisplay() {
        return isDisplay;
    }
}
