/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.negocio;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Metodos para el funcionamiento de la aplicación
 * @author Emmanuel
 */
public class Operacion {
    
    public static boolean comprobarConexion() {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            return address.isReachable(5000); // Timeout de 5 segundos
        } catch (UnknownHostException e) {
            // No se pudo resolver el host
            return false;
        } catch (IOException e) {
            // Error de IO al verificar la conexión
            return false;
        }
    }
    
    public static boolean verificarCredenciales(String user, String password) {   
        // Verificar si las credenciales son "admin" y "password123"
        if (user.equals("admin") && password.equals("1234")) {
            return true; // Las credenciales son válidas
        } else {
            return false; // Las credenciales no son válidas
        }
    }
    
    
}
