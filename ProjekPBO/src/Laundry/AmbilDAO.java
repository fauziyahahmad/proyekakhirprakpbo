package Laundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AmbilDAO { 
	private Connection koneksi;
	private Statement statement;

	public AmbilDAO(){
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
	
        
	 public String[][] readLaundry(AmbilView view){
	        try{
                    String ID = view.txid.getText();
	            int jmlData = 0; //menampung jmlh data
	            String data[][] = new String[1][6];
	            //pengambilan dta dlm java dari db
	            String query = "SELECT * FROM laundry WHERE id='"+ID+"'";
	            ResultSet resultSet = statement.executeQuery(query);
                    if(resultSet.next()){
	            //while (resultSet.next()){
	                data[jmlData][0] = resultSet.getString("id");
	                data[jmlData][1] = resultSet.getString("nama");
	                data[jmlData][2] = resultSet.getString("berat");
	                data[jmlData][3] = resultSet.getString("harga");
	                data[jmlData][4] = resultSet.getString("tgl_masuk");
	                data[jmlData][5] = resultSet.getString("tgl_estimasi");
	                jmlData++;
	            //} 
                    } else { 
                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                        view.txid.setText("");
                    }
	            return data;
	        } catch (SQLException e){
	            System.out.println(e.getMessage());
	            System.out.println("SQL Error");
	            return null;
	        }
	    }
	 
	 public void update(AmbilView view) {
		 try {
			 String ID = view.txid.getText(); 
                         String a = view.txtgl_ambil.getText();
			 String query = "UPDATE laundry SET status='Completed' , tgl_ambil='"+a+"' WHERE id='"+ID+"'";
			 statement.execute(query);
                         JOptionPane.showMessageDialog(null, "Data disimpan");
		 }catch(Exception e) {
			 JOptionPane.showInputDialog(e.getMessage());
		 }
	 }
}
