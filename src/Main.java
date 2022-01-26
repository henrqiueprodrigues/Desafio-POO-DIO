import Dominio.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Cria os devs
        Dev dev1= new Dev("João");
        Dev dev2= new Dev("Maria");
        Dev dev3= new Dev("Antonio");
        Dev dev4= new Dev("Joaquina");

        //Cria os cursos dentro de um LinkedHashset
        Set<Conteudo> conteudo= new LinkedHashSet<>(){{
            add(new Curso("Java","Curso introdutorio de java",20));
            add(new Curso("C#","Curso introdutorio de C#",30));
            add(new Curso("JavaScript","Curso introdutorio de javaScript",15));
            add(new Curso("Python","Curso introdutorio Python",10));}};

        //Cria uma mentoria
        Conteudo mentoria= new Mentoria("Ajudando a iniciantes",
                "Uma breve live para ajudar quem está começando no mundo da programação", LocalDate.now());
        conteudo.add(mentoria); //Adiciona a mentoria ao conteudo

        //Cria um bootcamp
        BootCamp bootCamp = new BootCamp("Começando a progrmar",
                "Uma coletania de cursos introdutorios de diversas linguagens",conteudo);


        dev1.inscreverBootCamp(bootCamp);
        dev2.inscreverBootCamp(bootCamp);
        dev3.inscreverBootCamp(bootCamp);
        dev4.inscreverBootCamp(bootCamp);
        dev1.encerraBootCamp(bootCamp);
        System.out.println("Informações bootcamp: ");
        bootCamp.imprimeInfoBootCamp();
        System.out.println("\nInformações dev:");
        dev1.imprimeInfoDev();
        System.out.println("\nInformações dev:");
        dev2.imprimeInfoDev();

    }
}
