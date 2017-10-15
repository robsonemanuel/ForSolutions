package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.dao.ClienteDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
public class cadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form cadastro
     */
    public cadastroCliente() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        readJtable(); // pra carregar no inicio

    }

    public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        ClienteDAO cliDao = new ClienteDAO();
        modelo.setNumRows(0); // tira a duplicidade de regitros na tabela

        for (Cliente c : cliDao.read()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getCpf(),
                c.getLogradouro(),
                c.getNumero(),
                c.getTelefone(),
                c.getCelular(),
                c.getCnpj(),
                c.getBairro(),
                c.getCidade(),
                c.getCep(),
                c.getEstado()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroCasa = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtCnpj = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnFechar1 = new javax.swing.JButton();

        jButton5.setText("Fechar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nº:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Celular:");

        txtNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCasaActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cidade:");

        txtCpf.setBackground(new java.awt.Color(255, 252, 169));
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cep");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bairro:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-mail:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtCnpj.setBackground(new java.awt.Color(255, 252, 169));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CNPJ:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Logradouro:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefone:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "email", "cpf", "logradouro", "nº casa", "tel", "cel", "cnpj", "bairro", "cidade", "cep", "estado"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnFechar1.setText("Fechar");
        btnFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNumeroCasa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtTel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtLogradouro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnFechar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnFechar1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnCadastrar)
                .addGap(56, 56, 56)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabela.getSelectedRow() != -1F) {
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            c.setId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));

            dao.delete(c);
            readJtable();
            limpaCampo();
        } else {
            JOptionPane.showMessageDialog(null, "selecione um regitro para excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tabela.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            c.setNome(txtNome.getText());
            c.setEmail(txtEmail.getText());
            c.setCpf(txtCpf.getText());
            c.setLogradouro(txtLogradouro.getText());
            c.setNumero(Integer.parseInt(txtNumeroCasa.getText()));
            c.setTelefone(txtTel.getText());
            c.setCelular(txtCel.getText());
            c.setCnpj(txtCnpj.getText());
            c.setBairro(txtBairro.getText());
            c.setCidade(txtCidade.getText());
            c.setCep(txtCep.getText());
            c.setEstado(txtEstado.getText());
            c.setId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));

            dao.update(c);
            readJtable();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Cliente c = new Cliente();
        ClienteDAO dao = new ClienteDAO();

        String nCasa = "";
        JOptionPane.showMessageDialog(null, "n = " + txtNumeroCasa.getText());
        if (txtNumeroCasa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nº da casa invalido");
        } else if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nome invalido");
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "email invalido");
        } else if (txtLogradouro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Logradouro invalido");
        } else if (txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "cpf invalido");
        } else if (txtTel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "numero de telefone invalido");
        } else if (txtCel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "numero de celular invalido");
        } else if (txtBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bairro invalido invalido");
        } else if (txtCep.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "cep invalido");
        } else if (txtCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "cidade invalido");
        } else if (txtEstado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Estado invalido");
        } else {
            c.setNome(txtNome.getText());
            c.setEmail(txtEmail.getText());
            c.setCpf(txtCpf.getText());
            c.setLogradouro(txtLogradouro.getText());
            c.setNumero(Integer.parseInt(txtNumeroCasa.getText()));
            c.setTelefone(txtTel.getText());
            c.setCelular(txtCel.getText());
            c.setCnpj(txtCnpj.getText());
            c.setBairro(txtBairro.getText());
            c.setCidade(txtCidade.getText());
            c.setCep(txtCep.getText());
            c.setEstado(txtEstado.getText());
            dao.create(c);
            readJtable();
            limpaCampo();

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed
    public void validaCampo() {
        Cliente c = new Cliente();
        ClienteDAO dao = new ClienteDAO();
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nome invalido");
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "email invalido");
        } else if (txtLogradouro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Logradouro invalido");
        } else if (txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "cpf invalido");
        } else if (txtNumeroCasa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "numero da casa invalido");
        } else if (txtTel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "numero de telefone invalido");
        } else if (txtCel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "numero de celular invalido");
        } else if (txtBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bairro invalido invalido");
        } else if (txtCep.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "cep invalido");
        } else if (txtCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "cidade invalido");
        } else if (txtEstado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Estado invalido");
        } else {
            dao.create(c);
            readJtable();
            limpaCampo();

        }
    }

    public void limpaCampo() {
        txtNome.setText("");
        txtEmail.setText("");
        txtCpf.setText("");
        txtLogradouro.setText("");
        txtNumeroCasa.setText("");
        txtTel.setText("");
        txtCel.setText("");
        txtCnpj.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtEstado.setText("");

    }
    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCasaActionPerformed

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        if (tabela.getSelectedRow() != -1) {

            txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            txtCpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            txtLogradouro.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            txtNumeroCasa.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            txtTel.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            txtCel.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
            txtCnpj.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
            txtBairro.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
            txtCidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
            txtCep.setText(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
            txtEstado.setText(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_tabelaKeyReleased

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (tabela.getSelectedRow() != -1) {

            txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            txtCpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            txtLogradouro.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            txtNumeroCasa.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            txtTel.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            txtCel.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
            txtCnpj.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
            txtBairro.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
            txtCidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
            txtCep.setText(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
            txtEstado.setText(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFechar1ActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
