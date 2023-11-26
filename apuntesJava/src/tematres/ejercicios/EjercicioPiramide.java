package tematres.ejercicios;

public class EjercicioPiramide {

	public static void main(String[] args) {
		//PIRÁMIDE RELLENA
		int medida = 5;
		int medidaColum=(medida*2)-1;
		int max = medidaColum/2;
		int min = medidaColum/2;
				for(int i = 0; i<medida; i++) {
					for(int j = 0; j<medidaColum; j++) {
						if(i==medida-1) {
							System.out.print("* ");
						}else {
							if(j<max&&j>min) {
								System.out.print("* ");
								
							}else System.out.print("  ");
							/*if(i==0&&j==(medidaColum/2)) {
								System.out.print("* ");
							}else System.out.print("  ");*/
						}
						max++;
						min--;
					}
					System.out.println();
				}
	}

}
