package com.firstapi.myfirstapi.controller;

import com.firstapi.myfirstapi.model.User;
import com.firstapi.myfirstapi.service.UserServiceI;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/v1/users")

public class UserController {

    private final UserServiceI userServiceI;

    public UserController(UserServiceI userServiceI){
        this.userServiceI = userServiceI;
    }


    @Operation(summary = "Endpoint que permite listar todos los usuarios en la lista usuarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = "Se listo correctamente los usuarios."),
            @ApiResponse(responseCode = "400" , description = "Hubo error de logica en la aplicacion o ingresaste mal los datos"),
            @ApiResponse(responseCode = "500" , description = "Error de servidor temas de conectividad."),
    })
    @GetMapping
    public HashMap<Integer, User> all(){
        return userServiceI.all();
    }

    @Operation(summary = "Endpoint que permite listar un usuario por id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = "Se listo correctamente el usuario."),
            @ApiResponse(responseCode = "400" , description = "Hubo error de logica en la aplicacion o ingresaste mal los datos"),
            @ApiResponse(responseCode = "500" , description = "Error de servidor temas de conectividad."),
    })
    @GetMapping("/{idUser}")
    public User findById(@Parameter(description = "id de usuario" , example = "1") @PathVariable("idUser") Integer id){
        return userServiceI.findById(id);
    }


    @Operation(summary = "Endpoint que permite crear un usuario.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201" , description = "Se creo exitosamente el usuario.",
                content = {
                    @Content(mediaType = "application/json",
                    schema = @Schema(implementation = User.class))
                }),
            @ApiResponse(responseCode = "400" , description = "Hubo error de logica en la aplicacion o ingresaste mal los datos"),
            @ApiResponse(responseCode = "500" , description = "Error de servidor temas de conectividad."),
    })
    @PostMapping
    public User createUser(@RequestBody User user){
        return userServiceI.createUser(user);
    }



    @Operation(summary = "Endpoint que permite actualizar un usuario por id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = "Se actualizo correctamente el usuario."),
            @ApiResponse(responseCode = "400" , description = "Hubo error de logica en la aplicacion o ingresaste mal los datos"),
            @ApiResponse(responseCode = "500" , description = "Error de servidor temas de conectividad."),
    })
    @PutMapping("/{idUser}")
    public User updateUser(@PathVariable("idUser") Integer id, @RequestBody User user){
        return userServiceI.updateUser(id, user);
    }


    @Operation(summary = "Endpoint que permite eliminar un usuario por su id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = "Se elimino correctamente el usuario."),
            @ApiResponse(responseCode = "400" , description = "Hubo error de logica en la aplicacion o ingresaste mal los datos"),
            @ApiResponse(responseCode = "500" , description = "Error de servidor temas de conectividad."),
    })
    @DeleteMapping("/{idUser}")
    public void deleteUser(@PathVariable("idUser") Integer id){
        userServiceI.deleteUser(id);
    }
}
