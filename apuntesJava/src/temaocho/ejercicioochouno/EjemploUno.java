package temaocho.ejercicioochouno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EjemploUno {
    public static void main(String[] args) {
        try{
            Connection conex = DriverManager.getConnection("jdbc:MySQL://localhost:3306/ejemplo", "root", "");
            System.out.println("Conectado correctamente");
            conex.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
