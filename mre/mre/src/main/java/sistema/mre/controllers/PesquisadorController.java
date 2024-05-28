package sistema.mre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sistema.mre.models.PesquisadorModel;
import sistema.mre.services.PesquisadorService;

import java.util.List;

@RestController
@RequestMapping(value = "/pesquisador")
public class PesquisadorController {
    @Autowired
    private PesquisadorService pesquisadorService;

    @GetMapping
    public ResponseEntity<List<PesquisadorModel>> getAllPesquisador(){
        return ResponseEntity.ok().body(pesquisadorService.findAll());
    }
}
