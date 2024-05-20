package sistema.mre.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Agendamento")
@Getter @Setter
public class AgendamentoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAgendamento")
    private Integer idAgendamento;

    @Column(name = "tema_pesquisa", nullable = false, length = 45)
    private String temaPesquisa;

    @Column(name = "palavras_chave", nullable = false, length = 45)
    private String palavrasChave;

    @Column(name = "horario_visita", nullable = false, length = 45)
    private String horarioVisita;

    @Column(name = "duracao_visita", nullable = false, length = 45)
    private String duracaoVisita;

    public AgendamentoModel() {
    }

    public AgendamentoModel(Integer idAgendamento, String temaPesquisa, String palavrasChave, String horarioVisita, String duracaoVisita) {
        this.idAgendamento = idAgendamento;
        this.temaPesquisa = temaPesquisa;
        this.palavrasChave = palavrasChave;
        this.horarioVisita = horarioVisita;
        this.duracaoVisita = duracaoVisita;
    }
}
