package protectora;

import java.time.LocalDate;

import protectora.utilidades.ColorAnimal;
import protectora.utilidades.EstadosAnimal;
import protectora.utilidades.Razas;
import protectora.utilidades.SexoAnimal;
import protectora.utilidades.TipoAnimal;

public class TestProtectora {

	public static void main(String[] args) {
		//TestProtectora.crearAnimal("Amalia", TipoAnimal.GATO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.COMUN_EUROPEO, LocalDate.of(2021, 03, 20), true, 123456789123456L);
		TestProtectora ts = new TestProtectora();
		Animal animal = ts.crearAnimal("Amalia", TipoAnimal.GATO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.COMUN_EUROPEO, LocalDate.of(2021, 03, 20), true, 123456789123456L);
		System.out.println(animal.getNombreAnimal());

	}
	private Animal crearAnimal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		Animal animal = new Animal(nombreAnimal, tipoAnimal, colorAnimal, sexoAnimal, razaAnimal, fechaNacimientoAnimal, castrado, chip);
		EstadoAnimal estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.INDOCUMENTADO);
		animal.agregarEstadoAnimal(estadoAnimal, animal);
		return animal;
	}

}
