package sistema.mre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.mre.models.MenuModel;

public interface MenuRepository extends JpaRepository<MenuModel, Integer> {
}
