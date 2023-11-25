package temados.repasoExamen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RepasoPreExamen {

	public static void main(String[] args) {
		
		//Ofrecido por JDCO
		
		
		//Escribir un programa Java que solicite una cadena de caracteres 
				//y la devuelva invertida con efecto espejo, esto es, se concatena a la palabra 
				//original su inversa, compartiendo la última letra, que hará de espejo, 
				//por lo que la palabra obtenida se lee igual hacia adelante que hacia atrás.
				//La palabra debe empezar con mayúsculas y terminar en mayúsculas, 
				//los demás caracteres deben estar en minúsculas. (5 puntos, ce: b,c,d,h)
				//Ejemplo: HolaloH
				 Scanner sc = new Scanner(System.in);
				 //Pedimos la palabra por consola 
			        System.out.print("Ingrese una palabra: ");
			        String palabra = sc.nextLine();
			        //Le damos la vuelta a la palabra 
			        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
			        //Ponemos la palabra en minuscula
			        String letraMinuscula = palabra.toLowerCase();
			        //Ponemos la primera letra en mayuscula
			        String letraMayuscula = palabra.substring(0,1).toUpperCase()+palabra.substring(1);
			        //Se pide la longitud de la palabra 
			        int l = palabra.length();
			        //Le asignamos la ultima letra en mayuscula
			        String palabra1 = palabra.substring(0, l-1) + palabra.substring(l-1).toUpperCase();
			        System.out.println(palabra + palabraInvertida.substring(1));
			        
/*------------------------------------------------------------------------------------------------------*/
			        
			      //Desarrolla un programa Java en el que obtenga lo siguiente (5 puntos, ce: b,c,d,h):
					//Solicita una fecha por consola y muestra lo siguiente:
					//Nombre del mes de la fecha
					//Pido la fecha por consola
			        System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
			        String fecha = sc.nextLine();
			        //Le introduzco el patron que quiero que tenga la fecha
			        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			        //Parseo el String fecha para que este en LocalDate
			        LocalDate fechaNueva = LocalDate.parse(fecha, formateador);
			        System.out.println("Mes: " + fechaNueva.getMonth());
					//Nombre del día, dos semanas y un día, después de la fecha 
			        LocalDate tiempoTrascurrido = fechaNueva.plusWeeks(2).plusDays(1);
			        System.out.println("Dia, dos semanas y un dia después: " + 
			        tiempoTrascurrido.getDayOfWeek());
					//Nombre del último día del año de la fecha
			        LocalDate ultimoDiaAno = LocalDate.of(fechaNueva.getYear(), 12, 31);
			        System.out.println("Ultimo dia del año: " + ultimoDiaAno.getDayOfWeek());
					//Número de días para finalizar el año desde la fecha
			        long diasParaFinalizarAno = ultimoDiaAno.toEpochDay() - fechaNueva.toEpochDay();
			        System.out.println("Dias para finalizar el ano: " + diasParaFinalizarAno);
					//Debes obtener y mostrar las siguientes características:
					//Símbolo separador de ficheros y carpetas en el sistema (Por ejemplo, en Windows es \)
			        String separador = System.getProperty("file.separator");
			        System.out.println("Símbolo separador de ficheros y carpetas: " + separador);
				    //Directorio de instalación de Java
			        String javaHome = System.getProperty("java.home");
			        System.out.println("Directorio de instalación de Java: " + javaHome);
					//Versión de la máquina virtual
			        String javaVersion = System.getProperty("java.version");
			        System.out.println("Versión de la máquina virtual: " + javaVersion);
					//Rutas donde se almacenan los ficheros .class en el sistema.
			        String classPath = System.getProperty("java.class.path");
			        System.out.println("Rutas donde se almacenan los ficheros .class: " + classPath);
			        
			        sc.close();
			        
	}

}
