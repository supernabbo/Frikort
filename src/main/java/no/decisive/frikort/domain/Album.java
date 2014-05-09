package no.decisive.frikort.domain;

import java.util.List;

public class Album {
	private String navn;
	private int aarstall;
	private List<Spor> spor;
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getNavn() {
		return navn;
	}
	public void setAarstall(int aarstall) {
		this.aarstall = aarstall;
	}
	public int getAarstall() {
		return aarstall;
	}
	public void setSpor(List<Spor> spor) {
		this.spor = spor;
	}
	public List<Spor> getSpor() {
		return spor;
	}

}
