package Jobsheet8.Tugas;

import java.util.Scanner;

public class Tugas3NoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1.");
            }
        } while (jumlahToko < 1);

        long totalBarangSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan Toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                do {
                    System.out.print("Barang pelanggan " + pelanggan + " Toko "
                            + toko + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);
                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + toko + " - pelanggan: "
                    + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalBarangSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
