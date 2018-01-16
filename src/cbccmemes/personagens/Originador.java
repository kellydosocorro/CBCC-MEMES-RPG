/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.personagens;
/**
 *
 * @author 201604940040
 */
public class Originador {
    
    CaretakerAluno caretaker;
    protected Aluno jogador1;
    
    public Originador(){
        caretaker = new CaretakerAluno();
        jogador1 = new Aluno();
    }
    
     /* Regressa ao estado anterior de aluno */
    public void voltarAluno(){
        jogador1 = caretaker.getUltimoEstadoSalvo().getSaveAluno();
    }
    
    public void novoAluno(Aluno player1){
        caretaker.novoMemento(new AlunoMemento(jogador1));
    }
    
}
