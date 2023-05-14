package mx.itson.wingman.DAO;

import java.util.List;
import mx.itson.wingman.entidades.Contratista;

/**
 *
 * @author lm
 */
public class ContratistaDAO {
    private List<Contratista> contratistas;

    public List<Contratista> getContratistas() {
        return contratistas;
    }

    public void setContratistas(List<Contratista> contratistas) {
        this.contratistas = contratistas;
    }
    
}
