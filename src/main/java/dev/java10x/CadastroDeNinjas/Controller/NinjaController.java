package dev.java10x.CadastroDeNinjas.Controller;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaService;
import dev.java10x.CadastroDeNinjas.dtos.NinjaDTO;
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
    public NinjaDTO criar(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas(){
        return ninjaService.listarNinja() ;
    }

    @GetMapping("/listar/{id}")
    public NinjaDTO listarNinjaByID(@PathVariable Long id) {
        return ninjaService.listarNinjaPorID(id);
    }

    @PutMapping("editar")
    public String editar(){
        return "ninja editada com sucesso";
    }

    @DeleteMapping("deletar/{id}")
    public void deletarninja(@PathVariable Long id) {
         ninjaService.deletarNinja(id);
    }

    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarNinjaPorID(@PathVariable Long id,
                                    @RequestBody NinjaDTO ninjaAtualizado){
        return ninjaService.alterarNinja(id, ninjaAtualizado);
    }
}
