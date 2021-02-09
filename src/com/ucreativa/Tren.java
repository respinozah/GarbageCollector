package com.ucreativa;

public class Tren {



	private String compania;
	private String pais;
	private int cantVagones;
	
	public Tren(String compania, String pais, int cantVagones) {
		this.compania = compania;
		this.pais = pais;
		this.cantVagones = cantVagones;
	}

	public void agregarVagon() {
		cantVagones++;
	}
	
	public void encender() {
		
	}
	
	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCantVagones() {
		return cantVagones;
	}

	public void setCantVagones(int cantVagones) {
		this.cantVagones = cantVagones;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}
	
	
}
