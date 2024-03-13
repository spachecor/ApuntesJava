package protectora.utilidades;

import java.util.HashMap;

/**
 * Clase de utilidades que contiene los mapeados de las diferentes características de los animales.
 * @author Selene
 * @version 1.0
 */
public class MapeadoAnimal {
    //declaramos los mapas
    public static HashMap<Integer, String> tiposAnimal;
    public static HashMap<Integer, String> coloresAnimal;
    public static HashMap<Integer, String> estadosAnimal;
    public static HashMap<Integer, String> estadosSolicitudAdopcion;
    public static HashMap<Integer, String> sexosAnimal;
    public static HashMap<Integer, String> tamaniosAnimal;
    public static HashMap<Integer, String> razasGato;
    public static HashMap<Integer, String> razasPerro;
    static{
        //asignamos los mapas y llamamos a las funciones para llenarlos
        tiposAnimal = new HashMap<>();
        MapeadoAnimal.agregarTiposAnimal();
        coloresAnimal = new HashMap<>();
        MapeadoAnimal.agregarColoresAnimal();
        estadosAnimal = new HashMap<>();
        MapeadoAnimal.agregarEstadosAnimal();
        estadosSolicitudAdopcion = new HashMap<>();
        MapeadoAnimal.agregarEstadosSolicitudAdopcion();
        sexosAnimal = new HashMap<>();
        MapeadoAnimal.agregarSexosAnimal();
        tamaniosAnimal = new HashMap<>();
        MapeadoAnimal.agregarTamaniosAnimal();
        razasGato = new HashMap<>();
        MapeadoAnimal.agregarRazasGato();
        razasPerro = new HashMap<>();
        MapeadoAnimal.agregarRazasPerro();
    }

