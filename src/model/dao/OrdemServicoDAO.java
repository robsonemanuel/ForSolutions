/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Orcamento;
import model.bean.Ordem_Servico;
import view.OrdemServico;

/**
 *
 * @author jose
 */
public class OrdemServicoDAO {
     private  Connection con = null;
    
    public OrdemServicoDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save (Ordem_Servico ordem){
        String sql="INSERT INTO ordem_servico (descri_prod, descri_def,nome_cliente)VALUES(?,?,?)";
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, ordem.getDescri_prod());
            stmt.setString(2, ordem.getDescri_def());
            stmt.setString(3, ordem.getNome());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com sucesso ! ");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   
    public int readUltimoId(){
      
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       int valor=0;
       
        try {
           
            stmt = con.prepareStatement("select id_ordem_servico from ordem_servico order by id_ordem_servico desc limit 1");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getInt("id_ordem_servico");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
      
       return valor;
     }
    }