package Dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;



//----------------- METODOS ---------------------------

    @Override
    public double calculoXp() {
        return xpPradrao * cargaHoraria;
    }


//----------------- CONSTRUTOR ---------------------------

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


//----------------- GETTERS/SETTERS -----------------------


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

//----------------- ToString -----------------------
    @Override
    public String toString() {
        return "\n{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
