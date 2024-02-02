package protectora.interfaces;
/**
 * Interfaz Buscable, que contiene el comportamiento necesario para buscar
 * @author selene
 * @version 1.2
 */
public interface Buscable {
	/**
	 * Este método requiere el código único del objeto donde quiera buscar. Buscará el objeto en el array usando el código único(que entrará como Integer o String)
	 * y devolverá el índice. Devuelve -1 si el objeto no ha sido encontrado
	 * @return el índice donde se encuentra el objeto
	 */
	int buscar(Object object);
}