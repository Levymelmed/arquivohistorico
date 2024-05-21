package sistema.mre.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Menu")
@Getter @Setter
public class MenuModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
    private Integer idMenu;

    @Column(name = "Menu", nullable = false, length = 20)
    private String menu;

    @Column(name = "icone", nullable = false, length = 10)
    private String icone;

    @Column(name = "link", nullable = false, length = 45)
    private String link;

    @ManyToOne
    @JoinColumn(name = "Funcionario_idFuncionario", nullable = false)
    private FuncionarioModel funcionario;

    public MenuModel() {
    }

    public MenuModel(Integer idMenu, String menu, String icone, String link, FuncionarioModel funcionario) {
        this.idMenu = idMenu;
        this.menu = menu;
        this.icone = icone;
        this.link = link;
        this.funcionario = funcionario;
    }
}
