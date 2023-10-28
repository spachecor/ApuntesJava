package temauno.actividades;

/**
 * Ejercicio de refuerzo y ampliación 11
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class RA11 {

	public static void main(String[] args) {

		//1. Pasar de decimal a binario
		int nDecimal;
		String nBinario;
		nDecimal = 159;
		nBinario = Integer.toBinaryString(nDecimal);
		System.out.println("El nº en binario es: " + nBinario);
		
		//2. Pasar de binario a decimal
		System.out.println("El nº en decimal es: " + Integer.parseUnsignedInt(nBinario, 2));
		
	}

}
