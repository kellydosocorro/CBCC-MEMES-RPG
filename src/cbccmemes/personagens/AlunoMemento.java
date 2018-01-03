package cbccmemes.personagens;
/**
 *
 * @author Kelly
 */
public class AlunoMemento {
    
    protected Aluno estadoAluno;

    public AlunoMemento(Aluno personagem) {
       estadoAluno = personagem;       
    }
    
    public AlunoMemento(int n){
        estadoAluno = null;
    }
    
    public Aluno getSaveAluno(){
        return estadoAluno;
    }
    
}
