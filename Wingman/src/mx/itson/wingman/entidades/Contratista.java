package mx.itson.wingman.entidades;

/**
 * Una clase que representa un contratista con un nombre, trabajo y contacto. Tiene métodos para actualizar y obtener estos valores.
 * @author Emmanuel
 */
public class Contratista {
    
    private String nombre;
    private String trabajo;
    private String contacto;

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
     * @return the trabajo
     */
    public String getTrabajo() {
        return trabajo;
    }

    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
}
