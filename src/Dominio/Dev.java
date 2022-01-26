package Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos= new LinkedHashSet<>();
    private Set<Conteudo> conteudosFianlizados = new LinkedHashSet<>();


//----------------- METODOS ---------------------------

    public void inscreverBootCamp(BootCamp bootCamp){
        this.conteudosInscritos.addAll(bootCamp.getContudosBootCamp()); //Adiciona o bootcamp a lista de conteudos incritos
        bootCamp.getDevsParticipantes().add(this); //Adiciona o dev a lista do bootcamp
    }

    public void imprimeInfoDev(){
        System.out.println("Nome: " + this.nome); //Imprime o nome do dev
        System.out.println("XP: " + calcularXp()); //Imprime o xp acumulado
        System.out.println("\nConteudos inscritos:"); //Imprime todos os conteudos aos quais o dev está inscrito
        for (Conteudo conteudo: conteudosInscritos) System.out.println(conteudo.getTitulo());
        System.out.println("\nConteudos finalizados"); //Imprime todos os conteudos que o dev ja terminou
        for (Conteudo conteudo: conteudosFianlizados) System.out.println(conteudo.getTitulo());

    }

    public void encerraBootCamp(BootCamp bootCamp){
        bootCamp.removeDev(this); //Remove o dev do bootcamp
        for (Conteudo conteudo: bootCamp.getContudosBootCamp()){ //Para cada conteudo dentro do bootcamp os remove e passa ppara conteudo concluido
            if(!conteudosFianlizados.contains(conteudo))conteudosFianlizados.add(conteudo); //Se ele ja não havia completado o curso previamente adiona a conteudo concluido
            conteudosInscritos.remove(conteudo); //Remove o conteudo da lista.
        }
    }

    public void progredirConteudo(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); //Pega o primeoro conteudo do set
        if(conteudo.isPresent()){
            this.conteudosFianlizados.add(conteudo.get()); //Adiciona a conteudos finalizados
            this.conteudosInscritos.remove(conteudo.get()); //Remove dos conteudos inscritos
        } else System.err.println("Você não esta matriculado em nenhum conteudo");
    }

    public double calcularXp(){
        return this.conteudosFianlizados.stream().mapToDouble(Conteudo::calculoXp).sum();
    }

    public void removeBootCamp(BootCamp bootCamp) { //Metodo auxiliar para encerraBootCamp da classe BootCamp
        for (Conteudo conteudo : bootCamp.getContudosBootCamp()) conteudosInscritos.remove(conteudo);
    }
//----------------- CONSTRUTOR ---------------------------
    public Dev(String nome) {
        this.nome = nome;
    }


//----------------- GETTERS/SETTERS -----------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getconteudosInscritos() {
        return conteudosInscritos;
    }

    public void setconteudosInscritos(Set<Conteudo> incritos) {
        this.conteudosInscritos = incritos;
    }

    public Set<Conteudo> getConteudosFianlizados() {
        return conteudosFianlizados;
    }

    public void setConteudosFianlizados(Set<Conteudo> conteudosFianlizados) {
        this.conteudosFianlizados = conteudosFianlizados;
    }

//----------------- EQUALS/HASHCODE -----------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosFianlizados, dev.conteudosFianlizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosFianlizados);
    }


}
