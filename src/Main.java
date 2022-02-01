import br.com.di.desafio.dominio.Bootcamp;
import br.com.di.desafio.dominio.Curso;
import br.com.di.desafio.dominio.Dev;
import br.com.di.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("DEscrição metoria");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCGB = new Dev();
        devCGB.setNome("Cleilson");
        devCGB.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Cleilson: "+devCGB.getConteudosInscritos());
        devCGB.progredir();
        System.out.println("Conteudos inscritos Cleilson: "+devCGB.getConteudosInscritos());
        System.out.println("Conteudos inscritos Cleilson: "+devCGB.getConteudosConcluidos());
        System.out.println("XP: "+devCGB.calcularTotalXp());

        System.out.println("=========  ### ========");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Maria: "+devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteudos inscritos Maria: "+devMaria.getConteudosInscritos());
        System.out.println("Conteudos inscritos Maria: "+devMaria.getConteudosConcluidos());
        System.out.println("XP: "+devMaria.calcularTotalXp());



    }
}
