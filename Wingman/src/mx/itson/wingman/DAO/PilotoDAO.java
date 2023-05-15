/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.wingman.entidades.Piloto;
import mx.itson.wingman.enumeradores.EstadoPiloto;
import mx.itson.wingman.enumeradores.TipoAvion;
import mx.itson.wingman.persistencia.Conexion;
/**
 * Clase que proporciona métodos para acceder a los datos de los pilotos en la base de datos.
 * @author Emmanuel
 */
public class PilotoDAO {
    
    public List<Piloto> obtenerTodos(){
        List<Piloto> pilotos = new ArrayList<>();
        
        try {
            Connection conexion = Conexion.obtener();
            
            PreparedStatement statement = conexion.prepareStatement("SELECT pilotoid, nombre, especialidad, estado FROM pilotos");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Piloto piloto = new Piloto();
                piloto.setPilotoId(resultSet.getInt("pilotoid"));
                piloto.setNombre(resultSet.getString("nombre"));
                piloto.setEspecialidad(TipoAvion.valueOf(resultSet.getString("especialidad")));
                piloto.setEstado(EstadoPiloto.valueOf(resultSet.getString("estado")));
            
                pilotos.add(piloto);
            }
            
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al obtener los pilotos: " + ex.getMessage());
        }
        
        return pilotos;
    }
    
    public boolean agregarPiloto(Piloto piloto) {
        boolean resultado = false;
        
        try {
            Connection conexion = Conexion.obtener();
            
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO pilotos (nombre, especialidad, estado) VALUES (?, ?, ?)");
            statement.setString(1, piloto.getNombre());
            statement.setString(2, piloto.getEspecialidad().name());
            statement.setString(3, piloto.getEstado().name());
            
            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;
            
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al agregar el piloto: " + ex.getMessage());
        }
        
        return resultado;
    }
    
    public boolean editarPiloto(Piloto piloto) {
        boolean resultado = false;
        
        try {
            Connection conexion = Conexion.obtener();
            
            PreparedStatement statement = conexion.prepareStatement("UPDATE pilotos SET nombre = ?, especialidad = ?, estado = ? WHERE pilotoid = ?");
            statement.setString(1, piloto.getNombre());
            statement.setString(2, piloto.getEspecialidad().name());
            statement.setString(3, piloto.getEstado().name());
            statement.setInt(4, piloto.getPilotoId());
            
            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;
            
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al editar el piloto: " + ex.getMessage());
        }
        
        return resultado;
    }
    
    public boolean eliminarPiloto(int[] ids) {
        boolean resultado = false;

        try {
            Connection con = Conexion.obtener();
            String consulta = "DELETE FROM pilotos WHERE (pilotoid = ?); ";
            PreparedStatement st = con.prepareStatement(consulta);
            for (int i = 0; (ids.length)>i; i++){
                st.setInt(1, ids[i]);
                st.execute();
                resultado = st.getUpdateCount()== 1;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
    
    public Piloto buscarPorNombre(String nombrePiloto) {
        Piloto piloto = null;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT pilotoid, nombre, especialidad, estado FROM pilotos WHERE nombre = ?");
            statement.setString(1, nombrePiloto);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                piloto = new Piloto();
                piloto.setPilotoId(resultSet.getInt("pilotoid"));
                piloto.setNombre(resultSet.getString("nombre"));
                piloto.setEspecialidad(TipoAvion.valueOf(resultSet.getString("especialidad")));
                piloto.setEstado(EstadoPiloto.valueOf(resultSet.getString("estado")));
            }

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al buscar el piloto por nombre: " + ex.getMessage());
        }
        return piloto;
    }
    
    public Piloto buscarPorId(int id) {
    Piloto piloto = null;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "SELECT pilotoid, nombre, especialidad, estado FROM pilotos WHERE pilotoid = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                piloto = new Piloto();
                piloto.setPilotoId(resultSet.getInt("pilotoid"));
                piloto.setNombre(resultSet.getString("nombre"));
                piloto.setEspecialidad(TipoAvion.valueOf(resultSet.getString("especialidad")));
                piloto.setEstado(EstadoPiloto.valueOf(resultSet.getString("estado")));
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return piloto;
    }
}
