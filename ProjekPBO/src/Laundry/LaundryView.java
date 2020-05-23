
package Laundry;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LaundryView extends JFrame{
    private Image image;
    JLabel lid;
    JTextField txid;
    JButton create,update,delete,exit,ambil;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "Berat", "Harga", "Tanggal Masuk", "Tanggal Estimasi", "Status"};
    
    public LaundryView(){
        image = new ImageIcon(getClass().getResource("j.jpg")).getImage();
         this.setContentPane(new JPanel() {
         @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(image, 0, 0, null);
            }
         });    
         
        setTitle("LAUNDRY");
        
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        lid = new JLabel("ID:");
        
        txid = new JTextField("");
        
        create = new JButton("Masukkan Data Baru");
        ambil = new JButton("Ambil Laundry");
        update = new JButton("Edit");
        delete = new JButton("Delete");
        exit = new JButton("Exit");
        
        setLayout(null);
        add(lid);
        add(txid);
        add(create);
        add(ambil);
        add(update);
        add(delete);
        add(exit);
        add(scrollPane);
        
        create.setBounds(40, 265, 175, 30);
        ambil.setBounds(40, 320, 175, 30);     
        lid.setBounds(580, 265, 40, 30);
        txid.setBounds(620, 265, 165, 30);
        
        update.setBounds(530,320, 75, 30);
        delete.setBounds(620, 320, 75, 30);
        exit.setBounds(710, 320, 75, 30);
        
        scrollPane.setBounds(40, 25, 750, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        setSize(850,420); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
}