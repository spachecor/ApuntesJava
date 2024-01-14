package protectora;

import java.time.LocalDateTime;
/**
 * Clase SolicitudAdopcion, que define las propiedades y el comportamiento de las solicitudes de adopción, pudiendo
 * comprobar si el adoptante cumple los requisitos, y si los cumple, cambiar el estado del animal a adoptado
 * @author selene
 * @version 1.0
 */
public class SolicitudAdopcion {
	private int codigoSolicitud;
	private LocalDateTime fechaHoraSolicitud;
	private String estadoSolicitud;
	private boolean aprobacionProtectora, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora;
	private Animal animal;
}
