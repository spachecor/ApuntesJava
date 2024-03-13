package protectora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.jdt.annotation.NonNull;
import protectora.interfaces.Agregable;
import protectora.interfaces.Buscable;
import protectora.interfaces.Eliminable;
import protectora.interfaces.Ordenable;
import protectora.utilidades.*;

/**
 * Clase Animal que define las propiedades y los comportamientos de los diferentes animales
 * @author selene
 * @version 1.3
 */
public class Animal implements Agregable, Ordenable, Eliminable, Buscable, Comparable<Animal>{
	//el contadoInstanciasAnimales cuenta las instancias que se han hecho
	private static int contadorInstanciasAnimal;
	private String nombreAnimal;
	private int colorAnimal, tipoAnimal, sexoAnimal, razaAnimal, tamanio;
	//el tiempo en protectora se cuenta en meses
	private int codigoAnimal, edadAnimal, tiempoEnProtectora;
	private long chip;
	private LocalDate fechaNacimientoAnimal;
	private LocalDateTime fechaEntradaProtectora;
	private boolean castrado, capacidadConvivirAnimales;
	private ArrayList<EstadoAnimal> estadosAnimal;
	private ArrayList<SolicitudAdopcion> solicitudes;
	{
		this.nombreAnimal="desconocido";
		this.capacidadConvivirAnimales=false;	
		this.estadosAnimal= new ArrayList<>();
		this.solicitudes=new ArrayList<>();
		this.fechaNacimientoAnimal=null;
	}
	static {
		Animal.contadorInstanciasAnimal=0;
	}

	/**
	 * Constructor especializado en inicializar objetos de la clase con los requisitos mínimos especificados y que automáticamente le asocial el código al animal y
	 * el resto de sus propiedades
	 * @param nombreAnimal el nombre del animal
	 * @param tipoAnimal el tipo del animal
	 * @param colorAnimal el color del animal
	 * @param sexoAnimal el sexo del animal
	 * @param razaAnimal la raza del animal
	 * @param tamanio el tamaño del animal
	 * @param fechaNacimientoAnimal la fecha de nacimiento del animal
	 * @param castrado si el animal está o no castrado
	 * @param chip el nº del chip del animal
	 */
	public Animal(@NonNull String nombreAnimal,@NonNull int tipoAnimal,@NonNull int colorAnimal,@NonNull int sexoAnimal, int razaAnimal, int tamanio,@NonNull LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		//aumentamos el contadorInstanciasAnimal
		Animal.aumentarContadorInstanciasAnimal();
		//asignamos los valores al objeto animal
		this.setCodigoAnimal();
		this.setNombreAnimal(nombreAnimal);
		this.setTipoAnimal(tipoAnimal);
		this.setColorAnimal(colorAnimal);
		this.setSexoAnimal(sexoAnimal);
		this.setRazaAnimal(razaAnimal);
		this.setTamanio(tamanio);
		this.setEdadAnimal(fechaNacimientoAnimal);
		this.setFechaEntradaProtectora();
		this.setTiempoEnProtectora();
		this.setFechaNacimientoAnimal(fechaNacimientoAnimal);
		this.setCastrado(castrado);
		this.setChip(chip);
	}
	/**
	 * Aumenta el número de instancias del objeto Animal
	 */
	private static void aumentarContadorInstanciasAnimal() {
		Animal.contadorInstanciasAnimal++;
	}

	/**
	 * Disminuye el nº de instancias del objeto animal. Usado en los métodos de eliminar que eliminen animales.
	 */
	public static void disminuirContadorInstanciasAnimal(){
		Animal.contadorInstanciasAnimal--;
	}

