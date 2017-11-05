
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.bean.Fornecedor;



public class FornecedorDAO {
    public void create(Fornecedor fornecedor){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO fornecedor (nome_fornecedor,cnpj_fornecedor,mercadoria_fornecedor,contato_fornecedor)"
                    + "VALUES (?,?,?,?)");
            stmt.setString(1,fornecedor.getNome());
            stmt.setString(2,fornecedor.getCnpj());
            stmt.setString(3,fornecedor.getMercadoria());
            stmt.setString(4,fornecedor.getContato());
           
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastro realizado !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Fornecedor> read(){
        
      Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs=null;
       List<Fornecedor> fornecedor = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();
            while(rs.next()){
                Fornecedor forne = new Fornecedor();
                forne.setId(rs.getInt("id_fornecedor"));
                forne.setNome(rs.getString("nome_fornecedor"));
                forne.setCnpj(rs.getString("cnpj_fornecedor"));
                forne.setMercadoria(rs.getString("mercadoria_fornecedor"));
                forne.setContato(rs.getString("contato_fornecedor"));
                fornecedor.add(forne);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fornecedor;
    }
 public void update(Fornecedor fornecedor){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE fornecedor SET nome_fornecedor=?,cnpj_fornecedor=?,mercadoria_fornecedor=?, contato_fornecedor=? WHERE id_fornecedor=?");
            stmt.setString(1,fornecedor.getNome());
            stmt.setString(2,fornecedor.getCnpj());
            stmt.setString(3,fornecedor.getMercadoria());
            stmt.setString(4,fornecedor.getContato());
            
            stmt.setInt(5,fornecedor.getId());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   
 
 public void delete(Fornecedor fornecedor){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE id_fornecedor=?");
            stmt.setInt(1,fornecedor.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   
}
