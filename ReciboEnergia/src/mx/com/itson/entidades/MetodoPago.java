/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.itson.entidades;

/**
 * Metodo con el cual se realizo el pago de la factura
 * @author Emmanuel
 */
public class MetodoPago {

    private boolean enLinea;
    private boolean cajero;
    private boolean ventanilla;
    
    /**
     * @return the enLinea
     */
    public boolean isEnLinea() {
        return enLinea;
    }

    /**
     * @param enLinea the enLinea to set
     */
    public void setEnLinea(boolean enLinea) {
        this.enLinea = enLinea;
    }

    /**
     * @return the cajero
     */
    public boolean isCajero() {
        return cajero;
    }

    /**
     * @param cajero the cajero to set
     */
    public void setCajero(boolean cajero) {
        this.cajero = cajero;
    }

    /**
     * @return the ventanilla
     */
    public boolean isVentanilla() {
        return ventanilla;
    }

    /**
     * @param ventanilla the ventanilla to set
     */
    public void setVentanilla(boolean ventanilla) {
        this.ventanilla = ventanilla;
    }

}
