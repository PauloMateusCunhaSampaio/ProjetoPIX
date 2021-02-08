package inter;

import back.banco.Banco;
import back.cadastro.Cadastro;
import back.conta.*;

class UsuarioIdentificado extends javax.swing.JFrame {
    public UsuarioIdentificado(Cadastro usuario) {
        this.usuario = usuario;
        initComponents();
    }
    
    public Cadastro usuario;



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoHistoricoTransferencia = new javax.swing.JButton();
        BotaoCriarPix = new javax.swing.JButton();
        TextoSaldo = new javax.swing.JLabel();
        BotaoTransferencia = new javax.swing.JButton();
        TextoTituloPIX = new javax.swing.JLabel();
        ChavePIX1 = new javax.swing.JLabel();
        ChavePIX2 = new javax.swing.JLabel();
        ChavePIX3 = new javax.swing.JLabel();
        ChavePIX4 = new javax.swing.JLabel();
        ChavePIX5 = new javax.swing.JLabel();
        CriarContaBanco = new javax.swing.JButton();
        ContasDisponiveis = new javax.swing.JComboBox<>();
        TextoMontante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoHistoricoTransferencia.setText("Historico de Transferencias");
        BotaoHistoricoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHistoricoTransferenciaActionPerformed(evt);
            }
        });

        BotaoCriarPix.setText("Criar Chave PIX");
        BotaoCriarPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCriarPixActionPerformed(evt);
            }
        });

        TextoSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoSaldo.setText("Saldo: ");

        BotaoTransferencia.setText("Transferencia");
        BotaoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTransferenciaActionPerformed(evt);
            }
        });

        TextoTituloPIX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoTituloPIX.setText("Chaves PIX cadastradas:");

        CriarContaBanco.setText("Criar Nova Conta");
        CriarContaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarContaBancoActionPerformed(evt);
            }
        });

        ContasDisponiveis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Salario", "Conta Corrente", "Conta Poupanca" }));
        ContasDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContasDisponiveisActionPerformed(evt);
            }
        });

        TextoMontante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoMontante.setText("Montante total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoTituloPIX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChavePIX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChavePIX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChavePIX3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChavePIX4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChavePIX5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoHistoricoTransferencia)
                                .addGap(10, 10, 10)
                                .addComponent(BotaoCriarPix, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CriarContaBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoMontante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoMontante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTituloPIX)
                    .addComponent(ContasDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChavePIX5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriarContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoHistoricoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCriarPix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCriarPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCriarPixActionPerformed
        dispose();
        Conta minha = null;
        new CriarPix(usuario, minha).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCriarPixActionPerformed

    private void BotaoHistoricoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHistoricoTransferenciaActionPerformed
        // TODO add your handling code here:
        Conta minha = null;
        new Historico(minha, usuario).setVisible(true);
    }//GEN-LAST:event_BotaoHistoricoTransferenciaActionPerformed

    private void BotaoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTransferenciaActionPerformed
        dispose();
        if(ContasDisponiveis.getSelectedItem().equals("Conta Corrente")){
            ContaCorrente minha = null;
            new Transferencia(usuario, minha).setVisible(true);
        }
        else if(ContasDisponiveis.getSelectedItem().equals("Conta Salario")){
            ContaSalario minha = null;
            new Transferencia(usuario, minha).setVisible(true);
        }
        else if(ContasDisponiveis.getSelectedItem().equals("Conta Poupanca")){
            ContaPoupanca minha = null;
            new Transferencia(usuario, minha).setVisible(true);
        }
        
    }//GEN-LAST:event_BotaoTransferenciaActionPerformed

    private void ContasDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContasDisponiveisActionPerformed
        // TODO add your handling code here:
        
        TextoMontante.setText("Montante total: "+Banco.getBancos().get(0).getSaldo());
        TextoSaldo.setText("Saldo: "+ usuario.getMeusSaldo()); // esperando arquivo de lula. Alem disso .getSelectedItem(); pega oque esta escrito no combobox clicado
    }//GEN-LAST:event_ContasDisponiveisActionPerformed

    private void CriarContaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarContaBancoActionPerformed
        // TODO add your handling code here:
        new OpcoesConta(usuario).setVisible(true);
    }//GEN-LAST:event_CriarContaBancoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCriarPix;
    private javax.swing.JButton BotaoHistoricoTransferencia;
    private javax.swing.JButton BotaoTransferencia;
    private javax.swing.JLabel ChavePIX1;
    private javax.swing.JLabel ChavePIX2;
    private javax.swing.JLabel ChavePIX3;
    private javax.swing.JLabel ChavePIX4;
    private javax.swing.JLabel ChavePIX5;
    private javax.swing.JComboBox<String> ContasDisponiveis;
    private javax.swing.JButton CriarContaBanco;
    private javax.swing.JLabel TextoMontante;
    private javax.swing.JLabel TextoSaldo;
    private javax.swing.JLabel TextoTituloPIX;
    // End of variables declaration//GEN-END:variables
}
