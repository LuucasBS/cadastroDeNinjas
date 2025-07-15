package dev.java10x.CadastroDeNinjas.Ninjas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "nome")
    String nome;

    @Column(name = "email",unique = true)
    String email;

    @Column(name = "idade")
    int idade;

    @ManyToOne()
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
