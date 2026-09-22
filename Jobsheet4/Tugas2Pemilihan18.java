package Jobsheet4;

import java.util.Scanner;

public class Tugas2Pemilihan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Validasi KRS ---");
        System.out.print("Masukkan jumlah SKS yang diambil: ");
        int jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        sc.close();
    }
}
