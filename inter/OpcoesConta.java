package inter;

import back.cadastro.Cadastro;
import back.conta.*;
import back.pessoa.Cliente;

public class OpcoesConta extends javax.swing.JFrame {

    public OpcoesConta(Cadastro usuario) {
        this.usuario = usuario;
        initComponents();
    }
    
    public Cadastro usuario;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoContaCorrente = new javax.swing.JButton();
        BotaoContaPoupanca = new javax.swing.JButton();
        BotaoContaSalario = new javax.swing.JButton();
        TextoContaCorrente = new javax.swing.JLabel();
        TextoContaPoupanca = new javax.swing.JLabel();
        TextoContaSalario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoContaCorrente.setText("Clique Aqui");
        BotaoContaCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoContaCorrenteActionPerformed(evt);
            }
        });

        BotaoContaPoupanca.setText("Clique Aqui");
        BotaoContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoContaPoupancaActionPerformed(evt);
            }
        });

        BotaoContaSalario.setText("Clique Aqui");
        BotaoContaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoContaSalarioActionPerformed(evt);
            }
        });

        TextoContaCorrente.setText("Conta Corrente");

        TextoContaPoupanca.setText("Conta Poupanca");

        TextoContaSalario.setText("Conta Salario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoContaCorrente)
                    .addComponent(TextoContaCorrente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoContaPoupanca)
                    .addComponent(TextoContaPoupanca))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoContaSalario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextoContaSalario)
                        .addGap(12, 12, 12)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoContaCorrente)
                    .addComponent(TextoContaPoupanca)
                    .addComponent(TextoContaSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoContaCorrente)
                    .addComponent(BotaoContaPoupanca)
                    .addComponent(BotaoContaSalario))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoContaCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoContaCorrenteActionPerformed
        // TODO add your handling code here:
        ContaCorrente novaConta;
        novaConta = new ContaCorrente(usuario.getCliente(), 0);
        new UsuarioIdentificado(usuario).setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoContaCorrenteActionPerformed

    private void BotaoContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoContaPoupancaActionPerformed
        ContaPoupanca novaConta;
        novaConta = new ContaPoupanca(usuario.getCliente(), 0);
        new UsuarioIdentificado(usuario).setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoContaPoupancaActionPerformed

    private void BotaoContaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoContaSalarioActionPerformed
        ContaSalario novaConta = null;
        ContaCorrente empregador = null;
        novaConta.setEmpregador(empregador);
        novaConta = new ContaSalario(usuario.getCliente(),empregador, 0);
        new UsuarioIdentificado(usuario).setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoContaSalarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoContaCorrente;
    private javax.swing.JButton BotaoContaPoupanca;
    private javax.swing.JButton BotaoContaSalario;
    private javax.swing.JLabel TextoContaCorrente;
    private javax.swing.JLabel TextoContaPoupanca;
    private javax.swing.JLabel TextoContaSalario;
    // End of variables declaration//GEN-END:variables
}
