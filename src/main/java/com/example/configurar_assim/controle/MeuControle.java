package com.example.configurar_assim.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuControle {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello Sprint Boot";
    }

    @GetMapping("/exercicio")
    public String exc(){
        return "Hello Exercicio";
    }

    @GetMapping("/clientes")
    public String getcliente(){
        return "Vai algum dia retornar do BD todos os clientes";
    }

    @GetMapping("/clientes/{codigo}")
    public String getCliente(@PathVariable int codigo){
        if(codigo == 7)
            return "SIIIIII";
        else if(codigo == 404)
            return "Bugueeeeeei!!";
        else
            return "Vai algum dia retornar o " + codigo + " cliente (Versão 2.0)";
    }


}
