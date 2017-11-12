
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.ContaPagar;


public class ContasAPagarDAO {
     public void create(ContaPagar c){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("insert into contaspagar(descricao,valor,data_vencimento)values(?,?,?)");
            stmt.setString(1,c.getDesc());
            stmt.setFloat(2, c.getValor());
            stmt.setString(3,c.getData_venc());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
     }
    }
     
     
    public List<ContaPagar> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<ContaPagar> contas = new ArrayList<>();
       
         try {
             stmt = con.prepareStatement("SELECT * FROM contaspagar WHERE YEAR(data_vencimento) = YEAR(now()) AND MONTH(data_vencimento) =  MONTH(now())");
             rs = stmt.executeQuery();
             while(rs.next()){
                ContaPagar conta = new ContaPagar();
                conta.setCodigo(rs.getInt("id"));
                conta.setDesc(rs.getString("descricao"));
                conta.setValor(rs.getFloat("valor"));
                conta.setData_venc(rs.getString("data_vencimento"));
                contas.add(conta);
             }
         } catch (SQLException ex) {
             Logger.getLogger(ContasAPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
       return contas;
    }
    
     public void update(ContaPagar c){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("update contaspagar set descricao = ?,valor = ?,data_vencimento = ? where id=?");
            stmt.setString(1,c.getDesc());
            stmt.setFloat(2, c.getValor());
            stmt.setString(3,c.getData_venc());
            stmt.setInt(4, c.getCodigo());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
     }
    }
     
      public void delete(ContaPagar c){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("delete from contaspagar where id=?");
            stmt.setInt(1, c.getCodigo());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
     }
    }
      
    public float somaDespesas(){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       float valor=0;
        try {
           
            stmt = con.prepareStatement("select sum(valor) from contaspagar where year(data_vencimento) = year(now()) and month(data_vencimento) = month(now())");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getFloat("sum(valor)");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
         return valor;
    }
    
    public float somaDespesasSelecionada(String ano,String mes){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       float val=0;
        try {
            stmt = con.prepareStatement(" select sum(valor) from contaspagar where year(data_vencimento) = ? and month(data_vencimento) =?");
            stmt.setString(1,ano);
            stmt.setString(2,mes);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                val = (rs.getFloat("sum(valor)"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return val;
    }
    
     public float somaDespesasSalFuncionarios(){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       float valor=0;
        try {
           
            stmt = con.prepareStatement("select sum(salario) from cargo INNER JOIN funcionario ON cargo.idcargo = funcionario.idcargo");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getFloat("sum(salario)");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
         return valor;
    }
     
      public List<ContaPagar> Ano(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<ContaPagar> contas = new ArrayList<>();
       
         try {
             stmt = con.prepareStatement("SELECT DISTINCT YEAR(data_vencimento) FROM contaspagar ORDER BY YEAR(data_vencimento)");
             rs = stmt.executeQuery();
             while(rs.next()){
                ContaPagar conta = new ContaPagar();
                conta.setData_venc(rs.getString("YEAR(data_vencimento)"));
                contas.add(conta);
             }
         } catch (SQLException ex) {
             Logger.getLogger(ContasAPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
       return contas;
    }
     
     
}
