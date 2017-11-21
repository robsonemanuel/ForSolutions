
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ContasAReceberDAO {
    public float somaLucro(){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       float valor=0;
        try {
           
            stmt = con.prepareStatement("select sum(valor) from pagamento where year(data_venda) = year(now()) and month(data_venda) = month(now())");
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
    
    public float somaLucroServico(){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       float valor=0;
        try {
           
            stmt = con.prepareStatement("select sum(valor_venda) from vendaservico where year(data_venda) = year(now()) and month(data_venda) = month(now())");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getFloat("sum(valor_venda)");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
         return valor;
    }
    
     public float somaLucroSelecionado(String ano,String mes){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       float val=0;
        try {
            stmt = con.prepareStatement("select sum(valor) from pagamento where year(data_venda) = ? and month(data_venda) =?");
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
     
       public float somaLucroSelecionadoServico(String ano,String mes){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       float val=0;
        try {
            stmt = con.prepareStatement("select sum(valor_venda) from vendaservico where year(data_venda) = ? and month(data_venda) =?");
            stmt.setString(1,ano);
            stmt.setString(2,mes);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                val = (rs.getFloat("sum(valor_venda)"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return val;
    }
   
}
