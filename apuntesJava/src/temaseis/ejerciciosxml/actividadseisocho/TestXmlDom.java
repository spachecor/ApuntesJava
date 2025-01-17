package temaseis.ejerciciosxml.actividadseisocho;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestXmlDom {
	//TODO definir la lista de personas
	static ArrayList<Persona> personas;
	//TODO definir el mapa que se construye a partir del XML
	static HashMap<Integer, String> emails;
	static{
		emails = new HashMap<>();
		personas = new ArrayList<>();
	}
	public static void main(String[] args) {
		//Creamos un objeto de la clase para poder invocar métodos propios
		TestXmlDom ts = new TestXmlDom();
		try {
			// 1º Creamos una nueva instancia de un fábrica de constructores
			// de documentos.DocumentBuilderFactory
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// 2º A partir de la instancia anterior, fabricamos un 
			// constructor de documentos, que procesará el XML.
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 3º Procesamos el documento (almacenado en un archivo) 
			// y lo convertimos en un árbol DOM.			
			Document documento=db.parse("apuntesJava\\src\\temaseis\\ejerciciosxml\\actividadseisocho\\personas.xml");

			System.out.println(documento.getXmlVersion());
			System.out.println(documento.getXmlEncoding());
			System.out.println(documento.getNodeName());

			Element root = documento.getDocumentElement();
			System.out.println(root.getNodeName());

			//Buscar un nodo concreto
			NodeList listaNodos=documento.
					getElementsByTagName("persona");

			Element persona;
			if (listaNodos.getLength()>0){
				persona=(Element)listaNodos.item(0);
				NodeList nodoPersona = persona.getElementsByTagName("age");

				if(nodoPersona.getLength()==1) {
					Element firstName = (Element)nodoPersona.item(0);
					System.out.println(firstName.getChildNodes().
							item(0));
				}
			}


			//obtener lista de hijos - comentamos porque no lo necesitamos
			//listaNodos=documento.getDocumentElement().getChildNodes();

			//Llamamos al método showPersonProperties, que recibe un nodelist(listaNodos) e imprime por consola
			//las propiedades de la persona
			ts.showPersonProperties(listaNodos);
			//LLENAMOS LA LISTA DE PERSONAS DE PERSONAS SEGÚN EL XML PERSONAS y de paso, invocamos al método showProperties
			//para llenar el hashmap
			for(int i = 0;i<listaNodos.getLength();i++){
				Node personaNodo = listaNodos.item(i);
				if(personaNodo.getNodeType()==Node.ELEMENT_NODE){
					Element elemento = (Element) personaNodo;
					//invocamos shoProperties para llenar la lista de personas y el mapa con los emails y el id, a demás de
					//devolvernos el mapa, aunque no lo necesitemos
					ts.showProperties(elemento);
				}
			}
		} catch (SAXException | IOException | ParserConfigurationException e) {

			e.printStackTrace();
		}
	}
	//TODO implementar este método para recorrer todas las personas
	//del XML y sus propiedades
	private void showPersonProperties(NodeList listaNodos) {
		for (int i=0; i<listaNodos.getLength();i++) {
			Node nodo=listaNodos.item(i);
			if(nodo.getNodeType()==Node.ELEMENT_NODE){
				//TODO tratar las propiedades de cada persona
				Element elemento = (Element) nodo;
				System.out.print(nodo.getNodeName()+" nº"+(i+1)+": ");
				System.out.print("Id: "+elemento.getElementsByTagName("id").item(0).getTextContent());
				System.out.print(" Nombre: "+elemento.getElementsByTagName("first_name").item(0).getTextContent());
				System.out.print(" Apellido: "+elemento.getElementsByTagName("last_name").item(0).getTextContent());
				System.out.print(" Email: "+elemento.getElementsByTagName("email").item(0).getTextContent());
				System.out.print(" Género: "+elemento.getElementsByTagName("gender").item(0).getTextContent());
				System.out.println(" Edad: "+elemento.getElementsByTagName("age").item(0).getTextContent());
			}
		}
	}
	//TODO recorrer cada persona, mostrar sus propiedades, crear y almacenar
	//las personas en una lista ordenada por apellidos y nombre, y también
	//almacenar todas las personas en un mapa compuesto por: el identificador
	//como clave y el correo como valor
	private HashMap<Integer,String> showProperties(Element elemento) {
		//agregamos todos los datos de la nueva persona en la lista
		personas.add(new Persona(
				Integer.parseInt(elemento.getElementsByTagName("id").item(0).getTextContent()),
				elemento.getElementsByTagName("first_name").item(0).getTextContent(),
				elemento.getElementsByTagName("last_name").item(0).getTextContent(),
				elemento.getElementsByTagName("gender").item(0).getTextContent(),
				elemento.getElementsByTagName("email").item(0).getTextContent(),
				Integer.parseInt(elemento.getElementsByTagName("age").item(0).getTextContent())
		));
		//agregamos el id y el email de la persona al mapa
		emails.put(Integer.parseInt(elemento.getElementsByTagName("id").item(0).getTextContent()),
				elemento.getElementsByTagName("email").item(0).getTextContent());
		return emails;
	}
}
