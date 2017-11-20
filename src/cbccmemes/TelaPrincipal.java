package cbccmemes;

import cbccmemes.personagens.*;
import cbccmemes.mochila.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame{

    public TelaPrincipal() {
        initComponents();
        addArmasDeJogo();
    }
    public void addArmasDeJogo(){
        //Armas Comuns
        armas_jogo.add(new Arma("TCC", 500));
        armas_jogo.add(new Arma("Livro", 300));
        armas_jogo.add(new Arma("Caderno", 100));
        armas_jogo.add(new Arma("Celular tocando", 200));
        armas_jogo.add(new Arma("Catuaba", 400, 2));
        //Armas de Biologia
        armas_jogo.add(new Arma("Bisturi", 150,"Biológicas"));
        armas_jogo.add(new Arma("Vírus", 350,"Biológicas"));
        armas_jogo.add(new Arma("Injeção", 250,"Biológicas"));
        //Armas de Exatas
        armas_jogo.add(new Arma("Calculadora", 150, "Exatas"));
        armas_jogo.add(new Arma("PC", 250, "Exatas"));
        armas_jogo.add(new Arma("Hacker", 350, "Exatas"));
        //Armas de Humanas
        armas_jogo.add(new Arma("Miçangas", 150,"Humanas"));
        armas_jogo.add(new Arma("Xerox", 250,"Humanas"));
        armas_jogo.add(new Arma("Ocupação", 350,"Humanas"));
    }
    
    public static boolean isEmpty(Object obj){
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
        setMaximumSize(new java.awt.Dimension(300, 400));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
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
        if ( !TelaPrincipal.isEmpty(getUser()) ) {
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
        if (!TelaPrincipal.isEmpty(user)){
            inicio_jogo = true;
            jButton1.setEnabled(!inicio_jogo);
            TelaAmbientes aux = new TelaAmbientes(this, this);
            setVisible(false);
            aux.setVisible(true);
            setVisible(true);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
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
}
