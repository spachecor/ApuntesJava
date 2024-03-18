package temaseis.ejerciciosxml;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que contiene los ejercicios de la actividad 6.14
 * @author Selene
 * @version 1.0
 */
public class EjercicioSeisCatorce {
    public static void main(String[] args){
        String nombre, nif;
        int telefono, edad;
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Introduce el nombre el empleado nº"+(i+1));
            nombre = sc.nextLine();
            System.out.println("Introduce el nif del empleado");
            nif = sc.nextLine();
            System.out.println("Introduce el telefono del empleado");
            telefono = sc.nextInt();
            System.out.println("Introduce la edad del empleado");
            edad = sc.nextInt();
            empleados.add(new Empleado(nombre, nif, edad, telefono));
            //reseteamos el scanner
            sc.nextLine();
        }
        try{
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbFactory.newDocumentBuilder();
            //Creamos un objeto tipo DOMImplementation, que nos servirá para crear nuestro documento xml
            DOMImplementation implementation = db.getDOMImplementation();
            Document empleadosDocumento = implementation.createDocument(null, "empleados", null);
            empleadosDocumento.setXmlVersion("1.0");
            for(int i = 0;i<empleados.size();i++){
                //creamos los elementos dom
                Element empleado = empleadosDocumento.createElement("empleado");
                //creamos los atributos
                empleado.setAttribute("nombre", empleados.get(i).getNombre());
                empleado.setAttribute("nif", empleados.get(i).getNif());
                empleado.setAttribute("edad", String.valueOf(empleados.get(i).getEdad()));
                empleado.setAttribute("telefono", String.valueOf(empleados.get(i).getTelefono()));
                //añadimos el elemento principal al elemento raiz empleados
                empleadosDocumento.getDocumentElement().appendChild(empleado);
                //asociamos nuestro documento al source
                Source source = new DOMSource(empleadosDocumento);
                //Creamos result y lo asociamos al documento
                Result result = new StreamResult(new File("apuntesJava\\src\\temaseis\\ejerciciosxml\\empleados.xml"));
                //Creamos el transformer para vincular el source con el result
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.transform(source, result);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
