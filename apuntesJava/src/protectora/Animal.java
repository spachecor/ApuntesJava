package protectora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.jdt.annotation.NonNull;

import protectora.interfaces.Agregable;
import protectora.interfaces.Buscable;
import protectora.interfaces.Eliminable;
import protectora.interfaces.Ordenable;
import protectora.utilidades.EstadosAnimal;
import protectora.utilidades.EstadosSolicitudAnimal;

/**
 * Clase Animal que define las propiedades y los comportamientos de los diferentes animales
 * @author selene
 * @version 1.3
 */
public class Animal implements Agregable, Ordenable, Comparable<Animal>{
	//el contadoInstanciasAnimales cuenta las instancias que se han hecho
	private static int contadorInstanciasAnimal;
	private String nombreAnimal;
	private int colorAnimal, tipoAnimal, sexoAnimal, razaAnimal, tamanio;
	//el tiempo en protectora se cuenta en meses
	private int codigoAnimal, edadAnimal, tiempoEnProtectora, contadorSolicitudes, contadorEstados;
	private long chip;
	private LocalDate fechaNacimientoAnimal;
	private LocalDateTime fechaEntradaProtectora;
	private boolean castrado, capacidadConvivirAnimales;
	private ArrayList<EstadoAnimal> estadosAnimal;
	private ArrayList<SolicitudAdopcion> solicitudes;
	{
		this.nombreAnimal="desconocido";
		this.capacidadConvivirAnimales=false;	
		this.chip=0;
<<<<<<< HEAD
		this.estadosAnimal= new ArrayList<EstadoAnimal>();
		this.solicitudes=new ArrayList<SolicitudAdopcion>();
=======
		//SE LE PONE UNA LONGITUD PROVISIONAL
		this.estadosAnimal= new EstadoAnimal[5];
		//SE LE PONE UNA LONGITUD PROVISIONAL
		this.solicitudes=new SolicitudAdopcion[5];
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
		this.contadorEstados=0;
		this.contadorSolicitudes=0;
	}
	static {
		Animal.contadorInstanciasAnimal=0;
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
	@Override
	/**
	 * Método agregar que viene de la interfaz Agregable para agregar objetos a los arrays de objetos. En este caso, según el objeto que entre, irá a uno u otro 
	 * array, o lanzará una excepción si el objeto no es el adecuado o si los arrays están llenos
	 * @param object el objeto que entrará en el array si no salta una excepción
	 */
	public void agregar(Object object) {
		//comprobacion de que entre un objeto del tipo EstadoAnimal
		if(object instanceof EstadoAnimal) {
<<<<<<< HEAD
			//agregamos el nuevo elemento al arraylist
			this.estadosAnimal.add((EstadoAnimal) object);
			//comprobacion de que entre un objeto del tipo SolicitudAdopcion
		}else if(object instanceof SolicitudAdopcion) {
			//agregamos el nuevo elemento al arraylist
			this.solicitudes.add((SolicitudAdopcion)object);
=======
			//comprobacion de que no este lleno en array de estados
			if(this.contadorEstados!=this.estadosAnimal.length) {
				//se añade el objeto
				this.estadosAnimal[this.contadorEstados]=(EstadoAnimal)object;
				//aumenta la veriable numérica que recoge la cantidad de objetos recogidos dentro del array
				this.contadorEstados++;
			}else throw new RuntimeException("Historial lleno");
			//comprobacion de que entre un objeto del tipo SolicitudAdopcion
		}else if(object instanceof SolicitudAdopcion) {
			//comprobacion de que no este lleno en array de solicitudes
			if(this.contadorSolicitudes!=this.solicitudes.length){
				//se añade el objeto
				this.solicitudes[this.contadorSolicitudes]=(SolicitudAdopcion)object;
				//se aumenta la variable num,erica que recoge la cantidad de objetos recogidos dentro del array
				this.contadorSolicitudes++;
			}else throw new RuntimeException("Historial lleno");
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
		}else throw new RuntimeException("Introducido objeto inválido");
	}
	@Override
	public boolean equals(Object obj) {
		//si el objeto es nulo, devuelve false
		if(obj==null)return false;
		//si pasa  el filtro, se comparan los códigos del animal. Sólo si son idénticos, es true
		return ((Animal)obj).getCodigoAnimal()==this.getCodigoAnimal();
	}
	@Override
	/**
	 * Método ordenar que viene de la interfaz Ordenable para ordenar los objetos dentro de un array. Ordena por el numero asignado al
	 * estado concreto
	 * @param objects[] es un array de objetos
	 */
	public void ordenar(ArrayList objects) {
		Collections.sort(objects);
	}
	@Override
	/**
	 * Método compareto de la interfaz Comparable que ordena los animales según su código de animal(multiplicamos resultado por menos uno para obtener el orden
	 * de menor a mayor)
	 */
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
		return "Nombre: "+this.getNombreAnimal()+" - Tipo: "+this.getTipoAnimal()+" - Color: "+this.getColorAnimal()
				+" - Sexo: "+this.getSexoAnimal()+" - Raza: "+this.getRazaAnimal()+" - Tamaño: "
				+this.getTamanio()+" - Edad: "+this.getEdadAnimal()+" - Tiempo en protectora(en meses): "+this.getTiempoEnProtectora()
				+" - ¿Castrado?: "+this.getCastrado()+" - ¿Chip?"+this.getComprobacionChip()+(this.getComprobacionChip()?
						" - Nº Chip: "+this.getChip():"");
	}
<<<<<<< HEAD
	public void resolverSolicitud(SolicitudAdopcion solicitud, boolean aprobacionProtectora) {
		//comprobacion del estado de la solicitud de adopcion del animal y de la aprobación de la protectora
		if(solicitud.getEstadoSolicitud()==EstadosSolicitudAnimal.EN_ESPERA&&aprobacionProtectora) {
			//la solicitud pasa a aprobada y el estado del animal a adoptado
			solicitud.setEstadoSolicitud(EstadosSolicitudAnimal.APROBADA);
			this.agregar(new EstadoAnimal(this, EstadosAnimal.ADOPTADO));
			//si no se cumplen las condiciones, la solicitud será denegada
		}else solicitud.setEstadoSolicitud(EstadosSolicitudAnimal.DENEGADA);
=======
	public void resolverSolicitud(boolean aprobacionProtectora) {
		//comprobacion del estado de la solicitud de adopcion del animal y de la aprobación de la protectora
		if(this.solicitudes[this.contadorSolicitudes].getEstadoSolicitud()==EstadosSolicitudAnimal.EN_ESPERA&&aprobacionProtectora) {
			//la solicitud pasa a aprobada y el estado del animal a adoptado
			this.solicitudes[this.contadorSolicitudes].setEstadoSolicitud(EstadosSolicitudAnimal.APROBADA);
			this.agregar(new EstadoAnimal(this, EstadosAnimal.ADOPTADO));
			//si no se cumplen las condiciones, la solicitud será denegada
		}else this.solicitudes[this.contadorSolicitudes].setEstadoSolicitud(EstadosSolicitudAnimal.DENEGADA);
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
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
	private void setTiempoEnProtectora() {
		ChronoUnit.MONTHS.between(fechaEntradaProtectora, LocalDateTime.now());
	}
	public static int getContadorInstanciasAnimal() {
		return Animal.contadorInstanciasAnimal;
	}
	public int getContadorSolicitudes() {
		return this.contadorSolicitudes;
	}
	public int getContadorEstados() {
		return this.contadorEstados;
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
	 * @return
	 */
	public int getEstadoAnimalActual() {
<<<<<<< HEAD
		ArrayList<EstadoAnimal> estados = this.getEstadosAnimal();
		return estados.get(estados.size()-1).getEstadoAnimal();
=======
		EstadoAnimal[] estados = (EstadoAnimal[])this.getEstadosAnimal();
		return estados[this.contadorEstados-1].getEstadoAnimal();
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
	}
}
