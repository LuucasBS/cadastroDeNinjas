package dev.java10x.CadastroDeNinjas.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {


    @PostMapping("/criar")
    public String criar() {
        return "missao criada com sucesso" ;
    }

    @GetMapping("/listar")
    public String listar(){
        return "missao Listada com sucesso" ;
    }

    @PutMapping("editar")
    public String editar(){
        return "missao editada com sucesso";
    }

    @DeleteMapping("deletar")
    public String deletarmissao() {
        return "missao deletada com sucesso";
    }


}
