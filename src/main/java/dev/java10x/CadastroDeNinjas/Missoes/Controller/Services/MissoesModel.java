package dev.java10x.CadastroDeNinjas.Missoes.Controller.Services;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldadeMissao;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldadeMissao) {
        this.nome = nome;
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public String getNomeMissao() {
        return nome;
    }

    public void setNomeMissao(String nome) {
        this.nome = nome;
    }

    public String getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(String dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }
}
