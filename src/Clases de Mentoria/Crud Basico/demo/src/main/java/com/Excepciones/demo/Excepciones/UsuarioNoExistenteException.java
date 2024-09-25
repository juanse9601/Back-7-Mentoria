package com.Excepciones.demo.Excepciones;

public class UsuarioNoExistenteException extends UsuarioException{
    public UsuarioNoExistenteException(String message) {
        super(message);
    }
}
