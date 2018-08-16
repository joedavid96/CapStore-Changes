package com.capgemini.capstore.beans;

import java.util.List;

import javax.persistence.Embeddable;

@Embeddable
public class Image {

	private List<String> imageUrl;

	public List<String> getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(List<String> imageUrl) {
		this.imageUrl = imageUrl;
	}
}
