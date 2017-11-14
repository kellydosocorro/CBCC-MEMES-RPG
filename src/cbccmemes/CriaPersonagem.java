/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes;

import cbccmemes.mochila.Arma;
import cbccmemes.personagens.Aluno;
import java.awt.Frame;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author hundson
 */
public class CriaPersonagem extends javax.swing.JDialog {

    /**
     * Creates new form CriaPersonagem
     */
    public CriaPersonagem(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CriaPersonagem(Frame parent, TelaPrincipal telap){
        this(parent, true);
        this.aux = telap;
        this.user = aux.getUser();
        this.armas = aux.getArms_jogo();
        this.setDadosAluno();
    }
    
    private void setDadosAluno(){
        if ( TelaPrincipal.isEmpty(user) ){
            user = new Aluno();
            TextNivel.setText(""+user.getNivel());
            this.setListArmasDisponiveis(Integer.parseInt(TextNivel.getText()), getClasseSelected(), armas);
        }else{
            TextNome.setText(user.getNome());
            TextNivel.setText(""+user.getNivel());
            ClassesSelect.setSelectedItem(user.getClasse_aluno());
            ArmasSelect.setSelectedItem(user.getArma_batalha().getNome());
        }
    }
    
    private void setListArmasPorClasse(String classe, Arma armas[]){
        armas_disponiveis = Aluno.getArmasDisponiveis(classe, armas);
        String list_arms[] = new String[armas_disponiveis.length];
        for ( int i=0; i<armas_disponiveis.length; i++ ){
            list_arms[i] = armas_disponiveis[i].getNome();
        }
        ArmasSelect.setModel(new DefaultComboBoxModel<>(list_arms));
    }
    
    private void setListArmasPorNivel(int nivel, Arma armas[]){
        armas_disponiveis = Aluno.getArmasDisponiveis(nivel, armas);
        String list_arms[] = new String[armas_disponiveis.length];
        for ( int i=0; i<armas_disponiveis.length; i++ ){
            list_arms[i] = armas_disponiveis[i].getNome();
        }
        ArmasSelect.setModel(new DefaultComboBoxModel<>(list_arms));
    }
    
    private void setListArmasDisponiveis(int nivel, String classe, Arma armas[]){
        armas_disponiveis = Aluno.getArmasDisponiveis(nivel, classe, armas);
        String list_arms[] = new String[armas_disponiveis.length];
        for ( int i=0; i<armas_disponiveis.length; i++ ){
            list_arms[i] = armas_disponiveis[i].getNome();
        }
        ArmasSelect.setModel(new DefaultComboBoxModel<>(list_arms));
    }
    
    private String getClasseSelected(){
        return (ClassesSelect.getItemAt(ClassesSelect.getSelectedIndex()));
    }
    private int getNivel(){
        return (Integer.parseInt(TextNivel.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeLabel = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        ClasseLabel = new javax.swing.JLabel();
        ClassesSelect = new javax.swing.JComboBox<>();
        NomeLabel1 = new javax.swing.JLabel();
        NomeLabel2 = new javax.swing.JLabel();
        crg_value = new javax.swing.JSpinner();
        NomeLabel3 = new javax.swing.JLabel();
        ataque_value = new javax.swing.JSpinner();
        NomeLabel4 = new javax.swing.JLabel();
        velocidade_value = new javax.swing.JSpinner();
        defesa_value = new javax.swing.JSpinner();
        ArmaLabel = new javax.swing.JLabel();
        ArmasSelect = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        NivaleLabel = new javax.swing.JLabel();
        TextNivel = new javax.swing.JTextField();
        AmbienteLabel = new javax.swing.JLabel();
        ArmasSelect1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criação de Personagem");
        setResizable(false);

        NomeLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        NomeLabel.setText("Nome:");
        NomeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TextNome.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        ClasseLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        ClasseLabel.setText("Classe:");
        ClasseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ClassesSelect.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        ClassesSelect.setModel(new javax.swing.DefaultComboBoxModel<>(Aluno.getClasses_personagem()));
        ClassesSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassesSelectActionPerformed(evt);
            }
        });

        NomeLabel1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        NomeLabel1.setText("Ataque:");
        NomeLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        NomeLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        NomeLabel2.setText("Velocidade:");
        NomeLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        crg_value.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        crg_value.setModel(new javax.swing.SpinnerNumberModel(1000, 850, 1150, 1));

        NomeLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        NomeLabel3.setText("CRG:");
        NomeLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ataque_value.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        ataque_value.setModel(new javax.swing.SpinnerNumberModel(150, 0, 450, 10));

        NomeLabel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        NomeLabel4.setText("Defesa:");
        NomeLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        velocidade_value.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        velocidade_value.setModel(new javax.swing.SpinnerNumberModel(150, 0, 450, 10));

        defesa_value.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        defesa_value.setModel(new javax.swing.SpinnerNumberModel(150, 0, 450, 10));

        ArmaLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        ArmaLabel.setText("Arma:");
        ArmaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ArmasSelect.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton1.setText("Salvar Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NivaleLabel.setText("Nível:");

        TextNivel.setEditable(false);

        AmbienteLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        AmbienteLabel.setText("Ambiente Inicial:");
        AmbienteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ArmasSelect1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(crg_value, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NomeLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NomeLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ataque_value, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeLabel2)
                                    .addComponent(NomeLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextNome)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NivaleLabel)
                            .addComponent(defesa_value, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(velocidade_value, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(TextNivel)))
                    .addComponent(ArmasSelect1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClassesSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClasseLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ArmaLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ArmasSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AmbienteLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel)
                    .addComponent(NivaleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel3)
                    .addComponent(crg_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLabel2)
                    .addComponent(velocidade_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ataque_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLabel4)
                    .addComponent(defesa_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClasseLabel)
                    .addComponent(ArmaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassesSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArmasSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AmbienteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ArmasSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        user.setNome(TextNome.getText());
        user.setClasse_aluno(ClassesSelect.getItemAt(ClassesSelect.getSelectedIndex()));
        user.setArma_batalha(armas_disponiveis[ArmasSelect.getSelectedIndex()]);
        user.setArmaMochila(0, armas_disponiveis[ArmasSelect.getSelectedIndex()]);
        user.setAtaque((int) ataque_value.getValue());
        user.setDefesa((int) defesa_value.getValue());
        user.setVelocidade((int) velocidade_value.getValue());
        user.setVida((int) crg_value.getValue());
        
        aux.setUser(user);
        
        //System.err.println("Teste: "+velocidade);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClassesSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesSelectActionPerformed
        // TODO add your handling code here:
        this.setListArmasDisponiveis(this.getNivel(), this.getClasseSelected(), armas);
    }//GEN-LAST:event_ClassesSelectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CriaPersonagem dialog = new CriaPersonagem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmbienteLabel;
    private javax.swing.JLabel ArmaLabel;
    private javax.swing.JComboBox<String> ArmasSelect;
    private javax.swing.JComboBox<String> ArmasSelect1;
    private javax.swing.JLabel ClasseLabel;
    private javax.swing.JComboBox<String> ClassesSelect;
    private javax.swing.JLabel NivaleLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JLabel NomeLabel1;
    private javax.swing.JLabel NomeLabel2;
    private javax.swing.JLabel NomeLabel3;
    private javax.swing.JLabel NomeLabel4;
    private javax.swing.JTextField TextNivel;
    private javax.swing.JTextField TextNome;
    private javax.swing.JSpinner ataque_value;
    private javax.swing.JSpinner crg_value;
    private javax.swing.JSpinner defesa_value;
    private javax.swing.JButton jButton1;
    private javax.swing.JSpinner velocidade_value;
    // End of variables declaration//GEN-END:variables
    private Aluno user;
    private Arma armas[];
    private Arma armas_disponiveis[];
    private TelaPrincipal aux;
}
