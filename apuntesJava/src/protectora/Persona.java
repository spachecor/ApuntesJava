package protectora;
/**
 * Clase padre Persona que define las propiedades y el comportamiento de los objetos persona que hereden de 
 * persona.
 * @author selene
 * @version 1.3
 */
public class Persona {
	private static int contadorPersonas;
	private String dni, nombre, trabajo, email, tipoVia, nombreVia, escalera, puerta, 
	infoAdicional, localidad, provincia;
	private int telefono, numeroCasa, bloque, codigoPostal;
	static {
		contadorPersonas=0;
	}
	/**
	 * Constructor de los objetos de tipo Persona
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
	public Persona(String nombre, String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setTrabajo(trabajo);
		this.setEmail(email);
		this.setTipoVia(tipoVia);
		this.setNombreVia(nombreVia);
		this.setEscalera(escalera);
		this.setPuerta(puerta);
		this.setInfoAdicional(infoAdicional);
		this.setLocalidad(localidad);
		this.setProvincia(provincia);
		this.setTelefono(telefono);
		this.setNumeroCasa(numeroCasa);
		this.setBloque(bloque);
		this.setCodigoPostal(codigoPostal);
		//aumentamos el nº de objetos persona instanciados
		this.aumentarContadorPersonas();
	}
	/**
	 * Método que aumenta el contador del número de objetos tipo Persona instanciadas
	 */
	private void aumentarContadorPersonas() {
		Persona.contadorPersonas++;
	}
	private void setNombre(String nombre) {
		this.nombre=nombre;
	}
	private void setDni(String dni) {
		this.dni=dni;
	}
	private void setTrabajo(String trabajo) {
		this.trabajo=trabajo;
	}
	private void setEmail(String email) {
		this.email=email;
	}
	private void setTipoVia(String tipoVia) {
		this.tipoVia=tipoVia;
	}
	private void setNombreVia(String nombreVia) {
		this.nombreVia=nombreVia;
	}
	private void setEscalera(String escalera) {
		this.escalera=escalera;
	}
	private void setPuerta(String puerta) {
		this.puerta=puerta;
	}
	private void setInfoAdicional(String infoAdicional) {
		this.infoAdicional=infoAdicional;
	}
	private void setLocalidad(String localidad) {
		this.localidad=localidad;
	}
	private void setProvincia(String provincia) {
		this.provincia=provincia;
	}
	private void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	private void setNumeroCasa(int numeroCasa) {
		this.numeroCasa=numeroCasa;
	}
	private void setBloque(int bloque) {
		this.bloque=bloque;
	}
	private void setCodigoPostal(int codigoPostal) {
		this.codigoPostal=codigoPostal;
	}
	protected String getDni() {
		return this.dni;
	}
}
