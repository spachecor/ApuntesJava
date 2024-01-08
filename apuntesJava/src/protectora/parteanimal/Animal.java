package protectora.parteanimal;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 * Clase Animal, que define todos los objetos de la misma, define sus características y su comportamiento
 * @author selene
 * @version 1.0
 */
public class Animal {
	private String tipo, tamanio="medio", raza, enfermedades="ninguna", color, sexo;
	private LocalDate fechaNacimiento, fechaEntradaRefugio;
	private boolean castrado, chip, capacidadConvivirAnimales;
	//el atributo tiempoEnRefugio es el tiempo que lleva el animal en el refugio en meses, la edad es su edad en años
	private int codigoAnimal, edad, tiempoEnRefugio;
	private static int contadorAnimal;
	/**
	 * Constructor básico para crear un objeto animal, con los atributos mínimos para ello
	 * @param tipo la especie del animal
	 * @param raza la raza del animal
	 * @param color el color del animal
	 * @param sexo el sexo del animal
	 * @param fechaNacimiento la fecha de nacimiento del animal
	 */
	public Animal(String tipo, String raza, String color, String sexo, LocalDate fechaNacimiento) {
		//aumentamos el contador de animales y asignamos el codigo del animal
		Animal.aumentarContadorAnimal();
		this.setCodigoAnimal();
		//asignamos la fecha de entrada al refugio
		this.setFechaEntradaRefugio();
		//asignamos la edad del animal según la fecha de nacimiento del mismo
		this.setEdad(fechaNacimiento);
		//asignamos el tiempo que lleva el animal en el refugio
		this.setTiempoEnRefugio(fechaEntradaRefugio);
		//asignamos el resto de valores de los atributos
		this.setTipo(tipo);
		this.setRaza(raza);
		this.setColor(color);
		this.setSexo(sexo);
		this.setfechaNacimiento(fechaNacimiento);
		
	}
	/**
	 * Constructor completo para crear un objeto animal, con todas las características posibles del animal
	 * @param tipo la especie del animal
	 * @param tamanio el tamaño del animal
	 * @param raza la raza del animal
	 * @param enfermedades si tiene alguna enfermedad, en caso negativo, sería "ninguna"
	 * @param color el color del animal
	 * @param sexo el sexo del animal
	 * @param fechaNacimiento la fecha de nacimiento del animal
	 * @param castrado si el animal está castrado o no
	 * @param chip si el animal lleva chip o no
	 * @param capacidadConvivirAnimales si el animal es capaz de convivir con otros animales o no
	 */
	public Animal(String tipo, String tamanio, String raza, String enfermedades, String color, String sexo, LocalDate fechaNacimiento, boolean castrado, boolean chip, boolean capacidadConvivirAnimales) {
		//aumentamos el contador de animales y asignamos el codigo del animal
		Animal.aumentarContadorAnimal();
		this.setCodigoAnimal();
		//asignamos la fecha de entrada al refugio
		this.setFechaEntradaRefugio();
		//asignamos la edad del animal según la fecha de nacimiento del mismo
		this.setEdad(fechaNacimiento);
		//asignamos el tiempo que lleva el animal en el refugio
		this.setTiempoEnRefugio(fechaEntradaRefugio);
		//asignamos el resto de valores de los atributos
		this.setTipo(tipo);
		this.setTamanio(tamanio);
		this.setRaza(raza);
		this.setEnfermedades(enfermedades);
		this.setColor(color);
		this.setSexo(sexo);
		this.setfechaNacimiento(fechaNacimiento);
		this.setCastrado(castrado);
		this.setChip(chip);
		this.setCapacidadConvivirAnimales(capacidadConvivirAnimales);
		
	}
	/**
	 * Método que aumenta el contador de animales de uno en uno
	 */
	private static void aumentarContadorAnimal() {
		Animal.contadorAnimal++;
	}
	/**
	 * Método que asigna el código del animal según la cantidad de animales que haya
	 */
	private void setCodigoAnimal() {
		this.codigoAnimal=contadorAnimal;
	}
	/**
	 * Método que asigna el valor del atributo tipo a través del parámetro de entrada
	 * @param tipo la especie del animal
	 */
	private void setTipo(String tipo) {
		this.tipo=tipo;
	}
	/**
	 * Método que asigna el valor del atributo tamanio a través del parámetro de entrada
	 * @param tamanio el tamaño del animal
	 */
	private void setTamanio(String tamanio) {
		this.tamanio=tamanio;
	}
	/**
	 * Método que asigna el valor del atributo raza a través del parámetro de entrada
	 * @param raza la raza del animal
	 */
	private void setRaza(String raza) {
		this.raza=raza;
	}
	/**
	 * Método que asigna el valor del atributo enfermedades a través del parámetro de entrada
	 * @param enfermedades si tiene alguna enfermedad, en caso negativo, sería "ninguna"
	 */
	private void setEnfermedades(String enfermedades) {
		this.enfermedades=enfermedades;
	}
	/**
	 * Método que asigna el valor del atributo color a través del parámentro de entrada
	 * @param color el color del animal
	 */
	private void setColor(String color) {
		this.color=color;
	}
	/**
	 * Método que asigna el valor del atributo sexo a través del parámetro de entrada
	 * @param sexo el sexo del animal
	 */
	private void setSexo(String sexo) {
		this.sexo=sexo;
	}
	/**
	 * Método que asigna el valor del atributo fechaNacimiento a través del parámetro de entrada
	 * @param fechaNacimiento la fecha de nacimiento del animal
	 */
	private void setfechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	/**
	 * Método que asigna el valor del atributo fechaEntradaRefugio asignandole el valor de un objeto de tipo fecha con la fecha actual
	 */
	private void setFechaEntradaRefugio() {
		this.fechaEntradaRefugio=LocalDate.now();
	}
	/**
	 * Método que asigna el valor del atributo castrado a través del parámetro de entrada
	 * @param castrado si el animal está castrado o no
	 */
	private void setCastrado(boolean castrado) {
		this.castrado=castrado;
	}
	/**
	 * Método que asigna el valor del atributo chip a través del parámetro de entrada
	 * @param chip si el animal lleva chip o no
	 */
	private void setChip(boolean chip) {
		this.chip=chip;
	}
	/*private int edad, tiempoEnRefugio;*/
	/**
	 * Método que asigna el valor del atributo capacidadConvivirAnimales a través del parámetro de entrada
	 * @param capacidadConvivirAnimales si el animal es capaz de convivir con otros animales o no
	 */
	private void setCapacidadConvivirAnimales(boolean capacidadConvivirAnimales) {
		this.capacidadConvivirAnimales=capacidadConvivirAnimales;
	}
	/**
	 * Método que asigna el valor del atributo edad a través de un cálculo con la fecha de nacimiento(que es el parámetro de entrada) y
	 * la fecha actual
	 * @param fechaNacimiento la fecha de nacimiento del animal
	 */
	private void setEdad(LocalDate fechaNacimiento) {
		Period edadAnimal = Period.between(fechaNacimiento, LocalDate.now());
		this.edad=edadAnimal.getYears();
	}
	/**
	 * Método que asigna el valor del atributo tiempoEnRefugio a través de una cálculo con la fecha de entrada al refugio(que es el 
	 * parámetro de entrada) y la fecha actual
	 * @param fechaEntradaRefugio la fecha en la que el animal entró en el refugio
	 */
	private void setTiempoEnRefugio(LocalDate fechaEntradaRefugio) {
		this.tiempoEnRefugio=(int)ChronoUnit.MONTHS.between(fechaEntradaRefugio, LocalDate.now());
	}
	public static int getContadorAnimal() {
		return Animal.contadorAnimal;
	}
	public String getCaracteristicasAnimal() {
		return "El animal con código "+this.codigoAnimal+" es un "+this.tipo+", de la raza "+this.raza+", de tamaño "+this.tamanio+", "
				+ "con las siguientes enfermedades: "+this.enfermedades+"; de color "+this.color+", de sexo "+this.sexo+". El animal "
				+ "nació en la fecha: "+this.fechaNacimiento+", y"+" tiene "+this.edad+" años. También entró al refugio en la fecha: "
				+this.fechaEntradaRefugio+" y lleva en él "+this.tiempoEnRefugio+" meses. Este animal "
				+(castrado?"está castrado":"no está castrado")+", "+(chip?"lleva chip":"no lleva chip")+" y "
				+(capacidadConvivirAnimales?"es capaz de convivir con otros animales":"no es capaz de convivir con otros animales");
	}
}
