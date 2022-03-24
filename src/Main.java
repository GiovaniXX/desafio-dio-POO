import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCarga_Horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCarga_Horaria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev_Giovani = new Dev();
        dev_Giovani.setNome("Giovani");
        dev_Giovani.inscrever_Bootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovani" + dev_Giovani.getConteudos_Inscritos());
        dev_Giovani.progredir();
        System.out.println("Conteúdos Concluídos Giovani" + dev_Giovani.getConteudos_Concluidos());
        System.out.println("XP:" + dev_Giovani.calcular_Total_XP());

        Dev dev_Giovanni = new Dev();
        dev_Giovanni.setNome("Giovanni");
        dev_Giovanni.inscrever_Bootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovanni" + dev_Giovanni.getConteudos_Inscritos());
        dev_Giovanni.progredir();
        System.out.println("Conteúdos Concluídos Giovanni" + dev_Giovani.getConteudos_Concluidos());
        System.out.println("XP:" + dev_Giovanni.calcular_Total_XP());
    }
}
