
package cbccmemes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImage extends JPanel{
   ImageIcon fundo;

    public JPanelImage(String urlImage, int width, int height) {
        //this.fundo = new ImageIcon(getClass().getResource(urlImage));
        this.fundo = new ImageIcon(urlImage);
        this.setSize(width, height);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g.create();
	g2d.drawImage(fundo.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	g2d.dispose();
    }
    
}
