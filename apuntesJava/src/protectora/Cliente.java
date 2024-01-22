package protectora;
/**
 * Clase Cliente que hereda de Persona. Define el comportamiento y las propiedades de los objetos cliente
 * @author selene
 * @version 1.2
 */
public class Cliente extends Persona{
	private String codigoCliente;
	/**
	 * Constructor de los objetos de tipo Cliente
	 * @param dni
	 * @param trabajo
	 * @param email
	 * @param tipoVia
	 * @param nombreVia
	 * @param escalera
	 * @param puerta
	 * @param infoAdicional
	 * @param localidad
	 * @param provincia
	 * @param telefono
	 * @param numeroCasa
	 * @param bloque
	 * @param codigoPostal
	 */
	public Cliente(String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal) {
		super(dni, trabajo, email, tipoVia, nombreVia, escalera, puerta, infoAdicional, localidad, provincia, telefono, numeroCasa, bloque, codigoPostal);
	}
	private void setCodigoCliente() {
		this.codigoCliente=super.getDni().concat("c");
	}
}
