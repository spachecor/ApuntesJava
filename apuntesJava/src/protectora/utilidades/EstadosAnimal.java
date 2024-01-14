package protectora.utilidades;
/**
 * Clase que contiene los tipos de estado por los que puede pasar un animal como constantes para utilidades
 * @author selene
 * @version 1.0
 */
public class EstadosAnimal {
	public static int ADOPTADO, ADOPTABLE, INDOCUMENTADO, FALLECIDO;
	static {
		ADOPTADO=12;
		ADOPTABLE=13;
		INDOCUMENTADO=14;
		FALLECIDO=15;
	}
}
