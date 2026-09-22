package Jobsheet4;

import java.util.Scanner;

public class TugasParkir18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM PARKIR ===");
        System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
        String kendaraan = sc.next();
        System.out.print("Masukkan lama parkir (jam): ");
        int lamaJam = sc.nextInt();

        int biaya;

        if (kendaraan.equalsIgnoreCase("motor")) {
            if (lamaJam <= 1) {
                biaya = 2000;
            } else {
                biaya = 2000 + (lamaJam - 1) * 1000;
            }
            System.out.println("Jenis Kendaraan : Motor");
        } else if (kendaraan.equalsIgnoreCase("mobil")) {
            if (lamaJam <= 1) {
                biaya = 4000;
            } else {
                biaya = 4000 + (lamaJam - 1) * 2000;
            }
            System.out.println("Jenis Kendaraan : Mobil");
        } else {
            System.out.println("Jenis kendaraan tidak dikenali");
            sc.close();
            return;
        }

        System.out.println("Lama Parkir     : " + lamaJam + " jam");
        System.out.println("Total Biaya     : Rp " + biaya);

        sc.close();
    }
}
