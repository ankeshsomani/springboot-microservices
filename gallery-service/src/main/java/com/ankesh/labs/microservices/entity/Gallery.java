package com.ankesh.labs.microservices.entity;

import java.util.List;

public class Gallery {

    private Long id;
    private List images;

    public Gallery(Long id, List images) {
        this.id = id;
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List getImages() {
        return images;
    }

    public void setImages(List images) {
        this.images = images;
    }
}
