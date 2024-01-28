package protectora;
/**
 * Clase padre Persona que define las propiedades y el comportamiento de los objetos persona que hereden de 
 * persona.
 * @author selene
 * @version 1.3
 */
public abstract class Persona {
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
	 * Método abstracto que genera el código de las clases herederas
	 */
	public abstract void setCodigo();
	/**
	 * Método abstracto que devuelve el código único del objeto de la clase heredera
	 * @return el código único de la clase heredera
	 */
	public abstract String getCodigo();
	/**
	 * Método que aumenta el contador del número de objetos tipo Persona instanciadas
	 */
	private void aumentarContadorPersonas() {
		Persona.contadorPersonas++;
	}
	@Override
	public String toString() {
		return "Nombre: "+this.getNombre()+" - DNI: "+this.getDni()+" - Trabajo: "+this.getTrabajo()+" - Email: "+this.getEmail()+" - Dirección: "+this.getDireccionCompleta()
				+" - Teléfono: "+this.getTelefono()+" - Información adicional: "+((this.getInfoAdicional()==null)?"ninguna":this.getInfoAdicional());
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getTrabajo() {
		return this.trabajo;
	}
	public String getEmail() {
		return this.email;
	}
	/**
	 * Método específico que genera la dirección completa
	 * @return la dirección completa
	 */
	public String getDireccionCompleta() {
		return this.getTipoVia()+" "+this.getNombreVia()+", "+this.getNumeroCasa()+((this.getBloque()==0)?"":" bloque: "+this.getBloque())
				+((this.getEscalera()==null)?"":" escalera: "+this.getEscalera())+((this.getPuerta()==null)?"":" puerta: "+this.getPuerta())
				+". "+this.getLocalidad()+", "+this.getProvincia()+". CP: "+this.getCodigoPostal();
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
	public String getInfoAdicional() {
		return this.infoAdicional;
	}
	public int getTelefono() {
		return this.telefono;
	}
	public String getLocalidad() {
		return this.localidad;
	}
	public String getProvincia() {
		return this.provincia;
	}
	public int getCodigoPostal() {
		return this.codigoPostal;
	}
	public String getPuerta() {
		return this.puerta;
	}
	public int getBloque() {
		return this.bloque;
	}
	public String getEscalera() {
		return this.escalera;
	}
	public int getNumeroCasa() {
		return this.numeroCasa;
	}
	public String getNombreVia() {
		return this.nombreVia;
	}
	public String getTipoVia() {
		return this.tipoVia;
	}
}
