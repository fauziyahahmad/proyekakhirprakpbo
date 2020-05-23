
package Laundry;

import java.sql.*;
import javax.swing.JOptionPane;

public class LaundryDAO {
    private Connection koneksi;
    private Statement statement;
    
    public LaundryDAO(){
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
    
    //utk mengambil data dari db dan mengatur ke dalam tabel
    public String[][] readLaundry(){
        try{
            int jmlData = 0; //menampung jmlh data
            String data[][] = new String[getJmldata()][7];
            //pengambilan dta dlm java dari db
            String query = "SELECT * FROM laundry";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                /*data[jmlData][0] = String.valueOf(jmlData+1); //membuat nomor urut data saat ditampilkan di tabel*/
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("berat");
                data[jmlData][3] = resultSet.getString("harga");
                data[jmlData][4] = resultSet.getString("tgl_masuk");
                data[jmlData][5] = resultSet.getString("tgl_estimasi");
                data[jmlData][6] = resultSet.getString("status");
                /*data[jmlData][7] = resultSet.getString("tgl_ambil");
               
                data[jmlData][9] = resultSet.getString("bayar");
                data[jmlData][10] = resultSet.getString("kembali");
                */
                jmlData++;
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] readIDLaundry(LaundryView View){
        try{
        	
            String ID = View.txid.getText();
            int jmlData = 0; //menampung jmlh data
            String data[][] = new String[getIDJmldata(ID)][7];
            //pengambilan dta dlm java dari db
            String query = "SELECT * FROM laundry WHERE id='"+ID+"'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("berat");
                data[jmlData][3] = resultSet.getString("harga");
                data[jmlData][4] = resultSet.getString("tgl_masuk");
                data[jmlData][5] = resultSet.getString("tgl_estimasi");
                data[jmlData][6] = resultSet.getString("status");
                /*data[jmlData][7] = resultSet.getString("tgl_ambil");
                data[jmlData][9] = resultSet.getString("bayar");
                data[jmlData][10] = resultSet.getString("kembali");
                */
                jmlData++;
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getJmldata(){
        int jmlData = 0;
        try{
            String query = "SELECT * FROM laundry";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public int getIDJmldata(String ID){
        int jmlData = 0;
        try{
            String query = "SELECT * FROM laundry WHERE id='"+ID+"'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void Delete(LaundryModel Model) {
        try{
            String query = "DELETE FROM laundry WHERE id = '"+Model.getId()+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        } catch (SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
}