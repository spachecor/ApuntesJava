package temados.examen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * Examen del T2, diversos ejercicios
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class ExamenT2 {
	public static void main(String[] args) {
	/* Desarrolla un programa Java en el que obtenga lo siguiente (b,c,d,e,f,h,i):

	1. Solicita una fecha por consola y muestra lo siguiente (ce: f, 10%):

	Nombre del mes de la fecha
	Nombre del día, dos semanas y un día, después de la fecha
	Nombre del último día del año de la fecha
	Número de días para finalizar el año desde la fecha
	*/
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una fecha con el siguiente formato: dd/MM/yyyy");
			//Se genera un formateador para que podamos introducir la fecha en un formato en concreto y lo podamos introducir 
			//directamente en el LocalDate.parse().
			DateTimeFormatter formateadorFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//Creamos el objeto LocalDate con su método estático .parse() introduciendo la fecha y el formato en el que viene la 
			//fecha
			LocalDate fecha = LocalDate.parse(sc.next(), formateadorFecha);
			
			//Apartado 1:
			//Tomamos el mes con el método de instancia .getMonth() y lo pasamos al idioma del sistema con .getDisplayName()
			System.out.println(String.format("El es es el %s", fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault())));
			
			//Apartado 2:
			//Aumentamos la fecha lo que se nos pide con el método de instancia .plusXXX()
			LocalDate fecha2 = fecha.plusWeeks(2).plusDays(1);
			//Creamos el formateador para ofrecer la fecha en formato completo, donde se vea el día
			DateTimeFormatter formateadorFecha2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
			//Agregamos también el día que se nos pide en formato número y en formato letra
			System.out.println("La fecha aumentada 2 semanas y un día es queda tal que: " + fecha2.format(formateadorFecha2) 
			+ " y el día de la fecha resultante es el: " + fecha2.getDayOfMonth() + " " + fecha2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
			
			//Apartado 3:
			//Aplicamos el método estático del objeto TemporalAdjusters denominado .lastDayOfYear() para obtener el último día del
			//año y lo formateamos para visualizarlo correctamente
			System.out.println("El último día del año de la fecha introducida es el: " + 
			fecha.with(TemporalAdjusters.lastDayOfYear()).format(formateadorFecha2));
			
			//Apartado 4:
			//Utilizamos ChronoUnit para obtener los días entre la fecha y el último día del año de la fecha en cuestión
			System.out.println("El número de días que faltan desde la fecha introducida hasta el fin de año de la misma fecha son: "
					+ ChronoUnit.DAYS.between(fecha, fecha.with(TemporalAdjusters.lastDayOfYear())));
			
	/*2. Muestra por consola lo siguiente (ce: e, 5%):

	Símbolo separador de ficheros y carpetas en el sistema (Por ejemplo, en Windows es \)
	Directorio de instalación de Java
	Versión de la máquina virtual
	Rutas donde se almacenan los ficheros .class en el sistema
	*/
			//Utilizamos el método estático de la clase System .getProperty() para, mediante unas cadenas concretas, obtener los
			//datos que nos piden
			System.out.println(System.getProperty("file.separator"));
			System.out.println(System.getProperty("java.home"));
			System.out.println(System.getProperty("java.vm.version"));
			System.out.println(System.getProperty("java.class.path"));
	/*
	3. Imagina que nos dan 2 cadenas de caracteres como las siguientes (ce: b, 25%):
	cadena 1: a e i o u

	cadena 2: r m t p z

	Nos piden transformar las cadenas anteriores para que se muestren en consola de la siguiente manera:

	u;r;4;0
	o;m;3;1
	i;t;2;2
	e;p;1;3
	a;z;0;4
	*/
		//1- metemos en cadenas las cadenas que nos han facilitado más los números
		String cadena1 = "a e i o u";
		String cadena2 = "r m t p z";
		String numeros = "0 1 2 3 4";
		
		//2- Instanciamos dos objetos StringBuilder de la primera cadena y de los números
		StringBuilder sb1 = new StringBuilder(cadena1);
		StringBuilder sb2 = new StringBuilder(numeros);
		
		//3- Introducimos las cadenas en 4 nuevas instancias de StringTokenizer para poder usarlas como Tokens. Aplicamos en 
		//dos de ellas el método de instancia .reverse() de la clase StringBuilder para darles la vuelta
		StringTokenizer st1 = new StringTokenizer(sb1.reverse().toString(), " ");
		StringTokenizer st2 = new StringTokenizer(cadena2, " ");
		StringTokenizer st4 = new StringTokenizer(numeros, " ");
		StringTokenizer st3 = new StringTokenizer(sb2.reverse().toString(), " ");
		
		//3- Instanciamos 5 nuevos objetos de la clase StringJoiner con el separador adecuado (;)
		StringJoiner sj1 = new StringJoiner(";");
		StringJoiner sj2 = new StringJoiner(";");
		StringJoiner sj3 = new StringJoiner(";");
		StringJoiner sj4 = new StringJoiner(";");
		StringJoiner sj5 = new StringJoiner(";");
		
		//4- Utilizando el método de instancia .nextToken() de StringTokenizer vamos añadiendo los Tokens a los StringJoiner
		sj1.add(st1.nextToken());
		sj1.add(st2.nextToken());
		sj1.add(st3.nextToken());
		sj1.add(st4.nextToken());
		
		sj2.add(st1.nextToken());
		sj2.add(st2.nextToken());
		sj2.add(st3.nextToken());
		sj2.add(st4.nextToken());
		
		sj3.add(st1.nextToken());
		sj3.add(st2.nextToken());
		sj3.add(st3.nextToken());
		sj3.add(st4.nextToken());
		
		sj4.add(st1.nextToken());
		sj4.add(st2.nextToken());
		sj4.add(st3.nextToken());
		sj4.add(st4.nextToken());
		
		sj5.add(st1.nextToken());
		sj5.add(st2.nextToken());
		sj5.add(st3.nextToken());
		sj5.add(st4.nextToken());
		
		//5- Imprimimos el resultado
		System.out.println(sj1);
		System.out.println(sj2);
		System.out.println(sj3);
		System.out.println(sj4);
		System.out.println(sj5);
		
		
			
	/*
	4. Se dispone de una lista de alumnos/as y sus calificaciones en el módulo de Programación del CFGS 1º DAM (se aprueba el 
	módulo siempre que la calificación sea 5 o más puntos) como la siguiente(ce: b, 25%):

	al1;4:h-al3;6:m-al2;9:m-al5;3:m-al4;5:h-al6;2:h

	En la lista anterior al1, al2, al3... representa el código de cada alumno; el valor numérico entero es la calificación; y las
	 letras 'h' o 'm' indican el sexo.

	Muestra en consola una lista con las calificaciones del alumnado de sexo femenino de la siguiente manera:

	<código alumna> <calificación> <aprobada/suspensa>
	*/
		//1- metemos en cadenas los datos facilitados separándolos según nos pide el enunciado
		String codigos = "1 2 3 4 5 6";
		String notas = "4 9 6 5 3 2";
		String sexos = "h m m h m h";
		
		//2- Instanciamos 3 objetos de tipo StringTokenizer con las tres cadenas anteriormente creadas
		StringTokenizer codigo = new StringTokenizer(codigos);
		StringTokenizer nota = new StringTokenizer(notas);
		StringTokenizer sexo = new StringTokenizer(sexos);
		
		//3- Instanciamos 6 objetos de tipo StringJoiner con los delimitadores y separadores que nos pide el enunciado
		StringJoiner mostrar1 = new StringJoiner("> <", "<", ">");
		StringJoiner mostrar2 = new StringJoiner("> <", "<", ">");
		StringJoiner mostrar3 = new StringJoiner("> <", "<", ">");
		StringJoiner mostrar4 = new StringJoiner("> <", "<", ">");
		StringJoiner mostrar5 = new StringJoiner("> <", "<", ">");
		StringJoiner mostrar6 = new StringJoiner("> <", "<", ">");
		
		//4- con el método de instancia .add() de StringJoiner vamos agregando los datos dados
		mostrar1.add(codigo.nextToken());
		mostrar1.add(nota.nextToken());
		mostrar1.add(sexo.nextToken());
		
		mostrar2.add(codigo.nextToken());
		mostrar2.add(nota.nextToken());
		mostrar2.add(sexo.nextToken());
		
		mostrar3.add(codigo.nextToken());
		mostrar3.add(nota.nextToken());
		mostrar3.add(sexo.nextToken());
		
		mostrar4.add(codigo.nextToken());
		mostrar4.add(nota.nextToken());
		mostrar4.add(sexo.nextToken());
		
		mostrar5.add(codigo.nextToken());
		mostrar5.add(nota.nextToken());
		mostrar5.add(sexo.nextToken());
		
		mostrar6.add(codigo.nextToken());
		mostrar6.add(nota.nextToken());
		mostrar6.add(sexo.nextToken());
		
		//5- Mostramos el resultado
		System.out.println(mostrar1);
		System.out.println(mostrar2);
		System.out.println(mostrar3);
		System.out.println(mostrar4);
		System.out.println(mostrar5);
		System.out.println(mostrar6);


		
		
		

	/*
	5. Calcula y muestra en consola los resultados de lo que se pide a continuación (ce: d, 10%):

	a) Fecha del siguiente domingo a partir de la fecha actual

	b) Fecha del segundo viernes del mes de diciembre

	c) Nombre del día de la semana de mi siguiente cumpleaños
	*/
		//Apartado 1
		
		//Utilizamos el método estático .nex(DayOfWeek.XXXX) del tipo de objeto TemporalAdjusters para obtener el siguiente
		//domingo a partir de la fecha actual (sacada del uso de un método estático .now() del tipo de objeto LocalDate)
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)).format(formateadorFecha2));
		
		//Apartado 2
		//1- Obtenemos el último día del año, para ubicarnos en diciembre. 2- Obtenemos el primer día del mes, ubicándonos en 
		//el 1 de diciembre. 3- Obtenemos el primer viernes del mes, diciendo que queremos el siguiente o el mismo(si estamos a
		//viernes) viernes del mes. 4- Obtenemos el segundo viernes del mes diciendo que queremos el siguiente viernes de ese mes.
		//Todo esto lo hacemos usando métodos estáticos del tipo de objeto TemporalAdjusters.
		System.out.println(hoy.with(TemporalAdjusters.lastDayOfYear()).with(TemporalAdjusters.firstDayOfMonth())
				.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		
		//Apartado 3
		//Sumamos 1 año a la fecha del cumpleaños con el método de instancia .plusYears(), luego tomamos el día de la semana con
		//el método estático .getDayOfWeek() y finalmente lo pasamos a el idioma del sistema con .getDisplayName()
		LocalDate cumple = LocalDate.of(2023, 03, 20);
		System.out.println(cumple.plusYears(1).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));

	/*
	6. Crea dos objetos, uno de tipo StringBuilder y otro de StringBuilder, ambos deben estar inicializados con una cadena
	 diferente. Después asigna la instancia del primer objeto al segundo y muestra por consola el contenido de ambos objetos. 
	 Explica el por qué del resultado obtenido. Explica las principales diferencias entre usar StringBuilder y StringBuffer 
	 (ce: c, 5%)
	*/
		StringBuilder stringBuilder1 = new StringBuilder("Hola caracola");
		StringBuilder stringBuilder2 = new StringBuilder("Adios caracol");
		stringBuilder2 = stringBuilder1;
		System.out.println(stringBuilder1 + " " + stringBuilder2);
		
		/*EXPLICACIÓN:
			Lo que ha ocurrido es que al yo asignar la instancia de stringBuilder1 al segundo objeto stringBuilder2, ambos pasan de
			apuntar cada uno a su dirección reservada en memoria propia a apuntar ambos a la misma. Esto significa que a partir de
			ahora, los cambios que hagas en uno de los dos repercutirá al otro, porque ambos apuntan al mismo sitio.
		
		PRINCIPAL DIFERENCIA ENTRE USAR StringBuffer y StringBuilder:
			La gran diferencia es que utilizaremos StringBuffer cuando trabajemos con múltiples hilos, y utilizaremos
			StringBuilder cuando no.
		
		
		
	/*
	7. Utiliza los constructores StringBuilder(int capacity) y StringBuilder(String str) para poner un ejemplo de cuándo 
	utilizarías uno u otro en un programa (ce: h, 10%)
	*/
		//Utilizaría el primero cuando no conozca la cadena que va a contener pero sí su longitud, guardando así en memoria el
		//espacio que va a necesitar
		StringBuilder ejercicio7_1 = new StringBuilder(5);
		//Utilizaría el segundo cuando sí conozca la cadena a utilizar
		StringBuilder ejercicio7_2 = new StringBuilder("holis");
		
	/*
	8. Realiza una configuración de depuración usando una versión distinta de JRE a la configuración de ejecución. Haz 2 
	capturas de pantalla, una para la configuración de depuración y otra para la de ejecución. La configuración de depuración 
	debe tener un nombre distinto a la de ejecución (ce: i, 10%).*/
	}
}
