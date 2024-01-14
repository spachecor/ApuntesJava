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
		//SALTA UN ERROR, Y AUNQUE LO E
		Animal animal = ts.crearAnimal("Amalia", TipoAnimal.GATO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.COMUN_EUROPEO, LocalDate.of(2021, 03, 20), true, 123456789123456L);
		//funciona pero me salta el error raro ese
		System.out.println(animal.getNombreAnimal());

	}
	//DUDA CÓMO HACERLO, COMO PONERLO TODO DEL TIRÓN, ES DECIR, COMO HACER QUE EN EL CONSTRUCTOR
	//DE ANIMAL SE ASIGNE AUTOMÁTICAMENTE UN ESTADOANIMAL SI PARA ASIGNAR UN ESTAOD ANIMAL HACE 
	//FALTA TENER YA CREADO EL OBJETO ANIMAL. LO MISMO PASA CUANDO SE QUIERE ASIGNAR EN EL ARRAY
	//DE ESTADOS DEL ANIMAL LOS ESTADOS DEL ANIMAL, QUE NO SÉ COMO HACERLO DE FORMA AUTOMÁTICA.
	//SÉ COMO ASIGNARLO TODO DE ESTA FORMA, PERO A LA HORA DE PONERLO, NO SÉ COMO HACER QUE EN CUANTO
	//SE CREE UN ANIMAL, SE LE ASIGNE UN ESTADO AUTOMÁTICAMENTE Y QUE ESTE ESTADO PASE A ESTAR EN EL 
	//ARRAY ESTADOANIMAL EN LA CLASE ANIMAL. SE PUEDE HACER AUTOMATICO DE ALGUNA MANERA????
	private Animal crearAnimal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		Animal animal = new Animal(nombreAnimal, tipoAnimal, colorAnimal, sexoAnimal, razaAnimal, fechaNacimientoAnimal, castrado, chip);
		EstadoAnimal estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.ADOPTABLE);
		EstadoAnimal estadoAnimal2 = new EstadoAnimal(animal, EstadosAnimal.FALLECIDO);
		animal.agregarEstadoAnimal(estadoAnimal, estadoAnimal2, animal);
		return animal;
	}

}
