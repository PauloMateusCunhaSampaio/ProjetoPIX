package inter;

import back.cadastro.Cadastro;
import back.conta.Conta;


public class Historico extends javax.swing.JFrame {


    public Historico(Conta minha, Cadastro Cliente) {
        initComponents();
        this.minha = minha;
        extrato = minha.toString();
    }
    public Conta minha;
    public String extrato;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoHistorico = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        CampoHistorico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoHistorico.setText("Historico");

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoHistorico)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 395, Short.MAX_VALUE)
                        .addComponent(BotaoVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoHistorico)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
            dispose();
            Cadastro Cliente = null;
            new UsuarioIdentificado(Cliente).setVisible(true); 
            // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoHistorico;
    private javax.swing.JLabel TextoHistorico;
    // End of variables declaration//GEN-END:variables
}
