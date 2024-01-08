package temacuatro.actividadunoydos;

import java.util.Scanner;

public class Empresa {
	static Empleado empleados[] = new Empleado[5];
	public static void main(String[] args) {
		//creamos cinco empleados
		/*empleados[0]= new Empleado("Jose Luis Romero García", "Comercial", 25000, 43);
		empleados[1]= new Empleado("Luisa Rodríguez Almenara", "Administración", 15000, 25);
		empleados[2]= new Empleado("Eduardo Gómez Amador", "Administración", 18000, 56);
		empleados[3]= new Empleado("María Isabel Gallardo Lucena", "Comercial", 37000, 50);
		empleados[4]= new Empleado("Amalia Carmona Casado", "Comercial", 14000, 22);*/
		final int CREAR=1, DESTRUIR=2, SALIR=3;
		int opcion=0;
		boolean salir=false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("¿Qué desea hacer?\n1- Crear nuevo empleado\n2- Eliminar empleado existente");
			//comprobamos que se introduzcan los valores correctos
			if(sc.hasNextInt()) {
				opcion=sc.nextInt();
				if(opcion!=CREAR||opcion!=DESTRUIR||opcion!=SALIR) {
					System.out.println("El nº introducido es inválido, pulse intro para volver al menú");
					sc.nextLine();
					//ERROR
					salir=true;
				}
			}else {
				System.out.println("Carácter inválido, pulse intro para volver al menú");
				sc.nextLine();
				salir=true;
			}
			//entramos en el menú si y solo si salir es diferente de true
			if(salir!=true) {
				switch (opcion) {
				case CREAR:
					System.out.println("has seleccionado crear");
					break;
				case DESTRUIR:
					System.out.println("has seleccionado destruir");
					break;
				case SALIR:
					System.out.println("has seleccionado salir");
					salir=true;
					break;
				}
			}
			System.out.println("T");
		}while(salir!=true);
		
		
		
		sc.close();
	}
	private void destructorEmpleados(int codigoEmpleado, int contadorEmpleados) {
		
		for(int i=contadorEmpleados-1;i>0;i--) {
			for(int j=contadorEmpleados-1;j>0;j--) {
				if(empleados[j]!=null) {
					//MAL,codigoEmpleado NO HAY QUE BORRAR EL ÚLTIMO, SINO BORRAR EL INDICADO Y MOVERLOS TODOS HACIA LA IZQUIERDA
				}
			}
		}
		Empleado.setReducirEmpleados();
	}
}
