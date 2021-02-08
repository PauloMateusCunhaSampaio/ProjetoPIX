package inter;

import back.cadastro.Cadastro;
import back.conta.*;
import back.pix.*;


public class CriarPix extends javax.swing.JFrame {


    public CriarPix(Cadastro usuario , Conta minha) {
        this.usuario = usuario;
        this.minha = minha;
        initComponents();
    }
    
    public Cadastro usuario;
    public Conta minha;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoEmail = new javax.swing.JTextField();
        TextoEmail = new javax.swing.JLabel();
        TextoTelefone = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        BotaoCadastrarEmail = new javax.swing.JButton();
        BotaoCadastrarTelefone = new javax.swing.JButton();
        BotaoCadastrarCodigo = new javax.swing.JButton();
        TextoCodigo = new javax.swing.JLabel();
        DadoIncorreto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoEmail.setText("Digite seu email para cadastro da chave PIX");

        TextoTelefone.setText("Digite seu telefone para cadastro da chave PIX");

        BotaoCadastrarEmail.setText("Cadastrar email");
        BotaoCadastrarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarEmailActionPerformed(evt);
            }
        });

        BotaoCadastrarTelefone.setText("Cadastrar telefone");
        BotaoCadastrarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarTelefoneActionPerformed(evt);
            }
        });

        BotaoCadastrarCodigo.setText("Cadastrar codigo");
        BotaoCadastrarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarCodigoActionPerformed(evt);
            }
        });

        TextoCodigo.setText("Gerar codigo aleatorio para cadastro de chave PIX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CampoEmail))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotaoCadastrarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(TextoTelefone)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotaoCadastrarTelefone)))
                    .addComponent(BotaoCadastrarCodigo)
                    .addComponent(TextoCodigo))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DadoIncorreto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(TextoEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastrarEmail))
                .addGap(18, 18, 18)
                .addComponent(TextoTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastrarTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoCodigo)
                .addGap(3, 3, 3)
                .addComponent(BotaoCadastrarCodigo)
                .addGap(18, 18, 18)
                .addComponent(DadoIncorreto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarEmailActionPerformed
        if(true){    // se o email não estiver repetido a funçao fica true
            usuario.cadastrarPix(usuario.getCliente());
            dispose();
            new UsuarioIdentificado(usuario).setVisible(true);
        }
        else{
            DadoIncorreto.setText("Email já em uso");
        }
    }//GEN-LAST:event_BotaoCadastrarEmailActionPerformed

    private void BotaoCadastrarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarTelefoneActionPerformed
        if(true){    // se o email não estiver repetido a funçao fica true
            //codigo de lulinha vincular email
            dispose();
            new UsuarioIdentificado(usuario).setVisible(true);
        }
        else{
            DadoIncorreto.setText("Telefone já em uso");
        }
    }//GEN-LAST:event_BotaoCadastrarTelefoneActionPerformed

    private void BotaoCadastrarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarCodigoActionPerformed
            dispose();
            new UsuarioIdentificado(usuario).setVisible(true);
        // cadastro de codigo
    }//GEN-LAST:event_BotaoCadastrarCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarCodigo;
    private javax.swing.JButton BotaoCadastrarEmail;
    private javax.swing.JButton BotaoCadastrarTelefone;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JLabel DadoIncorreto;
    private javax.swing.JLabel TextoCodigo;
    private javax.swing.JLabel TextoEmail;
    private javax.swing.JLabel TextoTelefone;
    // End of variables declaration//GEN-END:variables
}
