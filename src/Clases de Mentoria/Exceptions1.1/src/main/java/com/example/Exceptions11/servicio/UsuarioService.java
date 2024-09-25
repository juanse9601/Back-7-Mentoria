package com.example.Exceptions11.servicio;



import com.example.Exceptions11.Excepciones.UsuarioException;
import com.example.Exceptions11.Usuario;

public interface UsuarioService {

    void registrarUsuario(Usuario usuario) throws UsuarioException;

    Usuario obtenerUsuarioPorNombreUsuario(String nombreUsuario);
}
