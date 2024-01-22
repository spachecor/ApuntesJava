package protectora;

import java.time.LocalDateTime;

/**
 * Clase EstadoAnimal que es un histórico de los diferentes estados del animal
 * @author selene
 * @version 1.1
 */
public class EstadoAnimal implements Comparable{
	private int estadoAnimal;
	private Animal animal;
	private LocalDateTime instanteCambioEstado;
	/**
	 * Constructor de los estados que tomará el animal
	 * @param animal objeto del tipo animal
	 * @param estadoAnimal valor que entra por constante y que determina el estado del animal
	 */
	public EstadoAnimal(Animal animal, int estadoAnimal) {
		this.setAnimal(animal);
		this.setEstadoAnimal(estadoAnimal);
		this.setInstanteCambioEstado();
	}
	@Override
	/**
	 * Método compate to de la interfaz Comparable que nos ordena los objetos EstadoAnimal según el nº que le pertenece a cada estado
	 * @param arg0
	 * @return
	 */
	public int compareTo(Object arg0) {
		if(((EstadoAnimal)arg0).getEstadoAnimal()<this.estadoAnimal)return -1;
		else if(((EstadoAnimal)arg0).getEstadoAnimal()>this.estadoAnimal)return 1;
		else return 0;
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
	public int getEstadoAnimal() {
		return this.estadoAnimal;
	}
}
