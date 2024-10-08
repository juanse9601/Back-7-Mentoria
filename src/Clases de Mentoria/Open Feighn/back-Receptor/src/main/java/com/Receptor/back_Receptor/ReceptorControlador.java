package com.Receptor.back_Receptor;

import com.Receptor.back_Receptor.client.IemisorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptorControlador {

    @Autowired
    private IemisorClient iemisorClient;

    @GetMapping("/receptor")
    public String mensajeRecibido(){
        return iemisorClient.mensaje();
    }

}
