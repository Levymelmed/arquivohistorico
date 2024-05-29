package sistema.mre.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Menu", uniqueConstraints = {
        @UniqueConstraint(columnNames = "idMenu"),
        @UniqueConstraint(columnNames = "Menu"),
        @UniqueConstraint(columnNames = "icone")
})
public class MenuModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
    private Integer id;

    @Column(name = "Menu", nullable = false, length = 20)
    private String menu;

    @Column(name = "icone", nullable = false, length = 10)
    private String icone;

    @Column(name = "link", nullable = false, length = 45)
    private String link;

    @ManyToOne
    @JoinColumn(name = "Funcionario_idFuncionario", nullable = false)
    private FuncionarioModel funcionarioModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public FuncionarioModel getFuncionarioModel() {
        return funcionarioModel;
    }

    public void setFuncionarioModel(FuncionarioModel funcionarioModel) {
        this.funcionarioModel = funcionarioModel;
    }
}
