package Dominio;

public abstract class Conteudo {
    private String titulo; //Nome da mentoria
    private String descricao; //Descrição da mentoria
    protected static final Double xpPradrao = 10d;


//----------------- METODOS ---------------------------

    public abstract double calculoXp();


//----------------- CONSTRUTOR ---------------------------

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }


//----------------- GETTERS/SETTERS -----------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}
