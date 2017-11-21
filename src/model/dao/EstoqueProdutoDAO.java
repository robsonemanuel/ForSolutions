
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
import model.bean.Produto;


public class EstoqueProdutoDAO {
    public void create(Produto p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("INSERT INTO produto(descricao,quantidade,valor) VALUES(?,?,?)");
            stmt.setString(1,p.getDescricao());
            stmt.setInt(2,p.getQuantidade());
            stmt.setFloat(3,p.getValor());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar"+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
     
    public List<Produto> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("idproduto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getFloat("valor"));
                produto.setData_entrada(rs.getString("data_entrada"));
                produtos.add(produto);
       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
     public List<Produto> readOrderByAsc(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       
       List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto ORDER BY descricao");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("idproduto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getFloat("valor"));
                produto.setData_entrada(rs.getString("data_entrada"));
                produtos.add(produto);
       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    public void update(Produto p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("UPDATE produto SET descricao = ?,quantidade = ?,valor = ? WHERE idproduto = ?");
            stmt.setString(1,p.getDescricao());
            stmt.setInt(2,p.getQuantidade());
            stmt.setFloat(3,p.getValor());
            stmt.setInt(4,p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar"+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
     public void delete(Produto p){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE idproduto = ?");
           
            stmt.setInt(1,p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
     
     public List<Produto> readForDesc(String desc){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            stmt.setString(1,"%"+desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("idproduto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getFloat("valor"));
                produto.setData_entrada(rs.getString("data_entrada"));
                produtos.add(produto);
       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
     
      public void selectCod(int cod){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       
        try {

            stmt = con.prepareStatement("UPDATE produto set quantidade = quantidade - 1 where  idproduto = ?");
            stmt.setInt(1,cod);            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar baixa no estoque -> "+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }

      }
      
       public void selectCodQtde(int qtd,int cod){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       
        try {

            stmt = con.prepareStatement("UPDATE produto set quantidade = quantidade - ? where idproduto = ?");
            stmt.setInt(1,qtd);
            stmt.setInt(2,cod);             
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar baixa no estoque -> "+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }

      }
        
     public float SelectValor(int cod){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       float val=0;
        try {
            stmt = con.prepareStatement("select valor from produto where idproduto = ?");
            stmt.setInt(1,cod);
           
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                val = (rs.getFloat("valor"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return val;
        
        

    }
     
      public List<Produto> readWhereId(int cod){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto where idproduto = ?");
            stmt.setInt(1,cod);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("idproduto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValor(rs.getFloat("valor"));
                produto.setData_entrada(rs.getString("data_entrada"));
                produtos.add(produto);
       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
}
