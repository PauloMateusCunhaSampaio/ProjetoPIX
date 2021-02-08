package inter;

import back.cadastro.Cadastro;
import static back.cadastro.Cadastro.login;

public class JanelaInicial extends javax.swing.JFrame {

    public JanelaInicial() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoLogin = new javax.swing.JButton();
        CampoDeSenha = new javax.swing.JPasswordField();
        CampoDeEmail = new javax.swing.JFormattedTextField();
        TextoSemConta = new javax.swing.JLabel();
        BotaoParaCriarConta = new javax.swing.JButton();
        TextoSenhaLogin = new javax.swing.JLabel();
        TextoEmailLogin = new javax.swing.JLabel();
        TextoSenhaIncorreta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Login"); // NOI18N

        BotaoLogin.setText("OK");
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });

        CampoDeEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoDeEmailMouseClicked(evt);
            }
        });
        CampoDeEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                CampoDeEmailInputMethodTextChanged(evt);
            }
        });

        TextoSemConta.setText("Nao tem uma conta? ");

        BotaoParaCriarConta.setText("Clique Aqui");
        BotaoParaCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoParaCriarContaActionPerformed(evt);
            }
        });

        TextoSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextoSenhaLogin.setText("Senha");

        TextoEmailLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextoEmailLogin.setText("E-mail");

        TextoSenhaIncorreta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextoSenhaIncorreta.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoSemConta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(670, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoDeSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoDeEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TextoSenhaLogin)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoLogin)
                        .addGap(418, 418, 418))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoParaCriarConta)
                            .addComponent(TextoEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoSenhaIncorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(TextoEmailLogin)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoDeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoSenhaLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(TextoSenhaIncorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(TextoSemConta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoParaCriarConta)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed
        if(login(CampoDeSenha.getText(),CampoDeEmail.getText()) == null){   // se a senha estiver correta
            TextoSenhaIncorreta.setText("Senha Incorreta, digite novamente");
        }
        else{     
            Cadastro cliente = login(CampoDeSenha.getText(),CampoDeEmail.getText());
            new UsuarioIdentificado(cliente).setVisible(true);
            dispose();// se a senha estiver incorreta        
        }
    }//GEN-LAST:event_BotaoLoginActionPerformed

    private void CampoDeEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CampoDeEmailInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CampoDeEmailInputMethodTextChanged

    private void CampoDeEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDeEmailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeEmailMouseClicked

    private void BotaoParaCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoParaCriarContaActionPerformed
        // TODO add your handling code here:
        new CriaarConta().setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoParaCriarContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JButton BotaoParaCriarConta;
    private javax.swing.JFormattedTextField CampoDeEmail;
    private javax.swing.JPasswordField CampoDeSenha;
    private javax.swing.JLabel TextoEmailLogin;
    private javax.swing.JLabel TextoSemConta;
    private javax.swing.JLabel TextoSenhaIncorreta;
    private javax.swing.JLabel TextoSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
