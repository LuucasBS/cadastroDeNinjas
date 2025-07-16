package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository ;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }


    public MissoesModel criarmissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }

    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    public Optional<MissoesModel> listarMissoesPorId(Long id) {
        Optional<MissoesModel> missao = missoesRepository.findById(id);
        return missao;
    }

    public void deletarNinja(Long id) {
        missoesRepository.deleteById(id);
    }


}
