package protectora;
/**
 * Clase Cliente que hereda de Persona. Define el comportamiento y las propiedades de los objetos cliente
 * @author selene
 * @version 1.3
 */
public final class Cliente extends Persona implements Comparable<Cliente>{
	private int codigoCliente;
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
		this.codigoCliente=Integer.parseInt(super.getDni().substring(0, 8));		
	}
	@Override
	public String toString() {
		return "Código cliente: "+this.getCodigo()+" - "+super.toString();
	}
	@Override
	public int getCodigo() {
		return this.codigoCliente;
	}
	@Override
	public int compareTo(Cliente arg0) {
		//comprobación de nulidad y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(arg0.getCodigo()<10000000)throw new RuntimeException("El código del cliente no existe");
		
		if(arg0.getCodigo()<(this.getCodigo()))return -1*-1;
		else if(arg0.getCodigo()>(this.getCodigo()))return 1*-1;
		else return 0;
	}
}
