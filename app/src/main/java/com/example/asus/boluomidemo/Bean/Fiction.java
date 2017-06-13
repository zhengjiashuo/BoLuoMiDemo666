package com.example.asus.boluomidemo.Bean;

/**
 * Created by ASUS on 2017/6/13.
 */

public class Fiction {

    private int images;
    private String titles;
    private String titlestwo;

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getTitlestwo() {
        return titlestwo;
    }

    public void setTitlestwo(String titlestwo) {
        this.titlestwo = titlestwo;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "images=" + images +
                ", titles='" + titles + '\'' +
                ", titlestwo='" + titlestwo + '\'' +
                '}';
    }
}
