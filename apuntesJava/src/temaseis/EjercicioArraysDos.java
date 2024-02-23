package temaseis;
/**
 * Ejercicio de arrays segundo. Programa que compara dos matrices dadas elemento a elemento y que devuelve una matriz
 * que tiene el valor máximo en cada una de las posiciones comparando ambas matrices dadas. Las matrices dadas
 * serán exactamente iguales, tanto en filas como en elementos por fila.
 * @author selene
 * @version 1.0
 */
public class EjercicioArraysDos {

	public static void main(String[] args) {
		//creamos un objeto de la clase EjercicioArraysDos para usar los métodos creados
		EjercicioArraysDos ej = new EjercicioArraysDos();
		//inicializamos nuestras dos matrices A y B dadas
		int[][] matrizA = {
			{1,2,3},
			{6,7,8},
			{10,8,15}
		};
		int[][] matrizB = {
			{5,1,4},
			{7,3,11},
			{11,12,13}
		};
		//comprobamos que ambas matrices sean iguales
		if(ej.comprobadorMedidasMatrices(matrizA, matrizB)==0) {
			//comparamos A y B y mostramos la resultante
			ej.comparadorMatrices(matrizA, matrizB);
		}else System.out.println("Las matrices no son iguales y no puede hacerse la comparación entre ambas.");
	}
	/**
	 * Método que recibe dos matrices bidimensionales como parámetro, las compara, e imprime una nueva matriz, fruto de asignar en cada
	 * posición el valor mayor de cada elemento en ambas matrices dadas
	 * @param matrizA La primera matriz bidimensional a comparar
	 * @param matrizB La segunda matriz bidimensional a comparar
	 */
	public void comparadorMatrices(int[][] matrizA, int[][] matrizB){
		//se inicializa una matrizC que será la devuelta, que tendrá la longitud de cualquiera de las matrices padre en
		//tanto en filas como en elementos de cada fila
		int[][] matrizC = new int[matrizA.length][matrizA.length];
		//recorremos la matrizC comparando A y B y rellenando con el valor mayor en cada posición
		for(int i = 0;i < matrizC.length;i++) {
			for(int j = 0;j < matrizC.length;j++) {
				//en cada posición de la matriz C introducimos el valor máximo entre la matriz A y B en esa misma posición
				matrizC[i][j] = Math.max(matrizA[i][j], matrizB[i][j]);
			}
		}
		//usamos un bucle for para mostrar la nueva matriz
		for(int i = 0;i < matrizC.length;i++) {
			for(int j = 0;j < matrizC.length;j++) {
				System.out.print(matrizC[i][j]+" ");
			}
			System.out.println();
		}
	}
	/**
	 * Método que recibe dos matrices bidimensionales por parámetro y devuelve 0 si son de longitud tanto en filas como en elementos por fila son
	 * iguales y -1 si no lo son
	 * @param matrizA La primera matriz bidimensional a comparar
	 * @param matrizB La segunda matriz bidimensional a comparar
	 * @return 0 si las medidas de ambas matrices son 100% iguales y -1 si no lo son
	 */
	public int comprobadorMedidasMatrices(int[][] matrizA, int[][] matrizB) {
		boolean comprobador = true;
		//primero comprobamos que ambas tengan el mismo nº de filas
		if(matrizA.length==matrizB.length) {
			//segundo comprobamos que ambas tengan el mismo nº de elementos por fila en cada una de las filas
			for(int i = 0;i < matrizA.length;i++) {
				//comprobador será true en el momento en el que todas las filas contengan el mismo nº de elementos, si no, pasará a false
				if(matrizA[i].length!=matrizB[i].length)comprobador=false;
			}
		}else {
			//si ambas matrices no tienen la misma longitud de filas el comprobador será falso directamente
			comprobador=false;
		}
		return (comprobador)?0:-1;
	}
}
