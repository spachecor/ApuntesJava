package tematres.exposicion;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int numero,dia,dia2,temp;
		String mensaje="";
		
		//-------------Uso del if--------------------
		System.out.println("Uso del if");
		System.out.println("Que numero es par ?");
		numero=sc.nextInt();
		if(numero%2==0) {
			System.out.println("Es par");
		}
		if(numero%2!=0) {
			System.out.println("Es inpar");
		}
		System.out.println("\n Uso del if, else");
		
		
		
		//-------------Uso del if, else---------------
		System.out.println("En que dia de semana estamos del 1 al 7");
		dia=sc.nextInt();

		if(dia>=1 && dia<=5)
			System.out.println("Es un dia laboral");

		else
			System.out.println("No es laboral");
		System.out.println("\n Uso del if, else, else if");
		
		
		//-------------Uso del if, else, else if---------------
		System.out.println("En que dia de semana estamos del 1 al 7");
		dia2=sc.nextInt();
		if(dia2>=1 && dia2<=5) {
			System.out.println("No es fin de semana");

		}else if((dia2>=6 && dia2<=7)){
			System.out.println("Es fin de semana");
		}
		else {
			System.out.println("La semana solo tiene 7 dias");
		}
		System.out.println("\nUso del if, else, else if anidados");
		
		
		//-------------Uso del if, else, else if anidados---------------
		System.out.println("Indica la temperatura que hace en numero entero");
		temp=sc.nextInt();
		
		   if(temp<10){
	            mensaje = "Hace mucho frío.";
	        }
	        else{
	            if(temp<15){
	                mensaje = "Hace poco frío.";
	            }
	            else{
	                if(temp<25){
	                    mensaje = "Hace una temperatura normal.";
	                }
	                else{
	                    if(temp<30){
	                        mensaje = "Hace poco calor.";
	                    }
	                    else{
	                        mensaje = "Hace mucho calor.";
	                    }
	                }
	            }
	        }
	        System.out.printf("La temperatura actual es de %d grados.", temp);
	        System.out.println("\n" + mensaje);
	        
	        sc.close();
	}

}
