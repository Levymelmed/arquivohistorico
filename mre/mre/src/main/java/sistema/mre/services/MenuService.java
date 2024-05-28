package sistema.mre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.mre.models.MenuModel;
import sistema.mre.repositories.MenuRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;


    public MenuModel criarMenu(MenuModel menu) {
        return menuRepository.save(menu);
    }

    // Atualizar um menu existente
    public MenuModel atualizarMenu(Integer id, MenuModel menuAtualizado) {
        Optional<MenuModel> menuExistente = menuRepository.findById(id);
        if (menuExistente.isPresent()) {
            MenuModel menu = menuExistente.get();
            menu.setMenu(menuAtualizado.getMenu());
            menu.setIcone(menuAtualizado.getIcone());
            menu.setLink(menuAtualizado.getLink());
            menu.setFuncionarioModel(menuAtualizado.getFuncionarioModel());
            return menuRepository.save(menu);
        } else {
            throw new RuntimeException("Menu não encontrado com o ID: " + id);
        }
    }

    // Excluir um menu
    public void excluirMenu(Integer id) {
        menuRepository.deleteById(id);
    }

    // Buscar todos os menus
    public List<MenuModel> buscarTodosOsMenus() {
        return menuRepository.findAll();
    }

    // Buscar um menu por ID
    public MenuModel buscarMenuPorId(Integer id) {
        return menuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu não encontrado com o ID: " + id));
    }

    // Buscar menus por funcionário
    public List<MenuModel> buscarMenusPorFuncionario(Integer funcionarioId) {
        return menuRepository.findAllById(Collections.singleton(funcionarioId));
    }
}
