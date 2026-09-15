package Kuis1;

import java.util.Scanner;

public class ParkirMotor18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamaParkirJam;
        int tarifJamPertama = 2000;
        int tarifJamBerikutnya = 1000;
        int biayaJamPertama;
        int biayaJamBerikutnya;
        int totalBiaya;

        System.out.println("*********************** PARKIR MOTOR KAMPUS ***********************");
        System.out.print("Masukkan Lama Parkir (jam, minimal 2) : ");
        lamaParkirJam = sc.nextInt();

        biayaJamPertama = tarifJamPertama;
        biayaJamBerikutnya = (lamaParkirJam - 1) * tarifJamBerikutnya;
        totalBiaya = biayaJamPertama + biayaJamBerikutnya;

        System.out.println("Lama Parkir         : " + lamaParkirJam + " jam");
        System.out.println("Biaya Jam Pertama   : Rp " + biayaJamPertama);
        System.out.println("Biaya Jam Berikutnya: Rp " + biayaJamBerikutnya);
        System.out.println("Total Biaya Parkir  : Rp " + totalBiaya);

        sc.close();
    }
}
