package protectora.utilidades;
/**
 * Clase que contiene los tipos de estado por los que puede pasar la solicitud de adopcion de un animal como constantes para utilidades
 * @author selene
 * @version 1.0
 */
public class EstadosSolicitudAdopcion {
	public static int DENEGADA, EN_ESPERA, APROBADA;
	static {
		DENEGADA=16;
		EN_ESPERA=17;
		APROBADA=18;
	}
}
