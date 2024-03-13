package protectora.interfaces;

import java.util.ArrayList;

/**
 * Interfaz Buscable, que contiene el comportamiento necesario para buscar
 * @author selene
 * @version 1.3
 */
public interface Buscable {
	/**
	 * Este método requiere objeto que se quiere buscar y el arraylist en el que buscar.
	 * Buscará el objeto en el arraylist y devolverá el índice. Devuelve -1 si el objeto
	 * no ha sido encontrado
	 * @return el índice donde se encuentra el objeto
	 */
	int buscar(ArrayList array, Object object);
}