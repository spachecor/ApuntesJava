package protectora;

import java.time.LocalDateTime;

public class EstadoAnimal {
	private static final String ADOPTABLE="ADOPTABLE", ADOPTADO="ADOPTADO", INDOCUMENTADO="INDOCUMENTADO", FALLECIDO="FALLECIDO";
	private String estadoAnimal;
	private LocalDateTime instanteCambioEstado;
	private int codigoAnimalAfectado;
	
	public EstadoAnimal(boolean comprobacionChip, int codigoAnimal) {
		if(comprobacionChip)this.estadoAnimal=EstadoAnimal.ADOPTABLE;
		else this.estadoAnimal=EstadoAnimal.INDOCUMENTADO;
		this.setInstanteCambioEstado();
		this.setCodigoAnimalAfectado(codigoAnimal);
	}
	private void setInstanteCambioEstado() {
		this.instanteCambioEstado=LocalDateTime.now();
	}
	private void setCodigoAnimalAfectado(int codigoAnimalAfectado) {
		this.codigoAnimalAfectado=codigoAnimalAfectado;
	}
	private void modificarEstadoFallecido() {
		this.estadoAnimal=EstadoAnimal.FALLECIDO;
	}
}
