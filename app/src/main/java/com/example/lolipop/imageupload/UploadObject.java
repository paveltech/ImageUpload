package com.example.lolipop.imageupload;

import com.google.gson.annotations.SerializedName;

public class UploadObject {

    private String success;
    @SerializedName("id")
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UploadObject(String success) {
        this.success = success;
    }
    public String getSuccess() {
        return success;
    }
}
