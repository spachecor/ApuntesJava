package temados.librerias.clasemath;

public class ClaseMath {
	public static void main(String[] args) {
		//Todos los métodos (+ importantes) de la clase StringBuffer:
		
		
		int num1 = 5;
		int num2 = -2;
		double num3 = 0.073;
		double num4 = -54.365;
		
		//CONSTANTES:
		
		double pi = Math.PI;//Muestra el nº pi
		double e = Math.E;//Muestra el nº de euler o neperiano
		
		//MÉTODOS:
		
		//Math.abs() - Devuelve el tipo de dato con el que se utilice el método (siempre numérico)
		//Retorna el valor absoluto de un número
		int abs1 = Math.abs(num1);//Muestra 5
		int abs2 = Math.abs(num2);//Muestra 2
		double abs4 = Math.abs(num4);//Muestra 54.365
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.round() - Devuelve int o long, dependiendo del largo del número.
		//Redondea el número que le asignemos(redondeo de toa la vida)
		long round3 = Math.round(num3);//Muestra 0
		long round4 = Math.round(num4);//Muestra -54
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.ceil() - Devuelve un double
		//Devuelve el entero mayor o igual más próximo a un número dado.
		
		double ceil3 = Math.ceil(num3);//Muestra 1.0
		double ceil4 = Math.ceil(num4);//Muestra -54.0
		
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.floor() - Devuelve un double
		//Devuelve el entero anterior a el dado
		
		double floor3 = Math.floor(num3);//Muestra 0.0
		double floor4 = Math.floor(num4);//Muestra -55.0
		
		/*--------------------------------MÁXIMO Y MÍNIMO-------------------------------------------*/
		
		//Math.min() - Devuelve un dato de tipo numérico a razón de los introducidos
		//Devuelve el menor de los números introducidos
		
		int min1 = Math.min(num1, num2);//Muestra -2
		double min2 = Math.min(num3, num4);//Muestra -54.365
		double min3 = Math.min(num2, num4);//Muestra -54.365
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.max() - Devuelve un dato de tipo numérico a razón de los introducidos
		//Devuelve el mayor de los números introducidos
		
		int max1 = Math.max(num1, num2);//Muestra 5
		double max2 = Math.max(num3,  num4);//Muestra 0.073
		double max3 = Math.max(num2,  num4);//Muestra -2.0
		
		/*------------------------------------------------------------------------------------------*/
		/*-------------------------------EXPONENCIAL Y LOGARÍTMICA----------------------------------*/
		
		//Math.log() - Devuelve un double
		//Devuelve el logaritmo en base e del nº introducido
		
		double ln = Math.log(Math.E);//Muestra 1.o
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.exp() - Devuelve un double
		//Devuelve el número e(nº neperiano o nº de Euler) elevado a un valor (el que introducimos nosotros)
		
		double euler = Math.exp(2);//Muestra 7.38905609893065 (e²)
		
		/*------------------------------------------------------------------------------------------*/
		/*--------------------------------POTENCIA Y RAÍZ CUADRADA----------------------------------*/
		
		//Math.pow() - Devuelve un double
		//Devuelve un nº elevado a otro, ambos introducidos
		
		double pow = Math.pow(2, 5);//Muestra 32.0
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.sqrt() - Devuelve un double
		//Devuelve la raiz cuadrada del nº introducido
		
		double raiz = Math.sqrt(4);//Muestra 2.0
		
		/*------------------------------------------------------------------------------------------*/
		/*-------------------------------------TRIGONOMÉTRICAS--------------------------------------*/
		
		//Math.toRadians(angulo) - Devuelve un double
		//Convierte el ángulo en grados que se le introduzca en radianes
		
		double angulo = 30.0;
		double radian = Math.toRadians(angulo);	//Muestra 0.52....
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.toDegrees(angulo en radianes) - Devuelve un double
		//Convierte un ángulo en radianes en un ángulo en grados
		
		double anguloTransformado = Math.toDegrees(radian); //Muestra 30.0 (Puede contener un leve fallo
															//matemático
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.cos()/Math.sin()/Math.tan() - Devuelve un double
		//Realiza el coseno, seno y tangente de un ángulo (en radianes)
		
		double coseno = Math.cos(radian); //Muestra 0.866...
		double seno = Math.sin(radian); //Muestra 0.499....
		double tangente = Math.tan(radian); //Muestra 0.577....
		
		/*------------------------------------------------------------------------------------------*/
		
		//Math.acos()/Math.asin()/Math.atan() - Devuelve un double
		//Realiza el arcocoseno, arcoseno y arcotangente de un ángulo (en radianes)
		
		double arccos = Math.acos(radian);
		double arcsen = Math.asin(radian);
		double arctg = Math.atan(radian);
		
		
		
		
		
		System.out.println(anguloTransformado);
		
		
		
		
		
		
		
		
		
		

		
	}
}
