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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Cargo;

/**
 *
 * @author LUCAS
 */
public class CargoDAO {
    
    
     public Cargo select(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       Cargo c = new Cargo();
        try {
            stmt = con.prepareStatement("SELECT * FROM Cargo");            
            rs = stmt.executeQuery();
            
            while(rs.next()){                                
                c.setNome((rs.getString("nome_cargo")));                                                               
                c.setSalario((rs.getFloat("salario")));   
                c.setId((rs.getInt("id")));   
                c.setId((rs.getInt("iddepartamento")));   
                //JOptionPane.showMessageDialog(null,"Selete de funconario com sucesso !");                                                       
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados de id login ->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
         return c;
    }
     
     public Boolean delete(int id){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       boolean check = false;
       
        try {
            stmt = con.prepareStatement("DELETE FROM cargo WHERE idcargo = ?");           
            stmt.setInt(1,id);          
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
            check = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
    }
     
     public Boolean update(int id,String cargo,Float salario,int idDp){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       boolean check = false;
       
        try {
            stmt = con.prepareStatement("UPDATE cargo SET nome_cargo=?,salario=?,iddepartamento=? WHERE idcargo=?");
            stmt.setString(1,cargo);                                                           
            stmt.setFloat(2,salario);                                                           
            stmt.setInt(3,idDp);                                                           
            stmt.setInt(4,id);                                                           
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            check = true;            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar"+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
     
     public List<Cargo> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Cargo> cargo = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT * FROM cargo");            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cargo d = new Cargo();             
                d.setId((rs.getInt("idcargo")));                                                               
                d.setNome((rs.getString("nome_cargo"))); 
                d.setSalario((rs.getFloat("salario"))); 
                d.setDpto((rs.getInt("iddepartamento"))); 
                cargo.add(d);                                                                       
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados de id login ->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
         return cargo;
    }
     
     public Boolean insert(Cargo c){
         boolean check = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cargo (nome_cargo,salario,iddepartamento) VALUES (?,?,?)");
            stmt.setString(1,c.getNome());            
            stmt.setFloat(2,c.getSalario());            
            stmt.setInt(3,c.getDpto());            
            stmt.executeUpdate();   
            check = true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Cargos: "+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
    
}
