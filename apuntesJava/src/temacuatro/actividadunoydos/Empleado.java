package temacuatro.actividadunoydos;
/**
 * Clase Empleado en la que se definen las características y el comportamiento del objeto empleado
 * @author selene
 * @version 1.0
 */
public class Empleado {
	private int salario, edad, codigoEmpleado;
	private String nombre, departamento;
	private static int contadorEmpleados;
	/**
	 * Constructor predeterminado cuya funcion es controlar el nº de instancias aumentando el contadorEmpleados
	 */
	public Empleado() {
		//se aumenta el contador de instancias de empleados
		Empleado.contadorEmpleados++;
	}
	/**
	 * Constructor mínimo del objeto empleado, que sólo necesita el nombre
	 * @param nombre el nombre del empleado
	 */
	public Empleado(String nombre) {
		//se llama a los métodos set para asignar sus valores
		this.setNombre(nombre);
		this.setCodigoEmpleado(Empleado.contadorEmpleados);
		//se aumenta el contador de instancias de empleados
		Empleado.contadorEmpleados++;
	}
	/**
	 * Constructor completo del objeto empleado, que requiere todas las características del empleado para inicializarlo
	 * @param nombre el nombre del empleado
	 * @param departamento el departamento al que pertenece el empleado
	 * @param salario el salario del empleado
	 * @param edad la edad del empleado
	 */
	public Empleado(String nombre, String departamento, int salario, int edad) {
		//se llama a los métodos set para asignar sus valores
		this.setNombre(nombre);
		this.setDepartamento(departamento);
		this.setSalario(salario);
		this.setEdad(edad);
		this.setCodigoEmpleado(Empleado.contadorEmpleados);
		//se aumenta el contador de instancias de empleados
		Empleado.contadorEmpleados++;
	}
	/**
	 * Método set para asignar el código único(es un código exclusivo para cada empleado) al empleado
	 * @param contadorEmpleados valor que contiene el número de instancias del objeto empleado existentes
	 */
	private void setCodigoEmpleado(int contadorEmpleados) {
		this.codigoEmpleado=Empleado.contadorEmpleados;
	}
	/**
	 * Método set que asigna el salario del empleado
	 * @param salario el salario del empleado
	 */
	private void setSalario(int salario) {
		this.salario=salario;
	}
	/**
	 * Método set que asigna la edad de empleado
	 * @param edad la edad del empleado
	 */
	private void setEdad(int edad) {
		this.edad=edad;
	}
	/**
	 * Método set que asigna el nombre del empleado
	 * @param nombre el nombre del empleado
	 */
	private void setNombre(String nombre) {
		this.nombre=nombre;
	}
	/**
	 * Método set que asigna el departamento del empleado
	 * @param departamento el departamento al que pertenece el empleado
	 */
	private void setDepartamento(String departamento) {
		this.departamento=departamento;
	}
	/**
	 * Método set que reduce el nº de instancias del objeto Empleado
	 */
	public static void setReducirEmpleados() {
		Empleado.contadorEmpleados--;
	}
	/**
	 * Método get que devuelve el código del empleado
	 * @return devuelve el código del empleado
	 */
	public String getCodigoEmpleado() {
		return "Código de empleado: "+this.codigoEmpleado;
	}
	/**
	 * Método get que devuelve el salario del empleado
	 * @return devuelve el salario del empleado en caso de haberse asignado. En caso contrario, devuelve un mensaje en el que aclara que no se le ha asignado un salario a este empleado
	 */
	public String getSalario() {
		if(this.salario==0) {
			return "No se ha asignado un salario a este empleado";
		}else return "Salario: "+this.salario+" euros";
	}
	/**
	 * Método get que devuelve la edad del empleado
	 * @return devuelve la edad del empleado en caso de haberse asignado. En caso contrario, devuelve un mensaje en el que se aclara que no se le ha asignado una edad a este empleado
	 */
	public String getEdad() {
		if(this.edad==0) {
			return "No se ha asignado una edad a este empleado";
		}else return "Edad: "+this.edad+" años";
	}
	/**
	 * Método get que devuelve el nombre del empleado
	 * @return devuelve el nombre del empleado
	 */
	public String getNombre() {
		return "Nombre: "+this.nombre;
	}
	/**
	 * Método get que devuelve el departamento del empleado
	 * @return devuelve el departamento del empleado en caso de haberse asignado. En caso contrario, devuelve un mensahe en el que se aclara que no se le ha asignado un departamento a este empleado
	 */
	public String getDepartamento() {
		if(this.departamento==null) {
			return "No se ha asignado un departamento a este empleado";
		}else return "Departamento: "+this.departamento;
	}
	/**
	 * Método instanciable con el que se puede aumentar el sueldo a partir de un porcentaje dado
	 * @param porcentaje
	 */
	public void aumentarSalario(int porcentaje) {
		this.salario*=(1+porcentaje);
	}
	/**
	 * Método get que devuelve el nº de instancias del objeto Empleado
	 * @return devuelve el nº de instancias del objeto Empleado
	 */
	public static int getInstanciasEmpleado() {
		return Empleado.contadorEmpleados;
	}
}
