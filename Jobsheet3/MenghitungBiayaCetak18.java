package Jobsheet3;

import java.util.Scanner;

public class MenghitungBiayaCetak18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int biayaCetak;
        int total;

        x = sc.nextInt();

        biayaCetak = x * 500;
        total = biayaCetak + 5000;

        System.out.println("Total biaya cetak adalah Rp. " + total);
    }
}
