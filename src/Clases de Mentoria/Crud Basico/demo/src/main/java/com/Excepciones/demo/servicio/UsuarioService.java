package com.Excepciones.demo.servicio;


import com.Excepciones.demo.Excepciones.UsuarioException;

public interface UsuarioService {

    void registrarUsuario(Usuario usuario) throws UsuarioException;

    Usuario obtenerUsuarioPorNombreUsuario(String nombreUsuario);
}
