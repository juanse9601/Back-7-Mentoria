package com.Excepciones.demo.Excepciones;

public class ContrasenaInvalidaException extends UsuarioException{
    public ContrasenaInvalidaException(String message) {
        super(message);
    }
}
