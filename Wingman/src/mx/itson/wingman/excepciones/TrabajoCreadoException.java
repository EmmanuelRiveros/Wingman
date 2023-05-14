/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.excepciones;

/**
 *
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
