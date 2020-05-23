package Laundry;

public class EditModel {
    private String id,nama,berat,harga,tgl_masuk,tgl_estimasi;
    //,tgl_ambil,status,bayar,kembali,search;

public void setLaundryModel(String xid, String xnama, String xberat, String xharga, String xtgl_masuk, String xtgl_estimasi){
    //, String xtgl_ambil, String xstatus, String xbayar, String xkembali, String xsearch){
this.id = xid;
this.nama = xnama;
this.berat = xberat;
this.harga = xharga;
this.tgl_masuk = xtgl_masuk;
this.tgl_estimasi = xtgl_estimasi;
/*this.tgl_ambil = xtgl_ambil;
this.status = xstatus;
this.bayar = xbayar;
this.kembali = xkembali;
this.search = xsearch;*/
}

//id menggunakan auto increment
public String getId(){
return id;
}

public void setId(String id){
this.id = id;
}

public String getNama(){
return nama;
}

public void setNama(String nama){
this.nama = nama;
}

public String getBerat(){
return berat;
}

public void setBerat(String berat){
this.berat = berat;
}

public String getHarga(){
return harga;
}

public void setHarga(String harga){
this.harga = harga;
}

public String getTgl_masuk(){
return tgl_masuk;
}

public void setTgl_masuk(String tgl_masuk){
this.tgl_masuk = tgl_masuk;
}

public String getTgl_estimasi(){
return tgl_estimasi;
}

public void setTgl_estimasi(String tgl_estimasi){
this.tgl_estimasi = tgl_estimasi;
}
/*
public String getTgl_ambil(){
return tgl_ambil;
}

public void setTgl_ambil(String tgl_ambil){
this.tgl_ambil = tgl_ambil;
}

public String getStatus(){
return status;
}

public void setStatus(String status){
this.status = status;
}

public String getBayar(){
return bayar;
}

public void setBayar(String bayar){
this.bayar = bayar;
}

public String getKembali(){
return kembali;
}

public void setKembali(String kembali){
this.kembali = kembali;
}

public String getSearch(){
return search;
}

public void setSearch(String search){
this.search = search;
}*/
}
