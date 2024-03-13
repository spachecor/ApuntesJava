package protectora;

import org.eclipse.jdt.annotation.NonNull;

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
	 * @param nombre el nombre del adoptante
	 * @param dni el dni de la persona
	 * @param trabajo el trabajo de la persona
	 * @param email el email de la persona
	 * @param tipoVia el tipo de via donde vive la persona
	 * @param nombreVia el nombre de la via donde vive la persona
	 * @param escalera la escalera de la direccion de la persona
	 * @param puerta la puerta de la direccion de la persona
	 * @param infoAdicional información adicional sobre la persona
	 * @param localidad la localidad donde vive la persona
	 * @param provincia la provinicia donde vive la persona
	 * @param telefono el telefono de la persona
	 * @param numeroCasa el numero de la casa donde vive la persona
	 * @param bloque el bloque donde vive la persona
	 * @param codigoPostal el codigo postal donde vive la persona
	 */
	protected Persona(@NonNull String nombre,@NonNull  String dni, String trabajo,@NonNull  String email,@NonNull  String tipoVia,@NonNull  String nombreVia, String escalera,String puerta, String infoAdicional,@NonNull  String localidad,@NonNull  String provincia,@NonNull  int telefono,@NonNull  int numeroCasa, int bloque,@NonNull  int codigoPostal) {
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
	public abstract int getCodigo();
	/**
	 * Método que aumenta el contador del número de objetos tipo Persona instanciadas
	 */
	@Override
	public String toString() {
		return "Nombre: "+this.getNombre()+" - DNI: "+this.getDni()+" - Trabajo: "+((trabajo==null||trabajo.equals("null"))?"ninguno":this.getTrabajo())+" - Email: "+this.getEmail()+" - Dirección: "+this.getDireccionCompleta()
				+" - Teléfono: "+this.getTelefono()+" - Información adicional: "+((this.getInfoAdicional()==null)?"ninguna":this.getInfoAdicional());
	}
	private static void aumentarContadorPersonas() {
		Persona.contadorPersonas++;
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
		//en esta expresión regular, metemos un espacio al final para indicar que el nombre puede contener espacios.
		Pattern pat = Pattern.compile("^[a-zA-ZáÁéÉíÍóÓúÚ ]+$");
		Matcher mat = pat.matcher(nombre);
		if(mat.matches()){
			this.nombre=nombre;
		}else throw new RuntimeException("Introducido nombre inválido");
	}
	private void setDni(String dni) {
		//Primero creamos un objeto tipo Pattern para representar la expresión regular. Con el método compile
		//recibimos el parámetro de la expresión regular y se devuelve un objeto de la clase pattern
		Pattern pat = Pattern.compile("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
		//Después creamos un objeto de la clase Matcher, que usaremos para comparar el dni que entre con
		//la expresión regular.
		Matcher mat = pat.matcher(dni);
		//por último, con el método matcher obtendremos si coincide con el patrón, así que directamente
		//comparamos si es true o false para validarlo o directamente lanzar una excepción
		if(mat.matches()) {
			this.dni=dni;
		}else throw new RuntimeException("Se ha introducido un DNI inválido");
	}
	private void setTrabajo(String trabajo) {
		this.trabajo=trabajo;
	}
	private void setEmail(String email) {
		Pattern pat = Pattern.compile("^[a-zA-Z0-9]+\\.[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$");
		Matcher mat = pat.matcher(email);
		if(mat.matches()) {
			this.email=email;
		}else throw new RuntimeException("Se ha introducido un email inválido");
	}
	private void setTipoVia(String tipoVia) {
		Pattern pat = Pattern.compile("^[a-zA-Z ]+$");
		Matcher mat = pat.matcher(tipoVia);
		if(mat.matches()){
			this.tipoVia=tipoVia;
		}else throw new RuntimeException("Se ha introducido un tipo de vía incorrecto");
	}
	private void setNombreVia(String nombreVia) {
		Pattern pat = Pattern.compile("^[a-zA-ZáÁéÉíÍóÓúÚ ]+$");
		Matcher mat = pat.matcher(nombreVia);
		if(mat.matches()){
			this.nombreVia=nombreVia;
		}else throw new RuntimeException("Se ha introducido un nombre de vía incorrecto");
	}
	private void setEscalera(String escalera) {
		if(escalera==null|| escalera.equals("null")){
			this.escalera= null;
		}else {
			Pattern pat = Pattern.compile("^[a-zA-Z0-9 ]+$");
			Matcher mat = pat.matcher(escalera);
			if (mat.matches()) {
				this.escalera = escalera;
			} else throw new RuntimeException("Se ha introducido una escalera incorrecta");
		}
	}
	private void setPuerta(String puerta) {
		if(puerta==null||puerta.equals("null")){
			this.puerta= null;
		}else{
			Pattern pat = Pattern.compile("^[a-zA-Z0-9 ]+$");
			Matcher mat = pat.matcher(puerta);
			if(mat.matches()){
				this.puerta=puerta;
			}else throw new RuntimeException("Se ha introducido una puerta incorrecta");
		}
	}
	private void setInfoAdicional(String infoAdicional) {
		if(infoAdicional==null||infoAdicional.equals("null")){
			this.infoAdicional=null;
		}else this.infoAdicional=infoAdicional;
	}
	private void setLocalidad(String localidad) {
		this.localidad=localidad;
	}
	private void setProvincia(String provincia) {
		this.provincia=provincia;
	}
	private void setTelefono(int telefono) {
		Pattern pat = Pattern.compile("^[0-9]{9,12}$");
		Matcher mat = pat.matcher(String.valueOf(telefono));
		if(mat.matches()){
			this.telefono=telefono;
		}else throw new RuntimeException("Se ha introducido un teléfono incorrecto");
	}
	private void setNumeroCasa(int numeroCasa) {
		Pattern pat = Pattern.compile("^[0-9]{1,2}[0-9]?$");
		Matcher mat = pat.matcher(String.valueOf(numeroCasa));
		if(mat.matches()) {
			this.numeroCasa=numeroCasa;
		}else throw new RuntimeException("Se ha introducido un número incorrecto");	
	}
	private void setBloque(int bloque) {
		Pattern pat = Pattern.compile("^[0-9]{1,2}$");
		Matcher mat = pat.matcher(String.valueOf(bloque));
		if(mat.matches()){
			this.bloque=bloque;
		}else throw new RuntimeException("Introducido nº de bloque inválido");
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
