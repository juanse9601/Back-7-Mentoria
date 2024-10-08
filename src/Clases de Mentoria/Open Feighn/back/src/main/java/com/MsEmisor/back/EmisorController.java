package com.MsEmisor.back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmisorController {


    @GetMapping("/emisor/msn")
    public String mensaje(){
        return "Este es el mensaje del emisor: Hola BACK 8";
    }




}
