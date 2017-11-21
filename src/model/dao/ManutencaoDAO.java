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
import model.bean.Manutencao;


/**
 *
 * @author LUCAS
 */
public class ManutencaoDAO {
    
          public boolean insert(Manutencao m, String cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("INSERT INTO manutencao (descricao,nm_tecnicao,num_os,cliente,data,horas,pecas)VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1,m.getDescricao());
            stmt.setString(2,m.getNmTecnico());
            stmt.setInt(3,m.getNumero_os());
            stmt.setString(4,cliente);
            stmt.setString(5,m.getDt_inicio());            
            stmt.setString(6,m.getHora());                                    
            stmt.setString(7,m.getProdutos());                                    
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Cadastro realizado !");
            check = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar: "+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
          
    public List<String> emailAtendente(){
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<String> emails = new ArrayList();
        
         try {

            stmt = con.prepareStatement("SELECT email_funcionario FROM funcionario WHERE iddepartamento = 1");
            
            rs = stmt.executeQuery();

            if (rs.next()) {                
                emails.add(rs.getString("email_funcionario"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO ao selecionar os emails do departamento atendimento -> "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return emails;
    }
    
     public Cliente selectCliente(int num){
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente c = new Cliente();
        
         try {

            stmt = con.prepareStatement("SELECT c.nome_cliente,c.telefone_cliente FROM cliente as c INNER JOIN ordem_servico as os ON os.idcliente = c.id_cliente  WHERE os.id_ordem_servico = ?");
            stmt.setInt(1,num);
            rs = stmt.executeQuery();

            if (rs.next()) {                
                c.setNome(rs.getString("nome_cliente"));
                c.setTelefone(rs.getString("telefone_cliente"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO buscar o cliente com id  da o.s. -> "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return c;
    }
}
