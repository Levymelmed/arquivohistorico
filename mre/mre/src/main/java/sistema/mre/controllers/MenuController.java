package sistema.mre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistema.mre.models.MenuModel;
import sistema.mre.services.MenuService;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    // Endpoint para criar um novo menu
    @PostMapping
    public ResponseEntity<MenuModel> criarMenu(@RequestBody MenuModel menu) {
        MenuModel novoMenu = menuService.criarMenu(menu);
        return ResponseEntity.ok(novoMenu);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MenuModel> atualizarMenu(@PathVariable Integer id, @RequestBody MenuModel menuAtualizado) {
        MenuModel menu = menuService.atualizarMenu(id, menuAtualizado);
        return ResponseEntity.ok(menu);
    }

    // Endpoint para excluir um menu
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirMenu(@PathVariable Integer id) {
        menuService.excluirMenu(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<MenuModel>> buscarTodosOsMenus() {
        List<MenuModel> menus = menuService.buscarTodosOsMenus();
        return ResponseEntity.ok(menus);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuModel> buscarMenuPorId(@PathVariable Integer id) {
        MenuModel menu = menuService.buscarMenuPorId(id);
        return ResponseEntity.ok(menu);
    }

    @GetMapping("/funcionario/{funcionarioId}")
    public ResponseEntity<List<MenuModel>> buscarMenusPorFuncionario(@PathVariable Integer funcionarioId) {
        List<MenuModel> menus = menuService.buscarMenusPorFuncionario(funcionarioId);
        return ResponseEntity.ok(menus);
    }
}