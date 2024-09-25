package com.example.Exceptions11;

import com.example.Exceptions11.Excepciones.UsuarioException;
import com.example.Exceptions11.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    private List<Usuario> usuarios;

    public UsuarioController(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }


    @PostMapping("/registrar")
    public ResponseEntity<String> registrarUsuario(@RequestBody Usuario usuario){
        try {
            usuarioService.registrarUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).body("Uusario registrado correctamente");
        } catch (UsuarioException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }



}
