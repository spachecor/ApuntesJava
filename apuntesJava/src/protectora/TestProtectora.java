package protectora;

import java.time.LocalDate;

import protectora.utilidades.ColorAnimal;
import protectora.utilidades.EstadosAnimal;
import protectora.utilidades.Razas;
import protectora.utilidades.SexoAnimal;
import protectora.utilidades.TipoAnimal;
/**
 * Clase test que sirve para probar la creación de objetos y sus comportamientos
 * @author selene
 * @version 1.0
 */
public class TestProtectora {

	public static void main(String[] args) {
		
		TestProtectora ts = new TestProtectora();
		Animal animal = ts.crearAnimal("Amalia", TipoAnimal.GATO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.COMUN_EUROPEO, LocalDate.of(2021, 03, 20), true, 123456789123456L);
		System.out.println(animal.getNombreAnimal());
		Adoptante adoptante = new Adoptante("29500308W", "cualquiera", "example@explample.es", "uno", "cualquiera", "primera", "una", "no", "amapolas", "camperas", 8965237, 7, 2, 41401, 1400, 56, 2);
		System.out.println("prueba");
	}
	/**
	 * método que sirve para crear un animal. Lo crea, le asigna un estado y agrega el estado al animal. Finalmente, devuelve el animal creado
	 * @param nombreAnimal
	 * @param tipoAnimal
	 * @param colorAnimal
	 * @param sexoAnimal
	 * @param razaAnimal
	 * @param fechaNacimientoAnimal
	 * @param castrado
	 * @param chip
	 * @return el animal creado con el estado asignado
	 */
	private Animal crearAnimal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		Animal animal = new Animal(nombreAnimal, tipoAnimal, colorAnimal, sexoAnimal, razaAnimal, fechaNacimientoAnimal, castrado, chip);
		//estado del animal default
		EstadoAnimal estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.INDOCUMENTADO);
		//si el animal tiene chip (chip!=0), se le asigna estado de adoptable, si no prosigue con default
		if(animal.getChip()!=0) {
			estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.ADOPTABLE);
		}
		animal.agregarEstadoAnimal(estadoAnimal);
		return animal;
	}

}