	/**
	 * Método agregar que viene de la interfaz Agregable para agregar objetos a los arrays de objetos. En este caso, según el objeto que entre, irá a uno u otro 
	 * array, o lanzará una excepción si el objeto no es el adecuado o si los arrays están llenos
	 * @param object el objeto que entrará en el array si no salta una excepción
	 */
	@Override
	public void agregar(Object object) {
		//comprobacion de que entre un objeto del tipo EstadoAnimal
		if(object instanceof EstadoAnimal) {
			//agregamos el nuevo elemento al arraylist
			this.estadosAnimal.add((EstadoAnimal) object);
			//comprobacion de que entre un objeto del tipo SolicitudAdopcion
		}else if(object instanceof SolicitudAdopcion) {
			//agregamos el nuevo elemento al arraylist
			this.solicitudes.add((SolicitudAdopcion)object);
		}else throw new RuntimeException("Introducido objeto inválido");
	}
	@Override
	public void eliminar(ArrayList array, int indice) {
		array.remove(indice);
	}

	/**
	 * Método buscar heredado de la interfaz buscable, que recibe el arraylist en el que queremos buscar y el objeto a buscar.
	 * @param array es el arraylist en el que vamos a buscar
	 * @param object es el objeto que vamos a buscar en el arraylist
	 */
	@Override
	public int buscar(ArrayList array, Object object) {
		//creamos un iterador
		Iterator it = array.iterator();//usamos el iterador para iterar por la lista
		//mientras siga habiendo más elementos, el bucle seguirá dando vueltas
		while(it.hasNext()) {//si hay otro más, continuará
			Object aux = it.next();
			if(aux.equals(object))return Collections.binarySearch(array, aux);//si coincide el valor del objeto dentro de la lista 
			//con el que introducimos por parámetro, se devuelve la posición en la lista del objeto
		}
		//si se ha finalizado el bucle y no ha salido del método(lo que significa que no ha encontrado el objeto), devolverá -1
		return -1;
	}
	@Override
	public boolean equals(Object obj) {
		//si el objeto es nulo, devuelve false
		if(obj==null)return false;
		//si pasa  el filtro, se comparan los códigos del animal. Sólo si son idénticos, es true
		return ((Animal)obj).getCodigoAnimal()==this.getCodigoAnimal();
	}

	/**
	 * Método ordenar que viene de la interfaz Ordenable para ordenar los objetos dentro de un array. Ordena por el numero asignado al
	 * estado concreto
	 * @param objects es un arraylist de objetos
	 */
	@Override
	public void ordenar(ArrayList objects) {
		Collections.sort(objects);
	}

