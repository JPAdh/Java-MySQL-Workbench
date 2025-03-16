package View;

import Model.Vinho;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;

public class CadastroVinho extends javax.swing.JFrame {

    private Vinho objVinho;

    public CadastroVinho() {
        initComponents();
        this.objVinho = new Vinho();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InserirNome = new javax.swing.JTextField();
        InserirDesc = new javax.swing.JTextField();
        QuantEstoque = new javax.swing.JTextField();
        Preco = new javax.swing.JTextField();
        DataCadastro = new javax.swing.JTextField();
        TipoVinho = new javax.swing.JTextField();
        RegiaoVinho = new javax.swing.JTextField();
        MarcaVinho = new javax.swing.JTextField();
        BotaoConfirma = new javax.swing.JButton();
        BotaoMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(72, 14, 38));
        setPreferredSize(new java.awt.Dimension(715, 650));
        setSize(new java.awt.Dimension(715, 650));

        jPanel1.setBackground(new java.awt.Color(72, 14, 38));

        InserirNome.setBackground(new java.awt.Color(94, 31, 54));
        InserirNome.setForeground(new java.awt.Color(169, 169, 169));
        InserirNome.setMargin(new java.awt.Insets(3, 6, 2, 6));
        InserirNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirNomeActionPerformed(evt);
            }
        });

        InserirDesc.setBackground(new java.awt.Color(94, 31, 54));
        InserirDesc.setForeground(new java.awt.Color(169, 169, 169));

        QuantEstoque.setBackground(new java.awt.Color(94, 31, 54));
        QuantEstoque.setForeground(new java.awt.Color(169, 169, 169));

        Preco.setBackground(new java.awt.Color(94, 31, 54));
        Preco.setForeground(new java.awt.Color(169, 169, 169));

        DataCadastro.setBackground(new java.awt.Color(94, 31, 54));
        DataCadastro.setForeground(new java.awt.Color(169, 169, 169));

        TipoVinho.setBackground(new java.awt.Color(94, 31, 54));
        TipoVinho.setForeground(new java.awt.Color(169, 169, 169));

        RegiaoVinho.setBackground(new java.awt.Color(94, 31, 54));
        RegiaoVinho.setForeground(new java.awt.Color(169, 169, 169));

        MarcaVinho.setBackground(new java.awt.Color(94, 31, 54));
        MarcaVinho.setForeground(new java.awt.Color(169, 169, 169));

        BotaoConfirma.setBackground(new java.awt.Color(94, 31, 54));
        BotaoConfirma.setForeground(new java.awt.Color(169, 169, 169));
        BotaoConfirma.setText("Cadastrar");
        BotaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmaActionPerformed(evt);
            }
        });

        BotaoMenu.setBackground(new java.awt.Color(94, 31, 54));
        BotaoMenu.setForeground(new java.awt.Color(169, 169, 169));
        BotaoMenu.setText("Menu");
        BotaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/header.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do vinho :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descrição do vinho :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade em estoque :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preço do vinho :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de cadastro :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo do vinho :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Região de fabricação :");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Marca do vinho :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoMenu)
                .addGap(112, 112, 112)
                .addComponent(BotaoConfirma)
                .addGap(217, 217, 217))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InserirDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InserirNome, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoVinho, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegiaoVinho, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaVinho, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InserirNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InserirDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoVinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(RegiaoVinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaVinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoConfirma)
                    .addComponent(BotaoMenu))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InserirNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirNomeActionPerformed

    }//GEN-LAST:event_InserirNomeActionPerformed

    private void BotaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenuActionPerformed
        super.dispose();
    }//GEN-LAST:event_BotaoMenuActionPerformed

    private void BotaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmaActionPerformed
        try {
            String nome = "";
            String descricao = "";
            int quant_estoque = 0;
            double preco = 0.0;
            String data_cadastro = "";
            String tipo = "";
            String regiao = "";
            String marca = "";

            if (this.InserirNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.InserirNome.getText();
            }
            if (this.InserirDesc.getText().length() < 2) {
                throw new Mensagens("Descrição deve conter ao menos 2 caracteres.");
            } else {
                descricao = this.InserirDesc.getText();
            }
            if (this.QuantEstoque.getText().length() <= 0) {
                throw new Mensagens("Qauntidade em estoque deve ser número e maior que zero.");
            } else {
                quant_estoque = Integer.parseInt(this.QuantEstoque.getText());
            }
            if (this.Preco.getText().length() <= 0.0) {
                throw new Mensagens("Preço deve ser número e maior que zero.");
            } else {
                preco = Double.parseDouble(this.Preco.getText());
            }
            if (this.DataCadastro.getText().length() < 2) {
                throw new Mensagens("Data de Cadastro deve conter uma data.");
            } else {
                data_cadastro = this.DataCadastro.getText();
            }
            if (this.TipoVinho.getText().length() < 2) {
                throw new Mensagens("Tipo deve conter ao menos 2 caracteres.");
            } else {
                tipo = this.TipoVinho.getText();
            }
            if (this.RegiaoVinho.getText().length() < 2) {
                throw new Mensagens("Região deve conter ao menos 2 caracteres.");
            } else {
                regiao = this.RegiaoVinho.getText();
            }
            if (this.MarcaVinho.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.MarcaVinho.getText();
            }
            ArrayList<Vinho> minhalista = new ArrayList<>();
            minhalista = objVinho.getMinhaLista();
            boolean flag = false;
            for (Vinho v : minhalista) {
                if (nome.equals(v.getNome())) {
                    flag = true;
                }
            }
            if (flag == true) {
                throw new Mensagens("Vinho Existente");

            }

            if (this.objVinho.InsertVinhoBD(tipo, regiao, marca, nome, descricao, quant_estoque, preco, data_cadastro)) {
                JOptionPane.showMessageDialog(rootPane, "Vinho Cadastrado com Sucesso!");

                this.InserirNome.setText("");
                this.InserirDesc.setText("");
                this.QuantEstoque.setText("");
                this.Preco.setText("");
                this.DataCadastro.setText("");
                this.TipoVinho.setText("");
                this.RegiaoVinho.setText("");
                this.MarcaVinho.setText("");
            }
            System.out.println(this.objVinho.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao converter número.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroVinho.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotaoConfirmaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirma;
    private javax.swing.JButton BotaoMenu;
    private javax.swing.JTextField DataCadastro;
    private javax.swing.JTextField InserirDesc;
    private javax.swing.JTextField InserirNome;
    private javax.swing.JTextField MarcaVinho;
    private javax.swing.JTextField Preco;
    private javax.swing.JTextField QuantEstoque;
    private javax.swing.JTextField RegiaoVinho;
    private javax.swing.JTextField TipoVinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
