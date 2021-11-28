import java.sql.*;
import javax.swing.JOptionPane;
        
public class ConnectionDB {
    private Connection cd = null ;
    private Statement st = null ;
    private ResultSet rs = null ;
    private String url = "jdbc:sqlite:C:\\Users\\emmer\\Documents\\NetBeansProjects\\FinalProject\\DB.db" ;
    
    public void connect()throws SQLException {
        try{ cd = DriverManager.getConnection(url);
        }catch(Exception e){ JOptionPane.showMessageDialog(null,"Error");}
    }
    
    public void disconnect()throws SQLException{
        try{ cd.close();
        }catch(Exception e){ JOptionPane.showMessageDialog(null,"Close");}
    }
    
    public boolean execute(String sql)throws SQLException {
        try{ connect();
            st = cd.createStatement();
            st.execute(sql);
            return true ;
        }catch(Exception e){ return false;}
        finally{ disconnect(); }
    }
    
    public ResultSet get_resultset(String sql)throws SQLException{
        try{ connect();
        st = cd.createStatement();
        rs = st.executeQuery(sql);
        }catch(Exception e){rs=null;}
        finally{ disconnect(); }
        return rs ;
    }   
}
