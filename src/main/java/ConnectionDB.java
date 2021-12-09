import java.sql.*;
import javax.swing.JOptionPane;
        
public class ConnectionDB {
    private Connection cd = null ;
    private Statement st = null ;
    private ResultSet rs = null ;
    private String url = "jdbc:mysql://localhost:3306/bkk_metro" ;
    private String username = "root";
    private String password = "";
    
    public void connect()throws SQLException {
        try{ cd = DriverManager.getConnection(url,username,password);
        }catch(SQLException e){ JOptionPane.showMessageDialog(null,"Error"+e);}
    }
    
    public void disconnect()throws SQLException{
        try{ cd.close();
        }catch(SQLException e){ JOptionPane.showMessageDialog(null,"Close"+e);}
    }
    
    public boolean execute(String sql)throws SQLException {
        try{ connect();
            st = cd.createStatement();
            st.execute(sql);
            return true ;
        }catch(SQLException e){ return false;}
        finally{ disconnect(); }
    }
    
    public ResultSet get_resultset(String sql)throws SQLException{
        try{ connect();
        st = cd.createStatement();
        rs = st.executeQuery(sql);
        }catch(SQLException e){rs=null;}
        return rs ;
    }   
}
