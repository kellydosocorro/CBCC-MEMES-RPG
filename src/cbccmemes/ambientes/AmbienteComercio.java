package cbccmemes.ambientes;

import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import cbccmemes.personagens.Aluno;
import java.util.ArrayList;

/**
 * Ambiente voltado para comercialização de armas e itens.
 * @author 201604940039
 */
public class AmbienteComercio extends Ambiente{
    private final ArrayList<Item> itens;
    private final ArrayList<Arma> armas;
   
    Aluno user = new Aluno();

    public AmbienteComercio(String nome, String descricao, int nivelMinimo, ArrayList<Arma> armas, ArrayList<Item> itens) {
        super(nome, descricao, nivelMinimo);
        this.armas = armas;
        this.itens = itens;
        super.setOperacoes(new String[]{LISTAR_ITENS,COMPRAR_ITEM});
    }
    
    public void compraItem(Aluno user, Item item){
        if(user.getNivel() >= item.getNivel_minimo()){    
            if(user.getDinheiro() >= item.preco){
                boolean r = user.verificaEspacoMochila();
                if(r == true){
                    user.setDinheiro(user.getDinheiro() - item.preco);
                    user.setNovoItem(item);
                }  
            }
        }
    }
    
    public void compraArma(Aluno user, Arma arma){
        if(user.getNivel() >= arma.getNivel_minimo()){    
            if(user.getDinheiro() >= arma.dinheiro){
                boolean r = user.verificaEspacoMochila();
                if(r == true){
                    user.setDinheiro(user.getDinheiro() - arma.dinheiro);
                    user.setNovaArma(arma);
                }  
            }
        }
    }
    
    public void venderItem(Aluno user, String nome_Item){
        //removeItem(pesquisaItem(nome_Item));
    }

    @Override
    public void operacao(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
