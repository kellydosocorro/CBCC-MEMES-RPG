package cbccmemes.ambientes;


/**
 * Ambiente voltado para salas e predios fechados sem saída.
 * @author 201604940039
 */
public class AmbientePredio extends AmbienteAberto{
    
    public AmbientePredio(String nome, String descricao, int nivelMinimo) {
        super(nome, descricao, nivelMinimo);
        super.setOperacoes(new String[]{BATALHAR,LISTAR_OPONENTES,VOLTAR,PRINT_MAPA,LISTAR_AMBIENTES,MUDAR_AMBIENTE});
    }    
}
