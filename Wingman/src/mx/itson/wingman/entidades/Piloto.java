package mx.itson.wingman.entidades;
import mx.itson.wingman.enumeradores.TipoAvion;
import mx.itson.wingman.enumeradores.EstadoPiloto;
/**
 *
 * @author lm
 */
public class Piloto {
    private int pilotoId;
    private String nombre;
    private TipoAvion especialidad;
    private EstadoPiloto estado;

    public int getPilotoId() {
        return pilotoId;
    }

    public void setPilotoId(int pilotoId) {
        this.pilotoId = pilotoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAvion getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(TipoAvion especialidad) {
        this.especialidad = especialidad;
    }

    public EstadoPiloto getEstado() {
        return estado;
    }

    public void setEstado(EstadoPiloto estado) {
        this.estado = estado;
    }
    
    
}
