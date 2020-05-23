
package Laundry;

import java.sql.*;
import javax.swing.JOptionPane;

public class InputDAO {
    private Connection koneksi;
    private Statement statement;
    
    public InputDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/projekpbo";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
            //JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Class Not Found : " + ex);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }
    
    
    public void Insert(InputModel Model){
        try{
            String query = "INSERT INTO laundry VALUES (NULL,'"+Model.getNama()+"','"+
                            Model.getBerat()+"','"+Model.getHarga()+"','"+Model.getTgl_masuk()+
                            "','"+Model.getTgl_estimasi()+"','"+"-"+"','"+"Proses"+"')";    
            statement.executeUpdate(query); //execute querynya
            JOptionPane.showMessageDialog(null, "Data disimpan");
        } catch (Exception sql){
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
}