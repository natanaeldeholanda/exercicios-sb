package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( "/clientes") //@RequastMapping é pra mapear a url, pois o método @GetMapping pertence
//a classe @RequestMapping
public class ClenteController {
    //Criando um objeto Cliente, e mostrando via json -> instalar extensão json viewer
@GetMapping ("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Natanael", "012.345.678-90");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId (@PathVariable int id){
        return new Cliente (id, "Maria", "021.123.321-12");
    }
    @GetMapping
    public Cliente obterClientePorId2 (@RequestParam(name = "id", defaultValue = "1") int id){
    return new Cliente (id, "Pedro", "231.143.721-19");
    }
}
