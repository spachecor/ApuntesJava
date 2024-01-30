package protectora;
/**
 * Clase Cliente que hereda de Persona. Define el comportamiento y las propiedades de los objetos cliente
 * @author selene
 * @version 1.2
 */
public final class Cliente extends Persona implements Comparable{
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
	public Cliente(String nombre, String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal) {
		super(nombre, dni, trabajo, email, tipoVia, nombreVia, escalera, puerta, infoAdicional, localidad, provincia, telefono, numeroCasa, bloque, codigoPostal);
		this.setCodigo();
	}
	@Override
	public void setCodigo() {
		this.codigoCliente=super.getDni().concat("c");		
	}
	@Override
	public String toString() {
		return super.toString()+" - Código adoptante: "+this.getCodigo();
	}
	@Override
	public String getCodigo() {
		return this.codigoCliente;
	}
	@Override
	public int compareTo(Object arg0) {
		if(((Cliente)arg0).getCodigo().compareTo(this.getCodigo())==-1)return -1*-1;
		else if(((Cliente)arg0).getCodigo().compareTo(this.getCodigo())==1)return 1*-1;
		else return 0;
	}
}
