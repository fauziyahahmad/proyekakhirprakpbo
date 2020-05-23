package Laundry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmbilController {
	 AmbilModel ambilmodel;
	 AmbilView ambilview;
	 AmbilDAO ambildao;
	    
	 static String id,nama,berat,harga,tgl_masuk,tgl_estimasi;
	        //,tgl_ambil,status,bayar,kembali,search;
	 
	 public AmbilController( AmbilModel ambilmodel , AmbilView ambilview , AmbilDAO ambildao) {
		 this.ambilmodel = ambilmodel;
		 this.ambilview = ambilview;
		 this.ambildao = ambildao;
		 
		 ambilview.search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data[][] = new String[1][6];
				data = ambildao.readLaundry(ambilview);
				ambilview.txnama.setText(data[0][1]);
				ambilview.txberat.setText(data[0][2]);
				ambilview.txharga.setText(data[0][3]);
				ambilview.txtgl_masuk.setText(data[0][4]);
			}
		});
		 
		ambilview.hitung.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int bayar = Integer.parseInt(ambilview.txbayar.getText());
				int harga = Integer.parseInt(ambilview.txharga.getText());
				int kembalian = bayar - harga;
				ambilview.txkembali.setText(Integer.toString(kembalian));
			}
		});
		
		ambilview.simpan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ambildao.update(ambilview);
				ambilview.txid.setText("");
				ambilview.txnama.setText("");
				ambilview.txberat.setText("");
				ambilview.txharga.setText("");
				ambilview.txtgl_masuk.setText("");
				ambilview.txtgl_ambil.setText("");
				ambilview.txbayar.setText("");
				ambilview.txkembali.setText("");
			}
		});
                
            ambilview.kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LaundryMVC();
                ambilview.setVisible(false);
            }
        }); 
	 }
}
