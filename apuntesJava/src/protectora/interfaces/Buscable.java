package protectora.interfaces;
/**
 * Interfaz Buscable, que contiene el comportamiento necesario para buscar
 * @author selene
 * @version 1.2
 */
public interface Buscable {
	/**
	 * Este método requiere un objeto, que puede ser el objeto que queremos y en cuyo caso devolvería su posición (con un wrapper, Integer en concreto), y que 
	 * también puede ser un parámetro con el que buscar nuestro objeto(usando un envoltorio) para que devuelva el objeto en concreto
	 * @param object puede ser o el objeto buscado o el parámetro para buscar al objeto usando envoltorios
	 * @return el objeto buscado o su posición(usando envoltorios)
	 */
	Object buscar(Object object);
}
