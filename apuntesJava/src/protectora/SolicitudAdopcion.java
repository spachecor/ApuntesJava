package protectora;

import java.time.LocalDateTime;

import protectora.utilidades.EstadosAnimal;
import protectora.utilidades.EstadosSolicitudAnimal;
/**
 * Clase SolicitudAdopcion, que define las propiedades y el comportamiento de las solicitudes de adopción, pudiendo
 * comprobar si el adoptante cumple los requisitos, y si los cumple, cambiar el estado del animal a adoptado
 * @author selene
 * @version 1.2
 */
public class SolicitudAdopcion implements Comparable<SolicitudAdopcion>{
	private static int contadorInstanciasSolicitudAdopcion;
	private int codigoSolicitud;
	private LocalDateTime fechaHoraSolicitud;
	private int estadoSolicitud;
	private boolean aprobacionProtectora, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora;
	private Animal animal;
	private Adoptante adoptante;
	private final int INGRESO_MINIMO;
	static {
		contadorInstanciasSolicitudAdopcion=0;
	} {
		INGRESO_MINIMO=14000;
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
		//se aumenta el contador de instancias del objeto
		SolicitudAdopcion.aumentarContadorInstanciasAnimal();
		//se le asigna su código único referente al contador de instancias de este objeto
		this.setCodigoSolicitud();
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
	public void primeraComprobacion() {
		boolean requisitos=false;
		if(this.animal.getEstadoAnimalActual()==EstadosAnimal.ADOPTABLE&&this.adoptante.getIngresosAdoptante()>=INGRESO_MINIMO&&!this.adoptante.getVetoAdoptante()&&this.getAceptacionConvivientes()&&this.getCompromisoCastrar()&&this.getCompromisoInformarProtectora()) {
			//si el animal es un gato
			if(this.animal.getTipoAnimal()==0) {
				//si cumple los requisitos de vivienda
				if(this.adoptante.getDimensionViviendaAdoptante()>=45)requisitos=true;
				else requisitos=false;
			//si el animal es un perro
			}else if(this.animal.getTipoAnimal()==1) {
				//si cumple con los requisitos de vivienda
				if(this.adoptante.getDimensionViviendaAdoptante()>=60)requisitos=true;
				else requisitos=false;
			}
		}else requisitos=false;
		if(requisitos)this.setEstadoSolicitud(EstadosSolicitudAnimal.EN_ESPERA);
		else this.setEstadoSolicitud(EstadosSolicitudAnimal.DENEGADA);
	}
	/**
	 * Método que aumenta el contador de objetos de tipo SolicitudAdopcion instanciados
	 */
	private static void aumentarContadorInstanciasAnimal() {
		SolicitudAdopcion.contadorInstanciasSolicitudAdopcion++;
	}
	@Override
	public String toString() {
		return "Solicitud con código: "+this.getCodigoSolicitud()+" sobre el animal con nombre "+this.getAnimal().getNombreAnimal()+" y código: "
				+this.getAnimal().getCodigoAnimal()+" y solicitado por "+this.getAdoptante().getNombre()+" con código "+this.getAdoptante().getCodigo()
				+" tiene el siguiente estado: "+this.getEstadoSolicitud();
	}
	@Override
	public int compareTo(SolicitudAdopcion arg0) {
		//comprobación de nulidad, de instancia y de parámetro
		if(arg0==null) throw new RuntimeException("El parametro no puede ser nulo");
		if(arg0.getCodigoSolicitud()==0)throw new RuntimeException("El código de la solicitud no puede ser nulo");
		
		if(arg0.getCodigoSolicitud()<(this.getCodigoSolicitud()))return -1*-1;
		else if(arg0.getCodigoSolicitud()>(this.getCodigoSolicitud()))return 1*-1;
		else return 0;
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
	void setEstadoSolicitud(int estadoSolicitud) {
		this.estadoSolicitud=estadoSolicitud;
	}
<<<<<<< HEAD
	public void setAprobacionProtectora(boolean aprobacionProtectora) {
=======
	private void setAprobacionProtectora(boolean aprobacionProtectora) {
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
		this.aprobacionProtectora=aprobacionProtectora;
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
	public Animal getAnimal() {
		return this.animal;
	}
	public Adoptante getAdoptante() {
		return this.adoptante;
	}
	public int getCodigoSolicitud() {
		return this.codigoSolicitud;
	}
	public int getEstadoSolicitud() {
		return this.estadoSolicitud;
	}
}
