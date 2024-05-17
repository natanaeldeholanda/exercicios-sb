package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
    @GetMapping(path = "/ola")//pode haver mais de uma url chamando o método, se quiser acrescentar, utilizar {} separado por vírgula
    public String ola(){
        return "Olá Spring Boot!";
    }
    @GetMapping(path = "/dev")
    public String projetoDev(){
        return "Vou me tornar um dev de sucesso!";
    }
}
