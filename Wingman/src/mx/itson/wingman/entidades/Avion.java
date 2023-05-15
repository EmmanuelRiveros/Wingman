/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.entidades;
import mx.itson.wingman.enumeradores.TipoAvion;
import mx.itson.wingman.enumeradores.EstadoAvion;
import mx.itson.wingman.persistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * Entidad de avion
 * @author Jorge 
 * @author Emmanuel
 */
public class Avion {
    
    private int id;
    private String nombre;
    private String modelo;
    private String fabricante;
    private int capacidad;
    private TipoAvion tipoAvion;
    private EstadoAvion estadoAvion;
    private boolean avionCarguero;
    private boolean avionCombate;

    public static List<Avion> obtenerTodos() {
    List<Avion> aviones = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, nombre, modelo, fabricante, capacidad, "
                    + "tipoAvion, estadoAvion, avionCarguero, avionCombate FROM aviones");

            while (resultSet.next()) {
                Avion avion = new Avion();
                avion.setId(resultSet.getInt(1));
                avion.setNombre(resultSet.getString(2));
                avion.setModelo(resultSet.getString(3));
                avion.setFabricante(resultSet.getString(4));
                avion.setCapacidad(resultSet.getInt(5));
                avion.setTipoAvion(TipoAvion.valueOf(resultSet.getString(6)));
                avion.setEstadoAvion(EstadoAvion.valueOf(resultSet.getString(7)));
                avion.setAvionCarguero(resultSet.getString(8).equals("SI"));
                avion.setAvionCombate(resultSet.getString(9).equals("NO"));

                aviones.add(avion);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return aviones;
    }
    
