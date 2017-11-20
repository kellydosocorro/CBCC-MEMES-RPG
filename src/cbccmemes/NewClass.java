/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes;

import javax.swing.JFrame;

/**
 *
 * @author Kelly
 */
public class NewClass {
    public static void main(String[] args) {
        JFrame t1 = new JFrame();
        JPanelImage t = new JPanelImage("C:\\Users\\201604940040\\Desktop\\GitHub\\CBCC-MEMES-RPG\\src\\cbccmemes\\imagens\\mapa_prov.jpg", 1200, 769);
        
        t1.add(t);
        t1.setVisible(true);
    }
}
