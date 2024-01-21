package protectora;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import protectora.interfaces.Agregable;

/**
 * Clase Animal que define las propiedades y los comportamientos de los diferentes animales
 * @author selene
 * @version 1.0
 */
public class Animal implements Agregable{
	private String nombreAnimal;
	//el tiempo en protectora se cuenta en meses
	private int codigoAnimal, edadAnimal, tiempoEnProtectora, colorAnimal, tipoAnimal, sexoAnimal, razaAnimal;
	private long chip;
	//el contadorAnimales cuenta los animales que existen actualmente, y el contadoInstanciasAnimales cuenta las instancias que se han hecho sin tener en cuenta los
	//animales que existen o no actualmente
	private static int contadorAnimal, contadorInstanciasAnimal, contadorSolicitudes, contadorEstados;
	private LocalDate fechaNacimientoAnimal;
	private LocalDateTime fechaEntradaProtectora;
	private boolean castrado, capacidadConvivirAnimales;
	private EstadoAnimal estadoAnimal[];
	private SolicitudAdopcion solicitudes[];
	{
		this.nombreAnimal="desconocido";
		this.capacidadConvivirAnimales=false;
		this.chip=0;
		//SE LE PONE UN VALOR PROVISIONAL
		estadoAnimal=new EstadoAnimal[5];
		solicitudes=new SolicitudAdopcion[5];
	}
	static {
		Animal.contadorAnimal=0;
		Animal.contadorInstanciasAnimal=0;
		Animal.contadorSolicitudes=0;
		Animal.contadorEstados=0;
	}
	/**
	 * Constructor especializado en inicializar objetos de la clase con los requisitos especificados y que automáticamente le asocia el código al animal y
	 * el resto de sus propiedades
	 * @param colorAnimal
	 * @param sexoAnimal
	 * @param fechaNacimientoAnimal
	 * @param castrado
	 * @param chip
	 */
	public Animal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		//aumentamos tanto el contadoAnimales como el contadorInstanciasAnimal
		this.aumentarContadorAnimal();
		this.aumentarContadorInstanciasAnimal();
		//asignamos los valores al objeto animal
		this.setNombreAnimal(nombreAnimal);
		this.setTipoAnimal(tipoAnimal);
		this.setColorAnimal(colorAnimal);
		this.setSexoAnimal(sexoAnimal);
		this.setRazaAnimal(razaAnimal);
		this.setEdadAnimal(fechaNacimientoAnimal);
		this.setFechaNacimientoAnimal(fechaNacimientoAnimal);
		this.setCastrado(castrado);
		this.setChip(chip);
	}
	@Override
	public void agregar(Object object) {
		if(object instanceof EstadoAnimal) {
			if(Animal.contadorEstados!=this.estadoAnimal.length) {
				this.estadoAnimal[Animal.contadorEstados]=(EstadoAnimal)object;
				Animal.contadorEstados++;
			}else throw new RuntimeException("Historial lleno");
		}else if(object instanceof SolicitudAdopcion) {
			if(Animal.contadorSolicitudes!=this.solicitudes.length) {
				this.solicitudes[Animal.contadorSolicitudes]=(SolicitudAdopcion)object;
				Animal.contadorSolicitudes++;
			}else throw new RuntimeException("Historial lleno");
		}else throw new RuntimeException("Introducido un objeto inválido");
	}
	private void aumentarContadorInstanciasAnimal() {
		Animal.contadorInstanciasAnimal++;
	}
	private void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal=nombreAnimal;
	}
	private void setTipoAnimal(int tipoAnimal) {
		this.tipoAnimal=tipoAnimal;;	
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
	private void setEdadAnimal(LocalDate fechaNacimientoAnimal) {
		this.edadAnimal=(int)ChronoUnit.YEARS.between(fechaNacimientoAnimal, LocalDate.now());
	}
	private void setFechaNacimientoAnimal(LocalDate fechaNacimientoAnimal) {
		this.fechaNacimientoAnimal=fechaNacimientoAnimal;
	}
	private void setCastrado(boolean castrado) {
		this.castrado=castrado;
	}
	private void setChip(long chip) {
		this.chip=chip;
	}
	public int getTipoAnimal() {
		return this.tipoAnimal;
	}
	private void aumentarContadorAnimal() {
		Animal.contadorAnimal++;
	}
	public String getNombreAnimal() {
		return this.nombreAnimal;
	}
	public long getChip() {
		return this.chip;
	}
}
