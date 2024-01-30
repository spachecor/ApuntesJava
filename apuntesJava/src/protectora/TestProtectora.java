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
		Animal animal = ts.crearAnimal("Pepito", TipoAnimal.PERRO, ColorAnimal.BLANCO, SexoAnimal.MACHO, Razas.LABRADOR, Tamanios.MEDIANO, LocalDate.of(2019, 12, 01), false, 123456789123456L);
		System.out.println(animal.getNombreAnimal());
		EstadoAnimal estado2 = new EstadoAnimal(animal, EstadosAnimal.ADOPTADO);
		animal.agregar(estado2);
		EstadoAnimal estado3 = new EstadoAnimal(animal, EstadosAnimal.ADOPTABLE);
		animal.agregar(estado3);
		EstadoAnimal estado4 = new EstadoAnimal(animal, EstadosAnimal.ADOPTADO);
		animal.agregar(estado4);
		EstadoAnimal estado5 = new EstadoAnimal(animal, EstadosAnimal.ADOPTABLE);
		animal.agregar(estado5);
		animal.ordenar(animal.getEstadosAnimal());
		System.out.println("Prueba1");
		Adoptante adoptante = new Adoptante("Maria Reyes", "12345678A", "ninguno", "a@a.com", "calle", "soleada", null, "izq", null, "Palma del Río", "Córdoba", 789654123, 5, 0, 14500, 15000, 65, 2);
		SolicitudAdopcion solicitud = TestProtectora.crearSolicitud(animal, adoptante, true, true, true);
		solicitud.primeraComprobacion();
		System.out.println("Prueba2");
		System.out.println(animal.toString());
		System.out.println(adoptante.toString());
		System.out.println(solicitud.toString());
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
	private static SolicitudAdopcion crearSolicitud(Animal animal, Adoptante adoptante, boolean aceptacionConvivientes, boolean compromisoCastrar, boolean compromisoInformarProtectora) {
		SolicitudAdopcion solicitud = new SolicitudAdopcion(animal, adoptante, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora);
		return solicitud;
	}

}
