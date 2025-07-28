import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("desc java");
        curso1.setCargaHoraria(10);

        System.out.println(curso1);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Uma descricao");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev jao = new Dev();
        jao.setNome("jao");
        jao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jao:" + jao.getConteudosInscritos());
        jao.progredir();
        System.out.println("Conteudos Inscritos jao" + jao.getConteudosInscritos());
        System.out.println("Conteudos Cconcluidos de Jao: " + jao.getConteudosConcluidos());
        System.out.println("XP: " + jao.calcularTotalXP());
    }
}