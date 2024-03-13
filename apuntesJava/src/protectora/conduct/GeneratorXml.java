package protectora.conduct;

import org.w3c.dom.*;
import protectora.Adoptante;
import protectora.Animal;
import protectora.SolicitudAdopcion;
import protectora.utilidades.MapeadoAnimal;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Clase que genera documentos xml y que también lee documentos xml.
 * @author Selene
 * @version 1.0
 */
public class GeneratorXml {
    /**
     * Método que llena un ArrayList de animales según los animales que entran por un XML
     * @param pathname La ruta del xml que contiene los animales
     * @param array El array que queremos llenar de animales
     */
    public static void crearAnimalConXml(ArrayList<Animal> array, String pathname){
        try{
            //1º Creamos una instancia de DocumentBuilderFactory(factoria de creadores de documentos)
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //2º Creamos un objeto del tipo DocumentBuilder(creadores de documento) con la instancia anterior
            DocumentBuilder db = dbFactory.newDocumentBuilder();
            //3º Creamos el documento pasándole el archivo xml externo, que entra como argumento al método
            Document documento = db.parse(new File(pathname));
            //4º Obtenemos la lista de nodos que tiene animales, es decir, el animal(la etiqueta raíz es animales, sus nodos son cada animal)
            NodeList animales = documento.getElementsByTagName("animal");
            //5º Recorremos la lista de animales para ir sacando las características de cada animal
            for(int i = 0; i<animales.getLength();i++){
                //tomamos el item de la lista como un nodo para poder tratarlo/usarlo
                Node animal = animales.item(i);
                //comprobamos que el nodo es del tipo element para poder aplicar el siguiente casting
                if(animal.getNodeType()==Node.ELEMENT_NODE){
                    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    //tomamos el nodo como un element(usamos casting)
                    Element elemento = (Element) animal;
                    //tomamos las características del xml para generar los nuevos animales
					/*primero tomamos los elementos por el nombre(tag), luego tomamos el item 0(en nuestro caso es el item 0 porque solo tenemos un solo
					elemento de ese tipo, si tuviesemos varios elementos con el mismo nombre(tag) habría que iterarlos para recogerlos todos), y después
					tomamos el texto contenido dentro de la etiqueta que hemos tomado con el nombre y la posición.*/
                    //Creamos el animal con el metodo crearAnimal porque le asigna el estado del animal inicial y es indispensable
                    array.add(ComportamientoProtectora.crearAnimal(elemento.getElementsByTagName("nombre").item(0).getTextContent(),
                            Integer.parseInt(elemento.getElementsByTagName("tipo").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("color").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("sexo").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("raza").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("tamanio").item(0).getTextContent()),
                            LocalDate.parse(elemento.getElementsByTagName("fechaNacimientoAnimal").item(0).getTextContent(), formatoFecha),
                            Boolean.parseBoolean(elemento.getElementsByTagName("castrado").item(0).getTextContent()),
                            Long.parseLong(elemento.getElementsByTagName("chip").item(0).getTextContent())));
                }
            }
        }catch (Exception e){
            System.out.println("Imposible cargar documento xml");
            e.printStackTrace();
        }
    }

    /**
     * Método que llena un ArrayList de adoptantes según los adoptantes que entran por un XML
     * @param pathname La ruta del xml que contiene los adoptantes
     * @param array El array que queremos llenar de adoptantes
     */
    public static void crearAdoptanteConXml(ArrayList<Adoptante> array, String pathname){
        try{
            //1º Creamos una instancia de DocumentBuilderFactory(factoria de creadores de documentos)
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //2º Creamos un objeto del tipo DocumentBuilder(creadores de documento) con la instancia anterior
            DocumentBuilder db = dbFactory.newDocumentBuilder();
            //3º Creamos el documento pasándole el archivo xml externo, que entra como argumento al método
            Document documento = db.parse((new File(pathname)));
            //4º Obtenemos la lista de nodos que tiene adoptantes, es decir, el animal(la etiqueta raíz es adoptantes, sus nodos son cada adoptante)
            NodeList adoptantes = documento.getElementsByTagName("adoptante");
            //5º Recorremos la lista de adoptantes para ir sacando las características de cada adoptante
            for(int i = 0;i< adoptantes.getLength();i++){
                //tomamos el item de la lista como un nodo para poder tratarlo/usarlo
                Node adoptante = adoptantes.item(i);
                if(adoptante.getNodeType()==Node.ELEMENT_NODE){
                    //tomamos el nodo como un element(usamos casting)
                    Element elemento = (Element) adoptante;
                    array.add(new Adoptante(elemento.getElementsByTagName("nombre").item(0).getTextContent(),
                            elemento.getElementsByTagName("dni").item(0).getTextContent(),
                            elemento.getElementsByTagName("trabajo").item(0).getTextContent(),
                            elemento.getElementsByTagName("email").item(0).getTextContent(),
                            elemento.getElementsByTagName("tipoVia").item(0).getTextContent(),
                            elemento.getElementsByTagName("nombreVia").item(0).getTextContent(),
                            elemento.getElementsByTagName("escalera").item(0).getTextContent(),
                            elemento.getElementsByTagName("puerta").item(0).getTextContent(),
                            elemento.getElementsByTagName("infoAdicional").item(0).getTextContent(),
                            elemento.getElementsByTagName("localidad").item(0).getTextContent(),
                            elemento.getElementsByTagName("provincia").item(0).getTextContent(),
                            Integer.parseInt(elemento.getElementsByTagName("telefono").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("numeroCasa").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("bloque").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("codigoPostal").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("ingresosAdoptante").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("dimensionesViviendaAdoptante").item(0).getTextContent()),
                            Integer.parseInt(elemento.getElementsByTagName("numeroMascotasAdoptante").item(0).getTextContent())));
                }
            }
        }catch(Exception e){
            System.out.println("Imposible cargar documento xml");
            e.printStackTrace();
        }
    }

