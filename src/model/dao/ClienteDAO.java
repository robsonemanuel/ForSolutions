
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
import model.bean.Cliente;


/**
 *
 * @author José wilton
 */
public class ClienteDAO {
    public void create(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome_cliente,email_cliente,cpf_cliente,"
                    + "logradouro_cliente,n_endereco_cliente,telefone_cliente,"
                    + "celular_cliente,cnpj_cliente,bairro_cliente,cep_cliente,cidade_cliente,estado_cliente)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getEmail());
            stmt.setString(3,cliente.getCpf());
            stmt.setString(4,cliente.getLogradouro());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getTelefone());
            stmt.setString(7,cliente.getCelular());
            stmt.setString(8,cliente.getCnpj());
            stmt.setString(9,cliente.getBairro());
            stmt.setString(10,cliente.getCep());
            stmt.setString(11,cliente.getCidade());
            stmt.setString(12,cliente.getEstado());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastro realizado !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Cliente> read(){
        
      Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs=null;
       List<Cliente> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("id_cliente"));
                cli.setNome(rs.getString("nome_cliente"));
                cli.setEmail(rs.getString("email_cliente"));
                cli.setCpf(rs.getString("cpf_cliente"));
                cli.setLogradouro(rs.getString("logradouro_cliente"));
                cli.setNumero(rs.getInt("n_endereco_cliente"));
                cli.setTelefone(rs.getString("telefone_cliente"));
                cli.setCelular(rs.getString("celular_cliente"));
                cli.setCnpj(rs.getString("cnpj_cliente"));
                cli.setBairro(rs.getString("bairro_cliente"));
                cli.setCidade(rs.getString("cidade_cliente"));
                cli.setCep(rs.getString("cep_cliente"));
                cli.setEstado(rs.getString("estado_cliente"));
                clientes.add(cli);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }
 public void update(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome_cliente=?,email_cliente=?,cpf_cliente=?,logradouro_cliente=?,n_endereco_cliente=?,telefone_cliente=?,"
                    + "celular_cliente=?,cnpj_cliente=?,bairro_cliente=?,cep_cliente=?,cidade_cliente=?,estado_cliente=? WHERE id_cliente=?");
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getEmail());
            stmt.setString(3,cliente.getCpf());
            stmt.setString(4,cliente.getLogradouro());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getTelefone());
            stmt.setString(7,cliente.getCelular());
            stmt.setString(8,cliente.getCnpj());
            stmt.setString(9,cliente.getBairro());
            stmt.setString(10,cliente.getCep());
            stmt.setString(11,cliente.getCidade());
            stmt.setString(12,cliente.getEstado());
            stmt.setInt(13,cliente.getId());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   
 
 public void delete(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE id_cliente=?");
            stmt.setInt(1,cliente.getId());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }   
}
