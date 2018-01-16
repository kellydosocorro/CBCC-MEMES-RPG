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
import cbccmemes.telas.TelaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Kelly
 * Classe principal
 */
public class Main {
    private final ArrayList<Arma> armas_jogo;
    private final ArrayList<Item> itens_jogo;
    private Ambiente mapa_ufpa;
    private TelaPrincipal tela ;

    public Main() {
        this.armas_jogo = new ArrayList<>();
        this.itens_jogo = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Main my_class = new Main();
        my_class.addArmasDeJogo();
        my_class.mapa_ufpa = my_class.addAmbientes();
        
        //my_class.tela = new TelaPrincipal(my_class.itens_jogo, my_class.armas_jogo);
        //my_class.tela.setVisible(true);
    }
    
    public void addArmasDeJogo(){
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
    }
        
    public void addItensJogo(){
        
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
    }
    
    public Ambiente addAmbientes(){
        Ambiente ufpa = new AmbienteAberto("UFPA", "Cidade Universitária Prof.José da Silveira Netto", 0);
        
        AmbienteAberto campus1 = new AmbienteAberto("Básico", "Campus Setor 1", 0);
        AmbientePredio icb = new AmbientePredio("ICB","Instituto de Ciências Biológicas", 3);
            AmbienteSala biomed = new AmbienteSala("Biomedicina", "Faculdade de Biomedicina", 0);
            AmbienteSala biotec = new AmbienteSala("Biotecnologia", "Faculdade de Biotecnologia", 0);
        icb.addDestino(biomed);
        icb.addDestino(biotec);        
        AmbientePredio icen = new AmbientePredio("ICEN","Instituto de Ciências Exatas e Naturais", 0);
            AmbienteSala auditorio_icen = new AmbienteSala("Auditório","Auditório Icen", 0);
            AmbienteSala cacc = new AmbienteSala("CACC","Centro Acadêmico de Ciência da Computação", 0);
            AmbienteSala casi = new AmbienteSala("CASI","Centro Acadêmico de Sistemas de Informação", 0);
            AmbienteSala diretoria_facomp = new AmbienteSala("Diretoria FACOMP", "", 0);
            AmbienteSala diretoria_famat = new AmbienteSala("Diretoria FAMAT", "", 0);
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
