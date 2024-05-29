package sistema.mre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.mre.models.FuncionarioModel;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
}
