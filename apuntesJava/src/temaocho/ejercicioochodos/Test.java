package temaocho.ejercicioochodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            String nombre, correo, query = "insert into contacto values(?,?)", url = "jdbc:MySQL://localhost/agenda"
            , root = "root", psw = "";
            Scanner sc = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, root, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            System.out.println("introducir nombre");
            nombre = sc.nextLine();
            System.out.println("introducir correo");
            correo = sc.nextLine();
            statement.setString(1, nombre);
            statement.setString(2, correo);
            statement.executeUpdate();
            connection.close();
            statement.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
