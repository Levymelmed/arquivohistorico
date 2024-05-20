package sistema.mre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.mre.models.AgendamentoModel;
import sistema.mre.models.PesquisadorModel;
import sistema.mre.repositories.AgendamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<AgendamentoModel> findAll() {
        List<AgendamentoModel> agendamento = agendamentoRepository.findAll();
        return agendamento;
    }

    public AgendamentoModel inserirAgendamento(AgendamentoModel agendamento) {
        return agendamentoRepository.save(agendamento);
    }

}
