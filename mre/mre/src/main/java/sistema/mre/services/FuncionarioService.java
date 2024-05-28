package sistema.mre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import sistema.mre.models.FuncionarioModel;
import sistema.mre.repositories.FuncionarioRepository;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> listarfuncionario(){
        List<FuncionarioModel> funcionario = funcionarioRepository.findAll();
        return funcionario;
    }

    public FuncionarioModel inserirFuncionario(@RequestBody FuncionarioModel funcionarioModel){
        return funcionarioRepository.save(funcionarioModel);
    }


}
