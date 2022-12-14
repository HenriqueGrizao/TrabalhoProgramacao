/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Funcionarios.BancoDeDados;
import Funcionarios.Funcionarios;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

/**
 *
 * @author Pichau
 */
public class FrameAdicionar extends javax.swing.JFrame {

    /**
     * Creates new form FrameAdicionar
     */
    public FrameAdicionar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        tfCargo = new javax.swing.JTextField();
        tfRG = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        lbAviso = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnComfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Adicionar um funcion??rio</html>");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("RG");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Cargo");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Sal??rio");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Endere??o");

        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyPressed(evt);
            }
        });

        tfSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSalarioKeyPressed(evt);
            }
        });

        tfCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCargoKeyPressed(evt);
            }
        });

        tfRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRGKeyPressed(evt);
            }
        });

        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
        });

        lbAviso.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbAviso.setForeground(new java.awt.Color(255, 51, 51));
        lbAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAviso.setText("Preecha todos os campos");
        lbAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVoltar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnComfirmar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnComfirmar.setText("Confirmar");
        btnComfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnComfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEndereco)
                                    .addComponent(tfNome)
                                    .addComponent(tfRG)
                                    .addComponent(tfCargo)
                                    .addComponent(tfSalario))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(lbAviso)
                    .addComponent(btnVoltar)
                    .addComponent(btnComfirmar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TrabalhoProgramacao.inicial.setVisible(true);
        TrabalhoProgramacao.adicionar.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed
/**
 * Limpa todos os jTextField
 */
    private void limpar() {
        tfCargo.setText("");
        tfSalario.setText("");
        tfEndereco.setText("");
        tfRG.setText("");
        tfNome.setText("");
    }
/**
 * Verifica se as informa????es inseridas  no tf correspondem  ao esperado, transforma
 * essa informa????es em um objeto Funcionarios e o salva no ListaFuncionario
 */
    private void salvar() {
        //declara????o das variaveis
        String nome = "";
        String cargo = "";
        String endereco = "";
        float salario = 0;
        String rg = "";
        LocalDateTime now = LocalDateTime.now();
        boolean isRight = true;
        //fim da declara????o das variaveirs

        //verifica se n??o est?? tentado adicionar com algum campos vazios
        if (tfNome.getText().isBlank()) {
            lbAviso.setText("Campo do nome est?? vazio");
            tfNome.grabFocus();
            isRight = false;
        } else {
            nome = tfNome.getText();
        }

        if (tfCargo.getText().isBlank()) {
            lbAviso.setText("Campo do cargo est?? vazio");
            tfCargo.grabFocus();
            isRight = false;
        } else {
            cargo = tfCargo.getText();
        }

        if (tfEndereco.getText().isBlank()) {
            lbAviso.setText("Campo do endere??o est?? vazio");
            tfEndereco.grabFocus();
            isRight = false;
        } else {
            endereco = tfEndereco.getText();
        }

        //Verifica se o RG est?? correto (9 d??gitos e sem letras ou caracteres especiais)
        rg = tfRG.getText().replace(".", "").replace("-", "");
        if (rg.length() != 9) {
            lbAviso.setText("Quntidade de digitos no RG inv??lido");
            tfRG.grabFocus();
            isRight = false;
        } else {
            try {
                float teste = Float.parseFloat(rg);
            } catch (NumberFormatException e) {
                lbAviso.setText("?? permitido apenas numero no RG");
                tfRG.grabFocus();
                isRight = false;
            }
        }

        String data = now.getDayOfMonth() + "/" + now.getMonth().getValue() + "/" + now.getYear();

        //Verifica se o sal??rio est?? correto (maior  ou igual a 0 e se ?? um n??mero)
        try {
            salario = Float.parseFloat(tfSalario.getText().replace(',', '.'));
            if (salario <= 0) {
                lbAviso.setText("Valor do sal??rio inv??lido");
                tfSalario.grabFocus();
                isRight = false;
            }
        } catch (NumberFormatException e) {
            lbAviso.setText("Numero do sal??rio Inv??lido ");
            tfSalario.grabFocus();
            isRight = false;
        }

        //Salvado o Funcionario no Arrey da clase ListaFuncionario
        if (isRight) {
            Funcionarios T = new Funcionarios(nome, cargo, salario, data, rg, endereco);
            TrabalhoProgramacao.listaFuncionarios.add(T);
            lbAviso.setText("Funcionario salvo com id " + TrabalhoProgramacao.listaFuncionarios.getIdAtual());
            limpar();
            tfNome.grabFocus();
        }
    }

    private void btnComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComfirmarActionPerformed
        salvar();
    }//GEN-LAST:event_btnComfirmarActionPerformed

    private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfRG.grabFocus();
        }
    }//GEN-LAST:event_tfNomeKeyPressed

    private void tfRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRGKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfCargo.grabFocus();
        }
    }//GEN-LAST:event_tfRGKeyPressed

    private void tfCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCargoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfSalario.grabFocus();
        }
    }//GEN-LAST:event_tfCargoKeyPressed

    private void tfSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSalarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfEndereco.grabFocus();
        }
    }//GEN-LAST:event_tfSalarioKeyPressed

    private void tfEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            salvar();
        }
    }//GEN-LAST:event_tfEnderecoKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lbAviso.setText("Preencha todos os campos");
        limpar();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FrameAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdicionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}
