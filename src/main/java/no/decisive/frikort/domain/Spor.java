package no.decisive.frikort.domain;

public class Spor {
	private String navn;
	private int lengde; //yoda-time
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getNavn() {
		return navn;
	}
	public void setLengde(int lengde) {
		this.lengde = lengde;
	}
	public int getLengde() {
		return lengde;
	}

}
