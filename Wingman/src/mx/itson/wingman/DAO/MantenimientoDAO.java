import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mx.itson.wingman.entidades.Mantenimiento;
import mx.itson.wingman.persistencia.Conexion;

/**
 * Clase que proporciona métodos para acceder a los datos de mantenimiento de aviones en la base de datos.
 */
public class MantenimientoDAO {
    private List<Mantenimiento> personal;

    /**
     * Constructor de la clase MantenimientoDAO.
     * Inicializa la lista de mantenimientos.
     */
    public MantenimientoDAO() {
        this.personal = new ArrayList<>();
    }

    /**
     * Obtiene todos los mantenimientos de aviones desde la base de datos.
     *
     * @return Lista de objetos Mantenimiento.
     */
    public List<Mantenimiento> obtenerTodos() {
        List<Mantenimiento> personal = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT id, nombre, contacto FROM mantenimiento");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Mantenimiento mantenimiento = new Mantenimiento();
                mantenimiento.setId(resultSet.getInt("id"));
                mantenimiento.setNombre(resultSet.getString("nombre"));
                mantenimiento.setContacto(resultSet.getString("contacto"));

                personal.add(mantenimiento);
            }

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al obtener los mantenimientos: " + ex.getMessage());
        }
        return personal;
    }

    /**
     * Agrega un nuevo mantenimiento de avión a la base de datos.
     *
     * @param mantenimiento Objeto Mantenimiento a agregar.
     * @return true si se agregó correctamente, false en caso contrario.
     */
    public boolean agregar(Mantenimiento mantenimiento) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO mantenimiento (nombre, contacto) VALUES (?, ?)");
            statement.setString(1, mantenimiento.getNombre());
            statement.setString(2, mantenimiento.getContacto());

            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al agregar el mantenimiento: " + ex.getMessage());
        }
        return resultado;
    }

    /**
     * Elimina un mantenimiento de avión de la base de datos.
     *
     * @param id Identificador del mantenimiento a eliminar.
     * @return true si se eliminó correctamente, false en caso contrario.
     */
    public boolean eliminar(int id) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("DELETE FROM mantenimiento WHERE id = ?");
            statement.setInt(1, id);

            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al eliminar el mantenimiento: " + ex.getMessage());
        }
        return resultado;
    }

     /**
     * Edita un mantenimiento de avión en la base de datos.
     *
     * @param mantenimiento Objeto Mantenimiento con los nuevos datos a editar.
     * @return true si se editó correctamente, false en caso contrario.
     */
    public boolean editar(Mantenimiento mantenimiento) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("UPDATE mantenimiento SET nombre = ?, contacto = ? WHERE id = ?");
            statement.setString(1, mantenimiento.getNombre());
            statement.setString(2, mantenimiento.getContacto());
            statement.setInt(3, mantenimiento.getId());

            int filasAfectadas = statement.executeUpdate();
            resultado = filasAfectadas > 0;

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Ocurrió un error al editar el mantenimiento: " + ex.getMessage());
        }
        return resultado;
    }
}    
    