/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.entidades;

import mx.itson.wingman.enumeradores.TipoVuelo;

/**
 *
 * @author jorge
 */
public class Vuelo {

    private Avion avion;
    private Destino destino;
    private TipoVuelo tipoVuelo;
    private Ruta ruta;
    private Piloto piloto;
    private String clima;
    
    
    
    /**
     * @return the avion
     */
    public Avion getAvion() {
        return avion;
    }

    /**
     * @param avion the avion to set
     */
    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    /**
     * @return the destino
     */
    public Destino getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoVuelo
     */
    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    /**
     * @param tipoVuelo the tipoVuelo to set
     */
    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    /**
     * @return the ruta
     */
    public Ruta getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the piloto
     */
    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * @param piloto the piloto to set
     */
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    /**
     * @return the clima
     */
    public String getClima() {
        return clima;
    }

    /**
     * @param clima the clima to set
     */
    public void setClima(String clima) {
        this.clima = clima;
    }
    

    
}
