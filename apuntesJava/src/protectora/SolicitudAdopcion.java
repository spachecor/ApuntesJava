package protectora;

import java.time.LocalDateTime;

import protectora.utilidades.EstadosSolicitudAdopcion;
/**
 * Clase SolicitudAdopcion, que define las propiedades y el comportamiento de las solicitudes de adopción, pudiendo
 * comprobar si el adoptante cumple los requisitos, y si los cumple, cambiar el estado del animal a adoptado
 * @author selene
 * @version 1.0
 */
public class SolicitudAdopcion {
	private int codigoSolicitud;
	private LocalDateTime fechaHoraSolicitud;
	private int estadoSolicitud;
	private boolean aprobacionProtectora, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora, viviendaAdecuada;
	private Animal animal;
	private Adoptante adoptante;
	private static int contadorInstanciasSolicitudAdopcion;
	static {
		contadorInstanciasSolicitudAdopcion=0;
	}
	
	public SolicitudAdopcion(Animal animal, Adoptante adoptante, boolean aceptacionConvivientes, boolean compromisoCastrar, boolean compromisoInformarProtectora) {
		this.setFechaHoraSolicitud();
		this.setCodigoSolicitud();
		this.aumentarContadorInstanciasSolicitudAnimal();
		this.setAceptacionConvivientes(aceptacionConvivientes);
		this.setCompromisoCastrar(compromisoCastrar);
		this.setCompromisoInformarProtectora(compromisoInformarProtectora);
		this.setAnimal(animal);
		this.setAdoptante(adoptante);
	}
	private void setCodigoSolicitud() {
		this.codigoSolicitud=this.getContadorInstanciasSolicitudAdopcion();
	}
	private void setAnimal(Animal animal) {
		this.animal=animal;
	}
	private void setAdoptante(Adoptante adoptante) {
		this.adoptante=adoptante;
	}
	private void setFechaHoraSolicitud() {
		this.fechaHoraSolicitud=LocalDateTime.now();
	}
	private void setAceptacionConvivientes(boolean aceptacionConvivientes) {
		this.aceptacionConvivientes=aceptacionConvivientes;
	}
	private void setCompromisoCastrar(boolean compromisoCastrar) {
		this.compromisoCastrar=compromisoCastrar;
	}
	private void setCompromisoInformarProtectora(boolean compromisoInformarProtectora) {
		this.compromisoInformarProtectora=compromisoInformarProtectora;
	}
	private void setEstadoAdopcion(int estadoSolicitud) {
		this.estadoSolicitud=estadoSolicitud;
	}
	public boolean getAceptacionConvivientes() {
		return this.aceptacionConvivientes;
	}
	public boolean getCompromisoCastrar() {
		return this.compromisoCastrar;
	}
	public boolean getCompromisoInformarProtectora() {
		return this.compromisoInformarProtectora;
	}
	public int getContadorInstanciasSolicitudAdopcion() {
		return SolicitudAdopcion.contadorInstanciasSolicitudAdopcion;
	}
	private void aumentarContadorInstanciasSolicitudAnimal() {
		SolicitudAdopcion.contadorInstanciasSolicitudAdopcion++;
	}
	public void primeraComprobacion(Adoptante adoptante, Animal animal, SolicitudAdopcion solicitud) {	
		boolean requisitos=false;
		if(!adoptante.getVetoAdoptante()&&solicitud.getAceptacionConvivientes()&&solicitud.getCompromisoCastrar()&&solicitud.getCompromisoInformarProtectora()) {
			//el animal es un gato
			if(animal.getTipoAnimal()==0) {
				//cumple requisitos de vivienda
				if(adoptante.getDimensionViviendaAdoptante()<=45) requisitos=true;//en espera
				else requisitos=false;//si no cumple, denegada
				
			}else if(animal.getTipoAnimal()==1){//el animal es un perro
				//cumple los requisitos de vivienda
				if(adoptante.getDimensionViviendaAdoptante()<=60) requisitos=true;//en espera
				else requisitos=false;//si no cumple, denegada
			} 
		}else requisitos=false;
		//asignamos el estado resultante
		if(requisitos) solicitud.setEstadoAdopcion(EstadosSolicitudAdopcion.EN_ESPERA);
		else solicitud.setEstadoAdopcion(EstadosSolicitudAdopcion.DENEGADA);
	}
}
