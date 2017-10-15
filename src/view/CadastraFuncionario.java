/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.bean.Departamento;
import model.bean.Funcionario;
import model.dao.CadFuncionarioDAO;
import model.dao.LoginDAO;

/**
 *
 * @author LUCAS
 */
public class CadastraFuncionario extends javax.swing.JFrame {
    MaskFormatter ftmCpf;
    MaskFormatter ftmTel;
    MaskFormatter ftmData;
    
    
    
    /**
     * Creates new form CadastraFuncionario
     */
    public CadastraFuncionario() {
        initComponents();
        CadFuncionarioDAO cfdao = new CadFuncionarioDAO();
        List<String> dpto = cfdao.buscaDepartamento();
        String str = null;
        for(int i = 0;i<dpto.size(); i++ ){
            str = (String) dpto.get(i).toString();
            comboDepartamento.addItem(str);
            
        }       
        
        List<String> crg = cfdao.buscaCargo();
        String str1 = null;
        for(int i = 0;i<crg.size(); i++ ){
            str1 = (String) crg.get(i).toString();
            comboCargo.addItem(str1);
            
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edt_nome = new javax.swing.JTextField();
        try {     ftmCpf = new MaskFormatter("###.###.###-##"); } catch (ParseException e) {     e.printStackTrace(); }
        edt_cpf = new javax.swing.JFormattedTextField();
        this.edt_cpf = new JFormattedTextField(ftmCpf);
        try {     ftmTel = new MaskFormatter("(##)####-#####"); } catch (ParseException e) {     e.printStackTrace(); }
        edt_tel = new javax.swing.JFormattedTextField();
        this.edt_tel = new JFormattedTextField(ftmTel);
        try {     ftmData = new MaskFormatter("##/##/####"); } catch (ParseException e) {     e.printStackTrace(); }
        edt_dtad = new javax.swing.JFormattedTextField();
        this.edt_dtad = new JFormattedTextField(ftmData);
        edt_logra = new javax.swing.JTextField();
        edt_email = new javax.swing.JTextField();
        edt_num = new javax.swing.JTextField();
        comboDepartamento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboCargo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edt_senha1 = new javax.swing.JPasswordField();
        edt_senha2 = new javax.swing.JPasswordField();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Logradouro:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Admissao:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nº:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");

        edt_cpf.setColumns(11);
        edt_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_cpfActionPerformed(evt);
            }
        });

        edt_tel.setColumns(11);

        edt_dtad.setColumns(8);
        edt_dtad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_dtadActionPerformed(evt);
            }
        });

        comboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Departamento:");

        comboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CADASTRO DE FUNCIONÁRIO");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Senha:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirme a senha:");

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_cpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_tel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_dtad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_logra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_num, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboDepartamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_cadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_senha1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edt_senha2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_alterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_excluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_pesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edt_senha1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edt_senha2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(318, 318, 318)
                            .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edt_nome)
                                .addComponent(edt_dtad)
                                .addComponent(edt_tel)
                                .addComponent(edt_logra, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                                .addComponent(edt_email)
                                .addComponent(edt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(52, 52, 52)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edt_logra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edt_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edt_dtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(edt_senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(edt_senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void comboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentoActionPerformed
         
    }//GEN-LAST:event_comboDepartamentoActionPerformed

    private void comboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCargoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public boolean verificaCampo(){
        boolean checkGeral = false;
        boolean check = false;
        boolean checkNome = false;
        boolean checkCpf = false;
        boolean checkEmail = false;
        boolean checkTel = false;
        boolean checkDt = false;
        boolean checkLogra = false;
        boolean checkNum = false;
        
        
        String senha1 = edt_senha1.getText();
        String senha2 = edt_senha2.getText();
        if(!senha1.equals("")){
            if(senha1.equals(senha2)){
                check = true;
            }else{
                JOptionPane.showMessageDialog(null,"Senhas não conferem");
                check = false;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Por favor insira a senha");
            check = false;
        }
        
        if(check == true){
        
            if(edt_nome.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira o nome");checkNome = false;
            }else
                checkNome = true;
            
            if(edt_cpf.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira o CPF");checkCpf = false;
            }else
                checkCpf = true;
            
            if(edt_email.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira o email");checkEmail = false;
            }else
                checkEmail = true;
            
            if(edt_tel.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira o Telefone");checkTel = false;
            }else
                checkTel = true;
            
            if(edt_logra.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira o Logradouro");checkLogra = false;
            }else
                checkLogra = true;
            
            if(edt_num.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira o numero");checkNum = false;
            }else
                checkNum = true;
            
            if(edt_dtad.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Por favor insira a data de adimissão");checkDt = false;
            }else
                checkDt = true;           
        }
        
        if(checkNome && checkCpf && checkEmail && checkTel && checkDt && checkLogra && checkNum){
            checkGeral = true;
        }else{
            checkGeral = false;
        } 
        
        return checkGeral;
    }
    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        if(verificaCampo()){
            CadFuncionarioDAO cfdao = new CadFuncionarioDAO();
            cfdao.createLogin(edt_nome.getText(), edt_senha1.getText());
            String cargo_selecionado = (String) comboCargo.getSelectedItem();
            String dept_selecionado = (String) comboDepartamento.getSelectedItem();       
            int id_cargo = cfdao.buscaCodCargo(cargo_selecionado);
            int id_depto = cfdao.buscaCodDepartamento(dept_selecionado);
            int id_log   = cfdao.buscaCodLogin(edt_nome.getText());
            float salario = cfdao.buscaSalario(cargo_selecionado);
            int num = Integer.parseInt(edt_num.getText());
            Funcionario f = new Funcionario (salario,dept_selecionado,cargo_selecionado,edt_dtad.getText(),id_log,edt_cpf.getText(),edt_email.getText(),
            edt_nome.getText(),edt_logra.getText(),num,edt_tel.getText());       
            if(cfdao.create(f, id_cargo, id_depto)){
                edt_nome.setText("");
                edt_cpf.setText("");
                edt_tel.setText("");
                edt_email.setText("");
                edt_logra.setText("");
                edt_num.setText("");
                edt_dtad.setText("");
                edt_senha1.setText("");
                edt_senha2.setText("");
            }
            
        }else{
            //JOptionPane.showMessageDialog(null,"EXISTEM CAMPOS INVALIDOS");
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void edt_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_cpfActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        if(verificaCampo()){
            CadFuncionarioDAO cfdao = new CadFuncionarioDAO();        
            String cargo_selecionado = (String) comboCargo.getSelectedItem();
            String dept_selecionado = (String) comboDepartamento.getSelectedItem();       
            int id_cargo = cfdao.buscaCodCargo(cargo_selecionado);
            int id_depto = cfdao.buscaCodDepartamento(dept_selecionado); 
            int num = Integer.parseInt(edt_num.getText());
            float salario = cfdao.buscaSalario(cargo_selecionado);
            int id_log   = cfdao.buscaCodLogin(edt_nome.getText());
            Funcionario f = new Funcionario (salario,dept_selecionado,cargo_selecionado,edt_dtad.getText(),id_log,edt_cpf.getText(),edt_email.getText(),
            edt_nome.getText(),edt_logra.getText(),num,edt_tel.getText());                     
            cfdao.update(f, id_cargo, id_depto);
            LoginDAO ldao = new LoginDAO();        
            ldao.update(f.getLogin(), edt_senha1.getText());
                edt_nome.setText("");
                edt_cpf.setText("");
                edt_tel.setText("");
                edt_email.setText("");
                edt_logra.setText("");
                edt_num.setText("");
                edt_dtad.setText("");
                edt_senha1.setText("");
                edt_senha2.setText("");
        }else{
            
        }
        
        
        
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        CadFuncionarioDAO cfdao = new CadFuncionarioDAO();    
        LoginDAO ldao = new LoginDAO();
        String cpf = edt_cpf.getText();
        Funcionario fun = cfdao.select(cpf); 
        cfdao.delete(fun);
        ldao.delete(fun.getLogin());
        edt_nome.setText("");
        edt_cpf.setText("");
        edt_tel.setText("");
        edt_email.setText("");
        edt_logra.setText("");
        edt_num.setText("");
        edt_dtad.setText("");
        edt_senha1.setText("");
        edt_senha2.setText("");
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        CadFuncionarioDAO cfdao = new CadFuncionarioDAO();         
        String cpf = edt_cpf.getText();
        Funcionario fun = cfdao.select(cpf); 
        String senha = cfdao.buscaSenhaLogin(fun.getLogin());
        comboCargo.addItem(fun.getCargo());            
        comboDepartamento.addItem(fun.getDepartamento());        
        edt_nome.setText(fun.getNome());
        edt_email.setText(fun.getEmail());
        edt_logra.setText(fun.getLogradouro());        
        edt_num.setText(Integer.toString(fun.getNumero()));
        edt_dtad.setText(fun.getData_admissao());
        edt_tel.setText(fun.getTelefone());
        edt_senha1.setText(senha);
        edt_senha2.setText(senha);
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void edt_dtadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_dtadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_dtadActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JComboBox<String> comboDepartamento;
    private javax.swing.JFormattedTextField edt_cpf;
    private javax.swing.JFormattedTextField edt_dtad;
    private javax.swing.JTextField edt_email;
    private javax.swing.JTextField edt_logra;
    private javax.swing.JTextField edt_nome;
    private javax.swing.JTextField edt_num;
    private javax.swing.JPasswordField edt_senha1;
    private javax.swing.JPasswordField edt_senha2;
    private javax.swing.JFormattedTextField edt_tel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
