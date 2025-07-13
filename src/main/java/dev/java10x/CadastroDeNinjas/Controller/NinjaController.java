package dev.java10x.CadastroDeNinjas.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    @PostMapping("/criar")
    public String criar() {
        return "ninja criada com sucesso" ;
    }

    @GetMapping("/listar")
    public String listar(){
        return "ninja Listada com sucesso" ;
    }

    @PutMapping("editar")
    public String editar(){
        return "ninja editada com sucesso";
    }

    @DeleteMapping("deletar")
    public String deletarninja() {
        return "ninja deletada com sucesso";
    }
}
