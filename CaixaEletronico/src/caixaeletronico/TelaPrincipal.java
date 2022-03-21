
package caixaeletronico;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelePrincipal
     */
    ContaBancaria c1 = new ContaBancaria();
    ContaBancaria c2 = new ContaBancaria();
    String contaLogada = "";
    
    public void limpaCampo(){
        tf_agencia.setText("");
        tf_agencia_dest.setText("");
        tf_conta.setText("");
        tf_conta_dest.setText("");
        tf_valor.setText("");
        tf_valor_dest.setText("");
    }
    
    public TelaPrincipal() {
        initComponents();
        c1.setAgencia(1001);
        c1.setConta(10100);
        c1.setCliente("Ariela Helena");
        c1.setSaldo(0);
        
        c2.setAgencia(1002);
        c2.setConta(10101);
        c2.setCliente("Maria Lemos");
        c2.setSaldo(0);
        
        painelDepTransf.setVisible(false);
        painelSaque.setVisible(false);
        painelOperacoes.setVisible(false);
        painelSaldo.setVisible(false);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBanco = new javax.swing.JPanel();
        painelAgencia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_agencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_conta = new javax.swing.JTextField();
        btn_acessar = new javax.swing.JButton();
        painelDepTransf = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_agencia_dest = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_conta_dest = new javax.swing.JTextField();
        btn_enviar_dest = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_valor_dest = new javax.swing.JTextField();
        painelSaque = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        painelSaldo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_saldo = new javax.swing.JTextField();
        painelOperacoes = new javax.swing.JPanel();
        btn_deposito = new javax.swing.JButton();
        btn_saque = new javax.swing.JButton();
        btn_transferencia = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_saldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Centec - Versão 1.0");

        painelBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        painelAgencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Agência:");

        jLabel2.setText("Conta:");

        btn_acessar.setText("Acessar");
        btn_acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAgenciaLayout = new javax.swing.GroupLayout(painelAgencia);
        painelAgencia.setLayout(painelAgenciaLayout);
        painelAgenciaLayout.setHorizontalGroup(
            painelAgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAgenciaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_agencia))
                    .addGroup(painelAgenciaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(painelAgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAgenciaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_acessar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_conta))))
                .addContainerGap())
        );
        painelAgenciaLayout.setVerticalGroup(
            painelAgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAgenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_acessar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDepTransf.setBorder(javax.swing.BorderFactory.createTitledBorder("Destinatário"));

        jLabel3.setText("Agência:");

        jLabel4.setText("Conta:");

        btn_enviar_dest.setText("Enviar");
        btn_enviar_dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar_destActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor:");

        javax.swing.GroupLayout painelDepTransfLayout = new javax.swing.GroupLayout(painelDepTransf);
        painelDepTransf.setLayout(painelDepTransfLayout);
        painelDepTransfLayout.setHorizontalGroup(
            painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDepTransfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDepTransfLayout.createSequentialGroup()
                        .addComponent(btn_enviar_dest, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf_agencia_dest)
                    .addComponent(tf_valor_dest)
                    .addComponent(tf_conta_dest))
                .addContainerGap())
        );
        painelDepTransfLayout.setVerticalGroup(
            painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDepTransfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_agencia_dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_conta_dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDepTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_valor_dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_enviar_dest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSaque.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Valor:");

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSaqueLayout = new javax.swing.GroupLayout(painelSaque);
        painelSaque.setLayout(painelSaqueLayout);
        painelSaqueLayout.setHorizontalGroup(
            painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_valor, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSaqueLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );
        painelSaqueLayout.setVerticalGroup(
            painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_enviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("SALDO:");

        javax.swing.GroupLayout painelSaldoLayout = new javax.swing.GroupLayout(painelSaldo);
        painelSaldo.setLayout(painelSaldoLayout);
        painelSaldoLayout.setHorizontalGroup(
            painelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_saldo)
                .addContainerGap())
        );
        painelSaldoLayout.setVerticalGroup(
            painelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelBancoLayout = new javax.swing.GroupLayout(painelBanco);
        painelBanco.setLayout(painelBancoLayout);
        painelBancoLayout.setHorizontalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAgencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDepTransf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBancoLayout.setVerticalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDepTransf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelOperacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 14))); // NOI18N

        btn_deposito.setText("Deposito");
        btn_deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositoActionPerformed(evt);
            }
        });

        btn_saque.setText("Saque");
        btn_saque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saqueActionPerformed(evt);
            }
        });

        btn_transferencia.setText("Transferência");

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_saldo.setText("Saldo");
        btn_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelOperacoesLayout = new javax.swing.GroupLayout(painelOperacoes);
        painelOperacoes.setLayout(painelOperacoesLayout);
        painelOperacoesLayout.setHorizontalGroup(
            painelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_saque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_deposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelOperacoesLayout.setVerticalGroup(
            painelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOperacoesLayout.createSequentialGroup()
                .addComponent(btn_saldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_saque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_transferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acessarActionPerformed
        int ag = Integer.parseInt(tf_agencia.getText());
        int conta = Integer.parseInt(tf_conta.getText());
        
        if(ag == c1.getAgencia() && (conta == c1.getConta())){
            painelOperacoes.setVisible(true);
            this.setTitle(this.getTitle() +" - Bem-Vindo: "+ c1.getCliente());
            contaLogada = "c1";
        }else if(ag == c2.getAgencia() && (conta == c2.getConta())){
            painelOperacoes.setVisible(true);
            this.setTitle(this.getTitle() +" - Bem-Vindo: "+ c1.getCliente());
            contaLogada = "c2";
        }else{
            JOptionPane.showMessageDialog(null, "Agencia ou Conta Invalída!");
        }
    }//GEN-LAST:event_btn_acessarActionPerformed

    private void btn_depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositoActionPerformed
        painelDepTransf.setVisible(true);
        painelAgencia.setVisible(false);
        painelSaque.setVisible(false);
        painelSaldo.setVisible(false);
    }//GEN-LAST:event_btn_depositoActionPerformed

    private void btn_enviar_destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviar_destActionPerformed
        if(contaLogada == "c1"){
            if(tf_conta_dest.getText().equals(Integer.toString(c1.getConta()))){
                c1.depositar(Float.parseFloat(tf_valor_dest.getText()));
                painelDepTransf.setVisible(false);
                limpaCampo();
            }else{
                c2.depositar(Float.parseFloat(tf_valor_dest.getText()));
                painelDepTransf.setVisible(false);
                limpaCampo();
            }    
        }else{
            if(tf_conta_dest.getText().equals(Integer.toString(c2.getConta()))){
                c2.depositar(Float.parseFloat(tf_valor_dest.getText()));
                painelDepTransf.setVisible(false);
                limpaCampo();
            }else{
                c1.depositar(Float.parseFloat(tf_valor_dest.getText()));
                painelDepTransf.setVisible(false);
                limpaCampo();
            }
        }
    }//GEN-LAST:event_btn_enviar_destActionPerformed

    private void btn_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saldoActionPerformed
        painelSaldo.setVisible(true);
        painelDepTransf.setVisible(false);
        painelAgencia.setVisible(false);
        painelSaque.setVisible(false);
        if(contaLogada == "c1"){
            tf_saldo.setText(Float.toString(c1.getSaldo()));
        }else{
            tf_saldo.setText(Float.toString(c2.getSaldo()));
        }
    }//GEN-LAST:event_btn_saldoActionPerformed

    private void btn_saqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saqueActionPerformed
        painelSaldo.setVisible(false);
        painelDepTransf.setVisible(false);
        painelAgencia.setVisible(false);
        painelSaque.setVisible(true);
    }//GEN-LAST:event_btn_saqueActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        if(contaLogada == "c1"){
            float saldoAnterior = c1.getSaldo();
            c1.sacar(Float.parseFloat(tf_valor.getText()));
            JOptionPane.showMessageDialog(null,
                    "Saldo: "+saldoAnterior+"\n"+
                    "Valor do Saque: "+tf_valor.getText()+"\n"+
                    "Saldo Atual: "+c1.getSaldo());
            limpaCampo();
        }else if(contaLogada == "c2"){
            float saldoAnterior = c2.getSaldo();
            c2.sacar(Float.parseFloat(tf_valor.getText()));
            JOptionPane.showMessageDialog(null,
                    "Saldo: "+saldoAnterior+"\n"+
                    "Valor do Saque: "+tf_valor.getText()+"\n"+
                    "Saldo Atual: "+c2.getSaldo());
            limpaCampo();
        }else{
            JOptionPane.showMessageDialog(null, "Conta Invalida!");
            limpaCampo();
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acessar;
    private javax.swing.JButton btn_deposito;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_enviar_dest;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_saldo;
    private javax.swing.JButton btn_saque;
    private javax.swing.JButton btn_transferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painelAgencia;
    private javax.swing.JPanel painelBanco;
    private javax.swing.JPanel painelDepTransf;
    private javax.swing.JPanel painelOperacoes;
    private javax.swing.JPanel painelSaldo;
    private javax.swing.JPanel painelSaque;
    private javax.swing.JTextField tf_agencia;
    private javax.swing.JTextField tf_agencia_dest;
    private javax.swing.JTextField tf_conta;
    private javax.swing.JTextField tf_conta_dest;
    private javax.swing.JTextField tf_saldo;
    private javax.swing.JTextField tf_valor;
    private javax.swing.JTextField tf_valor_dest;
    // End of variables declaration//GEN-END:variables
}