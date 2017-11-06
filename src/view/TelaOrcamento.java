package view;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import connection.ConnectionFactory;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;
import model.bean.Orcamento;
import model.bean.Produto;
import model.dao.EstoqueProdutoDAO;
import model.dao.OrcamentoDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author José
 */
public class TelaOrcamento extends javax.swing.JFrame {

    public TelaOrcamento() {
        initComponents();

        EstoqueProdutoDAO dao = new EstoqueProdutoDAO();

        for (Produto p : dao.readOrderByAsc()) {
            cbPecas.addItem(p);
             
        }
    }

    Orcamento orcamento = new Orcamento();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtValServico = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoAnalise = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        cbPecas = new javax.swing.JComboBox<>();
        txtAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPeca = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome do Cliente: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ORÇAMENTO");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor do serviço: ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Peça Utilizada:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descrição da análise realizada:");

        txtDescricaoAnalise.setColumns(20);
        txtDescricaoAnalise.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoAnalise);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modelo do Aparelho:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        cbPecas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Peça" }));
        cbPecas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPecasItemStateChanged(evt);
            }
        });
        cbPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPecasMouseClicked(evt);
            }
        });
        cbPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPecasActionPerformed(evt);
            }
        });
        cbPecas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbPecasKeyPressed(evt);
            }
        });

        txtAdd.setText("Adicionar Peça");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        jtPeca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "QTDE", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtPeca);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peças usadas");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNomeCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtTelefoneCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtValServico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnGravar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbPecas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValServico, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void geraPdf() {
        OrcamentoDAO orc = new OrcamentoDAO();
        Document documento = new Document();

        Date dataHoraAtual = new Date();
        Float valorServ = ParseFloat(txtValServico.getText());
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("orcamento.pdf"));

            documento.open(); // abrindo o documento
            //criando as fontes e personalizando os textos
            Font fontCabecalho = new Font(FontFamily.HELVETICA, 18, Font.BOLD,
                    BaseColor.BLUE);
            Font dadosCliente = new Font(FontFamily.HELVETICA, 14, Font.BOLD,
                    BaseColor.BLACK);
            Font dadosLogo = new Font(FontFamily.HELVETICA, 8, Font.BOLD,
                    BaseColor.BLUE);
            Paragraph logo = new Paragraph("For Solutions", dadosLogo);
            logo.setAlignment((int) LEFT_ALIGNMENT);
            documento.add(logo);
            Paragraph cabecalho = new Paragraph("Orcamento do serviço", fontCabecalho);
            cabecalho.setAlignment(Element.ALIGN_CENTER);
            documento.add(cabecalho);
            Paragraph divisor = new Paragraph("_______________________________________________________________________");
            Paragraph dados = new Paragraph("Dados do cliente ", dadosCliente);
            dados.setAlignment(Element.ALIGN_CENTER);
            documento.add(divisor);
            documento.add(dados);
            Paragraph nome = new Paragraph("Nome: " + txtNomeCliente.getText());
            documento.add(nome);
            Paragraph tel = new Paragraph("Telefone: " + txtTelefoneCliente.getText());
            documento.add(tel);
            Paragraph nOrc = new Paragraph("Nº Orçamento: "+orc.readUltimoId() );
            documento.add(nOrc);
            Paragraph div3 = new Paragraph("_______________________________________________________________________");
            documento.add(div3);
            Paragraph descriModel = new Paragraph("Informações do Aparelho: ", dadosCliente);
            descriModel.setAlignment(Element.ALIGN_CENTER);
            documento.add(descriModel);
            Paragraph modelo = new Paragraph("Modelo do Aparelho: " + txtModelo.getText());
            documento.add(modelo);
            Paragraph div = new Paragraph("_______________________________________________________________________");
            documento.add(div);
            Paragraph info = new Paragraph("Dados do Serviço ", dadosCliente);
            info.setAlignment(Element.ALIGN_CENTER);
            documento.add(info);
            
            for (int i = 0; i < jtPeca.getRowCount(); i++) {
                String desc = jtPeca.getValueAt(i, 0).toString();
                String quantidade = jtPeca.getValueAt(i, 1).toString();
                String valor = jtPeca.getValueAt(i, 2).toString();
                Paragraph pecas = new Paragraph("Descrição das Peças: " + desc + "\n" + "Valor: R$" + valor + "\n" + "Quant: " + quantidade + "\n");
                documento.add(pecas);
                float valPeca = Float.parseFloat(valor);
                float quantPeca = Float.parseFloat(quantidade);
                float totalPecas = valPeca * quantPeca;
                float valObra = Float.parseFloat(txtValServico.getText());
                float totalPagar = totalPecas + valObra;
               Paragraph serv = new Paragraph("Valor da mão de obra: " +valorServ);
                documento.add(serv);
                Paragraph total = new Paragraph("Valor total a Pagar: " + totalPagar);
                documento.add(total);

            }
             
                Paragraph defeito = new Paragraph("Descrição do defeito: " + txtDescricaoAnalise.getText());
                documento.add(defeito);

            Paragraph div2 = new Paragraph("_______________________________________________________________________");
            div.setAlignment(Element.ALIGN_CENTER);
            documento.add(div2);
            Paragraph docData = new Paragraph("Conserto reailzado em: " + data);
            documento.add(docData);
            Paragraph docHora = new Paragraph("Hora: " + hora);
            documento.add(docHora);
            //Paragraph total = new Paragraph("Total a pagar:" + Valtotal);
            //documento.add(total);

            JOptionPane.showMessageDialog(null, "PDF gerado com sucesso ! ");

        } catch (FileNotFoundException | DocumentException ex) {
            JOptionPane.showMessageDialog(null, "erro ao gerar o pdf " + ex);
        } finally {
            documento.close();
        }
        try {
            Desktop.getDesktop().open(new File("orcamento.pdf")); // vai abrir o pdf assim que for gerado
        } catch (IOException ex) {
            Logger.getLogger(TelaOrcamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    float ParseFloat(String strNumber) {
   if (strNumber != null && strNumber.length() > 0) {
       try {
          return Float.parseFloat(strNumber);
       } catch(Exception e) {
          return -1;   // or some value to mark this field is wrong. or make a function validates field first ...
       }
   }
   else return 0;
}

    
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Orcamento orc = new Orcamento();
        OrcamentoDAO orcDao = new OrcamentoDAO();
        orc.setValorServico(ParseFloat(txtValServico.getText()));
          float count=0;
        for (int i=0; i<=jtPeca.getRowCount()-1;i++) {
        count+=Float.parseFloat(jtPeca.getValueAt(i, 2).toString());
       }
        orc.setValorPeca(count);
        orc.setTelefone(txtTelefoneCliente.getText());
        orc.setNome(txtNomeCliente.getText());
        orc.setDescricao(txtDescricaoAnalise.getText());
        
        if (txtNomeCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do cliente para continuar");
        } else if (txtTelefoneCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o telefone do cliente para continuar");
        } else if (txtDescricaoAnalise.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "informe a descrição do defeito para continuar");
        } else if (txtModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "informe o modelo do aparelho para continuar");
        }else if (txtValServico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "informe o valor do serviço continuar");
        } else {
            orcDao.save(orc);
            geraPdf();
            limpaCampo();
            limpaTabela();
        }
        

    }//GEN-LAST:event_btnGravarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void cbPecasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPecasItemStateChanged


    }//GEN-LAST:event_cbPecasItemStateChanged

    private void cbPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPecasMouseClicked

    }//GEN-LAST:event_cbPecasMouseClicked

    private void cbPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPecasActionPerformed

    private void cbPecasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbPecasKeyPressed

    }//GEN-LAST:event_cbPecasKeyPressed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        Produto produto = (Produto) cbPecas.getSelectedItem();
        DefaultTableModel dtmProdutos = (DefaultTableModel) jtPeca.getModel();
        Object[] dados = {produto.getDescricao(), "1", produto.getValor()};
        dtmProdutos.addRow(dados);
        
    }//GEN-LAST:event_txtAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void limpaCampo() {
        txtNomeCliente.setText("");
        txtValServico.setText("");
        txtModelo.setText("");
        txtDescricaoAnalise.setText("");
        txtTelefoneCliente.setText("");
    }
public void limpaTabela(){
        DefaultTableModel tblRemove = (DefaultTableModel)jtPeca.getModel();
        if (tblRemove.getRowCount() > 0){
            for (int i=1;i<=tblRemove.getRowCount();i++){
                tblRemove.removeRow(0);
            }            
        }
    }
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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<Object> cbPecas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtPeca;
    private javax.swing.JButton txtAdd;
    private javax.swing.JTextArea txtDescricaoAnalise;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    private javax.swing.JTextField txtValServico;
    // End of variables declaration//GEN-END:variables
}
