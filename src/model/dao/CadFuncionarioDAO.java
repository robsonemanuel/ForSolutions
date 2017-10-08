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
import model.bean.Funcionario;
import view.CadastraFuncionario;


/**
 *
 * @author LUCAS
 */
public class CadFuncionarioDAO {
    
    public boolean create(Funcionario funcionario,int cargo,int dpt){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (nome_funcionario,email_funcionario,cpf_funcionario,"
                    + "logradouro_funcionario,n_endereco_funcionario,telefone_funcionario,"
                    + "data_admisssao,idlogin,idcargo,iddepartamento)VALUES (?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2,funcionario.getEmail());
            stmt.setString(3,funcionario.getCpf());
            stmt.setString(4,funcionario.getLogradouro());
            stmt.setInt(5,funcionario.getNumero());
            stmt.setString(6,funcionario.getTelefone());
            stmt.setString(7,funcionario.getData_admissao());
            stmt.setInt(8,funcionario.getLogin());
            stmt.setInt(9,cargo);
            stmt.setInt(10,dpt);            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cadastro realizado !");
            check = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar: "+ex);
            check = false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
    
        public List<String> buscaDepartamento(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<String> departamento = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT descricao FROM departamento");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Departamento d = new Departamento();                
                d.setDescricao(rs.getString("descricao"));               
                departamento.add(d.getDescricao());
                
       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return departamento;
    }
        
        public List<String> buscaCargo(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<String> departamento = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cargo");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Departamento d = new Departamento();                
                d.setDescricao(rs.getString("nome_cargo"));               
                departamento.add(d.getDescricao());
                
       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return departamento;
    }
        
        
       public int buscaCodLogin(String desc){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       int cod_log=0;
        try {
            stmt = con.prepareStatement("SELECT * FROM login WHERE usuario=?");
            stmt.setString(1,desc);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                cod_log = (rs.getInt("idlogin"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados de id login ->"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cod_log;
    }
       public int buscaCodDepartamento(String desc){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       int cod_dept=0;
        try {
            stmt = con.prepareStatement("SELECT * FROM departamento WHERE descricao=?");
            stmt.setString(1,desc);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                cod_dept = (rs.getInt("iddepartamento"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cod_dept;
    }
       
    public int buscaCodCargo(String desc){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       int cod_carg=0;
        try {
            stmt = con.prepareStatement("SELECT * FROM cargo WHERE nome_cargo=?");
            stmt.setString(1,desc);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                cod_carg = (rs.getInt("idcargo"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cod_carg;
    }
    
    public void createLogin(String nome, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO login (usuario,senha,senha_temporaria)VALUES (?,?,?)");
            stmt.setString(1,nome);
            stmt.setString(2,senha);
            stmt.setString(3,"n");         
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Cadastro de login realizado !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar login: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
      public float buscaSalario(String desc){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       float salario=0;
        try {
            stmt = con.prepareStatement("SELECT * FROM cargo WHERE nome_cargo=?");
            stmt.setString(1,desc);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                                
                salario = (rs.getFloat("salario"));                                               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return salario;
    }

   
    
}
