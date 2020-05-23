
package Laundry;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LaundryController {
    LaundryModel laundrymodel;
    LaundryView laundryview;
    LaundryDAO laundrydao;
    
    static String id,nama,berat,harga,tgl_masuk,tgl_estimasi;
            //,tgl_ambil,status,bayar,kembali,search;
     
    public LaundryController(LaundryModel laundrymodel, LaundryView laundryview, LaundryDAO laundrydao){
        this.laundrymodel = laundrymodel;
        this.laundryview = laundryview;
        this.laundrydao = laundrydao;
        
        if(laundrydao.getJmldata() != 0){
            String dataLaundry[][] = laundrydao.readLaundry();
            laundryview.tabel.setModel((new JTable(dataLaundry, laundryview.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ada!");
        }
        
        
        laundryview.create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InputMVC();
                laundryview.setVisible(false);
            }
        });
        
        laundryview.ambil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AmbilMVC();
                laundryview.setVisible(false);
            }
        });
        
        laundryview.update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditMVC();
                laundryview.setVisible(false);
            }
        });
        
        laundryview.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int baris = laundryview.tabel.getSelectedRow();
                int kolom = laundryview.tabel.getSelectedColumn();

                id = laundryview.tabel.getValueAt(baris,0).toString(); 
                }
        });
        
        laundryview.delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            int input = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data " + id + "?","Delete",JOptionPane.YES_NO_OPTION);

                if (input == 0){
                    laundrymodel.setId(id);
                    laundrydao.Delete(laundrymodel); //menghapus data yg sudah ada
                    String dataLaundry[][] = laundrydao.readLaundry();
                    laundryview.tabel.setModel((new JTable (dataLaundry, laundryview.namaKolom)).getModel());
                }
            }
        });
        
        
        laundryview.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //keluar dari program
                System.exit(0);
            }
        }); 
        
        laundryview.txid.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				change();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				change();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void change() {
				String ID = laundryview.txid.getText();
				if(ID.isEmpty()) {
					String dataLaundry[][] = laundrydao.readLaundry();
                    laundryview.tabel.setModel((new JTable (dataLaundry, laundryview.namaKolom)).getModel());
				}
				else {
					String dataLaundry[][] = laundrydao.readIDLaundry(laundryview);
	                laundryview.tabel.setModel((new JTable (dataLaundry, laundryview.namaKolom)).getModel());
				}
			}
		});
        
    }
}