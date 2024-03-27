package temaseis.genericos.clasegenerica.ejercicio;

import temaseis.genericos.clasegenerica.clasecongenericos.TestGenericos;
import temaseis.genericos.clasegenerica.ejercicio.productos.*;

public class TestEjercicio {
    public static void main(String[] args) {
        /*Para la tarea se pide implementar una clase llamada BolsaSupermercado que maneje tipos genéricos para guardar
        productos en una lista de máximo 5 elementos. El tipo List<T> debe ser genérico, por ejemplo podríamos tener una
        bolsa que guarde productos de limpieza, otra bolsa para los lácteos otra para guardar frutas y otra para productos
        no perecibles.

        La clase BolsaSupermercado debe tener solo dos métodos, uno para agregar los productos addProducto cuyo argumento
        sea del tipo del parámetro generic y el método getProductos que devuelve la lista de productos del tipo generic.

        Entonces como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene
        en común dos atributos el nombre (string) y precio (double) que deben heredar de la clase padre Producto, pero
        ademas cada una van a tener dos atributos propios adicionales, sus métodos getter y constructor para inicializar
        los 4 atributos (los 2 del padre y los 2 propios).

        Para el ejemplo de la clase main se  pide crear un objeto bolsa para cada tipo de producto con 5 elementos, se
        debe mostrar por cada bolsa el detalle completo de sus elementos, el precio, nombre y los atributos adicionales
        sin realizar cast de ningún tipo, ni toString().*/
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo("Leche Entera", 0.8, 1, 10));
        bolsaLacteos.addProducto(new Lacteo("Leche Desnatada", 0.78, 1, 9));
        bolsaLacteos.addProducto(new Lacteo("Yogurt griego", 2.4, 4, 4));
        bolsaLacteos.addProducto(new Lacteo("Kéfir", 3.1, 4, 12));
        bolsaLacteos.addProducto(new Lacteo("Natillas chocolate", 4.5, 4, 3));

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Manzana Pink Lady", 1.23, 250.0, "rojo"));
        bolsaFrutas.addProducto(new Fruta("Manzana Golden", 0.75, 200.4, "amarillo"));
        bolsaFrutas.addProducto(new Fruta("Pera", 2.45, 104.75, "verde"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 2.05, 152.4, "naranja"));
        bolsaFrutas.addProducto(new Fruta("Aguacate", 4.68, 95.7, "verde oscuro"));

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Fregasuelos lavanda", 2.15, "Fregasuelos con extracto de lavanda", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Fregasuelos azahar", 2.78, "Fregasuelos con extracto de azahar", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Fregasuelos cítricos", 1.98, "Fregasuelos con extracto de limón", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Fregasuelos bosques", 2.36, "Fregasuelos con extracto de pino", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Fregasuelos frutal", 3.05, "Fregasuelos con extracto de fresa y coco", 1.5));

        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();
        bolsaNoPerecible.addProducto(new NoPerecible("Melocotón en almibar", 2.65, 500, 120));
        bolsaNoPerecible.addProducto(new NoPerecible("Melocotón en su jugo", 3.58, 500, 65));
        bolsaNoPerecible.addProducto(new NoPerecible("Piña en almibar", 3.12, 500, 105));
        bolsaNoPerecible.addProducto(new NoPerecible("Piña en su jugo", 3.78, 500, 53));
        bolsaNoPerecible.addProducto(new NoPerecible("Almendras tostadas", 5.15, 250, 230));

        TestEjercicio.mostrarContenido(bolsaLacteos);
        TestEjercicio.mostrarContenido(bolsaFrutas);
        TestEjercicio.mostrarContenido(bolsaLimpieza);
        TestEjercicio.mostrarContenido(bolsaNoPerecible);


    }
    public static <T extends Producto> void mostrarContenido(BolsaSupermercado<T> bolsa){
        for(T t:bolsa.getProductos()){
            System.out.print("Nombre: "+t.getNombre()+" - Precio: "+t.getPrecio());
            if(t instanceof Lacteo) System.out.println(" - Proteinas: "+ ((Lacteo) t).getProteinas()+" - Cantidad: "+((Lacteo) t).getCantidad());
            else if(t instanceof Fruta) System.out.println(" - Color: "+((Fruta) t).getColor()+" - Peso: "+((Fruta) t).getPeso());
            else if(t instanceof Limpieza) System.out.println(" - Componentes: "+((Limpieza) t).getComponentes()+" - Litros: "+((Limpieza) t).getLitros());
            else if(t instanceof NoPerecible) System.out.println(" - Contenido: "+((NoPerecible) t).getContenido()+" - Calorías: "+((NoPerecible) t).getCalorias());
        }
    }
}
