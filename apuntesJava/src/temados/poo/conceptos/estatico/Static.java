package temados.poo.conceptos.estatico;

public class Static {
	/* La idea principal es que: La clase describe el comportamiento de cada uno de sus objetos. Si
	 * definimos una constante de un tipo de objeto que tenfa siempre el mismo valor, es común a
	 * todos los objetos, y por lo tanto, debe estar asociado la tipo de objeto y no a las instancias.
	 * 
	 * IMPORTANTE: LOS ATRIBUTOS ESTÁTICOS SON ACCESIBLES A PARTIR DEL TIPO DE DATO/OBJETO, NO DE
	 * UNO EN CONCREO O UNO INSTANCIADO.
	 * 
	 * ATRIBUTOS ESTÁTICOS: Estos atributos están compartidos por todos los objetos del mismo tipo y
	 * son accesibles desde cada uno de ellos. Cualquier modificación por parte de un objeto afectará
	 * al resto (p.ej, si tenemos un contador de instancias, será estático porque todos los objetos de
	 * un tipo de objeto tendrán acceso a ella, y lo modificarán cada vez que cualquier objeto de ese
	 * tipo de objeto sea instanciado.).
	 * Para el acceso a un atributo, en lugar de utilizar this, se utiliza el nombre del tipo de objeto
	 * (ej: Persona.numPersonas++;).
	 * Normalmente, las constantes asociadas al tipos de objeto son buenas candidatas para definirlas
	 * como estáticas.
	 * 
	 * MÉTODOS ESTÁTICOS: Se pueden acceder a los métodos estáticos del mismo modo que pueden las
	 * instancias, anteponiendo el nombre del tipo de objeto (ej: Math.max).
	 * Se permite definir un código estático para inicializar atributos estáticos. Su ejecución se 
	 * dispara una sola vez al principio.
	 * 
	 * La gran diferencia entre los métodos instanciadp y los estáticos, es que para utilizar un
	 * método instanciado, necesitamos un objeto instanciado y utilizaremos sobr este objeto ya
	 * creado el método instanciado. El método estático, sin embargo, se utiliza sobre el propio
	 * tipo de objeto, sin necesidad de instanciarlo, como puede ocurrir con la clase Math.
	 * */
}
