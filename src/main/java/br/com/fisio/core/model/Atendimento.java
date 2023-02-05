package br.com.fisio.core.model;

import br.com.fisio.core.enums.TipoAtendimento;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "atendimento")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePaciente;

    private String nomeMedico;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataAtendimento;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoAtendimento tipoAtendimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public LocalDateTime getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDateTime dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "id=" + id +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", nomeMedico='" + nomeMedico + '\'' +
                ", dataAtendimento=" + dataAtendimento +
                ", tipoAtendimento=" + tipoAtendimento +
                '}';
    }
}
