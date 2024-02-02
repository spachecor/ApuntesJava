package protectora;

import java.util.Arrays;

import protectora.interfaces.Agregable;
import protectora.interfaces.Ordenable;
import protectora.interfaces.Eliminable;

/**
 * Clase Adoptante que hereda de Persona. Define los comportamientos y las propiedades de los objeto tipo Adoptante
 * @author selene
 * @version 1.2
 */
public final class Adoptante extends Persona implements Agregable, Ordenable, Eliminable, Comparable<Adoptante>{
	
	private static int contadorSolicitudes;//variable estática que sirve para contar las solicitudes actuales
	private String codigoAdoptante;//código único del adoptante
	private int ingresosAdoptante, dimensionViviendaAdoptante, numeroMascotasAdoptante;
	private boolean vetoAdoptante;//si el adoptante está o no vetado
	private SolicitudAdopcion solicitudes[];//array de solicitudes de adopcion realizadas, tanto aceptadas como denegadas
	{
		this.vetoAdoptante=false;
		//SE LE ASIGNA UNA LONGITUD PROVISIONAL
		this.solicitudes=new SolicitudAdopcion[5];
	}
	static {
		Adoptante.contadorSolicitudes=0;
	}
	/**
	 * Constructor de objetos del tipo Adoptante
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
	/**
	 * Método eliminar que viene de la interfaz Eliminable para eliminar objetos a los arrays de objetos.Lanzará excepcion si el objeto no es el adecuado o si los
	 * arrays están llenos
	 * @param object el objeto que se eliminará en el array si no salta una excepción
	 */
	public void eliminar(Object object) {
		if(object instanceof SolicitudAdopcion) {
			if(Adoptante.contadorSolicitudes!=0) {
				this.solicitudes[Adoptante.contadorSolicitudes]=null;
				Adoptante.contadorSolicitudes--;
			}else throw new RuntimeException("No hay nada que eliminar");
		}else throw new RuntimeException("Introducido objeto inválido");
	}	
	@Override
	/**
	 * Método setCodigo heredado de clase padre Persona para asignar el código único al adoptante
	 */
	public void setCodigo() {
		this.codigoAdoptante=super.getDni().toLowerCase().concat("a");
	}
	@Override
	/**
	 * Método toString reescrito para personalizar el mensaje cuando se imprime un objeto de esta clase
	 */
	public String toString() {
		return "Código adoptante: "+this.getCodigo()+" - "+super.toString();
	}
	@Override
	/**
	 * Método getCodigo heredado de clase padre Persona para mostrar el código único del objeto
	 */
	public String getCodigo() {
		return this.codigoAdoptante;
	}
	@Override
	/**
	 * Método de la interfaz Comparable que nos devuelve un valor u otro según el objeto sea mayor, menor o igual al introducido por parámetro comparados por el 
	 * código único
	 * @param arg0 un objeto Adoptante
	 */
	public int compareTo(Adoptante arg0) {
		//comprobación de nulidad y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(arg0.getCodigo()==null)throw new RuntimeException("El código del adoptante no puede ser nulo");
		
		if(arg0.getCodigo().compareTo(this.getCodigo())==-1)return -1*-1;
		else if(arg0.getCodigo().compareTo(this.getCodigo())==1)return 1*-1;
		else return 0;
	}
	@Override
	/**
	 * Método implementado por la interfaz Ordenable que ordena el array
	 */
	public void ordenar(Object[] objects) {
		Arrays.sort(objects);
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
