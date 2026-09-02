package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEvento {
    EVENTO_PLANEJADO("Evento Planejado",1),
    INSCRICAO_ABERTAS("Inscriçao Abertas,",2),
    EVENTO_EM_ANDAMENTO("Evento em Andamento",3),
    EVENTO_ENCERRADO("Evento Encerrado",4),
    EVENTO_CANCELADO("Evento cancelado",5);



    private final String descricao;
    private final int codigo_numerico;

    StatusEvento(String descricao, int codigo_numerico) {
        this.descricao = descricao;
        this.codigo_numerico = codigo_numerico;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo_numerico() {
        return codigo_numerico;
    }
}
