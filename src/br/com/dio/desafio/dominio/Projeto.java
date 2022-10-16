package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
    @Override
    public double calcularXp() { return XP_PADRAO + 40d;
    }

    public Projeto() {
    }

    @Override
    public String toString() {
        return "Projetos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'';
    }
}
