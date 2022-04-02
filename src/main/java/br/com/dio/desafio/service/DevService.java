package br.com.dio.desafio.service;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

import java.util.Iterator;
import java.util.Optional;

public class DevService {

    public void inscreverBootcamp(Bootcamp bootcamp, Dev dev){
        dev.getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(dev);
    }

    public void progredir(Dev dev) {
        Optional<Conteudo> conteudo = dev.getConteudosInscritos().stream().findFirst();
        if(conteudo.isPresent()) {
            dev.getConteudosConcluidos().add(conteudo.get());
            dev.getConteudosInscritos().remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(Dev dev) {
        Iterator<Conteudo> iterator = dev.getConteudosConcluidos().iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }
}
