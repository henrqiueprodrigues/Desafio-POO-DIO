package Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data; //Data em que ela será realizada


//----------------- METODOS ---------------------------

    @Override
    public double calculoXp() {
        return xpPradrao + 20;
    }


//----------------- CONSTRUTOR ---------------------------

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }


//----------------- GETTERS/SETTERS -----------------------

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


//----------------- ToString -----------------------

    @Override
    public String toString() {
        return "\n{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
