package dev.java10x.CadastroDeNinjas.Controller;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping("/criar")
    public String criar() {
        return "ninja criada com sucesso" ;
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinja() ;
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaByID(@PathVariable Long id) {
        return ninjaService.listarNinjaPorID(id);
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
