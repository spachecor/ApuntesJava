package protectora;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
import java.util.logging.Logger;

import protectora.interfaces.Buscable;
import protectora.interfaces.Eliminable;
import protectora.logger.ProtectoraLogger;
import protectora.utilidades.ColorAnimal;
import protectora.utilidades.EstadosAnimal;
import protectora.utilidades.Razas;
import protectora.utilidades.SexoAnimal;
import protectora.utilidades.Tamanios;
import protectora.utilidades.TipoAnimal;

/**
 * Clase test que sirve para probar la creación de objetos y sus comportamientos
 * @author selene
 * @version 1.4
 */
public class TestProtectora implements Buscable, Eliminable{
	public static void main(String[] args) {
		TestProtectora ts = new TestProtectora();
		//creamos un logger propio usando ProtectoraLogger
		Logger logger = ProtectoraLogger.getLogger(TestProtectora.class.getName());
<<<<<<< HEAD
		//creamos un arraylist de personas donde podemos tener tanto adoptantes como clientes
		ArrayList<Persona> personas = new ArrayList<Persona>();
		//creamos un arraylist de solicitudes
		ArrayList<SolicitudAdopcion> solicitudes = new ArrayList<SolicitudAdopcion>();
		//creamos un arraylist de animales
		ArrayList<Animal> animales = new ArrayList<Animal>();
		animales.add(ts.crearAnimal("Pepito", TipoAnimal.PERRO, ColorAnimal.BLANCO, SexoAnimal.MACHO, Razas.LABRADOR, Tamanios.MEDIANO, LocalDate.of(2019, 12, 01), false, 123456789123456L));
		logger.info("Creado animal 1");
		System.out.println(animales.get(0).getNombreAnimal());
		EstadoAnimal estado2 = new EstadoAnimal(animales.get(0), EstadosAnimal.ADOPTADO);
		animales.get(0).agregar(estado2);
		EstadoAnimal estado3 = new EstadoAnimal(animales.get(0), EstadosAnimal.ADOPTABLE);
		animales.get(0).agregar(estado3);
		EstadoAnimal estado4 = new EstadoAnimal(animales.get(0), EstadosAnimal.ADOPTADO);
		animales.get(0).agregar(estado4);
		EstadoAnimal estado5 = new EstadoAnimal(animales.get(0), EstadosAnimal.ADOPTABLE);
		animales.get(0).agregar(estado5);
		animales.get(0).ordenar(animales.get(0).getEstadosAnimal());
		System.out.println("Prueba1");
		animales.add(ts.crearAnimal("Amelia", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0));
		animales.add(ts.crearAnimal("Manuela", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0));
		animales.add(ts.crearAnimal("Linda", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0));
		animales.add(ts.crearAnimal("Bombón", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0));
		System.out.println(ts.buscar(animales, animales.get(1)));
		ts.eliminar(animales, ts.buscar(animales, animales.get(0)));
		//creamos un nuevo adoptante dentro del array de personas
		personas.add(new Adoptante("Maria Reyes", "12345678A", "ninguno", "a@a.com", "calle", "soleada", null, "izq", null, "Palma del Río", "Córdoba", 789654123, 5, 0, 14500, 15000, 65, 2));
		solicitudes.add(TestProtectora.crearSolicitud(animales.get(0), (Adoptante) personas.get(0), true, true, true));
		solicitudes.get(0).primeraComprobacion();
		System.out.println("Prueba2");
		System.out.println(animales.get(0).toString());
		System.out.println(personas.get(0).toString());
		System.out.println(solicitudes.get(0).toString());
=======
		//creamos un array de personas donde podemos tener tanto adoptantes como clientes
		Persona[] personas = new Persona[5];
		//creamos un array de solicitudes
		SolicitudAdopcion[] solicitudes = new SolicitudAdopcion[5];
		//creamos un array de animales
		Animal[] animales = new Animal[5];
		animales[0] = ts.crearAnimal("Pepito", TipoAnimal.PERRO, ColorAnimal.BLANCO, SexoAnimal.MACHO, Razas.LABRADOR, Tamanios.MEDIANO, LocalDate.of(2019, 12, 01), false, 123456789123456L);
		logger.info("Creado animal 1");
		System.out.println(animales[0].getNombreAnimal());
		EstadoAnimal estado2 = new EstadoAnimal(animales[0], EstadosAnimal.ADOPTADO);
		animales[0].agregar(estado2);
		EstadoAnimal estado3 = new EstadoAnimal(animales[0], EstadosAnimal.ADOPTABLE);
		animales[0].agregar(estado3);
		EstadoAnimal estado4 = new EstadoAnimal(animales[0], EstadosAnimal.ADOPTADO);
		animales[0].agregar(estado4);
		EstadoAnimal estado5 = new EstadoAnimal(animales[0], EstadosAnimal.ADOPTABLE);
		animales[0].agregar(estado5);
		animales[0].ordenar(animales[0].getEstadosAnimal());
		System.out.println("Prueba1");
		animales[1] = ts.crearAnimal("Amelia", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0);
		animales[2] = ts.crearAnimal("Manuela", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0);
		animales[3] = ts.crearAnimal("Linda", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0);
		animales[4] = ts.crearAnimal("Bombón", TipoAnimal.PERRO, ColorAnimal.BICOLOR, SexoAnimal.HEMBRA, Razas.DALMATA, Tamanios.GIGANTE, LocalDate.of(2022, 12, 01), false, 0);
		System.out.println(ts.buscar(animales, animales[1]));
		ts.eliminar(animales, ts.buscar(animales, animales[0]));
		//creamos un nuevo adoptante dentro del array de personas
		personas[0] = new Adoptante("Maria Reyes", "12345678A", "ninguno", "a@a.com", "calle", "soleada", null, "izq", null, "Palma del Río", "Córdoba", 789654123, 5, 0, 14500, 15000, 65, 2);
		solicitudes[0] = TestProtectora.crearSolicitud(animales[0], (Adoptante) personas[0], true, true, true);
		solicitudes[0].primeraComprobacion();
		System.out.println("Prueba2");
		System.out.println(animales[0].toString());
		System.out.println(personas[0].toString());
		System.out.println(solicitudes[0].toString());
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
	}
	/**
	 * Método que sirve para crear un animal. Lo crea, le asigna un estado y agrega el estado del animal. Finalmente, devuelve el animal creado.
	 * @param nombreAnimal
	 * @param tipoAnimal
	 * @param colorAnimal
	 * @param sexoAnimal
	 * @param razaAnimal
	 * @param fechaNacimientoAnimal
	 * @param castrado
	 * @param chip
	 * @return el animal creado con el estado asignado
	 */
	private Animal crearAnimal(String nombreAnimal, int tipoAnimal, int colorAnimal, int sexoAnimal, int razaAnimal, int tamanio, LocalDate fechaNacimientoAnimal, boolean castrado, long chip) {
		Animal animal = new Animal(nombreAnimal, tipoAnimal, colorAnimal, sexoAnimal, razaAnimal, tamanio, fechaNacimientoAnimal, castrado, chip);
		EstadoAnimal estadoAnimal;
		if(animal.getChip()==0) {
			estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.INDOCUMENTADO);
		}
		else {
			estadoAnimal = new EstadoAnimal(animal, EstadosAnimal.ADOPTABLE);
		}
		animal.agregar(estadoAnimal);
		return animal;
	}
	private static SolicitudAdopcion crearSolicitud(Animal animal, Adoptante adoptante, boolean aceptacionConvivientes, boolean compromisoCastrar, boolean compromisoInformarProtectora) {
		SolicitudAdopcion solicitud = new SolicitudAdopcion(animal, adoptante, aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora);
		return solicitud;
	}
	@Override
<<<<<<< HEAD
	public int buscar(ArrayList array, Object object) {
		//como ya tenemos reescrito el método equals en animal, simplemente aplicamos indexOf, que nos devolverá -1 si no encuentra el objeto o la posición de este
		//si lo encuentra
		return array.indexOf(object);
	}
	@Override
	public void eliminar(ArrayList array, int indice) {
		array.remove(indice);
=======
	public int buscar(Object[] array, Object object) {
		int salida = -1, contador=0;
		while(salida==-1&&contador<array.length) {
			if(((Animal)object).equals((Animal)array[contador]))salida=contador;
			else contador++;
		}
		return salida;	
	}
	@Override
	public void eliminar(Object[] array, int indice) {
		array[indice]=null;
		for(int i = 1; i<array.length; i++) {
			if(array[i-1]==null) {
				array[i-1]=array[i];
				array[i]=null;
			}
		}
>>>>>>> 9af789db91487a99f07f43bf27c3cb59e41afc91
	}

}
