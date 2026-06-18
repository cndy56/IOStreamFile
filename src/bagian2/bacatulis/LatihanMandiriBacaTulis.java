/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author asus
 */
public class LatihanMandiriBacaTulis {
        public static void main(String[] args) {
        String namaFile = "hari.txt";

        // 1. Menulis 5 nama hari ke dalam berkas hari.txt
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");

            System.out.println("5 nama hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis data: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Isi hari.txt setelah ditulis:");
        bacaFile(namaFile);

        // 2. Menambahkan 2 nama hari lagi tanpa menghapus isi sebelumnya
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile, true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println();
            System.out.println("2 nama hari berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Isi seluruh hari.txt setelah ditambahkan:");
        bacaFile(namaFile);

        // 3. Menghitung jumlah baris dalam berkas hari.txt
        int jumlahBaris = hitungBaris(namaFile);

        System.out.println();
        System.out.println("Jumlah baris dalam hari.txt: " + jumlahBaris);
    }

    public static void bacaFile(String namaFile) {
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            int nomor = 1;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
        }
    }

    public static int hitungBaris(String namaFile) {
        int jumlah = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal menghitung baris: " + e.getMessage());
        }

        return jumlah;
    }
}
