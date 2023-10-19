package temados.poo.referenciar;

public class TestPunto {
	
	/* 
	 * 
	 */
	public static void main(String[] args) {
		Punto punto1, punto2=new Punto(),
				punto3,punto4;
		
		punto1 = new Punto(3,4);
		
		punto3 = new Punto(55);
	
		//el objeto punto4 apunta a la misma
		//dirección de memoria que punto1
		punto4 = punto1;
		
		System.out.println(punto1);
		//envío un mensaje al objeto punto4
		int x = 8;
		punto4.setX(x);
		System.out.println(x);
		
		
		System.out.println(punto4);
		//leo un mensaje del objeto punto4
		System.out.println(punto4.getX());
		
		System.out.println(punto2.getX());
		punto4.setPunto(punto2);
		System.out.println(punto2.getX());
		
		int num1, num2;
		num1 = 1;
		num2 = num1;
		num2++;
		System.out.println(num1);
		System.out.println(num2);
		
		
		/* Expliquemos qué es lo que ocurre dependiendo del tipo de dato que referenciemos:
		 * 
		 * - Un tipo de dato primitivo siempre se pasa por valor.
		 * - Un tipo de dato objeto siempre se pasa por referencia.
		 * 
		 * Por lo tanto, ocurrirá lo siguiente:
		 * 
		 * 	- Un tipo de dato primitivo siempre se pasa por valor. Esto quiere decir que cuando 
		 * nosotros pasamos un tipo de dato primitivo, se copia su valor y se trabaja con éste. De 
		 * esta forma, el valor original de nuestro dato primitivo se mantiene independientemente
		 * de lo que hagamos con el dato. En el ejemplo de arriba com num1 y num2 podemos ver clara-
		 * mente de lo que hablamos, pues se ve perfectamente como aunque modifiquemos num2, num1
		 * sigue intacto. a parte, si utilizamos el Debug, podremos ver que su ID es diferente.
		 * 
		 * 	- Un tipo de dato objeto siempre para por referencia. Esto quiere decir que cuando 
		 * nosotros pasamos un tipo de dato objeto, estamos pasando la dirección en memoria de este
		 * objeto. Con ésto ocurre que cuando modificamos cualquier objeto pasado por memoria, el 
		 * objeto original se modifica también. En el ejemplo de arriba podemos ver como si modi-
		 * ficamos punto1 o punto4, ambos cambian. A parte, su ID pasa a ser la misma desde que los
		 * igualamos, pues ocupan el mismo espacio en memoria, cosa que no ocurriría si fuese un tipo
		 * de dato primitivo.
		 * 
		 */
	}

}
