package com.twitter.api.model;

import java.util.List;

public class TwitterVo {
    private String name;
    private String image;
    private String description;
    private List<TwitterFeaturesVo> lstTwitter;
    public TwitterVo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<TwitterFeaturesVo> getLstTwitter() {
        return lstTwitter;
    }

    public void setLstTwitter(List<TwitterFeaturesVo> lstTwitter) {
        this.lstTwitter = lstTwitter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
