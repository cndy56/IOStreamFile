/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author asus
 */
public class MainKontak {
      public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(new Kontak("Andi", "081111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "082222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "083333", "citra@gmail.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // Mencari kontak
        buku.cariKontak("Budi");
        buku.cariKontak("Dewi");

        System.out.println();

        // Menghapus kontak
        buku.hapusKontak("Andi");

        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}
