/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.itson.entidades;

import java.util.Date;

/**
 * Información relacionada con el pago de la factura
 * @author Emmanuel
 */
public class Pago {

    private Date fechaPago;
    private float montoPago;
    private MetodoPago metodoPago;
    
    /**
     * @return the fechaPago
     */
    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the montoPago
     */
    public float getMontoPago() {
        return montoPago;
    }

    /**
     * @param montoPago the montoPago to set
     */
    public void setMontoPago(float montoPago) {
        this.montoPago = montoPago;
    }

    /**
     * @return the metodoPago
     */
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    /**
     * @param metodoPago the metodoPago to set
     */
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
}
