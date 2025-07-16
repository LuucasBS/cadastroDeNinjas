package dev.java10x.CadastroDeNinjas.Controller;


import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesRepository;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

            private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    public MissoesModel criar(@RequestBody MissoesModel missoesModel) {
        return missoesService.criarmissao(missoesModel);
    }

    @GetMapping("/listar")
    public List<MissoesModel> listar(){
        return missoesService.listarMissoes();
    }
//
    @GetMapping("/listar/{id}")
    public Optional<MissoesModel> listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissoesPorId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarninja(@PathVariable Long id) {
        missoesService.deletarNinja(id);
    }



}
