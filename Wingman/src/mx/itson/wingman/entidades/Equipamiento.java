package mx.itson.wingman.entidades;

import mx.itson.wingman.enumeradores.TipoEquipamiento;

/**
 *
 * @author lm
 */
public class Equipamiento {
    private String nombre;
    private TipoEquipamiento tipoEquipamiento;
    private int unidades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEquipamiento getTipoEquipamiento() {
        return tipoEquipamiento;
    }

    public void setTipoEquipamiento(TipoEquipamiento tipoEquipamiento) {
        this.tipoEquipamiento = tipoEquipamiento;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
}
