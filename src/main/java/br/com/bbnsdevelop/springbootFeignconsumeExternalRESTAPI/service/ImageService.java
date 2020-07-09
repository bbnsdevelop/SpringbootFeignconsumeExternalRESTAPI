package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service;

import java.util.List;

import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.entity.Image;

public interface ImageService {
	
	
	//Returns random images pagewise
    public List<Image> getImages(int page);

    // Returns list of images for a topic
    public List<Image> getImages(String topic, int page);

}
