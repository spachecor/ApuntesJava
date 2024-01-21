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
	private SolicitudAdopcion[] solicitudes;
	{
		vetoAdoptante=false;
		//SE LE PONE UN VALOR PROVIVISIONAL
		solicitudes=new SolicitudAdopcion[5];
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
			//comprobamos que el lugar en el array esté vacío
			for(int i=0;i<=this.solicitudes.length-1;i++) {
				//si la posición está vacía, le agrega el nuevo estado
				if(this.solicitudes[i]==null) {
					this.solicitudes[i]=(SolicitudAdopcion)object;
					//una vez agregado, sale del bucle
					break;
				}else {
					//si la posición no está vacía y ya ha llegado a la última, avisa de que el historial está completo
					if(i==this.solicitudes.length-1)throw new RuntimeException("El objeto introducido es inválido");
				}
			}
		}
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
