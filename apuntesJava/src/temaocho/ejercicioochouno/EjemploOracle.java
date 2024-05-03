package temaocho.ejercicioochouno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EjemploOracle {
    public static void main(String[] args) {
        try{
            //hemos tenido que instalar ORACLEXE y oracle sql developer
            //el ORACLEXE lo hemos instalado, y le hemos introducido una contraseña al final(root), que es la misma que ponemos como contraseña
            //de la conexión

            //dentro de oracle sql developer, lo hemos configurado con la contraseña que hemos colocado en oraclexe, y del el hemos tomado el
            //SID(click dcho sobre la conexión root y propiedades y lo tenemos ahí) y el puerto, que ambos van en la url de la conexión
            //el user es system, que lo tomamos de oracle sql server también.

            //por último tenemos que descargamos el driver, podemos hacerlo desde maven repository online o en intellij desde librerías en
            //proyect structure usando la opcion de maven y buscándola por ojdbc11
            Connection conex = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
            System.out.println("Conectado correctamente");
            conex.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
