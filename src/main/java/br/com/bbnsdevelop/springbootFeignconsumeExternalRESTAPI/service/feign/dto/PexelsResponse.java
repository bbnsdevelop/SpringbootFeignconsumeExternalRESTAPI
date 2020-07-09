package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.feign.dto;

import java.util.List;

public class PexelsResponse {
    private List<Photo> photos;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}