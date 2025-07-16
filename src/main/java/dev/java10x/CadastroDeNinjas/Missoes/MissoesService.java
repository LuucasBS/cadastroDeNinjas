package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;

public class MissoesService {

    private MissoesRepository missoesRepository ;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }


}
