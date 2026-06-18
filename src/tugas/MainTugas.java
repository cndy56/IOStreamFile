/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

//Nama : Cindy Aulia Rakhma
//NPM : 2410010108
/**
 *
 * @author asus
 */
public class MainTugas {
    public static void main(String[] args) {
        // Menyimpan daftar kategori dalam array String
        String[] kategori = {"Makanan", "Minuman", "Peralatan"};

        System.out.println("=== Daftar Kategori Barang ===");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }

        System.out.println();

        // Membuat objek Gudang dan menambahkan minimal 5 objek Barang
        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Beras", 15000, 20));
        gudang.tambahBarang(new Barang("Gula", 14000, 15));
        gudang.tambahBarang(new Barang("Minyak Goreng", 18000, 10));
        gudang.tambahBarang(new Barang("Sabun", 5000, 25));
        gudang.tambahBarang(new Barang("Kopi", 12000, 12));

        // Menampilkan seluruh barang
        gudang.tampilkanSemua();

        System.out.println();

        // Menyimpan seluruh data barang ke berkas
        gudang.simpanKeBerkas();

        System.out.println();

        // Membuat objek Gudang baru, lalu memuat data dari berkas
        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();
        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total nilai persediaan: Rp " + gudangBaru.totalNilai());
    }
}
