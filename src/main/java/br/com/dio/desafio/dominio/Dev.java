package br.com.dio.desafio.dominio;

import lombok.*;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;
}
