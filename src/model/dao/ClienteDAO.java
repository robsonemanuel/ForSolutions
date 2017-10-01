
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                    + "celular_cliente,cnpj_cliente)VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getEmail());
            stmt.setString(3,cliente.getCpf());
            stmt.setString(4,cliente.getLogradouro());
            stmt.setInt(5,cliente.getNumero());
            stmt.setString(6,cliente.getTelefone());
            stmt.setString(7,cliente.getCelular());
            stmt.setString(8,cliente.getCnpj());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastro realizado !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
