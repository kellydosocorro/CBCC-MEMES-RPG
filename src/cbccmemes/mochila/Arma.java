package cbccmemes.mochila;

import cbccmemes.TelaPrincipal;

public class Arma {
    private final String nome;
    private int poder_ataque;
    private String classe_associada;
    private int nivel_minimo;

    public Arma(String nome, int poder_ataque, String classe_associada, int nivel_minimo) {
        this.nome = nome;
        this.poder_ataque = poder_ataque;
        this.classe_associada = classe_associada;
        this.nivel_minimo = nivel_minimo;
    }
    
    public Arma(String nome, int poder_ataque, int nivel_minimo) {
        this(nome, poder_ataque, null, nivel_minimo);
    }

    public Arma(String nome, int poder_ataque, String classe_associada) {
        this(nome, poder_ataque, classe_associada, 0);
    }

    public Arma(String nome, int poder_ataque) {
        this(nome, poder_ataque, null, 0);
    }
    
    public String getNome() {
        return nome;
    }

    public int getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(int poder_ataque) {
        this.poder_ataque = poder_ataque;
    }

    public String getClasse_associada() {
        return classe_associada;
    }

    public int getNivel_minimo() {
        return nivel_minimo;
    }
    
    public static boolean armaPertenceClasse(Arma arm, String classe){
        String aux = arm.getClasse_associada();
        
        if ( TelaPrincipal.isEmpty(aux) )
            return true;
        
        return (!TelaPrincipal.isEmpty(aux) && !TelaPrincipal.isEmpty(classe) && classe.equals(aux));
    }
}
