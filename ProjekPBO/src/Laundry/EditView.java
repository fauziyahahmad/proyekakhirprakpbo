
package Laundry;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EditView extends JFrame{
    private Image image;
    JLabel lnama,lberat,lharga,ltgl_masuk,ltgl_est,judul,lid;
    JTextField txnama,txberat,txharga,txtgl_masuk,txtgl_est,txid;
    JButton create,hitung,kembali,search;
    
    public EditView(){
        image = new ImageIcon(getClass().getResource("z.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(image, 0, 0, null);
            }
         });    
         
        setTitle("EDIT DATA LAUNDRY");
        
        judul = new JLabel("EDIT DATA LAUNDRY");
        lid = new JLabel("ID:");
        lnama = new JLabel("Nama");  
        lberat = new JLabel("Berat");
        lharga = new JLabel("Harga");
        ltgl_masuk = new JLabel("Tanggal Masuk");
        ltgl_est = new JLabel("Tanggal Estimasi");
        
        txid = new JTextField("");
        txnama = new JTextField("");
        txberat = new JTextField("");
        txharga = new JTextField("");
        txtgl_masuk = new JTextField("");
        txtgl_est = new JTextField("");
        
       
        create = new JButton("Simpan");
        kembali = new JButton ("Kembali");
         search = new JButton ("Cari");
        
        setLayout(null);
        add(judul);
        add(lid);
        add(search);
        add(lnama);
        add(lberat);
        add(lharga);
        add(ltgl_masuk);
        add(ltgl_est);
        add(txid);
        add(txnama);
        add(txberat);
        add(txharga);
        add(txtgl_masuk);
        add(txtgl_est);
        add(create);
        add(kembali);
        
        judul.setBounds(130,10,300,25);
        
        lid.setBounds(50, 50, 50, 20);
        txid.setBounds(170, 50, 70, 20);
        search.setBounds(250, 50, 70, 20);
        
        lnama.setBounds(50, 80, 50, 20);
        txnama.setBounds(170, 80, 150, 20);
        
        lberat.setBounds(50, 105, 50, 20);
        txberat.setBounds(170, 105, 150, 20);
        
        lharga.setBounds(50, 130, 50, 20);
        txharga.setBounds(170, 130, 150, 20);
        
        ltgl_masuk.setBounds(50, 155, 150, 20);
        txtgl_masuk.setBounds(170, 155, 150, 20);
        ltgl_est.setBounds(50, 180, 150, 20);
        txtgl_est.setBounds(170, 180, 150, 20);
        
        create.setBounds(75, 230, 100, 25);
        kembali.setBounds(200,230, 100, 25);
        
        setSize(400,330); 
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public String getNama(){
        return txnama.getText();
    }
    
    public String getBerat(){
        return txberat.getText();
    }
    
    public String getHarga(){
        return txharga.getText();
    }
    
    public String getTgl_masuk(){
        return txtgl_masuk.getText();
    }
    
    public String getTgl_estimasi(){
        return txtgl_est.getText();
    }
}

