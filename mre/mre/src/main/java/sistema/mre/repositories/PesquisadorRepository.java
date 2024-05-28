package sistema.mre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistema.mre.models.FuncionarioModel;
import sistema.mre.models.PesquisadorModel;

@Repository
public interface PesquisadorRepository extends JpaRepository<PesquisadorModel, Integer>{

}
