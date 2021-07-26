package com.chinook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {

	@Id
	private int artistId;
	
	@Column(name="Name")
	private String name;
	
	///////////////////////////////////// Methods
	
	public Artist() {	}
	
	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + "]";
	}
	
	
}
