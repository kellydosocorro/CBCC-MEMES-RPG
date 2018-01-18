package cbccmemes;

import cbccmemes.ambientes.Ambiente;
import cbccmemes.ambientes.AmbienteAberto;
import cbccmemes.ambientes.AmbientePredio;
import cbccmemes.ambientes.AmbienteSala;
import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import cbccmemes.mochila.Item_Ataque;
import cbccmemes.mochila.Item_Defesa;
import cbccmemes.mochila.Item_Vida;
import cbccmemes.personagens.Aluno;
import cbccmemes.personagens.Professor;
import cbccmemes.telas.AmbienteDeCombate;
import cbccmemes.telas.TelaAmbientes;
import cbccmemes.telas.TelaPrincipal;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Kelly
 * Classe principal
 */
public class Main {    
    public static void main(String[] args) {
        Main m = new Main();
        
        ArrayList<Arma> armas_jogo = m.addArmasDeJogo();
        ArrayList<Item> itens_jogo = m.addItensJogo();
        Ambiente mapa_ufpa = m.addAmbientes();
        
        Aluno user = new Aluno("User1", "", 1, 1000, 150, 50, 20, new Item_Ataque("Teste Item", 150), new Arma("Teste Arma", 200), 1000);
        
        user.setImagem(new ImageIcon(m.getClass().getResource("/cbccmemes/imagens/icones/1.jpg")));
        user.addArmaMochila(new Arma("Arma Mochila 1", 0));
        user.addItemMochila(new Item_Ataque("Item de Ataque1", 150));
        
        user.addArmaMochila(new Arma("Arma Mochila 2", 0));
        user.addItemMochila(new Item_Ataque("Item de Ataque2", 150));
        //System.out.println(Arrays.toString(user.getNomesArmas()));
        //System.out.println(Arrays.toString(user.getNomesItens()));
        
        TelaPrincipal tela = new TelaPrincipal(user,itens_jogo, armas_jogo);
        
        tela.setUser(user);
        
        TelaAmbientes mapa = new TelaAmbientes(new JFrame(), mapa_ufpa);
        tela.setMapa(mapa);
                
        tela.setVisible(true);
        
        AmbienteDeCombate ab = new AmbienteDeCombate(tela, user, new Professor("Gustavo", 1, 1000, 200, 200, 100, null, null, 150));
        ab.setVisible(true);
    }
    
    public ArrayList<Arma> addArmasDeJogo(){
        ArrayList<Arma> armas_jogo = new ArrayList<>();
        //Armas Comuns
        armas_jogo.add(new Arma("TCC", 500));
        armas_jogo.add(new Arma("Livro", 300));
        armas_jogo.add(new Arma("Caderno", 100));
        armas_jogo.add(new Arma("Celular tocando", 200));
        armas_jogo.add(new Arma("Catuaba", 400, 2));
        //Armas de Biologia
        armas_jogo.add(new Arma("Bisturi", 150,"Biológicas"));
        armas_jogo.add(new Arma("Vírus", 350,"Biológicas"));
        armas_jogo.add(new Arma("Injeção", 250,"Biológicas"));
        //Armas de Exatas
        armas_jogo.add(new Arma("Calculadora", 150, "Exatas"));
        armas_jogo.add(new Arma("PC", 250, "Exatas"));
        armas_jogo.add(new Arma("Hacker", 350, "Exatas"));
        //Armas de Humanas
        armas_jogo.add(new Arma("Miçangas", 150,"Humanas"));
        armas_jogo.add(new Arma("Xerox", 250,"Humanas"));
        armas_jogo.add(new Arma("Ocupação", 350,"Humanas"));
        
        return armas_jogo;
    }
        
    public ArrayList<Item> addItensJogo(){
        ArrayList<Item> itens_jogo = new ArrayList<>();
        //Itens comuns de ataque
                                    // Nome, Poder de ação
        itens_jogo.add(new Item_Ataque("Xerox", 200));
        itens_jogo.add(new Item_Ataque("Caderno", 150));
        itens_jogo.add(new Item_Ataque("Caneta", 250));
        
                                    // Nome, Classe, Poder, Nível, Dinheiro necessario
        itens_jogo.add(new Item_Ataque("Régua", "Exatas", 400, 0, 0));
        itens_jogo.add(new Item_Ataque("Apostila", "Humanas", 400 , 0, 0));
        itens_jogo.add(new Item_Ataque("Constituição", "Jurídicas", 400 , 0, 0));
        itens_jogo.add(new Item_Ataque("Seringa", "Biológicas", 400 , 0, 0));
        
        //Itens comuns de defesa
                                    // Nome, Poder de ação
        itens_jogo.add(new Item_Defesa("Livro", 100));
        itens_jogo.add(new Item_Defesa("Exercícios feitos", 150));
        itens_jogo.add(new Item_Defesa("Artigo", 350));
        
                            // Vida, Poder de ação, Dinheiro, Nome
        // itens_jogo.add(new Item_Defesa(0, 100, 0, "Livro"));
        
        //Itens de vida
                                    // Valor, Nome, Nível
        itens_jogo.add(new Item_Vida(50, "Garrfa de Água", 0));
        itens_jogo.add(new Item_Vida(100, "Chop da BC", 1));
        itens_jogo.add(new Item_Vida(200, "Lanche do Ver-o-pesinho", 3));
        itens_jogo.add(new Item_Vida(300, "Bandejão do RU", 4));
        
        return itens_jogo;
    }
    
