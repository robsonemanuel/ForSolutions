
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ContasAReceberDAO {
    public float somaLucro(){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       float valor=0;
        try {
           
            stmt = con.prepareStatement("select sum(valor) from pagamento where year(data_venda) = year(now()) and month(data_venda) = month(now())");
            rs = stmt.executeQuery();
             while(rs.next()){
               valor = rs.getFloat("sum(valor)");
             }
         
        } catch (SQLException ex) {
           
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
     }
         return valor;
    }  
   
}
