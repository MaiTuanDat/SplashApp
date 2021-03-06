package com.example.levanhao.splashapp.model.product;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by HaoLV on 11/8/2017.
 */

public class Size implements Serializable {
    private int id;
    private String size_name;

    public Size(int id, String size_name) {
        this.id = id;
        this.size_name = size_name;
    }

    public Size(JSONObject jsonObject) {
        try {
            this.id = jsonObject.getInt("id");
            this.size_name = jsonObject.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public Size() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize_name() {
        return size_name;
    }

    public void setSize_name(String size_name) {
        this.size_name = size_name;
    }
}
