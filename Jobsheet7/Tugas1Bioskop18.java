package Jobsheet7;
import java.util.Scanner;

public class Tugas1Bioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        long totalPendapatan = 0;

        System.out.print("Masukkan jumlah transaksi hari ini: ");
        int jumlahTransaksi = sc.nextInt();

        for (int i = 1; i <= jumlahTransaksi; i++) {
            System.out.print("Transaksi ke-" + i + " - Jumlah tiket: ");
            int jumlahTiket = sc.nextInt();

            // Jika input tidak valid (negatif), abaikan dan minta ulang
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Masukkan jumlah tiket yang valid.");
                i--; // ulangi iterasi yang sama
                continue;
            }

            // Hitung diskon
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            long hargaTotal = (long) (jumlahTiket * hargaPerTiket * (1 - diskon));

            System.out.println("Jumlah tiket: " + jumlahTiket);
            if (diskon > 0) {
                System.out.println("Diskon: " + (int)(diskon * 100) + "%");
            }
            System.out.println("Total bayar: Rp " + hargaTotal);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += hargaTotal;
        }

        System.out.println("\n=== Rekapitulasi Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan    : Rp " + totalPendapatan);

        sc.close();
    }
}
