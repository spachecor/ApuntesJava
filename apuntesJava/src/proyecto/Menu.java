package proyecto;

public class Menu {
	private final int ANIMAL=1, PRODUCTO=2, DONACION=3, SALIR=4, ADMINISTRADOR=1, USUARIO=2;
	
	public Menu(int rol, int opcion){
		if(rol==ADMINISTRADOR) {
			switch(opcion) {
			case ANIMAL:
				
				break;
			case PRODUCTO:
				
				break;
			case DONACION:
				
				break;
			case SALIR:
				
				break;
			default:
				
				break;
			}
		}else if(rol==USUARIO){
			switch(opcion) {
			case ANIMAL:
				
				break;
			case PRODUCTO:
				
				break;
			case DONACION:
				
				break;
			case SALIR:
				
				break;
			default:
				
				break;
			}
		}else {
			//en caso de no ser ni uno ni otro, el error
		}
		
	}
}
