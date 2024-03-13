package protectora.conduct;

import protectora.Adoptante;
import protectora.Animal;
import protectora.EstadoAnimal;
import protectora.SolicitudAdopcion;
import protectora.utilidades.EstadosAnimal;

import java.time.LocalDate;

/**
 * Clase que define una serie de métodos estáticos útiles para el comportamiento de las clases entre sí
 * @author Selene
 * @version 1.0
 */
public class ComportamientoProtectora {
    /**
     * Método que sirve para crear un animal. Lo crea, le asigna un estado y agrega el estado del animal. Finalmente, devuelve el animal creado.
     * @param nombreAnimal el nombre del animal
     * @param tipoAnimal el tipo de animal (gato, perro, etc.)
     * @param colorAnimal el color del animal
     * @param sexoAnimal el sexo del animal
     * @param razaAnimal la raza del animal
     * @param tamanio el tamañoi del animal
     * @param fechaNacimientoAnimal la fecha de nacimiento del animal
     * @param castrado si el animal está o no castrado
     * @param chip el nº del chip del animal (si es 0, no lleva chip)
     * @return un objeto tipo animal
     */
    public static Animal crearAnimal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, int tamanio, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
        Animal animal = new Animal(nombreAnimal, tipoAnimal, colorAnimal, sexoAnimal, razaAnimal, tamanio, fechaNacimientoAnimal, castrado, chip);
        EstadoAnimal estadoAnimal;
        if(animal.getChip()==0) {
            estadoAnimal = new EstadoAnimal(EstadosAnimal.INDOCUMENTADO);
        }
        else {
            estadoAnimal = new EstadoAnimal(EstadosAnimal.ADOPTABLE);
        }
        animal.agregar(estadoAnimal);
        return animal;
    }

    /**
     * Método que sirve para crear solicitudes de adopcion. La crea, realiza la primera comprobación y devuelve el nuevo objeto tipo solicitud de adopcion
     * @param animal el animal que se quiere adoptar
     * @param adoptante el adoptante interesado en el animal
     * @param aceptacionConvivientes si los familiaresd del adoptante aceptan la adopcion
     * @param compromisoCastrar si el adoptante se compromete a castrar al animal
     * @param compromisoInformarProtectora si el adoptante se compromete a tener informada a la protectora
     * @return Una solicitud de adopción con estado en espera o denegada
     */
    public static SolicitudAdopcion crearSolicitud(Animal animal, Adoptante adoptante, boolean aceptacionConvivientes, boolean compromisoCastrar, boolean compromisoInformarProtectora) {
        SolicitudAdopcion solicitud = new SolicitudAdopcion(animal, adoptante, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora);
        solicitud.primeraComprobacion();
        return solicitud;
    }
}
