package View;

import View.CadastroVinho;
import View.GerenciaVinho;
import javax.swing.WindowConstants;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotaoCadastro = new javax.swing.JButton();
        BotaoGerenc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 14, 38));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/headerfinal.png"))); // NOI18N

        BotaoCadastro.setBackground(new java.awt.Color(85, 31, 54));
        BotaoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imgcadastro.png"))); // NOI18N
        BotaoCadastro.setBorder(null);
        BotaoCadastro.setBorderPainted(false);
        BotaoCadastro.setContentAreaFilled(false);
        BotaoCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroActionPerformed(evt);
            }
        });

        BotaoGerenc.setBackground(new java.awt.Color(85, 31, 54));
        BotaoGerenc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoGerenc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imggerenc.png"))); // NOI18N
        BotaoGerenc.setBorder(null);
        BotaoGerenc.setBorderPainted(false);
        BotaoGerenc.setContentAreaFilled(false);
        BotaoGerenc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoGerenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerencActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo cdv branca MENOR.png"))); // NOI18N

        BotaoSair.setBackground(new java.awt.Color(85, 31, 54));
        BotaoSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoSair.setForeground(new java.awt.Color(169, 169, 169));
        BotaoSair.setText("Sair");
        BotaoSair.setBorder(null);
        BotaoSair.setBorderPainted(false);
        BotaoSair.setContentAreaFilled(false);
        BotaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(BotaoCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroActionPerformed
        CadastroVinho objeto = new CadastroVinho();
        objeto.setVisible(true);
    }//GEN-LAST:event_BotaoCadastroActionPerformed

    private void BotaoGerencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerencActionPerformed
        GerenciaVinho objeto2 = new GerenciaVinho();
        objeto2.setVisible(true);
    }//GEN-LAST:event_BotaoGerencActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastro;
    private javax.swing.JButton BotaoGerenc;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
