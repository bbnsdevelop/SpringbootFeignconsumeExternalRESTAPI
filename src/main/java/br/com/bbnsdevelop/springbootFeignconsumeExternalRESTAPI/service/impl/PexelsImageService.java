package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.entity.Image;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.ImageService;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.feign.PexelsClient;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.feign.dto.PexelsResponse;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.feign.dto.Photo;

@Service
public class PexelsImageService implements ImageService {
	
	private static final String PEXELS = "Pexels";
	private static final int MAX_IMAGES_PER_PAGE = 20;
	
	@Autowired
	private PexelsClient client;

	@Override
	public List<Image> getImages(int page) {
	    // Returns images in pexel's format
	    PexelsResponse response = client.getPhotos(MAX_IMAGES_PER_PAGE, page);
	    List<Image> images = new ArrayList<>();
	    //Iterate through all pages
	    for(Photo photo : response.getPhotos()) {
	        // Create an instance of Image using each photo and add to list of Images
	        Image image = new Image(PEXELS, photo.getPhotographer(),
	                photo.getSrc().getLarge(), photo.getPhotographerUrl());
	        images.add(image);
	    }
	    // Return image list
	    return images;
	}

	@Override
	public List<Image> getImages(String topic, int page) {
	    PexelsResponse response = client.getPhotos(topic, MAX_IMAGES_PER_PAGE, page);
	    List<Image> images = new ArrayList<>();
	    for(Photo photo : response.getPhotos()) {
	        Image image = new Image(PEXELS, photo.getPhotographer(),
	            photo.getSrc().getLarge(), photo.getPhotographerUrl());
	        images.add(image);
	    }
	    return images;
	}
}