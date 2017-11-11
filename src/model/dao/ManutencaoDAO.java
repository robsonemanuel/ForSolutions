package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
            stmt = con.prepareStatement("INSERT INTO manutencao (descricao,nm_tecnicao,num_os,cliente,inicio,fim,pecas)VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1,m.getDescricao());
            stmt.setString(2,m.getNmTecnico());
            stmt.setInt(3,m.getNumero_os());
            stmt.setString(4,cliente);
            stmt.setString(5,m.getDt_inicio());            
            stmt.setString(6,m.getDt_fim());                                    
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
}
