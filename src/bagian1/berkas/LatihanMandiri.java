/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author asus
 */
public class LatihanMandiri {
   public static void main(String[] args) {

        // 1. Mengecek berkas laporan.txt
        File laporan = new File("laporan.txt");

        System.out.println("1. Informasi berkas laporan.txt");
        System.out.println("Apakah berkas ada? " + laporan.exists());

        if (laporan.exists()) {
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        System.out.println();

        // 2. Membuat folder arsip menggunakan mkdir()
        File arsip = new File("arsip");

        System.out.println("2. Membuat folder arsip");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        System.out.println();

        // 3. Membuat berkas sementara.txt lalu menghapusnya
        File sementara = new File("sementara.txt");

        System.out.println("3. Membuat dan menghapus berkas sementara.txt");

        try {
            if (sementara.createNewFile()) {
                System.out.println("Berkas sementara.txt berhasil dibuat.");
            } else {
                System.out.println("Berkas sementara.txt sudah ada sebelumnya.");
            }

            System.out.println("Sebelum dihapus, apakah berkas ada? " + sementara.exists());

            if (sementara.delete()) {
                System.out.println("Berkas sementara.txt berhasil dihapus.");
            } else {
                System.out.println("Berkas sementara.txt gagal dihapus.");
            }

            System.out.println("Sesudah dihapus, apakah berkas ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    } 
}
