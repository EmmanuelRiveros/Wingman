package mx.itson.wingman.DAO;

import java.util.List;
import mx.itson.wingman.entidades.Mantenimiento;

/**
 *
 * @author lm
 */
public class MantenimientoDAO {
    private List<Mantenimiento> personal;

    public List<Mantenimiento> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Mantenimiento> personal) {
        this.personal = personal;
    }
    
    
}
