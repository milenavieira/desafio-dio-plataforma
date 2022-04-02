import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.service.DevService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DevService service = new DevService();

        Curso curso1 = Curso.builder().build();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = Curso.builder().build();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = Mentoria.builder().build();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = Bootcamp.builder().build();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        service.inscreverBootcamp(bootcamp, devCamila);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        service.progredir(devCamila);
        service.progredir(devCamila);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + service.calcularTotalXp(devCamila));

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        service.inscreverBootcamp(bootcamp, devJoao);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        service.progredir(devJoao);
        service.progredir(devJoao);
        service.progredir(devJoao);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + service.calcularTotalXp(devJoao));

    }

}
