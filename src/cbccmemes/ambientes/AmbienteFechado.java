/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.ambientes;

import java.util.ArrayList;

/**
 *
 * @author 201604940039
 */
public class AmbienteFechado extends Ambiente{

    public AmbienteFechado(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
    }

    @Override
    public void operacao(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Ambiente> getDestinos() {
        return null;
    }

    @Override
    public Ambiente getDestino(String nome) {
        return null;
    }
    
}
