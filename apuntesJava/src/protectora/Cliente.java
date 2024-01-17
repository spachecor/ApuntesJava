package protectora;
/**
 * Clase Cliente que hereda de Persona. Define el comportamiento y las propiedades de los objetos cliente
 * @author selene
 * @version 1.0
 */
public class Cliente extends Persona{
	private String codigoCliente;
	
	public Cliente(String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal) {
		super(dni, trabajo, email, tipoVia, nombreVia, escalera, puerta, infoAdicional, localidad, provincia, telefono, numeroCasa, bloque, codigoPostal);
		this.setCodigoCliente();
	}
	private void setCodigoCliente() {
		this.codigoCliente=super.getDni().concat("c");
	}
}
