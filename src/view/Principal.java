/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionFactory;
import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.bean.MySQLBackup;

public class Principal extends javax.swing.JFrame {

    int nivel = Login.level;

    public Principal() {
        initComponents();
        acesso();
        setExtendedState(MAXIMIZED_BOTH);// abrir com tela cheia
    }

    public void acesso() {
        switch (nivel) {
            case 1:
                // nivel do atendente
                menu_func.setVisible(false); // tela de cadastro funcionarios
                menu_fornecedores.setVisible(false);// tela de fornecedores
                menu_produto.setVisible(false);// cadastro de produtos no estoque
                menu_manutencao.setVisible(false);//// tela de manutenção
                //menu_estoque.setVisible(false);// tela de estoque
                menu_contas.setVisible(false); //  contas a pagar e receber
                break;
            case 2:
                //nivel do gerente
                menu_func.setVisible(true); // tela de cadastro funcionarios
                menu_fornecedores.setVisible(true);// tela de fornecedores
                menu_produto.setVisible(true);// cadastro de produtos no estoque
                menu_contas.setVisible(true); //  contas a pagar e receber
                menu_manutencao.setVisible(true);// tela de manutenção
                menu_cad_cli.setVisible(true); // cadastro de cliente
                menu_vendas.setVisible(true); // tela de vendas e orçamento
                break;
            case 3:
                // nivel do tecnico
                menu_func.setVisible(false); // tela de cadastro funcionarios
                menu_fornecedores.setVisible(false);// tela de fornecedores
                menu_produto.setVisible(false);// cadastro de produtos no estoque
                menu_contas.setVisible(false); //  contas a pagar e receber
                menu_manutencao.setVisible(true);// tela de manutenção
                menu_cad_cli.setVisible(false); // cadastro de cliente
                menu_vendas.setVisible(false); // tela de vendas e orçamento

                break;
            default:
                menu_cad_cli.setVisible(false); // cadastro de cliente
                menu_func.setVisible(false); // tela de cadastro funcionarios
                menu_fornecedores.setVisible(false);// tela de fornecedores
                menu_produto.setVisible(false);// cadastro de produtos no estoque
                menu_manutencao.setVisible(false);//// tela de manutenção
                menu_contas.setVisible(false); //  contas a pagar e receber
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        menu_cad_cli = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        menu_fornecedores = new javax.swing.JMenuItem();
        menu_func = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menu_produto = new javax.swing.JMenuItem();
        menu_contas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menu_vendas = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menu_manutencao = new javax.swing.JMenu();
        menu_manu = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_estoque = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_bk = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        jMenu8.setText("Clientes");

        menu_cad_cli.setText("Cadastros");
        menu_cad_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cad_cliActionPerformed(evt);
            }
        });
        jMenu8.add(menu_cad_cli);

        jMenuItem15.setText("Pesquisar Clientes");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenu1.add(jMenu8);

        menu_fornecedores.setText("Fornecedores");
        menu_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_fornecedoresActionPerformed(evt);
            }
        });
        jMenu1.add(menu_fornecedores);

        menu_func.setText("Funcionários");

        jMenuItem5.setText("Funcionário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_func.add(jMenuItem5);

        jMenuItem6.setText("Departamento");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu_func.add(jMenuItem6);

        jMenuItem7.setText("Cargo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menu_func.add(jMenuItem7);

        jMenu1.add(menu_func);

        menu_produto.setText("Produtos");
        menu_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_produtoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_produto);

        menu_contas.setText("Contas");

        jMenuItem3.setText("Contas a Pagar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_contas.add(jMenuItem3);

        jMenuItem8.setText("Contas a Receber");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menu_contas.add(jMenuItem8);

        jMenu1.add(menu_contas);

        jMenuBar1.add(jMenu1);

        menu_vendas.setText("Vendas");

        jMenuItem9.setText("Venda");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menu_vendas.add(jMenuItem9);

        jMenuItem10.setText("Orcamento");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menu_vendas.add(jMenuItem10);

        jMenuBar1.add(menu_vendas);

        menu_manutencao.setText("Manutencoes");

        menu_manu.setText("Manutencao");
        menu_manu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_manuActionPerformed(evt);
            }
        });
        menu_manutencao.add(menu_manu);

        jMenuBar1.add(menu_manutencao);

        jMenu6.setText("Estoque");

        menu_estoque.setText("Produtos");
        menu_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_estoqueActionPerformed(evt);
            }
        });
        jMenu6.add(menu_estoque);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ajuda");

        jMenuItem13.setText("Suporte");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuBar1.add(jMenu7);

        jMenu2.setText("Opções");

        menu_bk.setText("Backup");
        menu_bk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_bkActionPerformed(evt);
            }
        });
        jMenu2.add(menu_bk);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(628, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_produtoActionPerformed
        CadastroProduto produto = new CadastroProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_menu_produtoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ContasPagar ContPag = new ContasPagar();
        ContPag.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menu_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_fornecedoresActionPerformed
        Tela_Fornecedor fornecedor = new Tela_Fornecedor();
        fornecedor.setVisible(true);
    }//GEN-LAST:event_menu_fornecedoresActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CadastraFuncionario funcionario = new CadastraFuncionario();
        funcionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CadastraDepartamento departamento = new CadastraDepartamento();
        departamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CadastraCargo cargo = new CadastraCargo();
        cargo.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ContasReceber ContReceb = new ContasReceber();
        ContReceb.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Vendas venda = new Vendas();
        venda.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        TelaOrcamento orcamento = new TelaOrcamento();
        orcamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void menu_manuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_manuActionPerformed
        TelaManutencao manu = new TelaManutencao();
        manu.setVisible(true);
    }//GEN-LAST:event_menu_manuActionPerformed

    private void menu_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_estoqueActionPerformed
        PesquisarProduto produto = new PesquisarProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_menu_estoqueActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Contato contato = new Contato();
        contato.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void menu_cad_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cad_cliActionPerformed
        cadastroCliente cliente = new cadastroCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_menu_cad_cliActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        PesquisarCliente cli = new PesquisarCliente();
        cli.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void menu_bkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_bkActionPerformed
          MySQLBackup bk =new  MySQLBackup();  
    }//GEN-LAST:event_menu_bkActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menu_bk;
    private javax.swing.JMenuItem menu_cad_cli;
    private javax.swing.JMenu menu_contas;
    private javax.swing.JMenuItem menu_estoque;
    private javax.swing.JMenuItem menu_fornecedores;
    private javax.swing.JMenu menu_func;
    private javax.swing.JMenuItem menu_manu;
    private javax.swing.JMenu menu_manutencao;
    private javax.swing.JMenuItem menu_produto;
    private javax.swing.JMenu menu_vendas;
    // End of variables declaration//GEN-END:variables
}
