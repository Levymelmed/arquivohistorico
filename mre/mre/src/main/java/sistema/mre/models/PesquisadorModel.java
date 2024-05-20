package sistema.mre.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name = "pesquisador")
@Getter @Setter
public class PesquisadorModel implements Serializable {

    //@Column
    //private String instituicao_origem;]
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPesquisador")
    private Integer idPesquisador;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "rg", nullable = false, length = 7)
    private String rg;

    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;

    @Column(name = "estado_civil", nullable = false, length = 13)
    private String estadoCivil;

    @Column(name = "genero", nullable = false, length = 1)
    private String genero;

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

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "data_nascimento", nullable = false, length = 45)
    private String dataNascimento;

    @Column(name = "telefone", nullable = false, length = 11)
    private String telefone;

    @Column(name = "instituição_origem", nullable = false, length = 45)
    private String instituicaoOrigem;

    @ManyToOne
    @JoinColumn(name = "Agendamento_idAgendamento", nullable = false)
    private AgendamentoModel agendamento;

    public PesquisadorModel() {
    }

    public PesquisadorModel(Integer idPesquisador, String nome, String rg, String cpf, String estadoCivil, String genero, String nacionalidade, String naturalidade, String cidade, String estado, String bairro, String lote, String logradouro, String cep, String complemento, String email, String dataNascimento, String telefone, String instituicaoOrigem, AgendamentoModel agendamento) {
        this.idPesquisador = idPesquisador;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.lote = lote;
        this.logradouro = logradouro;
        this.cep = cep;
        this.complemento = complemento;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.instituicaoOrigem = instituicaoOrigem;
        this.agendamento = agendamento;
    }
}
