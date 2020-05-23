package Laundry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EditController {
	 EditModel editmodel;
	 EditView editview;
	 EditDAO editdao;
	    
	 static String id,nama,berat,harga,tgl_masuk,tgl_estimasi;
	        //,tgl_edit,status,bayar,kembali,search;
	 
	 public EditController(EditModel editmodel , EditView editview , EditDAO editdao) {
		 this.editmodel = editmodel;
		 this.editview = editview;
		 this.editdao = editdao;
		 
		 editview.search.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String data[][] = new String[1][6];
					data = editdao.readLaundry(editview);
					editview.txnama.setText(data[0][1]);
					editview.txberat.setText(data[0][2]);
					editview.txharga.setText(data[0][3]);
					editview.txtgl_masuk.setText(data[0][4]);
					editview.txtgl_est.setText(data[0][5]);
				}
			});
		 
		 editview.create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				editdao.update(editview);
                                editview.txid.setText("");
				editview.txnama.setText("");
				editview.txberat.setText("");
				editview.txharga.setText("");
				editview.txtgl_masuk.setText("");
				editview.txtgl_est.setText("");
			}
                        
                        
                        
		});
		 
            editview.kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LaundryMVC();
                editview.setVisible(false);
            }
        });
            
            editview.txberat.getDocument().addDocumentListener(new DocumentListener() {
			
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
				if(editview.txberat.getText().isEmpty()) {
					
				}
				else {
					String berat = editview.txberat.getText();
					int iberat = Integer.parseInt(berat);
					iberat *= 5000;
					berat = Integer.toString(iberat);
					editview.txharga.setText(berat);
				}
			}
		});
	 }

}