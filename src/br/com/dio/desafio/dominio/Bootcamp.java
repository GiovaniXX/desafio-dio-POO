package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate data_Inicial = LocalDate.now();
    private final LocalDate data_Final = data_Inicial.plusDays(45);
    private Set<Dev> devs_Inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_Inicial() {
        return data_Inicial;
    }

    public LocalDate getData_Final() {
        return data_Final;
    }

    public Set<Dev> getDevs_Inscritos() {
        return devs_Inscritos;
    }

    public void setDevs_Inscritos(Set<Dev> devs_Inscritos) {
        this.devs_Inscritos = devs_Inscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(data_Inicial, bootcamp.data_Inicial) && Objects.equals(data_Final, bootcamp.data_Final) && Objects.equals(devs_Inscritos, bootcamp.devs_Inscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, data_Inicial, data_Final, devs_Inscritos, conteudos);
    }
}
