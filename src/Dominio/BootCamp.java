package Dominio;

import java.time.LocalDate;
import java.util.*;

public class BootCamp{
    private final String nome;
    private final String descricao;
    private final LocalDate inicio= LocalDate.now();
    private final  LocalDate fim= inicio.plusDays(45);
    private Set<Dev> devsParticipantes= new HashSet<>(); //Guarda os conteudos do bootcamp.
    private Set<Conteudo> contudosBootCamp= new LinkedHashSet<>(); //Guada os cursos e mentorias do bootcamp.


//----------------- METODOS ---------------------------

    public void encerraBootCamp(){
        if(this.fim.equals(LocalDate.now())){ //Checa se é o dia do encerramento.
            for(Dev devs: devsParticipantes) devs.removeBootCamp(this); //Remove o bootcamp de todos os devs que não o completaram.
        }else {
            System.out.println("Prazo do BootCamp ainda não terminou. O termino sera no dia: "+ this.fim);
        }
    }

    public void removeDev(Dev dev){ //Metodo auxiliar para função remove bootcamp da classe Dev
        devsParticipantes.remove(dev); //Remove o dev da lista de participantes
    }

    public void imprimeInfoBootCamp(){
        System.out.println(nome); //Imprime o nome.
        System.out.println("\nDescrição: " + descricao); //Imprime a descrição.
        System.out.println("\nInício: " + inicio + "\nFinalização: " + fim); //Imprime a data do início e do fim do bootcamp.
        System.out.println("\nDevs inscritos:");
        for (Dev devs: devsParticipantes) System.out.print(devs.getNome() + ", "); //Imprime todos os devs inscritos
        System.out.println("\nCursos e mentorias:");
        for (Conteudo conteudo: contudosBootCamp) System.out.println(conteudo.getTitulo()); //Imprime todo os conteudos do bootcamp
    }
//----------------- CONSTRUTOR ---------------------------

    public BootCamp(String nome, String descricao, Set<Conteudo> contudosBootCamp) {
        this.nome = nome;
        this.descricao = descricao;
        this.contudosBootCamp = contudosBootCamp;
    }


//----------------- GETTERS/SETTERS -----------------------

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public Set<Dev> getDevsParticipantes() {
        return devsParticipantes;
    }

    public void setDevsParticipantes(Set<Dev> devsParticipantes) {
        this.devsParticipantes = devsParticipantes;
    }

    public Set<Conteudo> getContudosBootCamp() {
        return contudosBootCamp;
    }

    public void setContudosBootCamp(Set<Conteudo> contudosBootCamp) {
        this.contudosBootCamp = contudosBootCamp;
    }


//----------------- EQUALS/HASHCODE -----------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(inicio, bootCamp.inicio) && Objects.equals(fim, bootCamp.fim) && Objects.equals(devsParticipantes, bootCamp.devsParticipantes) && Objects.equals(contudosBootCamp, bootCamp.contudosBootCamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inicio, fim, devsParticipantes, contudosBootCamp);
    }

}
