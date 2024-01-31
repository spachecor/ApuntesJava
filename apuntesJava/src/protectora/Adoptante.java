package protectora;

import protectora.interfaces.Agregable;

/**
 * Clase Adoptante que hereda de Persona. Define los comportamientos y las propiedades de los objeto tipo Adoptante
 * @author selene
 * @version 1.1
 */
public final class Adoptante extends Persona implements Agregable, Comparable{
	
	private static int contadorSolicitudes;
	private String codigoAdoptante;
	private int ingresosAdoptante, dimensionViviendaAdoptante, numeroMascotasAdoptante;
	private boolean vetoAdoptante;
	private SolicitudAdopcion solicitudes[];
	{
		this.vetoAdoptante=false;
		//SE LE ASIGNA UNA LONGITUD PROVISIONAL
		this.solicitudes=new SolicitudAdopcion[5];
	}
	static {
		Adoptante.contadorSolicitudes=0;
	}
	/**
	 * Constructor de objetos del tipo Animal
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
	 * @param ingresosAdoptante
	 * @param dimensionViviendaAdoptante
	 * @param numeroMascotasAdoptante
	 */
	public Adoptante(String nombre, String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal, int ingresosAdoptante, int dimensionViviendaAdoptante, int numeroMascotasAdoptante) {
		super(nombre, dni, trabajo, email, tipoVia, nombreVia, escalera, puerta, infoAdicional, localidad, provincia, telefono, numeroCasa, bloque, codigoPostal);
		this.setIngresosAdoptante(ingresosAdoptante);;
		this.setDimensionesViviendasAdoptante(dimensionViviendaAdoptante);
		this.setNumeroMascotasAdoptante(numeroMascotasAdoptante);
		//le asignamos su código de adoptante
		this.setCodigo();
	}
	@Override
	/**
	 * Método agregar que viene de la interfaz Agregable para agregar objetos a los arrays de objetos. En este caso, según el objeto que entre, irá a uno u otro 
	 * array, o lanzará una excepción si el objeto no es el adecuado o si los arrays están llenos
	 * @param object el objeto que entrará en el array si no salta una excepción
	 */
	public void agregar(Object object) {
		if(object instanceof SolicitudAdopcion) {
			if(Adoptante.contadorSolicitudes!=this.solicitudes.length) {
				this.solicitudes[Adoptante.contadorSolicitudes]=(SolicitudAdopcion)object;
				Adoptante.contadorSolicitudes++;
			}else throw new RuntimeException("Historial lleno");
		}else throw new RuntimeException("Introducido objeto inválido");
	}
	@Override
	public void setCodigo() {
		this.codigoAdoptante=super.getDni().toLowerCase().concat("a");
	}
	@Override
	public String toString() {
		return super.toString()+" - Código adoptante: "+this.getCodigo();
	}
	@Override
	public String getCodigo() {
		return this.codigoAdoptante;
	}
	@Override
	public int compareTo(Object arg0) {
		//comprobación de nulidad, de instancia y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(!(arg0 instanceof Adoptante))throw new RuntimeException("Introducido un objeto inválido");
		if(((Adoptante)arg0).getCodigo()==null)throw new RuntimeException("El código del adoptante no puede ser nulo");
		
		if(((Adoptante)arg0).getCodigo().compareTo(this.getCodigo())==-1)return -1*-1;
		else if(((Adoptante)arg0).getCodigo().compareTo(this.getCodigo())==1)return 1*-1;
		else return 0;
	}
	private void setIngresosAdoptante(int ingresosAdoptante) {
		this.ingresosAdoptante=ingresosAdoptante;
	}
	private void setDimensionesViviendasAdoptante(int dimensionViviendaAdoptante) {
		this.dimensionViviendaAdoptante=dimensionViviendaAdoptante;
	}
	private void setNumeroMascotasAdoptante(int numeroMascotasAdoptante) {
		this.numeroMascotasAdoptante=numeroMascotasAdoptante;
	}
	public void setVetoAdoptante(boolean vetoAdoptante) {
		this.vetoAdoptante=vetoAdoptante;
	}
	public boolean getVetoAdoptante() {
		return this.vetoAdoptante;
	}
	public int getNumeroMascotasAdoptante() {
		return this.numeroMascotasAdoptante;
	}
	public int getDimensionViviendaAdoptante() {
		return this.dimensionViviendaAdoptante;
	}
	public int getIngresosAdoptante() {
		return this.ingresosAdoptante;
	}
}
