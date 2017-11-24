package cbccmemes.extencoes;

import javax.swing.JFrame;

/**
 *
 * @author Kelly
 * Classe principal para fins de Teste das Extenções
 */
public class NewClass {
    public static void main(String[] args) {
        JFrame t1 = new JFrame();
        
        t1.add(new NewClass().getJPanelImage());
        t1.setSize(1200, 769);
        t1.setVisible(true);
    }
    
    /**
     * Função para retorno de um JPanelImage
     */
    public JPanelImage getJPanelImage(){
        JPanelImage t = new JPanelImage("/cbccmemes/imagens/fachada.JPG");
        
        return t;
    }
        
}
