package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudos_Inscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudos_Concluidos = new LinkedHashSet<>();

    public void inscrever_Bootcamp(Bootcamp bootcamp) {
        this.conteudos_Inscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs_Inscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudos_Inscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudos_Concluidos.add(conteudo.get());
            this.conteudos_Inscritos.remove(conteudo.get());
        } else {
            System.err.println("Voçê não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcular_Total_XP() {
        return this.conteudos_Concluidos.stream().mapToDouble(Conteudo::calcular_XP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudos_Inscritos() {
        return conteudos_Inscritos;
    }

    public void setConteudos_Inscritos(Set<Conteudo> conteudos_Inscritos) {
        this.conteudos_Inscritos = conteudos_Inscritos;
    }

    public Set<Conteudo> getConteudos_Concluidos() {
        return conteudos_Concluidos;
    }

    public void setConteudos_Concluidos(Set<Conteudo> conteudos_Concluidos) {
        this.conteudos_Concluidos = conteudos_Concluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudos_Inscritos, dev.conteudos_Inscritos) && Objects.equals(conteudos_Concluidos, dev.conteudos_Concluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudos_Inscritos, conteudos_Concluidos);
    }
}
