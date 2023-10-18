package temados.poo.jerarquizar;

public class Automovil {
	private Rueda rueda1, rueda2, rueda3, rueda4;
	private Gps gps;
	//public Automovil([<tipo> <identificador1> ... <tipo> <identificadorN>])
	//Los <> definen la obligatoriedad.
	
	//constructor. Tenemos que pasarle los parámetros rueda, pues un automóvil tiene 4 ruedas.
	public Automovil (Rueda rueda1, Rueda rueda2, Rueda rueda3, int rueda4) {
		this.rueda1=rueda1;
		this.rueda2=rueda2;
		this.rueda3=rueda3;
		//this.rueda1=rueda1; //Comentamos porque lo hemos pasado a int
	}
	
	//Método settet para decidir si tenrá Gps, no es necesario.
	public void setGps(Gps gps) {
		this.gps=gps;
	}

}
