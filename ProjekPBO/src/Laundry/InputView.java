
package Laundry;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class InputView extends JFrame{
    private Image image;
    JLabel lnama,lberat,lharga,ltgl_masuk,ltgl_est,judul;
    JTextField txnama,txberat,txharga,txtgl_masuk,txtgl_est;
    JButton create,hitung,kembali;
    
    public InputView(){
        image = new ImageIcon(getClass().getResource("z.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(image, 0, 0, null);
            }
         });    
        setTitle("INPUT DATA LAUNDRY");
        
        judul = new JLabel("INPUT DATA LAUNDRY");
        lnama = new JLabel("Nama");  
        lberat = new JLabel("Berat");
        lharga = new JLabel("Harga");
        ltgl_masuk = new JLabel("Tanggal Masuk");
        ltgl_est = new JLabel("Tanggal Estimasi");
        
        txnama = new JTextField("");
        txberat = new JTextField("");
        txharga = new JTextField("");
        txtgl_masuk = new JTextField("");
        txtgl_est = new JTextField("");
        
       
        create = new JButton("Simpan");
        kembali = new JButton ("Kembali");
        
        setLayout(null);
        add(judul);
        add(lnama);
        add(lberat);
        add(lharga);
        add(ltgl_masuk);
        add(ltgl_est);
        add(txnama);
        add(txberat);
        add(txharga);
        add(txtgl_masuk);
        add(txtgl_est);
        add(create);
        add(kembali);
        
        judul.setBounds(130,10,300,25);
        
        lnama.setBounds(50, 50, 50, 20);
        txnama.setBounds(170, 50, 150, 20);
        
        lberat.setBounds(50, 75, 50, 20);
        txberat.setBounds(170, 75, 150, 20);
        
        lharga.setBounds(50, 100, 50, 20);
        txharga.setBounds(170, 100, 150, 20);
        
        ltgl_masuk.setBounds(50, 125, 150, 20);
        txtgl_masuk.setBounds(170, 125, 150, 20);
        ltgl_est.setBounds(50, 150, 150, 20);
        txtgl_est.setBounds(170, 150, 150, 20);
        
        create.setBounds(75, 200, 100, 25);
        kembali.setBounds(200,200, 100, 25);
        
        setSize(400,300); 
        
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

