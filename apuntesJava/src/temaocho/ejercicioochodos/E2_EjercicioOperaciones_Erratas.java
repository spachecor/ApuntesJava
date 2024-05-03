package temaocho.ejercicioochodos;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E2_EjercicioOperaciones_Erratas {



    public static void main(String[]args){

        try {
        boolean escape = true;
        String user = "root";
        String pwd = "";
        String url = "jdbc:MySQL://localhost/agenda";
        Connection conex = DriverManager.getConnection(url,user,pwd);

        Scanner scan = new Scanner(System.in);

        //HACEMOS UN VALIDADOR PARA LOS CAMPOS, QUE SI NO COINCIDE LANCE EXCEPCION
            Pattern patternNombre = Pattern.compile("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
            Pattern patternCorreo = Pattern.compile("^[a-z0-9]+\\.?[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,3}$");
            Matcher matcher = null;

        String opcion;

        do{
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Ver todos los contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Elige opcion: ");
            opcion = scan.next();

            switch(Integer.parseInt(opcion)){
                case 1:
                    String nombre=null;
                    String correo=null;
                    do{
                        try{
                            System.out.print("Ingresa el nombre del contacto: ");
                            nombre = scan.next();
                            matcher = patternNombre.matcher(nombre);
                            if(!matcher.matches())throw new RuntimeException("El nombre es incorrecto");
                            System.out.print("Ingresa el correo del contacto: ");
                            correo = scan.next();
                            matcher = patternCorreo.matcher(correo);
                            if(!matcher.matches())throw new RuntimeException("El correo es incorrecto");
                            escape = false;
                        }catch (RuntimeException e){
                            System.out.println("Introducido valor inválido, compruébelo y vuelva a intentarlo");
                            System.out.println("Pulse 0 + intro para continuar");
                            scan.next();
                        }
                    }while(escape);

                    try{
                        String query = "INSERT INTO contacto VALUES (?,?)";
                        PreparedStatement queryInsert = conex.prepareStatement(query);
                        queryInsert.setString(1, nombre);
                        queryInsert.setString(2, correo);
                        //ELIMINADO EL QUERY, SOBRABA
                        queryInsert.executeUpdate();
                        System.out.println("\nContacto ingresado satisfactoriamente!!\n");
                        queryInsert.close();
                    }catch(Exception ex){
                        System.out.println("Error en el ingreso | "+ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("\nListado de contactos.\n");
                    try{
                        String query2 = "SELECT * FROM contacto";
                        Statement instruccion = conex.createStatement();
                        ResultSet resultado = instruccion.executeQuery(query2);

                        while (resultado.next()) {
                            String nombre2 = resultado.getString("nombre");
                            //CAMBIADO EL NOMBRE DEL LABEL DE EMAIL A CORREO
                            String correo2 = resultado.getString("correo");
                            System.out.println("NOMBRE: " + nombre2);
                            System.out.println("CORREO: " + correo2 + "\n");
                        }
                        instruccion.close();
                        resultado.close();
                    }catch(Exception ex){
                        System.out.println("Error en la recuperacion de datos | ");
                    }
                    break;

                case 3:
                    String nombre3 = null;
                    //BORRADA VARIABLE ENCONTRADO TIPO BOOLEAN, NO TENIA NI USO NI SENTIDO
                    escape = true;
                    do{
                        try{
                            System.out.print("Escribe el nombre del contacto a buscar: ");
                            nombre3 = scan.next();
                            matcher = patternNombre.matcher(nombre3);
                            if(!matcher.matches())throw new RuntimeException("El nombre es incorrecto");
                            escape = false;
                        }catch (RuntimeException e){
                            System.out.println("Introducido valor inválido, compruébelo y vuelva a intentarlo");
                            System.out.println("Pulse 0 + intro para continuar");
                            scan.next();
                        }
                    }while(escape);

                    System.out.println("\nBusquedas de contactos.\n");
                    try{
                        //TERRIBLE, ARREGLADO, SUSTITUIDO POR INTERROGANTE Y CAMBIADO A PREPAREDSTATMENT
                        String query3 = "SELECT * FROM contacto WHERE nombre like ?";
                        PreparedStatement instruccion3 = conex.prepareStatement(query3);
                        instruccion3.setString(1, nombre3);
                        //ELIMINADO EL QUERY DE LOS ARGUMENTOS, INNECESARIO
                        ResultSet resultado3 = instruccion3.executeQuery();

                        while (resultado3.next()) {
                            if(resultado3.getString("nombre").equalsIgnoreCase(nombre3)) {
                                String nombre3_1 = resultado3.getString("nombre");
                                String correo3 = resultado3.getString("correo");
                                System.out.println("NOMBRE: " + nombre3_1);
                                System.out.println("CORREO: " + correo3 + "\n");
                            }else{
                                System.out.println("\nNo existe ningun contacto con este nombre!\n");
                            }
                       }
                        instruccion3.close();
                        resultado3.close();
                    }catch(Exception ex){
                        System.out.println("Error en la busqueda de datos | "+ex.getMessage());
                    }
                    break;
                case 4:
                    String nombreDelete=null;
                    System.out.println("Introduzca el nombre del contacto a eliminar");
                    escape = true;
                    do{
                        try{
                            System.out.print("Escribe el nombre del contacto a buscar: ");
                            nombreDelete = scan.next();
                            matcher = patternNombre.matcher(nombreDelete);
                            if(!matcher.matches())throw new RuntimeException("El nombre es incorrecto");
                            escape = false;
                        }catch (RuntimeException e){
                            System.out.println("Introducido valor inválido, compruébelo y vuelva a intentarlo");
                            System.out.println("Pulse 0 + intro para continuar");
                            scan.next();
                        }
                    }while(escape);

                    try{
                        String query4 = "delete from contacto where nombre like ?";
                        PreparedStatement queryDelete = conex.prepareStatement(query4);
                        queryDelete.setString(1, nombreDelete);
                        queryDelete.executeUpdate();
                        System.out.println("\nContacto eliminado satisfactoriamente!!\n");
                        queryDelete.close();
                    }catch(Exception ex){
                        System.out.println("Error en la eliminación | "+ex.getMessage());
                    }

                    break;
                case 5:
                    System.out.println("Has salido de la aplicacion!!");
                    conex.close();
                    break;
            }
        }while(Integer.parseInt(opcion)!=5);

    }catch (SQLException e) {
            System.out.println(e);
        }
    }

}


