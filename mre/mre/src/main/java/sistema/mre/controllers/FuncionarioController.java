package sistema.mre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistema.mre.models.FuncionarioModel;
import sistema.mre.services.FuncionarioService;

import java.util.List;

@RestController
@RequestMapping(value= "/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> getAllFuncionarios(){
        return ResponseEntity.ok().body(funcionarioService.listarfuncionario());
    }

    @PostMapping(value ="inserir-funcionário")
    public ResponseEntity<FuncionarioModel> saveFuncionario(@RequestBody FuncionarioModel funcionarioModel){
        return ResponseEntity.ok().body(funcionarioService.inserirFuncionario(funcionarioModel));
    }
}