    /**
     * Método que sirve para agregar los tipos dentro del mapeado de tipos de los animales
     */
    private static void agregarTiposAnimal(){
        MapeadoAnimal.tiposAnimal.put(TipoAnimal.GATO, "Gato");
        MapeadoAnimal.tiposAnimal.put(TipoAnimal.PERRO, "Perro");
    }
    /**
     * Método que sirve para agregar los colores dentro del mapeado de colores de los animales
     */
    private static void agregarColoresAnimal(){
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.MARRON_OSCURO, "Marrón oscuro");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.MARRON_CLARO, "Marrón claro");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.BLANCO, "Blanco");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.NEGRO, "Negro");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.BICOLOR, "Bicolor");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.TRICOLOR, "Tricolor");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.NARANJA, "Naranja");
        MapeadoAnimal.coloresAnimal.put(ColorAnimal.AZUL, "Azul");
    }
    /**
     * Método que sirve para agregar los estados dentro del mapeado de estados de los animales
     */
    private static void agregarEstadosAnimal(){
        MapeadoAnimal.estadosAnimal.put(EstadosAnimal.ADOPTABLE, "Adoptable");
        MapeadoAnimal.estadosAnimal.put(EstadosAnimal.ADOPTADO, "Adoptado");
        MapeadoAnimal.estadosAnimal.put(EstadosAnimal.INDOCUMENTADO, "Indocumentado");
        MapeadoAnimal.estadosAnimal.put(EstadosAnimal.FALLECIDO, "Fallecido");
    }
    /**
     * Método que sirve para agregar los estados dentro del mapeado de estados de adopción de los animales
     */
    private static void agregarEstadosSolicitudAdopcion(){
        MapeadoAnimal.estadosSolicitudAdopcion.put(EstadosSolicitudAdopcion.DENEGADA, "Denegada");
        MapeadoAnimal.estadosSolicitudAdopcion.put(EstadosSolicitudAdopcion.EN_ESPERA, "En espera");
        MapeadoAnimal.estadosSolicitudAdopcion.put(EstadosSolicitudAdopcion.APROBADA, "Aprobada");
    }
    /**
     * Método que sirve para agregar los sexos dentro del mapeado de sexos de los animales
     */
    private static void agregarSexosAnimal(){
        MapeadoAnimal.sexosAnimal.put(SexoAnimal.MACHO, "Macho");
        MapeadoAnimal.sexosAnimal.put(SexoAnimal.HEMBRA, "Hembra");
    }
    /**
     * Método que sirve para agregar los tamaños dentro del mapeado de tamaños de los animales
     */
    private static void agregarTamaniosAnimal(){
        MapeadoAnimal.tamaniosAnimal.put(Tamanios.PEQUENIO, "Pequeño");
        MapeadoAnimal.tamaniosAnimal.put(Tamanios.MEDIANO, "Mediano");
        MapeadoAnimal.tamaniosAnimal.put(Tamanios.GRANDE, "Grande");
        MapeadoAnimal.tamaniosAnimal.put(Tamanios.GIGANTE, "Gigante");
    }
    /**
     * Método que sirve para agregar las razas dentro del mapeado de razas de gatos
     */
    private static void agregarRazasGato(){
        MapeadoAnimal.razasGato.put(RazasGato.PERSA, "Persa");
        MapeadoAnimal.razasGato.put(RazasGato.ESFINGE, "Esfinge");
        MapeadoAnimal.razasGato.put(RazasGato.SIAMES, "Siames");
        MapeadoAnimal.razasGato.put(RazasGato.MAINE_COON, "Maine Coon");
        MapeadoAnimal.razasGato.put(RazasGato.BENGALI, "Bengali");
        MapeadoAnimal.razasGato.put(RazasGato.RAGDOLL, "Ragdoll");
        MapeadoAnimal.razasGato.put(RazasGato.SIBERIANO, "Siberiano");
        MapeadoAnimal.razasGato.put(RazasGato.ANGORA, "Angora");
        MapeadoAnimal.razasGato.put(RazasGato.CORNISH_REX, "Cornish Rex");
        MapeadoAnimal.razasGato.put(RazasGato.COMUN_EUROPEO, "Común Europeo");
        MapeadoAnimal.razasGato.put(RazasGato.ORIENTAL, "Oriental");
        MapeadoAnimal.razasGato.put(RazasGato.EXOTICO, "Exótico");
        MapeadoAnimal.razasGato.put(RazasGato.SOMALI, "Somali");
        MapeadoAnimal.razasGato.put(RazasGato.CURL_AMERICANO, "Curl Americano");
        MapeadoAnimal.razasGato.put(RazasGato.AZUL_RUSO, "Azul Ruso");
        MapeadoAnimal.razasGato.put(RazasGato.ABISINIO, "Abisinio");
        MapeadoAnimal.razasGato.put(RazasGato.CARTUJO, "Cartujo");
        MapeadoAnimal.razasGato.put(RazasGato.HIMALAYO, "Himalayo");
        MapeadoAnimal.razasGato.put(RazasGato.BOMBAY, "Bombay");
        MapeadoAnimal.razasGato.put(RazasGato.BOSQUE_NORUEGA, "Bosque Noruega");
    }
    /**
     * Método que sirve para agregar las razas dentro del mapeado de razas de perros
     */
    private static void agregarRazasPerro(){
        MapeadoAnimal.razasPerro.put(RazasPerro.CHIHUAHUA, "Chihuahua");
        MapeadoAnimal.razasPerro.put(RazasPerro.POMERANIA, "Pomerania");
        MapeadoAnimal.razasPerro.put(RazasPerro.BICHON_MALTES, "Bichón Maltés");
        MapeadoAnimal.razasPerro.put(RazasPerro.CANICHE, "Caniche");
        MapeadoAnimal.razasPerro.put(RazasPerro.BULLDOG_FRANCES, "Bulldog Francés");
        MapeadoAnimal.razasPerro.put(RazasPerro.YORKSHIRE, "Yorkshire");
        MapeadoAnimal.razasPerro.put(RazasPerro.BEAGLE, "Beagle");
        MapeadoAnimal.razasPerro.put(RazasPerro.BOXER, "Bóxer");
        MapeadoAnimal.razasPerro.put(RazasPerro.JACK_RUSSELL, "Jack Russell");
        MapeadoAnimal.razasPerro.put(RazasPerro.BORDER_COLLIE, "Border Collie");
        MapeadoAnimal.razasPerro.put(RazasPerro.BULL_TERRIER, "Bull Terrier");
        MapeadoAnimal.razasPerro.put(RazasPerro.CARLINO, "Carlino");
        MapeadoAnimal.razasPerro.put(RazasPerro.MESTIZO, "Mestizo");
        MapeadoAnimal.razasPerro.put(RazasPerro.GALGO, "Galgo");
        MapeadoAnimal.razasPerro.put(RazasPerro.HUSKY_SIBERIANO, "Husky Siberiano");
        MapeadoAnimal.razasPerro.put(RazasPerro.SHIBA_INU, "Shiba Inu");
        MapeadoAnimal.razasPerro.put(RazasPerro.LABRADOR, "Labrador");
        MapeadoAnimal.razasPerro.put(RazasPerro.SAN_BERNARDO, "San Bernardo");
        MapeadoAnimal.razasPerro.put(RazasPerro.ROTTWEILER, "Rottweiler");
        MapeadoAnimal.razasPerro.put(RazasPerro.BOBTAIL, "Bobtail");
        MapeadoAnimal.razasPerro.put(RazasPerro.DOGO_ARGENTINO, "Dogo Argentino");
        MapeadoAnimal.razasPerro.put(RazasPerro.GRAN_DANES, "Gran Danés");
    }
}
