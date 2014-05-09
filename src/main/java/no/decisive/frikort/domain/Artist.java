package no.decisive.frikort.domain;

import java.util.Set;

public class Artist {
	private String navn;
	private Set<Album> album;
	
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getNavn() {
		return navn;
	}
	public void setAlbum(Set<Album> album) {
		this.album = album;
	}
	public Set<Album> getAlbum() {
		return album;
	}
	
	
}
