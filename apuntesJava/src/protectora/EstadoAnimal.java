package protectora;

import java.time.LocalDateTime;

/**
 * Clase EstadoAnimal que es un histórico de los diferentes estados del animal
 * @author selene
 * @version 1.0
 */
public class EstadoAnimal {
	private int estadoAnimal;
	private Animal animal;
	private LocalDateTime instanteCambioEstado;
	/**
	 * Constructor de los estados que tomará el animal
	 * @param animal un objeto de tipo animal
	 * @param estadoAnimal valor que entra por constante y que determina el estado del animal
	 */
	public EstadoAnimal(Animal animal, int estadoAnimal) {
		this.setEstadoAnimal(estadoAnimal);
		this.setAnimal(animal);
		this.setInstanteCambioEstado();
	}
	private void setAnimal(Animal animal) {
		this.animal=animal;
	}
	private void setEstadoAnimal(int estadoAnimal) {
		this.estadoAnimal=estadoAnimal;
	}
	private void setInstanteCambioEstado() {
		this.instanteCambioEstado=LocalDateTime.now();
	}
}
