package sistema.mre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.mre.models.PesquisadorModel;
import sistema.mre.repositories.PesquisadorRepository;

import java.util.List;

@Service
public class PesquisadorService {

    @Autowired
    private PesquisadorRepository pesquisadorRepository;

    public List<PesquisadorModel> findAll() {
        List<PesquisadorModel> pesquisador = pesquisadorRepository.findAll();
        return pesquisador;
    }
}
