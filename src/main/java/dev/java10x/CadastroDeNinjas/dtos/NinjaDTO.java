package dev.java10x.CadastroDeNinjas.dtos;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;

public class NinjaDTO {

   private Long id;
   private String nome;
   private String email;
   private int idade;


    private MissoesModel missoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = this.idade;
        return 0;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public NinjaDTO() {
    }

    public NinjaDTO(Long id, String nome, String email, int idade, MissoesModel missoes) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
    }
}
