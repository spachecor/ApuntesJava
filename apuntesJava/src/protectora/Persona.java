package protectora;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase padre Persona que define las propiedades y el comportamiento de los objetos persona que hereden de 
 * persona.
 * @author selene
 * @version 1.3
 */
abstract class Persona {
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
	protected Persona(String nombre, String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal) {
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
		Persona.aumentarContadorPersonas();
	}
	/**
	 * Método abstracto que genera el código de las clases herederas
	 */
	protected abstract void setCodigo();
	/**
	 * Método abstracto que devuelve el código único del objeto de la clase heredera
	 * @return el código único de la clase heredera
	 */
	protected abstract int getCodigo();
	/**
	 * Método que aumenta el contador del número de objetos tipo Persona instanciadas
	 */
	private static void aumentarContadorPersonas() {
		Persona.contadorPersonas++;
	}
	@Override
	public String toString() {
		return "Nombre: "+this.getNombre()+" - DNI: "+this.getDni()+" - Trabajo: "+this.getTrabajo()+" - Email: "+this.getEmail()+" - Dirección: "+this.getDireccionCompleta()
				+" - Teléfono: "+this.getTelefono()+" - Información adicional: "+((this.getInfoAdicional()==null)?"ninguna":this.getInfoAdicional());
	}
	private static boolean validarDni(String dni) {
		//Primero creamos un objeto tipo Pattern para representar la expresión regular. Con el método compile
		//recibimos el parámetro de la expresión regular y se devuelve un objeto de la clase pattern
		Pattern pat = Pattern.compile("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		//Después creamos un objeto de la clase Matcher, que usaremos para comparar el dni que entre con
		//la expresión regular. 
		Matcher mat = pat.matcher(dni);
		//por último, con el método matcher obtendremos si coincide con el patrón, así que directamente
		//devolvemos el boolean que da como resultado de usar el método matches con el objeto del tipo Matcher
		return mat.matches();
	}
	private static boolean validarEmail(String email) {
		Pattern pat = Pattern.compile("^[a-z0-9]+@[a-z0-9]+.[a-z]{2,3}$");
		Matcher mat = pat.matcher(email);
		return mat.matches();
	}
	private static boolean validarNumeroCasa(int numeroCasa) {
		Pattern pat = Pattern.compile("^[0-9]{1,2}[0-9]?$");
		Matcher mat = pat.matcher(String.valueOf(numeroCasa));
		return mat.matches();
	}
	protected String getNombre() {
		return this.nombre;
	}
	protected String getTrabajo() {
		return this.trabajo;
	}
	protected String getEmail() {
		return this.email;
	}
	/**
	 * Método específico que genera la dirección completa
	 * @return la dirección completa
	 */
	protected String getDireccionCompleta() {
		return this.getTipoVia()+" "+this.getNombreVia()+", "+this.getNumeroCasa()+((this.getBloque()==0)?"":" bloque: "+this.getBloque())
				+((this.getEscalera()==null)?"":" escalera: "+this.getEscalera())+((this.getPuerta()==null)?"":" puerta: "+this.getPuerta())
				+". "+this.getLocalidad()+", "+this.getProvincia()+". CP: "+this.getCodigoPostal();
	}
	private void setNombre(String nombre) {
		this.nombre=nombre;
	}
	private void setDni(String dni) {
		if(Persona.validarDni(dni)) {
			this.dni=dni;
		}else throw new RuntimeException("Se ha introducido un DNI inválido");
	}
	private void setTrabajo(String trabajo) {
		this.trabajo=trabajo;
	}
	private void setEmail(String email) {
		if(Persona.validarEmail(email)) {
			this.email=email;
		}else throw new RuntimeException("Se ha introducido un email inválido");
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
		if(Persona.validarNumeroCasa(numeroCasa)) {
			this.numeroCasa=numeroCasa;
		}else throw new RuntimeException("Se ha introducido un número incorrecto");	
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
	protected String getInfoAdicional() {
		return this.infoAdicional;
	}
	protected int getTelefono() {
		return this.telefono;
	}
	protected String getLocalidad() {
		return this.localidad;
	}
	protected String getProvincia() {
		return this.provincia;
	}
	protected int getCodigoPostal() {
		return this.codigoPostal;
	}
	protected String getPuerta() {
		return this.puerta;
	}
	protected int getBloque() {
		return this.bloque;
	}
	protected String getEscalera() {
		return this.escalera;
	}
	protected int getNumeroCasa() {
		return this.numeroCasa;
	}
	protected String getNombreVia() {
		return this.nombreVia;
	}
	protected String getTipoVia() {
		return this.tipoVia;
	}
}
