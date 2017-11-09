/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.personagens;

import cbccmemes.TelaPrincipal;
import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.*;

/**
 *
 * @author 201604940039
 */
public class Aluno extends Personagem{
    private static final int NIVEL_MAXIMO = 8;
    private static final String nomes_alunos[] = {"Lucas","Ian","José","Jairo","Kelly"};
    private static final String classes_personagem[] = {"Biológicas","Exatas","Humanas"};
    
    private Item itens[] = new Item[getLIMITE_MOCHILA()];
    private Arma armas[] = new Arma[getLIMITE_MOCHILA()];
    private int barra_experiencia;
    private String classe_aluno;

    public Aluno(String nome, int nivel, int ataque, int defesa, String classe_aluno, Ambiente ambiente) {
        super(nome, nivel, ataque, defesa, ambiente);
        this.barra_experiencia = 0;
        this.classe_aluno = classe_aluno;
    }
    
    public void procurarItem(){
        getAmbiente().getClass().getName();
    }

    public static String[] getClasses_personagem() {
        return classes_personagem;
    }

    public int getBarra_experiencia() {
        return barra_experiencia;
    }

    public void setBarra_experiencia(int barra_experiencia) {
        this.barra_experiencia += barra_experiencia;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public String getClasse_aluno() {
        return classe_aluno;
    }
    
    public static String[] getArmasDisponiveis(String classe, Arma armas[]){
        if ( TelaPrincipal.isEmpty(armas) ){
            String teste[] = {"Teste"};
            return teste;
        }
        else{
            int indices[] = new int[armas.length];
            
            int cont_aux = 0;
            for (int i=0; i<armas.length; i++) {
                if (Arma.armaPertenceClasse(armas[i], classe)){
                    //aux[cont_aux] = arma.getNome();
                    indices[cont_aux] = i;
                    cont_aux++;
                }
            }
            String aux[] = new String[cont_aux];
            for ( int i=0; i<cont_aux; i++ )
                aux[i] = armas[indices[i]].getNome();
                
            return aux;
        }
    }
}
