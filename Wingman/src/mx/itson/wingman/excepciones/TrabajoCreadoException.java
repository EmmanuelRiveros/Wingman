/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.excepciones;

/**
 * Una excepción que se lanza cuando se intenta crear un trabajo que ya existe.
 * @author Emmanuel
 */
public class TrabajoCreadoException extends Exception{
    public TrabajoCreadoException(){        
    }
    
    public TrabajoCreadoException(String ex){
        super(ex);
    } 
    
    public TrabajoCreadoException(Throwable t){
        super(t);
    }
    
    public TrabajoCreadoException(String ex, Throwable t){
        super(ex, t);
    }
}
