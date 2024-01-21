package protectora.interfaces;

public interface Buscable {
	Object buscar(int indice);
	Object buscar(long indice);
	Object buscar(double indice);
	Object buscar(String indice);
	Object buscar(boolean indice);
	int buscar(Object object);
}
