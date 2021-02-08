package inter;

import back.cadastro.Cadastro;
import back.pessoa.Cliente;


public class CriaarConta extends javax.swing.JFrame {


    public CriaarConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroEmail = new javax.swing.JTextField();
        CadastroNome = new javax.swing.JTextField();
        CadastroNumero = new javax.swing.JTextField();
        TextoEmail = new javax.swing.JLabel();
        TextoSenha = new javax.swing.JLabel();
        TextoNome = new javax.swing.JLabel();
        TextoTelefone = new javax.swing.JLabel();
        CadastroSenha = new javax.swing.JPasswordField();
        BotaoCadastro = new javax.swing.JButton();
        TextoErroCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroNomeActionPerformed(evt);
            }
        });

        TextoEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoEmail.setText("Email:");

        TextoSenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoSenha.setText("Senha:");

        TextoNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoNome.setText("Nome Completo");

        TextoTelefone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoTelefone.setText("Telefone");

        BotaoCadastro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BotaoCadastro.setText("Cadastrar");
        BotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroActionPerformed(evt);
            }
        });

        TextoErroCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoErroCadastro.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastroSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastroNumero))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(BotaoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextoErroCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CadastroEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoEmail)
                                    .addComponent(TextoSenha)
                                    .addComponent(TextoNome)
                                    .addComponent(TextoTelefone))
                                .addGap(0, 387, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastroNome)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(TextoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextoErroCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroNomeActionPerformed

    private void BotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroActionPerformed

            if(CadastroSenha.getText().length() < 5 || Cadastro.existeEmail(CadastroEmail.getText()) || Cadastro.existeTelefone(CadastroNumero.getText())){                        
                TextoErroCadastro.setText("Dados Incorretos! Digite novamente");
            }
            else{
                Cadastro novoCliente = new Cadastro(new Cliente(CadastroNome.getText(),CadastroEmail.getText(),CadastroNumero.getText(),CadastroSenha.getText()));
                new UsuarioIdentificado(novoCliente).setVisible(true);
                dispose();
            }
       
    }//GEN-LAST:event_BotaoCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastro;
    private javax.swing.JTextField CadastroEmail;
    private javax.swing.JTextField CadastroNome;
    private javax.swing.JTextField CadastroNumero;
    private javax.swing.JPasswordField CadastroSenha;
    private javax.swing.JLabel TextoEmail;
    private javax.swing.JLabel TextoErroCadastro;
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoSenha;
    private javax.swing.JLabel TextoTelefone;
    // End of variables declaration//GEN-END:variables
}
