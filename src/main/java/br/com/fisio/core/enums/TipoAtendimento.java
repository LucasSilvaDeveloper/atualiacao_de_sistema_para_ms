package br.com.fisio.core.enums;

public enum TipoAtendimento {

    PILATES("Pilates"),
    PILATES_INDIVIDUAL("Pilates Individual"),
    PILATES_KIDS("Pilates Kids"),
    FISIOTERAPIA("Fisioterapia"),
    MASSAGEM("Massagem"),
    AVALIACAO("Avaliação");

    private final String descricao;

    TipoAtendimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
