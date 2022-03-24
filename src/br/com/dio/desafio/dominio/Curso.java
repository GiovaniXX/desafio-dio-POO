package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int carga_Horaria;

    public Curso() {
    }

    public int getCarga_Horaria() {
        return carga_Horaria;
    }

    public void setCarga_Horaria(int carga_Horaria) {
        this.carga_Horaria = carga_Horaria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carga_Horaria=" + carga_Horaria +
                '}';
    }

    @Override
    public double calcular_XP() {
        return XP_PADRAO * carga_Horaria;
    }
}
