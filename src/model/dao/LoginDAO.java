package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    public boolean checkLogin(String login, String senha) {

        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM login WHERE usuario = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
    public boolean VerificaNewSenha(String login, String senha) {

        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sim = "s";
        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM login WHERE usuario = ? and senha = ? and senha_temporaria=?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.setString(3, sim);

            rs = stmt.executeQuery();

            if (rs.next()) {                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
    public boolean InsereNovaSenha(String novasenha, String identificador, String identificador_user) {

        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String n = "n";
       
        boolean check = false;

       try {

             stmt = con.prepareStatement("UPDATE login SET senha = ?,senha_temporaria=? WHERE senha =? AND usuario =?");
             stmt.setString(1,novasenha);                        
             stmt.setString(2,n);
             stmt.setString(3,identificador);
             stmt.setString(4,identificador_user);
             stmt.executeUpdate();
             
            check = true;

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
     public boolean update(int id, String senha) {

        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String n = "n";
       
        boolean check = false;

       try {

             stmt = con.prepareStatement("UPDATE login SET senha = ? WHERE idlogin =?");
             stmt.setString(1,senha);                        
             stmt.setInt(2,id);             
             stmt.executeUpdate();
             
            check = true;

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
     
     public void delete(int id){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("DELETE FROM login WHERE idlogin = ?");
           
            stmt.setInt(1,id);          
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
