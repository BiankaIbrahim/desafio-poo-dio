import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso Python");
        curso3.setDescricao("descrição curso Python");
        curso3.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Projeto projetoJava = new Projeto();
        projetoJava.setTitulo("Projeto OOP com java");
        projetoJava.setDescricao("Descrição projeto OOP e seus pilares");

        Projeto projetoPython = new Projeto();
        projetoPython.setTitulo("Projeto OOP com Python");
        projetoPython.setDescricao("Descrição projeto OOP e seus pilares");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projetoJava);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Python Developer");
        bootcamp2.setDescricao("Descrição Bootcamp Python Developer");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(projetoPython);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Cavalcante");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("Total de XP:" + devCamila.calcularTotalXp());
        System.out.println(devCamila.gerarCertificado(bootcamp));
        devCamila.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

        System.out.println("\n-----\n");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao Oliveira");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("Total de XP:" + devJoao.calcularTotalXp());
    }

}
