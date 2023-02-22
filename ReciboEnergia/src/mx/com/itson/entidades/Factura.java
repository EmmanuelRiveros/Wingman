/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.itson.entidades;

import java.util.List;

/**
 * Factura con los gastos totales de energía y el tipo de pago que se realizo
 * @author Emmanuel
 */
public class Factura {
    
    private PeriodoFacturacion periodo;
    private List<Cargo> cargos;
    private Pago pago;

    /**
     * @return the periodo
     */
    public PeriodoFacturacion getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(PeriodoFacturacion periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the cargos
     */
    public List<Cargo> getCargos() {
        return cargos;
    }

    /**
     * @param cargos the cargos to set
     */
    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    /**
     * @return the pago
     */
    public Pago getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
}
