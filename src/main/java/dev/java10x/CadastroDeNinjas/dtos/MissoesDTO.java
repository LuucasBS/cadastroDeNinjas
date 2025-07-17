package dev.java10x.CadastroDeNinjas.dtos;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesDTO {
    private Long id;
    private String nome;
    private String dificuldadeMissao;
    private List<NinjaModel> ninja;


}
