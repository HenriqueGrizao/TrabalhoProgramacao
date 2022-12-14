/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Funcionarios.Funcionarios;
import java.awt.event.KeyEvent;

/**
 *
 * @author Pichau
 */
public class FrameBuscar extends javax.swing.JFrame {

    /**
     * Creates new form FrameEditar
     */
    public FrameBuscar() {
        initComponents();
    }
    private Funcionarios func;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbAviso = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmaID = new javax.swing.JButton();
        tfID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfNomeBusca = new javax.swing.JTextField();
        btnBuscaNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Buscar funcion??rio</html>");

        tfCargo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        tfRG.setEditable(false);

        tfNome.setEditable(false);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("RG");

        lbAviso.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbAviso.setForeground(new java.awt.Color(255, 51, 51));
        lbAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAviso.setText("Insira o id ou nome");
        lbAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVoltar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Cargo");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Sal??rio");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Endere??o");

        tfEndereco.setEditable(false);

        tfSalario.setEditable(false);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Digite o id ou nome do funcion??rio que deseja buscar</html>");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("ID");

        btnConfirmaID.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnConfirmaID.setText("Buscas por ID");
        btnConfirmaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaIDActionPerformed(evt);
            }
        });

        tfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIDKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Data contrata????o");

        tfData.setEditable(false);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel10.setText("Nome");

        tfNomeBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeBuscaKeyPressed(evt);
            }
        });

        btnBuscaNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnBuscaNome.setText("Buscar por nome");
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lbAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfData))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfID))
                                    .addComponent(btnConfirmaID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeBusca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscaNome)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(tfEndereco)
                            .addComponent(tfNome)
                            .addComponent(tfRG)
                            .addComponent(tfCargo)
                            .addComponent(tfSalario))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmaID)
                    .addComponent(btnBuscaNome))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAviso)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Limpa todos os jTextField
 */
    private void limpar() {
        tfCargo.setText("");
        tfSalario.setText("");
        tfEndereco.setText("");
        tfRG.setText("");
        tfNome.setText("");
        tfID.setText("");
        tfData.setText("");
        tfNomeBusca.setText("");
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TrabalhoProgramacao.inicial.setVisible(true);
        TrabalhoProgramacao.buscar.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaIDActionPerformed
        buscarID();
    }//GEN-LAST:event_btnConfirmaIDActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        limpar();
        lbAviso.setText("Insira o id");
    }//GEN-LAST:event_formWindowActivated

    private void tfIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarID();
        }
    }//GEN-LAST:event_tfIDKeyPressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        buscarNome();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void tfNomeBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeBuscaKeyPressed
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarNome();
        }
    }//GEN-LAST:event_tfNomeBuscaKeyPressed
    /**
     * Busca um funcion??rio com base no id inserido no
     * tfID e salva as informa????es nos jTextField correspondentes
     */
    private void buscarID() {

        try {
            func = TrabalhoProgramacao.listaFuncionarios.getFuncionario(Integer.parseInt(tfID.getText()));
            tfNome.setText(func.getNome());
            tfCargo.setText(func.getCargo());
            tfEndereco.setText(func.getEndereco());
            tfRG.setText(func.getRG());
            tfSalario.setText(String.valueOf(func.getSalario()));
            tfData.setText(func.getContratacaoData());
            lbAviso.setText("Funcion??rio encontrado");
        } catch (NumberFormatException e) {
            limpar();
            lbAviso.setText("N??o ?? um numaro valido");
        } catch (IllegalArgumentException e) {
            limpar();
            lbAviso.setText("N??o foi posivel achar esse id");
        }
        tfNomeBusca.setText("");

    }

    /**
     * Busca um funcion??rio com base no nome inserido no
     * tfNomeBusca e salva as informa????es nos jTextField correspondentes
     */
    private void buscarNome() {
        try {
            func = TrabalhoProgramacao.listaFuncionarios.BuscarNome(tfNomeBusca.getText());
            tfNome.setText(func.getNome());
            tfCargo.setText(func.getCargo());
            tfEndereco.setText(func.getEndereco());
            tfRG.setText(func.getRG());
            tfSalario.setText(String.valueOf(func.getSalario()));
            tfData.setText(func.getContratacaoData());
            lbAviso.setText("Funcion??rio encontrado");
        } catch (IllegalArgumentException e) {
            limpar();
            lbAviso.setText("N??o foi posivel achar esse nome");
        }
    }

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
            java.util.logging.Logger.getLogger(FrameBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnConfirmaID;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeBusca;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}
