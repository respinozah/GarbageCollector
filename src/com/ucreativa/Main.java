/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bicicleta miBici = new Bicicleta("Oreo", "Azul", 18);
		Barco miBarco = new Barco("Poseidon", "Naranja", "Costa Rica");
		Tren miTren = new Tren("Trenes del sur", "China", 4);
		
		System.out.println(miBici.getMarca());
		System.out.println(miBarco.getNombre());
		System.out.println(miTren.getCompania());
		
		miBici = null;
		
		System.gc();
		
		miBarco = null;
		miTren = null;
		
		Runtime.getRuntime().gc();

	}

}
