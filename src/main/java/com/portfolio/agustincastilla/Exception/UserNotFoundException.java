
package com.portfolio.agustincastilla.Exception;


public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String mensaje){
        super(mensaje);
    }
    
}
