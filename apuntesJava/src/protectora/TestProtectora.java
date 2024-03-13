package protectora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

import protectora.conduct.ComportamientoProtectora;
import protectora.conduct.GeneratorXml;
import protectora.interfaces.Buscable;
import protectora.interfaces.Eliminable;
import protectora.logger.ProtectoraLogger;
import protectora.utilidades.*;
/**
 * Clase test que sirve para probar la creación de objetos y sus comportamientos
 * @author selene
 * @version 1.4
 */
public class TestProtectora implements Buscable, Eliminable{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//abrimos flujo de entrada
		//Mantenemos la llamada al logger aunque actualmente no vamos a usarlo.
		Logger logger = ProtectoraLogger.getLogger(TestProtectora.class.getName());
		//creamos un objeto de la clase main para poder llamar a sus métodos
		TestProtectora ts = new TestProtectora();
		//creamos las listas de animales y adoptantes para llenarlas
		ArrayList<Animal> animales = new ArrayList<>();
		ArrayList<Adoptante> adoptantes = new ArrayList<>();
		//llenamos los arrayslist de animales y adoptantes con el contenido de los xml correspondientes
		GeneratorXml.crearAnimalConXml(animales, "xml\\animales.xml");
		GeneratorXml.crearAdoptanteConXml(adoptantes, "xml\\adoptante.xml");

		//VAMOS A SIMULAR EL CASO DE 3 SOLICITUDES DE ADOPCIÓN(usamos bucle for para repetir el proceso 3 veces)
		ArrayList<SolicitudAdopcion> solicitudes = new ArrayList<>();
		for(int i = 0;i<3;i++){
			String dni, aux;
			int indiceAdoptante=-1, indiceAnimal=-1, codigoAnimal;
			boolean aceptacionConvivientes=false, compromisoCastrar=false, compromisoInformarProtectora=false, aceptacionProtectora=false;
			//1º Solicitamos el adoptante que va a adoptar al animal, para ello le pedimos que introduzca su dni
			System.out.println("Introduzca el DNI del adoptante");
			dni = sc.next();
			//2º Buscamos el dni del adoptante entre dentro de la lista de adoptantes
			for(Adoptante adoptante: adoptantes){
				if(adoptante.getCodigo()==Integer.parseInt(dni.substring(0,8))){
					indiceAdoptante = ts.buscar(adoptantes, adoptante);
					break;
				}
			}
			//3º Solicitamos el codigo del animal a adoptar
			System.out.println("Introduzca el código del animal");
			codigoAnimal = sc.nextInt();
			//4º Buscamos el codigo del animal dentro de la lista de animales
			for(Animal animal: animales){
				if(codigoAnimal==animal.getCodigoAnimal()){
					indiceAnimal = ts.buscar(animales, animal);
					break;
				}
			}
			//5º Creamos la solicitud y la almacenamos en el array de solicitudes(solicitamos un par de datos al posible futuro adoptante)
			//aceptacion de otros convivientes de la adopcion
			System.out.println("¿Vive usted solo? (Responda s/n");
			aux = sc.next();//comprobamos si el adoptante vive solo
			if(aux.toLowerCase().equals("n")){//si no vive solo, comprobamos si los convivientes aceptan la adopcion
				System.out.println("¿Sus convivientes están de acuerdo con la adopción?(Responda s/n)");
				aux = sc.next();
				if(aux.toLowerCase().equals("s")) aceptacionConvivientes=true;//solo si la aceptan el estado cambiará a true
			} else if (aux.toLowerCase().equals("s")) aceptacionConvivientes = true;//si el adoptante vive solo pasa a true automáticamente
			//compromiso castración animal
			if(animales.get(indiceAnimal).getCastrado()) compromisoCastrar=true;//se comprueba que el animal esté castrado, en caso contrario:
			else{
				System.out.println("El animal no está castrado, ¿se compromete a castrarlo?(Responda s/n)");
				aux = sc.next();//se pregunta al adoptante si lo piensa castrar
				if(aux.toLowerCase().equals("s"))compromisoCastrar=true;//solo si acepta el estado cambiará a true
			}
			//compromiso informar a la protectora
			System.out.println("¿Se compromete a tener informada a la protectora en todo momento en caso de problemas" +
					" de salud grave/fallecimiento/cambio de domicilio del animal?(Responda s/n)");
			aux = sc.next();//se pregunta si se compromete a informar a la protectora
			if(aux.toLowerCase().equals("s"))compromisoInformarProtectora=true;//solo si acepta el estado cambiará a true
			//se genera la solicitud y se almacena dentro del arraylist de solicitudes
			solicitudes.add(ComportamientoProtectora.crearSolicitud(animales.get(indiceAnimal), adoptantes.get(indiceAdoptante), aceptacionConvivientes, compromisoCastrar, compromisoInformarProtectora));
			//La protectora ahora acepta o no la adopción
			if(solicitudes.get(i).getEstadoSolicitud()==EstadosSolicitudAdopcion.EN_ESPERA){//se comprueba que la adopción no haya sido denegada ya
				System.out.println("¿Se aprueba la solicitud de adopción del animal "+solicitudes.get(i).getAnimal().getCodigoAnimal()+" con nombre "
						+solicitudes.get(i).getAnimal().getNombreAnimal()+" del posible adoptante con código "+solicitudes.get(i).getAdoptante().getCodigo()+" y nombre "
						+solicitudes.get(i).getAdoptante().getNombre()+"?(Responda s/n)");
				aux  = sc.next();
				if(aux.toLowerCase().equals("s")) aceptacionProtectora = true;//solo si acepta se aprueba y cambia a true
			}
			//resolvemos la solicitud
			solicitudes.get(i).resolverSoliditud(aceptacionProtectora);
		}
		GeneratorXml.generarResultadoSolicitudesAdopcion(solicitudes);
		sc.close();//cerramos el flujo de entrada
    }
	@Override
	public int buscar(ArrayList array, Object object) {
		//creamos un iterador
		Iterator<Object> it = array.iterator();//usamos el iterador para iterar por la lista
		//mientras siga habiendo más elementos, el bucle seguirá dando vueltas
		while(it.hasNext()) {//si hay otro más, continuará
			Object aux = it.next();
			if(aux.equals(object))return Collections.binarySearch(array, aux);//si coincide el valor del objeto dentro de la lista
			//con el que introducimos por parámetro, se devuelve la posición en la lista del objeto
		}
		//si se ha finalizado el bucle y no ha salido del método(lo que significa que no ha encontrado el objeto), devolverá -1
		return -1;
	}
	@Override
	public void eliminar(ArrayList array, int indice) {
		array.remove(indice);
	}
}
