
package Laundry;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class AmbilView extends JFrame{
    private Image image;
    JLabel lid,lnama,lberat,lharga,ltgl_masuk,ltgl_ambil,lbayar,lkembali,judul;
    JTextField txid,txnama,txberat,txharga,txtgl_masuk,txtgl_ambil,txbayar,txkembali;
    JButton simpan,hitung,kembali,search;
    
    public AmbilView(){
        image = new ImageIcon(getClass().getResource("z.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(image, 0, 0, null);
            }
         });    
        setTitle("AMBIL LAUNDRY");
        
        judul = new JLabel("AMBIL LAUNDRY");
        lid = new JLabel("ID:");
        lnama = new JLabel("Nama");  
        lberat = new JLabel("Berat");
        lharga = new JLabel("Harga");
        ltgl_masuk = new JLabel("Tanggal Masuk");
        ltgl_ambil = new JLabel("Tanggal Ambil");
        lbayar = new JLabel("Bayar");
        lkembali = new JLabel("Kembali");        
        
        txid = new JTextField("");
        txnama = new JTextField("");
        txberat = new JTextField("");
        txharga = new JTextField("");
        txtgl_masuk = new JTextField("");
        txtgl_ambil = new JTextField("");
        txbayar = new JTextField("");
        txkembali = new JTextField("");
        
        simpan = new JButton("Simpan");
        hitung = new JButton("Hitung");
        kembali = new JButton ("Kembali");
        search = new JButton ("Cari");
        
        setLayout(null);
        add(judul);
        add(lid);
        add(lnama);
        add(lberat);
        add(lharga);
        add(ltgl_masuk);
        add(ltgl_ambil);
        add(lbayar);
        add(lkembali);
        add(txid);
        add(txnama);
        add(txberat);
        add(txharga);
        add(txtgl_masuk);
        add(txtgl_ambil);
        add(txbayar);
        add(txkembali);
        add(simpan);
        add(hitung);
        add(kembali);
        add(search);
        
        judul.setBounds(220,10,300,20);
        
        lid.setBounds(30, 50, 50, 20);
        txid.setBounds(130, 50, 120, 20);
        search.setBounds(260, 50, 70, 20);
        
        lnama.setBounds(30, 85, 50, 20);
        txnama.setBounds(130, 85, 120, 20);
        
        lberat.setBounds(340, 85, 50, 20);
        txberat.setBounds(400, 85, 90, 20);
        
        ltgl_masuk.setBounds(30, 115, 150, 20);
        txtgl_masuk.setBounds(130, 115, 120, 20);
        
        lharga.setBounds(340, 115, 50, 20);
        txharga.setBounds(400, 115, 90, 20);
        
        ltgl_ambil.setBounds(30, 145, 150, 20);
        txtgl_ambil.setBounds(130, 145, 120, 20);
        
        lbayar.setBounds(30, 175, 150, 20);
        txbayar.setBounds(130, 175, 120, 20);
        
        hitung.setBounds(260, 175, 70, 20);
        
        lkembali.setBounds(340, 175, 150, 20);
        txkembali.setBounds(400, 175, 90, 20);
        
        simpan.setBounds(180, 225, 80, 25);
        kembali.setBounds(280, 225, 80, 25);
       
        setSize(540,320); 
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
}


