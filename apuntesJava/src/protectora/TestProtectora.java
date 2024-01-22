package protectora;

import java.time.LocalDate;

import protectora.utilidades.ColorAnimal;
import protectora.utilidades.EstadosAnimal;
import protectora.utilidades.Razas;
import protectora.utilidades.SexoAnimal;
import protectora.utilidades.Tamanios;
import protectora.utilidades.TipoAnimal;

/**
 * Clase test que sirve para probar la creación de objetos y sus comportamientos
 * @author selene
 * @version 1.2
 */
public class TestProtectora {

	public static void main(String[] args) {
		TestProtectora ts = new TestProtectora();
		Animal animal = ts.crearAnimal("Pepito", TipoAnimal.PERRO, ColorAnimal.BLANCO, SexoAnimal.MACHO, Razas.LABRADOR, Tamanios.MEDIANO, LocalDate.of(2019, 12, 01), false, 0);
		System.out.println(animal.getNombreAnimal());
		EstadoAnimal estado2 = new EstadoAnimal(animal, EstadosAnimal.ADOPTADO);
		animal.agregar(estado2);
		animal.ordenar(animal.getEstadosAnimal());
		System.out.println("Prueba");

	}
	/**
	 * Método que sirve para crear un animal. Lo crea, le asigna un estado y agrega el estado del animal. Finalmente, devuelve el animal creado.
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
	private Animal crearAnimal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, int tamanio, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		Animal animal = new Animal(nombreAnimal, tipoAnimal, colorAnimal, sexoAnimal, razaAnimal, tamanio, fechaNacimientoAnimal, castrado, chip);
		EstadoAnimal estadoAnimal;
		if(animal.getChip()==0) {
			estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.INDOCUMENTADO);
		}
		else {
			estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.ADOPTABLE);
		}
		animal.agregar(estadoAnimal);
		return animal;
	}

}
