/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.ambientes;

import cbccmemes.personagens.Personagem;
import java.util.ArrayList;

/**
 *
 * @author hundson
 */
public class AmbienteSala extends Ambiente{
    private final ArrayList<Personagem> oponentes;
    
    public AmbienteSala(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
        this.oponentes = new ArrayList<>();
        super.setOperacoes(new String[]{BATALHAR,LISTAR_OPONENTES,VOLTAR,PRINT_MAPA});
    }

    @Override
    public void addOponente(Personagem oponente) {
        oponentes.add(oponente);
    }

    @Override
    public void removeOponente(Personagem oponente) {
        oponentes.remove(oponente);
    }

    @Override
    public Personagem getOponente(String nome) {
        return buscaPersonagem(nome);
    }

    public ArrayList<Personagem> getOponentes() {
        return oponentes;
    }
    
    private Personagem buscaPersonagem(String nome){
        for ( Personagem pers: oponentes )
            if ( pers.getNome().equalsIgnoreCase(nome) )
                return pers;
        
        return null;
    }

    @Override
    public void operacao(String nome) {
        if (operacaoValid(nome) != null)
            System.out.println("Realiza Operação");
    }
    
    private String operacaoValid(String nome){
        for (String aux: getOperacoes())
            if (aux.equalsIgnoreCase(nome))
                return nome;
        return null;
    }
}
