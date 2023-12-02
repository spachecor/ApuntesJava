package tematres.ejercicios;

public class MatrizYMatrizTraspuesta {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int[][] resultado = new int[3][3];
		
		System.out.println("Matriz original\n");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=(int)Math.round(Math.random()*10);
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMatriz traspuesta\n");
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//multiplicacion de matriz por si misma
		for(int i=0;i<resultado.length;i++) {
			for(int j=0;j<resultado[i].length;j++) {
				resultado[i][j]=(matriz[i][j]*matriz[j][i])+(matriz[i][j]*matriz[j][i])+(matriz[i][j]*matriz[j][i]);
				System.out.print(resultado[i][j]+" ");

			}
			System.out.println();
		}
		
	}

}
