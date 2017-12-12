package cbccmemes.telas;

import cbccmemes.personagens.*;
import cbccmemes.mochila.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame{
    
    private TelaPrincipal() {
        initComponents();
    }
    public void addItensJogo(){
        
        //Itens comuns de ataque
                                    // Nome, Poder de ação
        itens_jogo.add(new Item_Ataque("Xerox", 200));
        itens_jogo.add(new Item_Ataque("Caderno", 150));
        itens_jogo.add(new Item_Ataque("Caneta", 250));
        
                                    // Nome, Classe, Poder, Nível, Dinheiro necessario
        itens_jogo.add(new Item_Ataque("Régua", "Exatas", 400, 0, 0));
        itens_jogo.add(new Item_Ataque("Apostila", "Humanas", 400 , 0, 0));
        itens_jogo.add(new Item_Ataque("Constituição", "Jurídicas", 400 , 0, 0));
        itens_jogo.add(new Item_Ataque("Seringa", "Biológicas", 400 , 0, 0));
        
        //Itens comuns de defesa
                                    // Nome, Poder de ação
        itens_jogo.add(new Item_Defesa("Livro", 100));
        itens_jogo.add(new Item_Defesa("Exercícios feitos", 150));
        itens_jogo.add(new Item_Defesa("Artigo", 350));
        
                            // Vida, Poder de ação, Dinheiro, Nome
        // itens_jogo.add(new Item_Defesa(0, 100, 0, "Livro"));
        
        //Itens de vida
                                    // Valor, Nome, Nível
        itens_jogo.add(new Item_Vida(50, "Garrfa de Água", 0));
        itens_jogo.add(new Item_Vida(100, "Chop da BC", 1));
        itens_jogo.add(new Item_Vida(200, "Lanche do Ver-o-pesinho", 3));
        itens_jogo.add(new Item_Vida(300, "Bandejão do RU", 4));
        
    }
    
    
    public TelaPrincipal(ArrayList<Item> itens_jogo, ArrayList<Arma> armas_jogo) {
        this();
        this.itens_jogo = itens_jogo;
        this.armas_jogo = armas_jogo;
    }    
    
    private boolean isEmpty(Object obj){
        return (obj==null);
    }
    
    public Aluno getUser() {
        return user;
    }

    public void setUser(Aluno user) {
        this.user = user;
    }

    public ArrayList<Arma> getArms_jogo() {
        return armas_jogo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CBCCMEMES");
        setName("TelaPrincipal"); // NOI18N
        setResizable(false);

        jButton1.setText("Criar Personagem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Personagem");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inicio Jogo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CriaPersonagem cr = new CriaPersonagem(this, this);
        this.setVisible(false);
        cr.setVisible(true);
        this.setVisible(true);
        if ( !isEmpty(getUser()) ) {
            jButton1.setText("Editar Personagem");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (isEmpty(user)){
            JOptionPane.showMessageDialog(rootPane,"Nenhum Personagem Criado");
        }else{
            user.descricaoPerosnagem(this);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!isEmpty(user)){
            inicio_jogo = true;
            jButton1.setEnabled(!inicio_jogo);
            /*TelaAmbientes aux = new TelaAmbientes(this, this);
            setVisible(false);
            aux.setVisible(true);
            setVisible(true);*/
            AmbienteDeCombate ambiente = new AmbienteDeCombate(this);
            this.setVisible(false);
            ambiente.setVisible(true);
            this.setVisible(true);
        }else{
            jButton2ActionPerformed(evt);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
    private boolean inicio_jogo = false;
    private Aluno user;

    //Ver possibilidade de mudança para ArrayList
    private ArrayList<Arma> armas_jogo = new ArrayList<>();
    private ArrayList<Item> itens_jogo = new ArrayList<>();
}
