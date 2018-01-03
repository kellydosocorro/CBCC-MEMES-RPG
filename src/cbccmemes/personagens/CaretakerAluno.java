package cbccmemes.personagens;
import java.util.ArrayList;
/**
 *
 * @author Kelly
 */
public class CaretakerAluno {
    
    /**
     * Padrão de Projeto Memento: arraylist que salva os estados anteriores do Aluno.
     */
    protected ArrayList<AlunoMemento> estados;
    
    public CaretakerAluno() {
        estados = new ArrayList<>();
    }
 
    public void novoMemento(AlunoMemento memento) {
        estados.add(memento);
    }
 
    public AlunoMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new AlunoMemento(0);
        }
        AlunoMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
    
}
