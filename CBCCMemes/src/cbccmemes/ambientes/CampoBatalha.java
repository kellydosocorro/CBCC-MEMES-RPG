/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.ambientes;

import cbccmemes.personagens.Aluno;
import cbccmemes.personagens.Personagem;

/**
 *
 * @author hundson
 */
public class CampoBatalha extends Ambiente{
    Aluno adversarios[];
    public CampoBatalha(String nome, int nivel_minimo, Personagem personagem, Ambiente anterior) {
        super(nome, nivel_minimo, personagem, anterior);
    }
    
}