    public Ambiente addAmbientes(){
        
        // nome, nivel, vida, ataque, defesa, velocidade, item_batalha, arma_batalha, dinheiro
        Professor Josivaldo = new Professor("Josivaldo", 3, 20000, 8000, 5700, 60, null, null, 100000);
        Professor professor = new Professor("Adversario", 0, 10000, 1000, 800, 40, null, null, 10000);
        
        // nome, classe, nivel, vida, ataque, defesa, velocidade, item, arma, dinheiro, atual
        Aluno Lucas = new Aluno("Lucas", "Exatas", 2, 8000, 400, 600, 20, null, null, 10000);
        Aluno aluno_bio = new Aluno("Adversario", "Biológicas", 1, 5000, 400, 200, 10, null, null, 5000);
        Aluno aluno_exatas = new Aluno("Adversario", "Exatas", 1, 7000, 300, 400, 10, null, null, 4000);
        
        Ambiente ufpa = new AmbienteAberto("UFPA", "Cidade Universitária Prof.José da Silveira Netto", 0);
        
        
        AmbienteAberto campus1 = new AmbienteAberto("Básico", "Campus Setor 1", 0);
        AmbientePredio icb = new AmbientePredio("ICB","Instituto de Ciências Biológicas", 3);
            icb.addOponente(professor);
            
            AmbienteSala biomed = new AmbienteSala("Biomedicina", "Faculdade de Biomedicina", 0);
            biomed.addOponente(aluno_bio);
                
            AmbienteSala biotec = new AmbienteSala("Biotecnologia", "Faculdade de Biotecnologia", 0);
            biotec.addOponente(aluno_bio);
        
        icb.addDestino(biomed);
        icb.addDestino(biotec);   
        
        AmbientePredio icen = new AmbientePredio("ICEN","Instituto de Ciências Exatas e Naturais", 0);
            AmbienteSala auditorio_icen = new AmbienteSala("Auditório","Auditório Icen", 0);
            auditorio_icen.addOponente(professor);
            
            AmbienteSala cacc = new AmbienteSala("CACC","Centro Acadêmico de Ciência da Computação", 0);
            cacc.addOponente(Lucas);
            
            AmbienteSala casi = new AmbienteSala("CASI","Centro Acadêmico de Sistemas de Informação", 0);
            casi.addOponente(aluno_exatas);
            
            AmbienteSala diretoria_facomp = new AmbienteSala("Diretoria FACOMP", "", 0);
            diretoria_facomp.addOponente(Josivaldo);
            
            AmbienteSala diretoria_famat = new AmbienteSala("Diretoria FAMAT", "", 0);
            diretoria_famat.addOponente(professor);
            
            icen.addDestino(auditorio_icen);
        icen.addDestino(cacc);
        icen.addDestino(casi);
        icen.addDestino(diretoria_facomp);
        icen.addDestino(diretoria_famat);
        
        AmbientePredio mirante = new AmbientePredio("Mirante", "Mirante do Rio", 1);
            for (int i=0; i<4; i++){
                mirante.addDestino(new AmbientePredio("Andar "+(i+1),"Salas de "+(i+1)+"00-"+(i+1)+"16", i+1));
                for (int j=0; j<5; j++)
                    if (j<9)
                        mirante.getDestinos().get(i).addDestino(new AmbienteSala("Sala "+(i+1)+"0"+(j+1),"Sala de Aula", i));
                    else
                        mirante.getDestinos().get(i).addDestino(new AmbienteSala("Sala "+(i+1)+""+(j+1),"Sala de Aula", i));
            }
        campus1.addDestino(mirante);
        campus1.addDestino(icb);
        campus1.addDestino(icen);
        
        AmbienteAberto campus2 = new AmbienteAberto("Profissional", "Campus Setor 2", 2);
        AmbienteAberto campus3 = new AmbienteAberto("Saúde", "Campus Setor 3", 3);
        
        ufpa.addDestino(campus1);
        ufpa.addDestino(campus2);
        ufpa.addDestino(campus3);
        
        return ufpa;
    }
    
}
