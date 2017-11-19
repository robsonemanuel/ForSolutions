/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.bean.VendaServico;

/**
 *
 * @author BOBSON
 */
public class VendaServicoDAO {
    
    public void create(VendaServico v){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("INSERT INTO vendaservico(id_os,valor_venda,descricaorealizada,horastrabalhada,nome) VALUES(?,?,?,?,?)");
            stmt.setInt(1,v.getId_os());
            stmt.setFloat(2,v.getValor_venda());
            stmt.setString(3,v.getDesc());
            stmt.setString(4,v.getHoras());
            stmt.setString(5,v.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar"+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
    public List<VendaServico> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
        List<VendaServico> vendaservicos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT id_ordem_servico, nome_cliente, pecas, horas,descricao from ordem_servico \n" +
            "inner join manutencao on ordem_servico.id_ordem_servico = manutencao.num_os\n" +
            "where ordem_servico.id_ordem_servico not in(select id_os from vendaservico)");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                VendaServico vendaservico = new VendaServico();
                
                vendaservico.setId_os(rs.getInt("id_ordem_servico"));
                vendaservico.setNome(rs.getString("nome_cliente"));
                vendaservico.setPecas(rs.getString("pecas"));
                vendaservico.setHoras(rs.getString("horas"));
                vendaservico.setDesc(rs.getString("descricao"));
                vendaservicos.add(vendaservico);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VendaServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
    }
       return vendaservicos;
    }
    
   
    }