	/**
	 * Método compareto de la interfaz Comparable que ordena los animales según su código de animal(multiplicamos resultado por menos uno para obtener el orden
	 * de menor a mayor)
	 */
	@Override
	public int compareTo(Animal arg0) {
		//comprobación de nulidad y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(arg0.getCodigoAnimal()==0)throw new RuntimeException("El animal no existe/no tiene código asignado");
		
		if(arg0.getCodigoAnimal()<this.getCodigoAnimal())return-1*-1;
		else if(arg0.getCodigoAnimal()>this.getCodigoAnimal())return 1*-1;
		else return 0;
	}
	/**
	 * Método heredado toString que te dice las características del animal
	 */
	@Override
	public String toString() {
		return "Nombre: "+this.getNombreAnimal()+" - Tipo: "+MapeadoAnimal.tiposAnimal.get(this.getTipoAnimal())+" - Color: "+MapeadoAnimal.coloresAnimal.get(this.getColorAnimal())
				+" - Sexo: "+MapeadoAnimal.sexosAnimal.get(this.getSexoAnimal())+" - Raza: "
				+((this.getRazaAnimal()>=19&&this.getRazaAnimal()<=38)?MapeadoAnimal.razasGato.get(this.getRazaAnimal()):MapeadoAnimal.razasPerro.get(this.getRazaAnimal()))
				+" - Tamaño: "+MapeadoAnimal.tamaniosAnimal.get(this.getTamanio())+" - Edad: "+this.getEdadAnimal()+" años - Tiempo en protectora(en meses): "+this.getTiempoEnProtectora()
				+" - ¿Castrado?: "+this.getCastrado()+" - ¿Chip?"+this.getComprobacionChip()+(this.getComprobacionChip()?
						" - Nº Chip: "+this.getChip():"");
	}
	public void resolverSolicitud(SolicitudAdopcion solicitud, boolean aprobacionProtectora) {
		//comprobacion del estado de la solicitud de adopcion del animal y de la aprobación de la protectora
		if(solicitud.getEstadoSolicitud()== EstadosSolicitudAdopcion.EN_ESPERA&&aprobacionProtectora) {
			//la solicitud pasa a aprobada y el estado del animal a adoptado
			solicitud.setEstadoSolicitud(EstadosSolicitudAdopcion.APROBADA);
			this.agregar(new EstadoAnimal(EstadosAnimal.ADOPTADO));
			//si no se cumplen las condiciones, la solicitud será denegada
		}else solicitud.setEstadoSolicitud(EstadosSolicitudAdopcion.DENEGADA);
	}
	private void setCodigoAnimal() {
		this.codigoAnimal=Animal.getContadorInstanciasAnimal();
	}
	private void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal=nombreAnimal;
	}
	private void setTipoAnimal(int tipoAnimal) {
		this.tipoAnimal=tipoAnimal;
	}
	public void setColorAnimal(int color) {
		this.colorAnimal= color;
	}
	private void setSexoAnimal(int sexoAnimal) {
		this.sexoAnimal=sexoAnimal;
	}
	private void setRazaAnimal(int razaAnimal) {
		if(razaAnimal==0&&this.getTipoAnimal()== TipoAnimal.GATO){
			this.razaAnimal= RazasGato.COMUN_EUROPEO;
		}else if(razaAnimal==0&&this.getTipoAnimal()==TipoAnimal.PERRO){
			this.razaAnimal= RazasPerro.MESTIZO;
		}else this.razaAnimal=razaAnimal;
	}
	private void setTamanio(int tamanio) {
		if(tamanio==0){
			this.tamanio=Tamanios.MEDIANO;
		}else this.tamanio=tamanio;
	}
	private void setEdadAnimal(LocalDate fechaNacimientoAnimal) {
		this.edadAnimal=(int)ChronoUnit.YEARS.between(fechaNacimientoAnimal, LocalDate.now());
	}
	private void setFechaNacimientoAnimal(LocalDate fechaNacimientoAnimal) {
		this.fechaNacimientoAnimal=fechaNacimientoAnimal;
	}
	private void setFechaEntradaProtectora() {
		this.fechaEntradaProtectora=LocalDateTime.now();
	}
	private void setCastrado(boolean castrado) {
		this.castrado=castrado;
	}
	private void setChip(long chip) {
		this.chip=chip;
	}
	private void setTiempoEnProtectora() {
		this.tiempoEnProtectora = (int)ChronoUnit.MONTHS.between(fechaEntradaProtectora, LocalDateTime.now());
	}
	public static int getContadorInstanciasAnimal() {
		return Animal.contadorInstanciasAnimal;
	}
	public String getNombreAnimal() {
		return this.nombreAnimal;
	}
	public long getChip() {
		return this.chip;
	}
	public int getTipoAnimal() {
		return this.tipoAnimal;
	}
	public int getColorAnimal() {
		return this.colorAnimal;
	}
	public int getSexoAnimal() {
		return this.sexoAnimal;
	}
	public int getRazaAnimal() {
		return this.razaAnimal;
	}
	public int getTamanio() {
		return this.tamanio;
	}
	public int getEdadAnimal() {
		return this.edadAnimal;
	}
	public int getTiempoEnProtectora() {
		return this.tiempoEnProtectora;
	}
	public boolean getCastrado() {
		return this.castrado;
	}
	public boolean getComprobacionChip() {
		if(this.getChip()==0)return false;
		else return true;
	}
	public int getCodigoAnimal() {
		return this.codigoAnimal;
	}
	public ArrayList<EstadoAnimal> getEstadosAnimal() {
		return estadosAnimal;
	}
	/**
	 * Método que devuelve el estado del animal contenido dentro de un objeto de tipo EstadoAnimal
	 * @return Devuelve el estado del animal actual, que es el último dentro del array de estados del animal que éste contiene
	 */
	public int getEstadoAnimalActual() {
		ArrayList<EstadoAnimal> estados = this.getEstadosAnimal();
		return estados.get(estados.size()-1).getEstadoAnimal();
	}
}
