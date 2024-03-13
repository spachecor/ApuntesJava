package protectora.interfaces;

import java.util.ArrayList;

/**
 * Interfaz Eliminable, que contiene el comportamiento necesario para eliminar objetos
 * @author selene
 * @version 1.3
 */
public interface Eliminable {
	/**
	 * Elimina el objeto cuyo índice es pasado por parámetro de un arraylist de objetos pasado también por parámetros
	 * @param array el arraylist donde se eliminará el objeto
	 * @param indice la posición del objeto dentro del array
	 */
	void eliminar(ArrayList array, int indice);
}
