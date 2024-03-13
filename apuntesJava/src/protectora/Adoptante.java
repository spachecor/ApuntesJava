package protectora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import protectora.interfaces.Agregable;
import protectora.interfaces.Buscable;
import protectora.interfaces.Ordenable;
import protectora.interfaces.Eliminable;

/**
 * Clase Adoptante que hereda de Persona. Define los comportamientos y las propiedades de los objeto tipo Adoptante
 * @author selene
 * @version 1.3
 */
public final class Adoptante extends Persona implements Agregable, Eliminable, Buscable, Ordenable, Comparable<Adoptante>{
	
	private static int contadorSolicitudes;//variable estática que sirve para contar las solicitudes actuales
	private int ingresosAdoptante, dimensionViviendaAdoptante, numeroMascotasAdoptante, codigoAdoptante;//código único del adoptante
	private boolean vetoAdoptante;//si el adoptante está o no vetado
	private ArrayList<SolicitudAdopcion> solicitudes;//array de solicitudes de adopcion realizadas, tanto aceptadas como denegadas
	{
		this.vetoAdoptante=false;
		this.solicitudes=new ArrayList<>();
	}
	static {
		Adoptante.contadorSolicitudes=0;
	}
	/**
	 * Constructor de objetos del tipo Adoptante
	 * @param nombre el nombre del adoptante
	 * @param dni el dni del adoptante
	 * @param trabajo el trabajo del adoptante
	 * @param email el email del adoptante
	 * @param tipoVia el tipo de via donde vive el adoptante
	 * @param nombreVia el nombre de la via donde vive el adoptante
	 * @param escalera la escalera de la direccion de la adoptante
	 * @param puerta la puerta de la direccion del adoptante
	 * @param infoAdicional información adicional sobre el adoptante
	 * @param localidad la localidad donde vive el adoptante
	 * @param provincia la provinicia donde vive el adoptante
	 * @param telefono el telefono del adoptante
	 * @param numeroCasa el numero de la casa donde vive el adoptante
	 * @param bloque el bloque donde vive el adoptante
	 * @param codigoPostal el codigo postal donde vive el adoptante
	 * @param ingresosAdoptante los ingresos del adoptante
	 * @param dimensionViviendaAdoptante las dimensiones del adoptante
	 * @param numeroMascotasAdoptante el numero de mascotas que tiene el adoptante
	 */
	public Adoptante(String nombre, String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal, int ingresosAdoptante, int dimensionViviendaAdoptante, int numeroMascotasAdoptante) {
		super(nombre, dni, trabajo, email, tipoVia, nombreVia, escalera, puerta, infoAdicional, localidad, provincia, telefono, numeroCasa, bloque, codigoPostal);
		this.setIngresosAdoptante(ingresosAdoptante);;
		this.setDimensionesViviendasAdoptante(dimensionViviendaAdoptante);
		this.setNumeroMascotasAdoptante(numeroMascotasAdoptante);
		//le asignamos su código de adoptante
		this.setCodigo();
	}

	/**
	 * Método agregar que viene de la interfaz Agregable para agregar objetos a los arrays de objetos. En este caso, según el objeto que entre, irá a uno u otro 
	 * array, o lanzará una excepción si el objeto no es el adecuado o si los arrays están llenos
	 * @param object el objeto que entrará en el array si no salta una excepción
	 */
	@Override
	public void agregar(Object object) {
		//comprobacion de que entre un objeto de tipo SolicitudAdopcion
		if(object instanceof SolicitudAdopcion) {
			//agregamos el nuevo elemento ArrayList
			this.solicitudes.add((SolicitudAdopcion)object);
		}else throw new RuntimeException("Introducido objeto inválido");
	}
	@Override
	public void eliminar(ArrayList array, int indice) {
		array.remove(indice);
	}
	@Override
	public int buscar(ArrayList array, Object object) {
		//creamos un iterador
		Iterator<Object> it = array.iterator();//usamos el iterador para iterar por la lista
		//mientras siga habiendo más elementos, el bucle seguirá dando vueltas
		while(it.hasNext()) {//si hay otro más, continuará
			Object aux = it.next();
			if(aux.equals(object))return Collections.binarySearch(array, aux);//si coincide el valor del objeto dentro de la lista
			//con el que introducimos por parámetro, se devuelve la posición en la lista del objeto
		}
		//si se ha finalizado el bucle y no ha salido del método(lo que significa que no ha encontrado el objeto), devolverá -1
		return -1;
	}
	/**
	 * Método toString reescrito para personalizar el mensaje cuando se imprime un objeto de esta clase
	 */
	@Override
	public String toString() {
		return "Código adoptante: "+this.getCodigo()+" - "+super.toString();
	}
	/**
	 * Método de la interfaz Comparable que nos devuelve un valor u otro según el objeto sea mayor, menor o igual al introducido por parámetro comparados por el 
	 * código único
	 * @param arg0 un objeto Adoptante
	 */
	@Override
	public int compareTo(Adoptante arg0) {
		//comprobación de nulidad y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(arg0.getCodigo()<10000000)throw new RuntimeException("El código del cliente no existe");
		
		if(arg0.getCodigo()<(this.getCodigo()))return -1*-1;
		else if(arg0.getCodigo()>(this.getCodigo()))return 1*-1;
		else return 0;
	}

	/**
	 * Método implementado por la interfaz Ordenable que ordena el array
	 */
	@Override
	public void ordenar(ArrayList objects) {
		Collections.sort(objects);
	}
	private void setIngresosAdoptante(int ingresosAdoptante) {
		Pattern pat = Pattern.compile("^[0-9]+$");
		Matcher mat = pat.matcher(String.valueOf(ingresosAdoptante));
		if(mat.matches()){
			this.ingresosAdoptante=ingresosAdoptante;
		}else throw new RuntimeException("Los ingresos no son válidos");
	}
	/**
	 * Método getCodigo heredado de clase padre Persona para mostrar el código único del objeto
	 */
	@Override
	public int getCodigo() {
		return this.codigoAdoptante;
	}
	private void setDimensionesViviendasAdoptante(int dimensionViviendaAdoptante) {
		Pattern pat = Pattern.compile("^[0-9]+$");
		Matcher mat = pat.matcher(String.valueOf(dimensionViviendaAdoptante));
		if(mat.matches()){
			this.dimensionViviendaAdoptante=dimensionViviendaAdoptante;
		}else throw new RuntimeException("La dimensión de la vivienda no es correcta.");
	}
	/**
	 * Método setCodigo heredado de clase padre Persona para asignar el código único al adoptante
	 */
	@Override
	public void setCodigo() {
		this.codigoAdoptante=Integer.parseInt(super.getDni().substring(0, 8));
	}
	public void aumentarNumeroMascotas(){
		this.numeroMascotasAdoptante++;
	}
	private void setNumeroMascotasAdoptante(int numeroMascotasAdoptante) {
		Pattern pat = Pattern.compile("^[0-9]{1,2}$");
		Matcher mat = pat.matcher(String.valueOf(numeroMascotasAdoptante));
		if(mat.matches()){
			this.numeroMascotasAdoptante=numeroMascotasAdoptante;
		}else throw new RuntimeException("El nº de mascotas es incorrecto");
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
