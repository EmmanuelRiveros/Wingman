/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.wingman.excepciones;

/**
 * Una excepción que se lanza cuando no se puede guardar una entidad en la base de datos.
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
