package sistema.mre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sistema.mre.models.AgendamentoModel;
import sistema.mre.services.AgendamentoService;

import java.util.List;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping
    public ResponseEntity<List<AgendamentoModel>> getAllAgendamento() {
        return ResponseEntity.ok().body(agendamentoService.findAll());
    }


}
