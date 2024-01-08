package protectora;

import java.time.LocalDate;

import protectora.parteanimal.Animal;

public class TestAnimal {

	public static void main(String[] args) {
		Animal[] animales = new Animal[1];
		//creamos un animal de prueba
		animales[0] = new Animal("gato", "europeo", "negro", "hembra", LocalDate.parse("2012-07-09"));
		//mostramos al animal de pruebas
		System.out.println(animales[0].getCaracteristicasAnimal());
		
	}

}
