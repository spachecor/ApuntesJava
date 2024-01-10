package protectora;

import java.util.Scanner;

public class Chip {
	private long numeroChip;
	public Chip() {
		this.setNumeroChip();
	}
	private void setNumeroChip() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nº del chip (15 cifras)");
		this.numeroChip=sc.nextLong();
		sc.close();
	}
}
