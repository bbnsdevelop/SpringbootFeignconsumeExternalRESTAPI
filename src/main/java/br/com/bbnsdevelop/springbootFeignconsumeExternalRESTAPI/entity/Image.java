package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.entity;

public class Image {

	private String source;
    public void setSource(String source) {
		this.source = source;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	public void setPhotographerUrl(String photographerUrl) {
		this.photographerUrl = photographerUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	private String photographer;
    private String photographerUrl;
    private String imageUrl;

    public Image(String source, String photographer, String imageUrl, String photographerUrl) {
       this.source = source;
       this.photographer = photographer;
       this.imageUrl = imageUrl;
       this.photographerUrl = photographerUrl;
   }

	public String getSource() {
		return source;
	}

	public String getPhotographer() {
		return photographer;
	}

	public String getPhotographerUrl() {
		return photographerUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}
    
}
