package protectora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.jdt.annotation.NonNull;

import protectora.interfaces.Agregable;
import protectora.interfaces.Ordenable;

/**
 * Clase Animal que define las propiedades y los comportamientos de los diferentes animales
 * @author selene
 * @version 1.2
 */
public class Animal implements Agregable, Ordenable, Comparable{
	//el contadorAnimales cuenta los animales que existen actualmente, y el contadoInstanciasAnimales cuenta las instancias que se han hecho sin tener en cuenta los
	//animales que existen o no actualmente
	private static int contadorAnimal, contadorInstanciasAnimal, contadorSolicitudes, contadorEstados;
	private String nombreAnimal;
	private int colorAnimal, tipoAnimal, sexoAnimal, razaAnimal, tamanio;
	//el tiempo en protectora se cuenta en meses
	private int codigoAnimal, edadAnimal, tiempoEnProtectora;
	private long chip;
	private LocalDate fechaNacimientoAnimal;
	private LocalDateTime fechaEntradaProtectora;
	private boolean castrado, capacidadConvivirAnimales;
	private EstadoAnimal estadosAnimal[];
	private SolicitudAdopcion solicitudes[];
	{
		this.nombreAnimal="desconocido";
		this.capacidadConvivirAnimales=false;	
		this.chip=0;
		//SE LE PONE UNA LONGITUD PROVISIONAL
		this.estadosAnimal= new EstadoAnimal[5];
		//SE LE PONE UNA LONGITUD PROVISIONAL
		this.solicitudes=new SolicitudAdopcion[5];
	}
	static {
		Animal.contadorAnimal=0;
		Animal.contadorInstanciasAnimal=0;
		Animal.contadorEstados=0;
		Animal.contadorSolicitudes=0;
	}
	/**
	 * Constructor especializado en inicializar objetos de la clase con los requisitos mínimos especificados y que automáticamente le asocial el código al animal y
	 * el resto de sus propiedades
	 * @param colorAnimal
	 * @param sexoAnimal
	 * @param fechaNacimientoAnimal
	 * @param castrado
	 * @param chip
	 */
	public Animal(@NonNull String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, int tamanio, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		//aumentamos tanto el contadoAnimales como el contadorInstanciasAnimal
		this.aumentarContadorAnimal();
		this.aumentarContadorInstanciasAnimal();
		//asignamos los valores al objeto animal
		this.setNombreAnimal(nombreAnimal);
		this.setTipoAnimal(tipoAnimal);
		this.setColorAnimal(colorAnimal);
		this.setSexoAnimal(sexoAnimal);
		this.setRazaAnimal(razaAnimal);
		this.setTamanio(tamanio);
		this.setEdadAnimal(fechaNacimientoAnimal);
		this.setFechaEntradaProtectora();
		this.setFechaNacimientoAnimal(fechaNacimientoAnimal);
		this.setCastrado(castrado);
		this.setChip(chip);
	}
	/**
	 * Aumenta el contador de animales existentes actualmente
	 */
	private void aumentarContadorAnimal() {
		Animal.contadorAnimal++;
	}
	/**
	 * Aumenta el número de instancias del objeto Animal
	 */
	private void aumentarContadorInstanciasAnimal() {
		Animal.contadorInstanciasAnimal++;
	}
	@Override
	/**
	 * Método agregar que viene de la interfaz Agregable para agregar objetos a los arrays de objetos. En este caso, según el objeto que entre, irá a uno u otro 
	 * array, o lanzará una excepción si el objeto no es el adecuado o si los arrays están llenos
	 * @param object el objeto que entrará en el array si no salta una excepción
	 */
	public void agregar(Object object) {
		if(object instanceof EstadoAnimal) {
			if(Animal.contadorEstados!=this.estadosAnimal.length) {
				this.estadosAnimal[Animal.contadorEstados]=(EstadoAnimal)object;
				Animal.contadorEstados++;
			}else throw new RuntimeException("Historial lleno");
		}else if(object instanceof SolicitudAdopcion) {
			if(Animal.contadorSolicitudes!=this.solicitudes.length){
				this.solicitudes[Animal.contadorSolicitudes]=(SolicitudAdopcion)object;
				Animal.contadorSolicitudes++;
			}else throw new RuntimeException("Historial lleno");
		}else throw new RuntimeException("Introducido objeto inválido");
	}
	@Override
	/**
	 * Método ordenar que viene de la interfaz Ordenable para ordenar los objetos dentro de un array. Ordena por el numero asignado al
	 * estado concreto
	 * @param objects[] es un array de objetos
	 */
	public void ordenar(Object[] objects) {
		//ordenamos el array, nos lo ordenará de mayor a menor
		Arrays.sort(objects);
		//como lo queremos de menor a mayor,invertimos el orden del array con un método static de la class Collection
		Collections.reverse(Arrays.asList(objects));
	}
	@Override
	/**
	 * Método compareto de la interfaz Comparable que ordena los animales según su código de animal
	 */
	public int compareTo(Object arg0) {
		if(((Animal)arg0).getCodigoAnimal()<this.getCodigoAnimal())return -1;
		else if(((Animal)arg0).getCodigoAnimal()>this.getCodigoAnimal())return 1;
		else return 0;
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
		this.razaAnimal=razaAnimal;
	}
	private void setTamanio(int tamanio) {
		this.tamanio=tamanio;
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
	public String getNombreAnimal() {
		return this.nombreAnimal;
	}
	public long getChip() {
		return this.chip;
	}
	public int getTipoAnimal() {
		return this.tipoAnimal;
	}
	public int getCodigoAnimal() {
		return this.codigoAnimal;
	}
	public Object[] getEstadosAnimal() {
		return estadosAnimal;
	}
	public int getEstadoAnimalActual() {
		EstadoAnimal[] estados = (EstadoAnimal[]) this.getEstadosAnimal();
		return estados[Animal.contadorEstados-1].getEstadoAnimal();
	}
}
