package dev.java10x.CadastroDeNinjas.Controller;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaService;
import dev.java10x.CadastroDeNinjas.dtos.NinjaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criar(@RequestBody NinjaDTO ninja) {
        NinjaDTO ninjaDTO = ninjaService.criarNinja(ninja);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja foi criado com sucesso:" + ninja.getNome() + "id:" + ninja.getId());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinja() ;

        return ResponseEntity.ok(ninjas);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjaByID(@PathVariable Long id) {
        NinjaDTO ninjasPorId =  ninjaService.listarNinjaPorID(id);
        if( id != null) {
            return ResponseEntity.ok()
                    .body(ninjasPorId);
        } else {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o ID" + id + "Não existe no registro");
        }
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<String> deletarninja(@PathVariable Long id) {

        if(ninjaService.listarNinjaPorID(id) != null) {
             ninjaService.deletarNinja(id);
             return ResponseEntity.ok("Ninja com id " + id + " deletado com sucesso.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o ID Não encontrado");
        }
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorID(@PathVariable Long id,
                                    @RequestBody NinjaDTO ninjaAtualizado){

        NinjaDTO ninja =  ninjaService.alterarNinja(id, ninjaAtualizado);
        if (ninja != null) {
            return ResponseEntity.ok().body(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Nao encontrado");
        }
    }
}
