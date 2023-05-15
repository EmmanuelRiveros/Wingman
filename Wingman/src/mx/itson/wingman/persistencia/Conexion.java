/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Realiza la conexion con la base de datos
 * @author Emmanuel
 */
public class Conexion {
    
   /**
     * Obtiene una conexión hacia la base de datos utilizando los parámetros proporcionados.
     * @return La conexión inicializada hacia la base de datos.
     */
    public static Connection obtener() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3307/wingman?user=root&password=1234");
        } catch (Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
            
        }
        return conexion;
    }
    
}