package inter;

import back.cadastro.Cadastro;
import back.conta.*;

public class Transferencia extends javax.swing.JFrame {

    public Transferencia(Cadastro usuario, Conta minha) {
        this.usuario = usuario;
        this.minha = minha;
        initComponents();
    }
    
    public Cadastro usuario;
    public Conta minha;
    public Conta receptor;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoCodigo = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JLabel();
        TextoValor = new javax.swing.JLabel();
        CampoValor = new javax.swing.JTextField();
        BotaoTransferir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoActionPerformed(evt);
            }
        });

        TextoCodigo.setText("Digite o codigo PIX pra transferir");

        TextoValor.setText("Digite o valor a ser transferido");

        CampoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoValorActionPerformed(evt);
            }
        });

        BotaoTransferir.setText("Transferir");
        BotaoTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextoValor)
                        .addComponent(CampoCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CampoValor, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(TextoCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoTransferir)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigoActionPerformed

    private void CampoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoValorActionPerformed

    private void BotaoTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTransferirActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(CampoValor.getText());
        if(receptor.transferir(minha , valor)){
            dispose();
            new UsuarioIdentificado(usuario).setVisible(true);
            }
            else{
            }
    }//GEN-LAST:event_BotaoTransferirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoTransferir;
    private javax.swing.JTextField CampoCodigo;
    private javax.swing.JTextField CampoValor;
    private javax.swing.JLabel TextoCodigo;
    private javax.swing.JLabel TextoValor;
    // End of variables declaration//GEN-END:variables


}
