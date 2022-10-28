import bt.edu.desafio.Conteudo;
import bt.edu.desafio.Curso;
import bt.edu.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso de Java");
        curso.setCargaHoraria(22);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("Descrição do curso de JavaScript");
        curso1.setCargaHoraria(22);

        System.out.println(curso);
        System.out.println(curso1);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria JavaScript");
        mentoria.setDescricao("Mentoria do curso de JavaScript");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        //exemplo de polimorfismo
        Conteudo conteudo = new Curso();

    }
}
