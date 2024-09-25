package com.example.Exceptions11.servicio;

import com.example.Exceptions11.Excepciones.ContrasenaInvalidaException;
import com.example.Exceptions11.Excepciones.NombreUsuarioInvalidoException;
import com.example.Exceptions11.Excepciones.UsuarioException;
import com.example.Exceptions11.Excepciones.UsuarioNoExistenteException;
import com.example.Exceptions11.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UsuarioServiceImpl implements UsuarioService{


    public List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void registrarUsuario(Usuario usuario) throws UsuarioException {
       if (usuario.getNombreUsuario() == null || usuario.getNombreUsuario().isEmpty()){
           throw new NombreUsuarioInvalidoException("El nombre de usuario no es valido");
       }
       if (usuario.getContrasena() == null || usuario.getContrasena().isEmpty()){
           throw new ContrasenaInvalidaException("La contraseña no es valida");
       }
       if (usuarios.stream().anyMatch(u -> u.getNombreUsuario().equals(usuario.getNombreUsuario()))){
           throw new UsuarioNoExistenteException("El nombre de usuario ya existe no se puede registrar");
       }

       usuarios.add(usuario);

    }

    @Override
    public Usuario obtenerUsuarioPorNombreUsuario(String nombreUsuario) {
        return usuarios.stream().filter(u->u.getNombreUsuario().equals(nombreUsuario)).findFirst().orElse(null);
    }
}
