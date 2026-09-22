package Jobsheet4;

import java.util.Scanner;

public class TugasAntrean18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MESIN ANTREAN AKADEMIK ===");
        System.out.println("1. Pengambilan Transkrip");
        System.out.println("2. Legalisir Dokumen");
        System.out.println("3. Konsultasi Akademik");
        System.out.println("4. Pengajuan Surat Keterangan");
        System.out.print("Masukkan kode layanan: ");
        int kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Antrean layanan: Pengambilan Transkrip");
                break;
            case 2:
                System.out.println("Antrean layanan: Legalisir Dokumen");
                break;
            case 3:
                System.out.println("Antrean layanan: Konsultasi Akademik");
                break;
            case 4:
                System.out.println("Antrean layanan: Pengajuan Surat Keterangan");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }

        sc.close();
    }
}
