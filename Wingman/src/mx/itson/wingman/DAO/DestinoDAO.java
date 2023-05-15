/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.DAO;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import mx.itson.wingman.entidades.Destino;
import mx.itson.wingman.persistencia.Conexion;

/**
 * Una clase que se encarga de interactuar con la base de datos para realizar operaciones de creación, lectura, actualización y eliminación de destinos.
 * @author Emmanuel
 */
public class DestinoDAO {
    /**
     * Obtiene todos los destinos desde la base de datos.
     *
     * @return Lista de objetos Destino.
     */
    public List<Destino> obtenerTodos() {
        List<Destino> destinos = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT airbaseId, airbaseNombre, ruta, ubicacion FROM destinos");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Destino destino = new Destino();
                destino.setAirbaseId(resultSet.getInt("airbaseId"));
                destino.setAirbaseNombre(resultSet.getString("airbaseNombre"));
                destino.setRuta(resultSet.getString("ruta"));
                destino.setRuta(resultSet.getString("ubicacion"));

                destinos.add(destino);
            }

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al obtener los destinos: " + ex.getMessage());
        }
        return destinos;
    }

    /**
     * Agrega un nuevo destino a la base de datos.
     *
     * @param destino Objeto Destino a agregar.
     * @return true si se agregó correctamente, false en caso contrario.
     */
    public boolean agregar(Destino destino) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO destinos (airbaseNombre, ruta, ubicacion) VALUES (?, ?, ?)");
            statement.setString(1, destino.getAirbaseNombre());
            statement.setString(2, destino.getRuta());
            statement.setString(3, destino.getUbicacion());

            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al agregar el destino: " + ex.getMessage());
        }
        return resultado;
    }

    /**
     * Elimina un destino de la base de datos.
     *
     * @param airbaseId Identificador del destino a eliminar.
     * @return true si se eliminó correctamente, false en caso contrario.
     */
    public boolean eliminar(int airbaseId) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("DELETE FROM destinos WHERE airbaseId = ?");
            statement.setInt(1, airbaseId);

            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al eliminar el destino: " + ex.getMessage());
        }
        return resultado;
    }
    
    public boolean editar(Destino destino) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("UPDATE destinos SET airbaseNombre = ?, ruta = ?, ubicacion = ? WHERE airbaseId = ?");
            statement.setString(1, destino.getAirbaseNombre());
            statement.setString(2, destino.getRuta());
            statement.setString(3, destino.getUbicacion());
            statement.setInt(4, destino.getAirbaseId());

            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al editar el destino: " + ex.getMessage());
        }
        return resultado;
    }
    
    public static Destino buscarPorNombre(String nombre) {
        Destino destino = null;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT airbaseId, airbaseNombre, ruta, ubicacion FROM destinos WHERE airbaseNombre = ?");
            statement.setString(1, nombre);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                destino = new Destino();
                destino.setAirbaseId(resultSet.getInt("airbaseId"));
                destino.setAirbaseNombre(resultSet.getString("airbaseNombre"));
                destino.setRuta(resultSet.getString("ruta"));
                destino.setUbicacion(resultSet.getString("ubicacion"));
            }
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Ocurrió un error al buscar el destino por nombre: " + ex.getMessage());
            }
            return destino;
    }
    
    public Destino buscarPorId(int id) {
        Destino destino = null;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "SELECT airbaseId, airbaseNombre, ruta, ubicacion FROM destinos WHERE airbaseId = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                destino = new Destino();
                destino.setAirbaseId(resultSet.getInt("airbaseId"));
                destino.setAirbaseNombre(resultSet.getString("airbaseNombre"));
                destino.setRuta(resultSet.getString("ruta"));
                destino.setUbicacion(resultSet.getString("ubicacion"));
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
    return destino;
}
}    
