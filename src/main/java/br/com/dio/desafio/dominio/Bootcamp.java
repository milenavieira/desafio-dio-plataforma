package br.com.dio.desafio.dominio;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Builder
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;
}
