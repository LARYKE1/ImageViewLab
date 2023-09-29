package com.example.imageviewlab;

public class imageModel {
    int path;
    String title,desc;

    public imageModel(int path, String title, String desc) {
        this.path = path;
        this.title = title;
        this.desc = desc;
    }

    public int getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

}
