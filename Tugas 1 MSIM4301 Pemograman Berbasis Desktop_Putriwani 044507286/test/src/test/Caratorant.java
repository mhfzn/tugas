package test;

// Library untuk memasukkan data dari 2keyboard
import java.util.Scanner;

public class Caratorant {
    public static class Menu {
        private String jenis;
        private String nama;
        private double harga;

        public Menu(String jenis, String nama, double harga) {
            this.jenis = jenis;
            this.nama = nama;
            this.harga = harga;
        }

        // Getter dan setter untuk jenis, nama, dan harga
    }

    public static class Pesanan {
        private Menu menu;
        private int jumlahPesanan;

        public Pesanan(Menu menu, int jumlahPesanan) {
            this.menu = menu;
            this.jumlahPesanan = jumlahPesanan;
        }
    }

    public Menu[] makanan; // Dibuat array karena menu makanan & minuman >1
    public Menu[] minuman; // Tanda [] menggambarkan array

    // Constructor
    public void setMakanan() {
        makanan = new Menu[4];
        makanan[0] = new Menu("makanan", "ayam bakar", 15000);
        makanan[1] = new Menu("makanan", "ayam goreng", 17000);
        makanan[2] = new Menu("makanan", "pecel ayam", 18000);
        makanan[3] = new Menu("makanan", "ayam geprek", 16000);
    }

    public void setMinuman() {
        minuman = new Menu[4];
        minuman[0] = new Menu("minuman", "es teh manis", 5000);
        minuman[1] = new Menu("minuman", "es kelapa", 4000);
        minuman[2] = new Menu("minuman", "es jeruk", 7000);
        minuman[3] = new Menu("minuman", "air putih", 2000);
    }

    public double totalHarga(Pesanan[] pesan) {
        double total = 0;

        for (int i = 0; i < pesan.length; i++) {
            total += pesan[i].menu.harga * pesan[i].jumlahPesanan;
        }

        total = total + (total * 0.1) + 20000; // 0.1 pajak & 20000 biaya layanan

        if (total >= 50000) {
            System.out.println("Selamat Anda mendapatkan promo beli 1 minuman gratis 1"); // Pembelian lebih dari 50rb

            if (total >= 100000) {
                System.out.println("Harga Total :" + total);
                System.out.println("Diskon 10% :" + total * 0.1);
                return total * 0.9; // Total kembalian, 0.9 karena tadi diskon 10%
            }
            return total;
        } else
            return total;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Membantu mendapatkan nilai dari keyboard
        System.out.println("Menu Makanan : ");
        Caratorant myMenu = new Caratorant();
        myMenu.setMakanan();
        myMenu.setMinuman();
        Pesanan[] pesan = new Pesanan[8];

        System.out.println(myMenu.makanan[0].nama);
        pesan[0] = new Pesanan(myMenu.makanan[0], sc.nextInt());
        System.out.println(myMenu.makanan[1].nama);
        pesan[1] = new Pesanan(myMenu.makanan[1], sc.nextInt());
        System.out.println(myMenu.makanan[2].nama);
        pesan[2] = new Pesanan(myMenu.makanan[2], sc.nextInt());
        System.out.println(myMenu.makanan[3].nama);
        pesan[3] = new Pesanan(myMenu.makanan[3], sc.nextInt());

        System.out.println("Menu Minuman : ");
        System.out.println(myMenu.minuman[0].nama);
        pesan[4] = new Pesanan(myMenu.minuman[0], sc.nextInt());
        System.out.println(myMenu.minuman[1].nama);
        pesan[5] = new Pesanan(myMenu.minuman[1], sc.nextInt());
        System.out.println(myMenu.minuman[2].nama);
        pesan[6] = new Pesanan(myMenu.minuman[2], sc.nextInt());
        System.out.println(myMenu.minuman[3].nama);
        pesan[7] = new Pesanan(myMenu.minuman[3], sc.nextInt());

        System.out.println("Total yang harus dibayar : " + myMenu.totalHarga(pesan));
    }
}
