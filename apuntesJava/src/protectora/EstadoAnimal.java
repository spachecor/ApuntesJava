package protectora;

import java.time.LocalDateTime;

/**
 * Clase EstadoAnimal que es un histórico de los diferentes estados del animal
 * @author selene
 * @version 1.2
 */
public class EstadoAnimal implements Comparable<EstadoAnimal>{
	private int estadoAnimal;
	private LocalDateTime instanteCambioEstado;
	/**
	 * Constructor de los estados que tomará el animal
	 * @param estadoAnimal valor que entra por constante y que determina el estado del animal
	 */
	public EstadoAnimal(int estadoAnimal) {
		this.setEstadoAnimal(estadoAnimal);
		this.setInstanteCambioEstado();
	}

	/**
	 * Método compate to de la interfaz Comparable que nos ordena los objetos EstadoAnimal según el nº que le pertenece a cada estado(multiplicamos resultado por menos uno para obtener el orden
	 * de menor a mayor)
	 * @param arg0 es el objeto que contiene la información del estado del animal
	 * @return devuelve 0 en caso de ser igual, 1 en caso de ser mayor, y -1 en caso de ser menor
	 */
	@Override
	public int compareTo(EstadoAnimal arg0) {
		//comprobación de nulidad y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(!((arg0.getEstadoAnimal()==12)||(arg0.getEstadoAnimal()==13)||(arg0.getEstadoAnimal()==14)
				||(arg0.getEstadoAnimal()==15)))throw new RuntimeException("El estado no existe/no es correcto");
		
		if(arg0.getEstadoAnimal()<this.estadoAnimal)return -1*-1;
		else if(arg0.getEstadoAnimal()>this.estadoAnimal)return 1*-1;
		else return 0;
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
