package test;

public class menu {
    public String kategori;//makanan dan minuman
    public String nama;
    public int harga;

    //method constructor, dipanggil ketika akan membuat object dari menu makanan & minuman
    public menu(String kategori, String nama, int harga) {
        this.kategori=kategori;
        this.nama=nama;
        this.harga=harga;
    }
    public void setKategori(String kategori){
        this.kategori=kategori;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setHarga(int harga){
        this.harga=harga;
    }
    public String getKategori(){
        return this.kategori;
    }
    public String getNama(){
        return this.nama;
    }
    public int getHarga(){
        return this.harga;
    }
}