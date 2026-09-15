package Kuis1;

import java.util.Scanner;

public class KonversiWaktu18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDetik;
        int jam;
        int menit;
        int detik;

        System.out.print("Total Detik = ");
        totalDetik = sc.nextInt();

        jam = totalDetik / 3600;
        menit = (totalDetik % 3600) / 60;
        detik = totalDetik % 60;


        System.out.println("Hasil Konversi Waktu = " + jam + " jam " + menit + " menit " + detik + " detik");

        sc.close();
    }
}
