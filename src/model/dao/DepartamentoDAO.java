package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Departamento;

/**
 *
 * @author LUCAS
 */
public class DepartamentoDAO {
    
     public Departamento select(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       Departamento d = new Departamento();
        try {
            stmt = con.prepareStatement("SELECT * FROM departamento");            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                d.setId((rs.getInt("iddepartamento")));                                                               
                d.setDescricao((rs.getString("iddepartamento")));                                                               
                                                               
                  
                
                //JOptionPane.showMessageDialog(null,"Selete de funconario com sucesso !");
                                                        
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados de id login ->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
         return d;
    }
     
     public Boolean delete(int id){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       boolean check = false;
       
        try {
            stmt = con.prepareStatement("DELETE FROM departamento WHERE iddepartamento = ?");           
            stmt.setInt(1,id);          
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
            check = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return check;
    }
     
     public Boolean update(int id,String desc){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       boolean check = false;
       
        try {
            stmt = con.prepareStatement("UPDATE departamento SET descricao=? WHERE iddepartamento=?");
            stmt.setString(1,desc);                                                           
            stmt.setInt(2,id);                                                           
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            check = true;            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar"+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
     
     public List<Departamento> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Departamento> dpto = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT * FROM departamento");            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Departamento d = new Departamento();             
                d.setId((rs.getInt("iddepartamento")));                                                               
                d.setDescricao((rs.getString("descricao"))); 
                dpto.add(d);                                                                       
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados de id login ->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
         return dpto;
    }
     
     public Boolean insert(Departamento d){
         boolean check = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO departamento (descricao) VALUES (?)");
            stmt.setString(1,d.getDescricao());            
            stmt.executeUpdate();   
            check = true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Departamento: "+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
    
}
