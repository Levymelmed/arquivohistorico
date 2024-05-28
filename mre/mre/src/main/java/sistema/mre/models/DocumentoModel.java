package sistema.mre.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "documento")
@Getter @Setter
public class DocumentoModel {

    @Id
    @Column(name = "numero_volume", nullable = false)
    private Integer numeroVolume;

    @Column(name = "cor_impressao", nullable = false, length = 8)
    private String corImpressao;

    @Column(name = "sigla", nullable = false, length = 4)
    private String sigla;

    @Column(name = "procedencia", nullable = false, length = 45)
    private String procedencia;

    @Column(name = "especie", nullable = false, length = 45)
    private String especie;

    @Column(name = "mes_inicial", nullable = false, length = 9)
    private String mesInicial;

    @Column(name = "mes_final", length = 9)
    private String mesFinal;

    @Column(name = "ano", nullable = false, length = 4)
    private String ano;

    @Column(name = "bloco", nullable = false, length = 45)
    private String bloco;

    @Column(name = "pratileira", nullable = false, length = 45)
    private String pratileira;


    public Integer getNumeroVolume() {
        return numeroVolume;
    }

    public void setNumeroVolume(Integer numeroVolume) {
        this.numeroVolume = numeroVolume;
    }

    public String getCorImpressao() {
        return corImpressao;
    }

    public void setCorImpressao(String corImpressao) {
        this.corImpressao = corImpressao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getMesInicial() {
        return mesInicial;
    }

    public void setMesInicial(String mesInicial) {
        this.mesInicial = mesInicial;
    }

    public String getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(String mesFinal) {
        this.mesFinal = mesFinal;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getPratileira() {
        return pratileira;
    }

    public void setPratileira(String pratileira) {
        this.pratileira = pratileira;
    }
}