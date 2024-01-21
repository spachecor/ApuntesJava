package protectora;

import protectora.interfaces.Agregable;

/**
 * Clase Adoptante que hereda de Persona. Define los comportamientos y las propiedades de los objeto tipo Adoptante
 * @author selene
 * @version 1.0
 */
public class Adoptante extends Persona implements Agregable{
	private String codigoAdoptante;
	private int ingresosAdoptante, dimensionViviendaAdoptante, numeroMascotasAdoptante;
	private boolean vetoAdoptante;
	private static int contadorSolicitudes;
	private SolicitudAdopcion[] solicitudes;
	{
		vetoAdoptante=false;
		//SE LE PONE UN VALOR PROVIVISIONAL
		solicitudes=new SolicitudAdopcion[5];
	}
	static {
		contadorSolicitudes=0;
	}

	public Adoptante(String dni, String trabajo, String email, String tipoVia, String nombreVia, String escalera, String puerta, String infoAdicional, String localidad, String provincia, int telefono, int numeroCasa, int bloque, int codigoPostal, int ingresosAdoptante, int dimensionViviendaAdoptante, int numeroMascotasAdoptante) {
		super(dni, trabajo, email, tipoVia, nombreVia, escalera, puerta, infoAdicional, localidad, provincia, telefono, numeroCasa, bloque, codigoPostal);
		this.setIngresosAdoptante(ingresosAdoptante);
		this.setDimensionViviendaAdoptante(dimensionViviendaAdoptante);
		this.setNumeroMascotasAdoptante(numeroMascotasAdoptante);
		//le asignamos su codigo de adoptante
		this.setCodigoAdoptante();
	}
	@Override
	public void agregar(Object object) {
		if(object instanceof SolicitudAdopcion) {
			if(Adoptante.contadorSolicitudes!=this.solicitudes.length) {
				this.solicitudes[Adoptante.contadorSolicitudes]=(SolicitudAdopcion)object;
				Adoptante.contadorSolicitudes++;
			}else throw new RuntimeException("Historial lleno");
		}else throw new RuntimeException("Introducido un objeto inválido");
	}
	private void setIngresosAdoptante(int ingresosAdoptante) {
		this.ingresosAdoptante=ingresosAdoptante;
	}
	private void setDimensionViviendaAdoptante(int dimensionViviendaAdoptante) {
		this.dimensionViviendaAdoptante=dimensionViviendaAdoptante;
	}
	private void setNumeroMascotasAdoptante(int numeroMascotasAdoptante) {
		this.numeroMascotasAdoptante=numeroMascotasAdoptante;
	}
	private void setVetoAdoptante(boolean vetoAdoptante) {
		this.vetoAdoptante=vetoAdoptante;
	}
	public boolean getVetoAdoptante() {
		return this.vetoAdoptante;
	}
	public int getDimensionViviendaAdoptante() {
		return this.dimensionViviendaAdoptante;
	}
	public int getNumeroMascotasAdoptante() {
		return this.numeroMascotasAdoptante;
	}
	private void setCodigoAdoptante() {
		this.codigoAdoptante=super.getDni().toLowerCase().concat("a");
	}
}
