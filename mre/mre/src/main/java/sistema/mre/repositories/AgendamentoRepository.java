package sistema.mre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistema.mre.models.AgendamentoModel;

@Repository
public interface AgendamentoRepository extends JpaRepository<AgendamentoModel, Integer> {
}
