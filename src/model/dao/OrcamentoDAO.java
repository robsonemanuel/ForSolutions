
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Orcamento;

/**
 *
 * @author José wilton
 */
public class OrcamentoDAO {
    private  Connection con = null;
    
    public OrcamentoDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save (Orcamento orcamento){
        String sql="INSERT INTO orcamento (valorservico,valorpeca,telefone,nome_cliente,descricao)VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setFloat(1, orcamento.getValorServico());
            stmt.setFloat(2, orcamento.getValorPeca());
            stmt.setString(3, orcamento.getTelefone());
            stmt.setString(4, orcamento.getNome());
            stmt.setString(5, orcamento.getDescricao());
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
           
            stmt = con.prepareStatement("select idorcamento from orcamento order by idorcamento desc limit 1");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getInt("idorcamento");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
      
       return valor;
     }
}
