package cbccmemes.ambientes;

import cbccmemes.mochila.Arma;
import cbccmemes.mochila.Item;
import java.util.ArrayList;

/**
 * Ambiente voltado para comercialização de armas e itens.
 * @author 201604940039
 */
public class AmbienteComercio extends Ambiente{
    private final ArrayList<Item> itens;
    private final ArrayList<Arma> armas;

    public AmbienteComercio(String nome, String descricao, int nivelMinimo, ArrayList<Arma> armas, ArrayList<Item> itens) {
        super(nome, descricao, nivelMinimo);
        this.armas = armas;
        this.itens = itens;
        super.setOperacoes(new String[]{LISTAR_ITENS,COMPRAR_ITEM});
    }

    @Override
    public void operacao(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
