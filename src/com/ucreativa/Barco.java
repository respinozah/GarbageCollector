/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Barco {


	private String nombre;
	private String color;
	private String origen;
	
	/**
	 * 
	 */
	public Barco(String nombre, String color, String origen) {
		this.nombre = nombre;
		this.color = color;
		this.origen = origen;
	}
	
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void cambiarOrigen(String origen) {
		this.origen = origen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}
}
