package protectora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Animal {
	private String nombreAnimal, colorAnimal, sexoAnimal;
	//el tiempo en la protectora se cuenta en meses
	private int codigoAnimal, edadAnimal, tiempoEnProtectora;
	private long numeroChip;
	//el contadorAnimales cuenta los animales que existen actualmente, y el contadorInstanciasAnimales cuenta las instancias que se han hecho sin tener en cuenta los
	//animales que existan o no actualmente
	private static int contadorAnimales, contadorInstanciasAnimales;
	private LocalDate fechaNacimientoAnimal;
	private LocalDateTime fechaEntradaProtectora;
	private boolean castrado, capacidadConvivirAnimales, comprobacionChip;
	private Chip chip;
	private EstadoAnimal estadoAnimal;
	
	{
		nombreAnimal = "desconocido";
		capacidadConvivirAnimales = false;
		comprobacionChip=false;
		chip = null;
		numeroChip=0;
	}
	/**
	 * Constructor especializado en inicializar un objeto de la clase con los requisitos mínimos especificados, y que automáticamente le asocia el codigo del
	 * animal y todas sus propiedades
	 * @param colorAnimal
	 * @param sexoAnimal
	 * @param fechaNacimientoAnimal
	 * @param castrado
	 */
	public Animal(String colorAnimal, String sexoAnimal, LocalDate fechaNacimientoAnimal, boolean castrado, boolean comprobacionChip) {
		//aumentamos el contado de animales en el sistema y el contador de animales instanciados
		this.aumentarContadorAnimales();
		this.aumentarContadorInstanciasAnimales();
		//asignamos el código único del animal
		this.setCodigoAnimal();
		this.setColorAnimal(colorAnimal);
		this.setSexoAnimal(sexoAnimal);
		this.setEdadAnimal(fechaNacimientoAnimal);
		this.setFechaEntradaProtectora();
		this.setTiempoEnProtectora();
		this.setCastrado(castrado);	
		//asignamos el estado del animal
		this.setEstadoAnimal(comprobacionChip);
	}
	public Animal(String nombreAnimal, String colorAnimal, String sexoAnimal, LocalDate fechaNacimientoAnimal, boolean castrado, boolean comprobacionChip, boolean capacidadConvivirAnimales) {
		this(colorAnimal, sexoAnimal, fechaNacimientoAnimal, castrado, comprobacionChip);
		//POR TERMINAR
	}
	
	private void setColorAnimal(String colorAnimal) {
		this.colorAnimal=colorAnimal;
	}
	private void setSexoAnimal(String sexoAnimal) {
		this.sexoAnimal=sexoAnimal;
	}
	private void setCodigoAnimal() {
		this.codigoAnimal=Animal.contadorInstanciasAnimales;
	}
	private void setEdadAnimal(LocalDate fechaNacimientoAnimal) {
		this.edadAnimal=(int)ChronoUnit.YEARS.between(fechaNacimientoAnimal, LocalDate.now());
	}
	private void setFechaEntradaProtectora() {
		this.fechaEntradaProtectora=LocalDateTime.now();
	}
	private void setTiempoEnProtectora() {
		this.tiempoEnProtectora=(int)ChronoUnit.MONTHS.between(fechaEntradaProtectora, LocalDateTime.now());
	}
	private void setCastrado(boolean castrado) {
		this.castrado=castrado;
	}
	private void setEstadoAnimal(boolean comprobacionChip){
		if(comprobacionChip) chip = new Chip();
		estadoAnimal = new EstadoAnimal(comprobacionChip, this.getCodigoAnimal());
	}
	private int getCodigoAnimal() {
		return this.codigoAnimal;
	}
	/**
	 * Método de la clase que aumenta el contador de los animales actuales en el sistema
	 */
	private void aumentarContadorAnimales() {
		Animal.contadorAnimales++;
	}
	/**
	 * Método de la clase que aumenta el contador de las instancias de animales actuales en el sistema
	 */
	private void aumentarContadorInstanciasAnimales() {
		Animal.contadorInstanciasAnimales++;
	}
}
