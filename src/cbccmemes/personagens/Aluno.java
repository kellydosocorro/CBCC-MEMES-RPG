package cbccmemes.personagens;

import cbccmemes.TelaPrincipal;
import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.*;

public class Aluno extends Personagem{
    private static final int NIVEL_MAXIMO = 8;
    private static final String nomes_alunos[] = {"Lucas","Ian","José","Jairo","Kelly"};
    private static final String classes_personagem[] = {"Biológicas","Exatas","Humanas"};
    
    private Item itens[] = new Item[getLIMITE_MOCHILA()];
    private Arma armas[] = new Arma[getLIMITE_MOCHILA()];
    private int barra_experiencia;
    private String classe_aluno;
    private Item item_equipado;

    public Aluno(String nome, String classe_aluno, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, Ambiente ambiente) {
        super(nome, nivel, vida, ataque, defesa, velocidade, item_batalha, arma_batalha, ambiente);
        this.barra_experiencia = 0;
        this.classe_aluno = classe_aluno;
    }
    
    public Aluno() {
        this("Aluno", "Classe_Aluno", 1, 1000, 150, 150, 150, null, null, null);
        this.barra_experiencia = 0;
    }

    public Item getItem_equipado() {
        return item_equipado;
    }

    public void setItem_equipado(Item item_equipado) {
        this.item_equipado = item_equipado;
    }
    
    public void procurarItem(){
        getAmbiente().getClass().getName();
    }

    public static String[] getClasses_personagem() {
        return classes_personagem;
    }
    
    public String getClasse_aluno(){
        return classe_aluno;
    }

    public void setClasse_aluno(String classe_aluno) {
        this.classe_aluno = classe_aluno;
    }

    public int getBarra_experiencia() {
        return barra_experiencia;
    }

    public void setBarra_experiencia(int barra_experiencia) {
        this.barra_experiencia = barra_experiencia;
    }

    public Arma[] getArmas() {
        return armas;
    }

    public void setArmas(Arma[] armas) {
        this.armas = armas;
    }
    
    public void setArmaMochila(int indice, Arma arma){
        if ( indice >= 0 && indice < getLIMITE_MOCHILA())
            this.getArmas()[indice] = arma;
    }
    
    public static Arma[] getArmasDisponiveis(String classe, Arma armas[]){
        if ( TelaPrincipal.isEmpty(armas) ){
            Arma teste[] = {};
            return teste;
        }
        else{
            int indices[] = new int[armas.length];
            
            int cont_aux = 0;
            for (int i=0; i<armas.length; i++) {
                if (Arma.armaPertenceClasse(armas[i], classe)){
                    indices[cont_aux] = i;
                    cont_aux++;
                }
            }
            Arma aux[] = new Arma[cont_aux];
            for ( int i=0; i<cont_aux; i++ ){
                aux[i] = armas[indices[i]];
            }
            return aux;
        }
    }
}
