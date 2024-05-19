package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    //Calculadora/somar/10/20
    @GetMapping("/somar/{a}/{b}")
    public int subtrair(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    //Calculadora/somar/subtrair?a=100&b=39
    //Chamando o método -> http://localhost:8080/calculadora/subtrair?b=100&a=170
    @GetMapping("/subtrair")
    public int somar(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }
}
