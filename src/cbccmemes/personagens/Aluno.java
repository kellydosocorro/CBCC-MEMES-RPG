package cbccmemes.personagens;

import cbccmemes.telas.DescricaoPersonagem;
import cbccmemes.telas.TelaPrincipal;
import cbccmemes.ambientes.Ambiente;
import cbccmemes.mochila.*;
import java.util.ArrayList;

public class Aluno extends Personagem {

    public static final int NIVEL_MAXIMO = 8;
    private static final String classes_personagem[] = {"Biológicas", "Exatas", "Humanas"};

    public double dinheiro;
    private ArrayList<Item> itens = new ArrayList<>(getLIMITE_MOCHILA());
    private ArrayList<Arma> armas = new ArrayList<>(getLIMITE_MOCHILA());
    private int barra_experiencia;
    private String classe_aluno;
    private Ambiente ambiente_atual;

    public Aluno(String nome, String classe_aluno, int nivel, int vida, int ataque, int defesa, int velocidade, Item item_batalha, Arma arma_batalha, double dinheiro, Ambiente atual) {
        super(nome, nivel, vida, ataque, defesa, velocidade, item_batalha, arma_batalha, dinheiro);
        this.barra_experiencia = 0;
        this.classe_aluno = classe_aluno;
        this.dinheiro = 10000;
        this.ambiente_atual = atual;
    }
    
    public Aluno() {
        this("", "Biológicas", 1, 1000, 150, 150, 150, null, null, 10000, null);
        this.barra_experiencia = 0;
    }

    public void procurarItem(Ambiente ambiente) {
        
    }

    public static String[] getClasses_personagem() {
        return classes_personagem;
    }

    public String getClasse_aluno() {
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

    public void setArmaMochila(Arma arma, int indice){
        if (!this.getArmas().isEmpty())
            this.getArmas().remove(indice);
        
        this.getArmas().add(indice, arma);
    }

    public static Arma[] getArmasDisponiveis(String classe, Arma armas[]) {
        if ( armas == null ) {
            Arma vazia[] = {};
            return vazia;
        } else {
            int indices[] = new int[armas.length];

            int cont_aux = 0;
            for (int i = 0; i < armas.length; i++) {
                if (armas[i].armaPertenceClasse(classe)) {
                    indices[cont_aux] = i;
                    cont_aux++;
                }
            }
            Arma aux[] = new Arma[cont_aux];
            for (int i = 0; i < cont_aux; i++) {
                aux[i] = armas[indices[i]];
            }
            return aux;
        }
    }

    public static Arma[] getArmasDisponiveis(int nivel, Arma armas[]) {
        if ( armas != null && nivel > 0 && nivel <= NIVEL_MAXIMO) {
            //Vetor para armazenar indices das armas que serão compatíveis
            int indices[] = new int[armas.length];

            int cont_aux = 0;
            for (int i = 0; i < armas.length; i++) {
                if (nivel >= armas[i].getNivel_minimo()) {
                    indices[cont_aux] = i;
                    cont_aux++;
                }
            }
            Arma aux[] = new Arma[cont_aux];
            for (int i = 0; i < cont_aux; i++) {
                aux[i] = armas[indices[i]];
            }
            return aux;
        } else {
            Arma vazia[] = {};
            return vazia;
        }
    }

    public static Arma[] getArmasDisponiveis(int nivel, String classe, Arma armas[]) {
        if (armas != null && nivel > 0 && nivel <= NIVEL_MAXIMO) {
            //Vetor para armazenar indices das armas que serão compatíveis
            int indices[] = new int[armas.length];

            int cont_aux = 0;
            for (int i = 0; i < armas.length; i++) {
                if (nivel >= armas[i].getNivel_minimo() && armas[i].armaPertenceClasse(classe)) {
                    indices[cont_aux] = i;
                    cont_aux++;
                }
            }
            Arma aux[] = new Arma[cont_aux];
            for (int i = 0; i < cont_aux; i++) {
                aux[i] = armas[indices[i]];
            }
            return aux;
        } else {
            Arma vazia[] = {};
            return vazia;
        }
    }

    public String[] getNomesArmas() {
        try {
            String str[] = new String[this.getArmas().size()];
            int i = 0 ;
            for ( Arma aux: this.getArmas()){
                str[i] = aux.getNome();
            }
            return str;
        } catch (Exception e) {
            return null;
        }
    }
    
    public String[] getNomesItens() {
        try {
            String str[] = new String[this.getArmas().size()];
            int i = 0 ;
            this.getItens().forEach((aux) -> {
                str[i] = aux.getNome();
            });
            return str;
        } catch (Exception e) {
            return null;
        }
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    @Override
    public void atacar(Personagem adversario) {
        if (adversario.getItem_equipado() != null){
            
        }else{
            int vida_adv = adversario.getVida();
            int defesa_adv = adversario.getDefesa();
            int ataque_user = this.getAtaque();
            
            if ( defesa_adv < ataque_user)
                if(vida_adv >= 0) {
                    vida_adv -= ataque_user - defesa_adv;
                }
            adversario.setVida(vida_adv);
        }
    }

    @Override
    public void descricaoPerosnagem(java.awt.Frame parent) {
        DescricaoPersonagem tela = new DescricaoPersonagem(parent, true);
        tela.setDados(this);
        tela.setVisible(true);
    }
}
