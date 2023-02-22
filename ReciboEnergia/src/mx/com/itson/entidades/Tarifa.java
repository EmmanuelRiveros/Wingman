/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.itson.entidades;

/**
 * Tarifa que se tendra en cuenta al calcular los cargos
 * @author Emmanuel
 */

public class Tarifa {

    private TipoTarifa tipoTarifa;
    private float precioKwh;
    
    /**
     * @return the tipoTarifa
     */
    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    /**
     * @param tipoTarifa the tipoTarifa to set
     */
    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    /**
     * @return the precioKwh
     */
    public float getPrecioKwh() {
        return precioKwh;
    }

    /**
     * @param precioKwh the precioKwh to set
     */
    public void setPrecioKwh(float precioKwh) {
        this.precioKwh = precioKwh;
    }
    
}
