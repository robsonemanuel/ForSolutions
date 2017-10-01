
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José wilton
 */
public class OrcamentoDAO {
    public void create(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO orcamento ()VALUES ()");
        } catch (SQLException ex) {
            Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
