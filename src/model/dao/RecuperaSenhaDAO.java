package model.dao;

import connection.ConnectionFactory;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.JavaMailApp;

public class RecuperaSenhaDAO {
    
    public boolean ConfereEmail(String email,String cpf){
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
         try {

            stmt = con.prepareStatement("SELECT * FROM funcionario WHERE email_funcionario=? AND cpf_funcionario=?");
            stmt.setString(1, email);
            stmt.setString(2, cpf);
            rs = stmt.executeQuery();

            if (rs.next()) {                
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO RECUPERA SENHA -> "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;
    }
    
     public boolean GeraCod(String cpf){
        Connection con;
        con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String date = new SimpleDateFormat("HH:mm:ss").format(timestamp.getTime());
        String senha = date;
        
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RecuperaSenhaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
        String sen = hash.toString(5);
        
        sen = sen.substring(0,5);       
        
         try {

             stmt = con.prepareStatement("UPDATE login SET senha = ? WHERE idlogin = (SELECT idlogin FROM funcionario where cpf_funcionario=?)");
             stmt.setString(1,sen);
             stmt.setString(2,cpf);            
             stmt.executeUpdate();
             
            check = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO RECUPERA SENHA -> "+ex);
            check = false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;
    }

    
}
