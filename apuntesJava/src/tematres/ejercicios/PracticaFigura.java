package tematres.ejercicios;

public class PracticaFigura {

	public static void main(String[] args) {
		int n = 4, contador=n-1, contador2, aux=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==contador) {
					System.out.print("*");
					contador--;
				}else System.out.print(" ");
			}System.out.println();
		}
		System.out.println();
		contador=0;
		for(int i=0;i<n;i++) {
			contador2=0;
			for(int j=0;j<n;j++) {
				if(j==contador&&contador2==0) {
					System.out.print("*");
					contador++;
					contador2++;
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}
}