    public static boolean guardar(String nombre, String modelo, String fabricante, int capacidad, 
            String tipoAvion, String estadoAvion, boolean avionCarguero, boolean avionCombate){
        boolean resultado = false;
        
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "INSERT INTO aviones (nombre, modelo, fabricante, capacidad, "
                    + "tipoAvion, estadoAvion, avionCarguero, avionCombate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, modelo);
            statement.setString(3, fabricante);
            statement.setInt(4, capacidad);
            statement.setString(5, tipoAvion);
            statement.setString(6, estadoAvion);
            statement.setString(7, avionCarguero ? "SI" : "NO" );
            statement.setString(8, avionCombate ? "SI" : "NO" );

            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        } catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }
    
    public static boolean editar(int id, String nombre, String modelo, String fabricante, int capacidad,
            String tipoAvion, String estadoAvion, boolean avionCarguero, boolean avionCombate) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE aviones SET nombre = ?, modelo = ?, fabricante = ?, capacidad = ?, "
                    + "tipoAvion = ?, estadoAvion = ?, avionCarguero = ?, avionCombate = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, modelo);
            statement.setString(3, fabricante);
            statement.setInt(4, capacidad);
            statement.setString(5, tipoAvion);
            statement.setString(6, estadoAvion);
            statement.setString(7, avionCarguero ? "SI" : "NO");
            statement.setString(8, avionCombate ? "SI" : "NO");
            statement.setInt(9, id);

            statement.execute();

            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }
    
    public static boolean editarColumna(List<Integer> ids, String columna, String nuevoValor) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();

            // Construir la consulta dinámica con los IDs proporcionados
            String consulta = "UPDATE aviones SET " + columna + " = ? WHERE id IN (";
            for (int i = 0; i < ids.size(); i++) {
                consulta += "?";
                if (i < ids.size() - 1) {
                    consulta += ",";
                }
            }
            consulta += ")";

            PreparedStatement statement = conexion.prepareStatement(consulta);

            // Establecer el nuevo valor para la columna
            statement.setString(1, nuevoValor);

            // Establecer los IDs de los aviones seleccionados
            for (int i = 0; i < ids.size(); i++) {
                statement.setInt(i + 2, ids.get(i));
            }

            statement.execute();

            resultado = statement.getUpdateCount() > 0;
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }
    
    public static boolean eliminar(int[] ids) {
        boolean resultado = false;

        try {
            Connection con = Conexion.obtener();
            String consulta = "DELETE FROM aviones WHERE (id = ?); ";
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
    
    public static List<Avion> buscarPorColumna(String nombreColumna, String valor) {
        List<Avion> aviones = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "SELECT id, nombre, modelo, fabricante, capacidad, tipoAvion, estadoAvion, avionCarguero, avionCombate "
                    + "FROM aviones WHERE " + nombreColumna + " = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, valor);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Avion avion = new Avion();
                avion.setId(resultSet.getInt(1));
                avion.setNombre(resultSet.getString(2));
                avion.setModelo(resultSet.getString(3));
                avion.setFabricante(resultSet.getString(4));
                avion.setCapacidad(resultSet.getInt(5));
                avion.setTipoAvion(TipoAvion.valueOf(resultSet.getString(6)));
                avion.setEstadoAvion(EstadoAvion.valueOf(resultSet.getString(7)));
                avion.setAvionCarguero(resultSet.getString(8).equals("SI"));
                avion.setAvionCombate(resultSet.getString(9).equals("NO"));

                aviones.add(avion);
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return aviones;
    }
    
    public static Avion buscarPorNombre(String nombre) {
        Avion avion = null;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT id, nombre, modelo, fabricante, capacidad, tipoAvion, estadoAvion, avionCarguero, avionCombate FROM aviones WHERE nombre = ?");
            statement.setString(1, nombre);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                avion = new Avion();
                avion.setId(resultSet.getInt("id"));
                avion.setNombre(resultSet.getString("nombre"));
                avion.setModelo(resultSet.getString("modelo"));
                avion.setFabricante(resultSet.getString("fabricante"));
                avion.setCapacidad(resultSet.getInt("capacidad"));
                avion.setTipoAvion(TipoAvion.valueOf(resultSet.getString("tipoAvion")));
                avion.setEstadoAvion(EstadoAvion.valueOf(resultSet.getString("estadoAvion")));
                avion.setAvionCarguero(resultSet.getString("avionCarguero").equals("SI"));
                avion.setAvionCombate(resultSet.getString("avionCombate").equals("NO"));
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al buscar el avión por nombre: " + ex.getMessage());
        }
        return avion;
    }
    
    public static Avion buscarPorId(int id){
        Avion avion = null;
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "SELECT id, nombre, modelo, fabricante, capacidad, tipoAvion, estadoAvion, avionCarguero, avionCombate "
                    + "FROM aviones WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
        
            if (resultSet.next()) {
                avion = new Avion();
                avion.setId(resultSet.getInt(1));
                avion.setNombre(resultSet.getString(2));
                avion.setModelo(resultSet.getString(3));
                avion.setFabricante(resultSet.getString(4));
                avion.setCapacidad(resultSet.getInt(5));
                avion.setTipoAvion(TipoAvion.valueOf(resultSet.getString(6)));
                avion.setEstadoAvion(EstadoAvion.valueOf(resultSet.getString(7)));
                avion.setAvionCarguero(resultSet.getString(8).equals("SI"));
                avion.setAvionCombate(resultSet.getString(9).equals("NO"));
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return avion;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the tipoAvion
     */
    public TipoAvion getTipoAvion() {
        return tipoAvion;
    }

    /**
     * @param tipoAvion the tipoAvion to set
     */
    public void setTipoAvion(TipoAvion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    /**
     * @return the estadoAvion
     */
    public EstadoAvion getEstadoAvion() {
        return estadoAvion;
    }

    /**
     * @param estadoAvion the estadoAvion to set
     */
    public void setEstadoAvion(EstadoAvion estadoAvion) {
        this.estadoAvion = estadoAvion;
    }

    /**
     * @return the avionCarguero
     */
    public boolean isAvionCarguero() {
        return avionCarguero;
    }

    /**
     * @param avionCarguero the avionCarguero to set
     */
    public void setAvionCarguero(boolean avionCarguero) {
        this.avionCarguero = avionCarguero;
    }

    /**
     * @return the avionCombate
     */
    public boolean isAvionCombate() {
        return avionCombate;
    }

    /**
     * @param avionCombate the avionCombate to set
     */
    public void setAvionCombate(boolean avionCombate) {
        this.avionCombate = avionCombate;
    } 
}
