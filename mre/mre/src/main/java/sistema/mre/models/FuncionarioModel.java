package sistema.mre.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.Temporal;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Funcionario", uniqueConstraints = {
        @UniqueConstraint(columnNames = "rg"),
        @UniqueConstraint(columnNames = "cpf"),
        @UniqueConstraint(columnNames = "email")
})
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFuncionario")
    private Integer idFuncionario;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "rg", nullable = false, length = 7, unique = true)
    private String rg;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "estado_civil", nullable = false, length = 13)
    private String estadoCivil;

    @Column(name = "genero", nullable = false)
    private char genero;

    @Column(name = "nacionalidade", nullable = false, length = 45)
    private String nacionalidade;

    @Column(name = "naturalidade", nullable = false, length = 2)
    private String naturalidade;

    @Column(name = "cidade", nullable = false, length = 45)
    private String cidade;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "bairro", nullable = false, length = 45)
    private String bairro;

    @Column(name = "lote", nullable = false, length = 45)
    private String lote;

    @Column(name = "logradouro", nullable = false, length = 45)
    private String logradouro;

    @Column(name = "cep", nullable = false, length = 8)
    private String cep;

    @Column(name = "complemento", nullable = false, length = 45)
    private String complemento;

    @Column(name = "email", nullable = false, length = 45, unique = true)
    private String email;

    @Column(name = "data_nascimento", nullable = false, length = 45)
    private String dataNascimento;

    @Column(name = "telefone", nullable = false, length = 11)
    private String telefone;

    @Column(name = "cargo", nullable = false, length = 45)
    private String cargo;

    @Column(name = "departamento", nullable = false, length = 45)
    private String departamento;

    @Column(name = "data_admissao", nullable = false)
    private Date dataAdmissao;
}
