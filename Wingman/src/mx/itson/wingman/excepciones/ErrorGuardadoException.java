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
public class ErrorGuardadoException extends Exception{
    public ErrorGuardadoException(){
    }
    
    public ErrorGuardadoException(String ex){
        super(ex);
    }
    
    public ErrorGuardadoException(Throwable t){
        super(t);
    }
    
    public ErrorGuardadoException(String ex, Throwable t){
        super(ex, t);
    }
}
