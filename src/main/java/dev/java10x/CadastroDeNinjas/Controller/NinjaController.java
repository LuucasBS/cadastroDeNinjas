package dev.java10x.CadastroDeNinjas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "<h1> boas vindas! </h1>" ;
    }

    @PostMapping("/criarNinjas")
    public String criarNinja(){
        return "Ninja criado!";
    }
}
