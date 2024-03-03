package protectora.interfaces;

import java.util.ArrayList;

/**
 * Interfaz Eliminable, que contiene el comportamiento necesario para eliminar objetos
 * @author selene
 * @version 1.3
 */
public interface Eliminable {
	/**
	 * Elimina el objeto cuyo índice es pasado por parámetro de un array de objetos pasado también por parámetros
	 * @param object el objeto a eliminar
	 */
	void eliminar(ArrayList array, int indice);
}
