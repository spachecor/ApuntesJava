package protectora;

import java.time.LocalDateTime;

public class EstadoAnimal {
	private static final String ADOPTABLE="ADOPTABLE", ADOPTADO="ADOPTADO", INDOCUMENTADO="INDOCUMENTADO", FALLECIDO="FALLECIDO";
	private String estadoAnimal;
	private LocalDateTime instanteCambioEstado;
	private int codigoAnimalAfectado;
	
	public EstadoAnimal(boolean comprobacionChip, int codigoAnimal) {
		if(comprobacionChip)estadoAnimal=EstadoAnimal.ADOPTABLE;
		else estadoAnimal=EstadoAnimal.INDOCUMENTADO;
		this.setInstanteCambioEstado();
		this.setCodigoAnimalAfectado(codigoAnimal);
	}
	private void setInstanteCambioEstado() {
		this.instanteCambioEstado=LocalDateTime.now();
	}
	private void setCodigoAnimalAfectado(int codigoAnimalAfectado) {
		this.codigoAnimalAfectado=codigoAnimalAfectado;
	}
}
