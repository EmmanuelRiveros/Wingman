package mx.itson.wingman.entidades;
import mx.itson.wingman.enumeradores.TipoAvion;

/**
 *
 * @author lm
 */
public class Piloto {
    private int pilotoId;
    private String nombre;
    private TipoAvion especialidad;
    private Estado estado;

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
