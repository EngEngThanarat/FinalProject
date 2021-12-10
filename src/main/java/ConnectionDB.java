import java.sql.*;
import javax.swing.JOptionPane;
        
public class ConnectionDB {
    private Connection cd = null ;
    private Statement st = null ;
    private ResultSet rs = null ;
    private String url = "jdbc:mysql://localhost:3306/bkk_metro" ;
    private String username = "root";
    private String password = "";
    
    public void connect()throws SQLException { //connection cd and st
        try{ cd = DriverManager.getConnection(url,username,password);
        }catch(SQLException e){ JOptionPane.showMessageDialog(null,"Error"+e);}
    }//open database
    
    public void disconnect()throws SQLException{
        try{ cd.close();
        }catch(SQLException e){ JOptionPane.showMessageDialog(null,"Close"+e);}
    }//close database
    
    public boolean execute(String sql)throws SQLException {
        try{ connect();
            st = cd.createStatement();//create new database
            st.execute(sql);//Actions on the sql
            return true ;
        }catch(SQLException e){ return false;}
        finally{ disconnect(); }
    }
    
    public ResultSet get_resultset(String sql)throws SQLException{
        try{ connect();
        st = cd.createStatement(); //statement connec with cd
        rs = st.executeQuery(sql); //Action and keep
        }catch(SQLException e){rs=null;}
        return rs ;
    }//call the database to keep result abot execute
}
