/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Bicicleta {

	private String marca;
	private String color;
	private int cambio;
	/**
	 * 
	 */
	public Bicicleta(String marca, String color, int cambio) {
		this.marca = marca;
		this.color = color;
		this.cambio = cambio;
	}
	
	public void subirCambio() {
		cambio++;
	}
	
	public void bajarCambio() {
		cambio--;
	}
		
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCambio() {
		return cambio;
	}
	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}
}
