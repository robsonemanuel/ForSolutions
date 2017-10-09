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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Pagamento;
import model.bean.VendaProduto;

/**
 *
 * @author BOBSON
 */
public class VendaDAO {
    public void create(Pagamento p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("Insert into pagamento(valor,forma_pagamento,vezes)values(?,?,?)");
            stmt.setFloat(1,p.getValor());
            stmt.setString(2,p.getForma_pagamento());
            stmt.setInt(3,p.getVezes());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Salvar"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
     public void createVendaProduto(VendaProduto p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
        try {
            
            
            stmt = con.prepareStatement("Insert into vendaproduto(descricao,quantidade,valor,id_pagamento)values(?,?,?,?)");
            stmt.setString(1,p.getDescricao());
            stmt.setInt(2,p.getQuantidade());
            stmt.setFloat(3,p.getValor());
            stmt.setInt(4,p.getId_pagamento());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Salvar"+ex);
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
           
            stmt = con.prepareStatement("select id_pagamento from pagamento order by id_pagamento desc limit 1");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getInt("id_pagamento");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
      
       return valor;
     }
    
}
