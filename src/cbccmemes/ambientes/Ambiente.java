package cbccmemes.ambientes;

import cbccmemes.personagens.Personagem;

public abstract class Ambiente {
    private final String nome;
    private int nivel_minimo;
    private Ambiente anterior = null;

    public Ambiente(String nome, int nivel_minimo) {
        this.nome = nome;
        this.nivel_minimo = nivel_minimo;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }

    public String getNome() {
        return nome;
    }

    public Ambiente getAnterior() {
        return anterior;
    }

    public void setAnterior(Ambiente anterior) {
        this.anterior = anterior;
    }
}