    /**
     * Método que genera un documento xml a través de la resolución de las solicitudes de adopción
     * @param solicitudes el array de solicitudes de adopción resueltas
     */
    public static void generarResultadoSolicitudesAdopcion(ArrayList<SolicitudAdopcion> solicitudes){
        try{
            //1º Creamos una instancia de DocumentBuilderFactory(factoria de creadores de documentos)
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //2º Creamos un objeto del tipo DocumentBuilder(creadores de documento) con la instancia anterior
            DocumentBuilder db = dbFactory.newDocumentBuilder();
            //3º Creamos un objeto tipo DOMImplementation, que nos servirá para crear nuestro documento xml
            DOMImplementation implementation = db.getDOMImplementation();
            //4º Creamos el documento con el objeto implementation anteriormente creado e indicamos el namespace, elemento raíz y doctype
            Document solicitudesResueltas =  implementation.createDocument(null, "solicitudesResueltas", null);
            //5º Asignamos la versión de xml
            solicitudesResueltas.setXmlVersion("1.0");
            for(int i = 0;i<solicitudes.size();i++){
                //6º Creamos los elementos en orden
                Element solicitud = solicitudesResueltas.createElement("solicitud");
                Element codigoSolicitud = solicitudesResueltas.createElement("codigoSolicitud");
                Element animal = solicitudesResueltas.createElement("animal");
                Element codigoAnimal = solicitudesResueltas.createElement("codigoAnimal");
                Element nombreAnimal = solicitudesResueltas.createElement("nombreAnimal");
                Element adoptante = solicitudesResueltas.createElement("adoptante");
                Element codigoAdoptante = solicitudesResueltas.createElement("codigoAdoptante");
                Element nombreAdoptante = solicitudesResueltas.createElement("nombreAdoptante");
                Element fechaSolicitud = solicitudesResueltas.createElement("fechaSolicitud");
                Element fechaResolucion = solicitudesResueltas.createElement("fechaResolucion");
                Element estado = solicitudesResueltas.createElement("estado");
                //7º Creamos el texto de los elementos que corresponda
                Text textCodigoSolicitud = solicitudesResueltas.createTextNode(String.valueOf(solicitudes.get(i).getCodigoSolicitud()));
                Text textCodigoAnimal = solicitudesResueltas.createTextNode(String.valueOf(solicitudes.get(i).getAnimal().getCodigoAnimal()));
                Text textNombreAnimal = solicitudesResueltas.createTextNode(solicitudes.get(i).getAnimal().getNombreAnimal());
                Text textCodigoAdoptante = solicitudesResueltas.createTextNode(String.valueOf(solicitudes.get(i).getAdoptante().getCodigo()));
                Text textNombreAdoptante = solicitudesResueltas.createTextNode(solicitudes.get(i).getAdoptante().getNombre());
                Text textFechaSolicitud = solicitudesResueltas.createTextNode(solicitudes.get(i).getFechaHoraSolicitud().toString());
                Text textFechaResolucion = solicitudesResueltas.createTextNode(solicitudes.get(i).getFechaHoraResolucion().toString());
                Text textEstado = solicitudesResueltas.createTextNode(MapeadoAnimal.estadosSolicitudAdopcion.get(solicitudes.get(i).getEstadoSolicitud()));
                //8º Asignamos la estructura, metiendo los textos dentro de los elementos y los elementos dentro de otros elementos
                //primero los texto dentro de sus etiquetas
                codigoSolicitud.appendChild(textCodigoSolicitud);
                codigoAnimal.appendChild(textCodigoAnimal);
                nombreAnimal.appendChild(textNombreAnimal);
                codigoAdoptante.appendChild(textCodigoAdoptante);
                nombreAdoptante.appendChild(textNombreAdoptante);
                fechaSolicitud.appendChild(textFechaSolicitud);
                fechaResolucion.appendChild(textFechaResolucion);
                estado.appendChild(textEstado);
                //luego unas etiquetas dentro de otras
                animal.appendChild(codigoAnimal);
                animal.appendChild(nombreAnimal);
                adoptante.appendChild(codigoAdoptante);
                adoptante.appendChild(nombreAdoptante);
                //continuamos metiendo etiquetas más específicas en otra más genérica
                solicitud.appendChild(codigoSolicitud);
                solicitud.appendChild(animal);
                solicitud.appendChild(adoptante);
                solicitud.appendChild(fechaSolicitud);
                solicitud.appendChild(fechaResolucion);
                solicitud.appendChild(estado);
                //9º Añadimos al elemento raíz el elemento solicitudes
                solicitudesResueltas.getDocumentElement().appendChild(solicitud);
            }
            //10º Asociamos nuestro documento con el source
            Source source = new DOMSource(solicitudesResueltas);
            //11º Creamos el result y lo asociamos al nuevo documento, que también se creará
            Result result = new StreamResult(new File("xml\\solicitudesResueltas.xml"));
            //12º Creamos un transformer, que vinculará nuestro source con nuestro result
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");//le asignamos la propiedad de que el xml esté identado
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");//le asignamos la propiedad al xml de tener la codificación UTF-8
            transformer.transform(source, result);
        }catch (Exception e){
            System.out.println("Imposible crear documento xml");
            e.printStackTrace();
        }
    }
}
