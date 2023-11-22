package tematres.arrays;

public class Arrays_exp {

	public static void main(String[] args) {
		/*Un array con valor definido, si es tipo int, sus valores serán 0, si es char, sus valores serán '', si es String o 
		 * cualquier otra variable de tipo objeto es null*/
		
		int n=100;
		int[] pares = new int[n];
		for(int i=0;i<n;i++) {
			pares[i]=i*2;
			System.out.println(pares[i]);
		}
	}

}
