package protectora;

import java.time.LocalDateTime;

import protectora.utilidades.EstadosSolicitudAnimal;
/**
 * Clase SolicitudAdopcion, que define las propiedades y el comportamiento de las solicitudes de adopción, pudiendo
 * comprobar si el adoptante cumple los requisitos, y si los cumple, cambiar el estado del animal a adoptado
 * @author selene
 * @version 1.2
 */
public class SolicitudAdopcion {
	private static int contadorInstanciasSolicitudAdopcion;
	private int codigoSolicitud;
	private LocalDateTime fechaHoraSolicitud;
	private int estadoSolicitud;
	private boolean aprobacionProtectora, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora;
	private Animal animal;
	private Adoptante adoptante;
	static {
		contadorInstanciasSolicitudAdopcion=0;
	}
	/**
	 * Constructor de los objetos SolicitudAdopcion, que genera una nueva solicitud de adopción relacionada con el animal y el adoptante y que reúne los requisitos
	 * para generar esta solicitud
	 * @param animal el objeto de tipo animal que podría ser adoptado
	 * @param adoptante el objeto de tipo adoptante que quiere adoptar al animal
	 * @param aceptacionConvivientes si los convivientes aceptan la nueva adopcion
	 * @param compromisoCastrar si el adoptante se compromete a castrar al animal en caso de no estarlo
	 * @param compromisoInformarProtectora si el adoptante se compromete a informar a la protectora en determinadas ocasiones
	 */
	public SolicitudAdopcion(Animal animal, Adoptante adoptante, boolean aceptacionConvivientes, boolean compromisoCastrar, boolean compromisoInformarProtectora) {
		//se le asigna su código único referente al contador de instancias de este objeto
		this.setCodigoSolicitud();
		//se aumenta el contador de instancias del objeto
		this.aumentarContadorInstanciasAnimal();
		//se asignan las propiedades de la solicitud
		this.setAnimal(animal);
		this.setAdoptante(adoptante);
		this.setFechaHoraSolicitud();
		this.setAceptacionConvivientes(aceptacionConvivientes);
		this.setCompromisoCastrar(compromisoCastrar);
		this.setCompromisoInformarProtectora(compromisoInformarProtectora);		
	}
	/**
	 * Método que realiza la primera comprobación del estado de la solicitud de adopcion del animal
	 * @param adoptante objeto de tipo adoptante
	 * @param animal objeto de tipo Animal
	 * @param solicitud objeto de tipo SolicitudAdopcion
	 */
	public void primeraComprobacion(Adoptante adoptante, Animal animal, SolicitudAdopcion solicitud) {
		boolean requisitos=false;
		if(!adoptante.getVetoAdoptante()&&solicitud.getAceptacionConvivientes()&&solicitud.getCompromisoCastrar()&&solicitud.getCompromisoInformarProtectora()) {
			//si el animal es un gato
			if(animal.getTipoAnimal()==0) {
				//si cumple los requisitos de vivienda
				if(adoptante.getDimensionViviendaAdoptante()<=45)requisitos=true;
				else requisitos=false;
			//si el animal es un perro
			}else if(animal.getTipoAnimal()==1) {
				//si cumple con los requisitos de vivienda
				if(adoptante.getDimensionViviendaAdoptante()<=60)requisitos=true;
				else requisitos=false;
			}
		}else requisitos=false;
		if(requisitos)solicitud.setEstadoAdopcion(EstadosSolicitudAnimal.EN_ESPERA);
		else solicitud.setEstadoAdopcion(EstadosSolicitudAnimal.DENEGADA);
	}
	/**
	 * Método que aumenta el contador de objetos de tipo SolicitudAdopcion instanciados
	 */
	private void aumentarContadorInstanciasAnimal() {
		SolicitudAdopcion.contadorInstanciasSolicitudAdopcion++;
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
	private int getContadorInstanciasSolicitudAdopcion() {
		return SolicitudAdopcion.contadorInstanciasSolicitudAdopcion;
	}
	public boolean getCompromisoCastrar() {
		return this.compromisoCastrar;
	}
	public boolean getCompromisoInformarProtectora() {
		return this.compromisoInformarProtectora;
	}
	public boolean getAceptacionConvivientes() {
		return this.aceptacionConvivientes;
	}
}
