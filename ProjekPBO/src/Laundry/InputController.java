
package Laundry;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InputController {
    InputModel inputmodel;
    InputView inputview;
    InputDAO inputdao;
    
    static String id,nama,berat,harga,tgl_masuk,tgl_estimasi;
            //,tgl_ambil,status,bayar,kembali,search;
     
    public InputController(InputModel inputmodel, InputView inputview, InputDAO inputdao){
        this.inputmodel = inputmodel;
        this.inputview = inputview;
        this.inputdao = inputdao;
        
        
        inputview.create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = inputview.getNama();
                String berat = inputview.getBerat();
                String harga = inputview.getHarga();
                String tgl_masuk = inputview.getTgl_masuk();
                String tgl_estimasi = inputview.getTgl_estimasi();
                
                if(nama.isEmpty() || berat.isEmpty() || harga.isEmpty() || tgl_masuk.isEmpty() || tgl_estimasi.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } else {
                    inputmodel.setInputModel(nama,berat,harga,tgl_masuk,tgl_estimasi);
                    inputdao.Insert(inputmodel); //membuat data baru

                    inputview.txnama.setText("");
                    inputview.txberat.setText("");
                    inputview.txharga.setText("");
                    inputview.txtgl_masuk.setText("");
                    inputview.txtgl_est.setText("");
                    
                }
            }
        });
        
        inputview.kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LaundryMVC();
                inputview.setVisible(false);
            }
        }); 
        
        inputview.txberat.getDocument().addDocumentListener(new DocumentListener() {
			
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
				//change();
				
			}
			
			public void change() {
				if(inputview.txberat.getText().isEmpty()) {
					
				}
				else {
					String berat = inputview.txberat.getText();
					int iberat = Integer.parseInt(berat);
					iberat *= 5000;
					berat = Integer.toString(iberat);
					inputview.txharga.setText(berat);
				}
			}
		});
    }
}