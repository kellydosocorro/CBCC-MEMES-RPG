package cbccmemes.ambientes;

import cbccmemes.personagens.Personagem;

public abstract class Ambiente {
    private final String nome;
    private int nivel_minimo;
    private Personagem personagem;
    private Ambiente anterior;

    public Ambiente(String nome, int nivel_minimo, Personagem personagem, Ambiente anterior) {
        this.nome = nome;
        this.nivel_minimo = nivel_minimo;
        this.personagem = personagem;
        this.anterior = anterior;
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
    
    public Personagem getPersonagem(){
        return personagem;
    }
}
