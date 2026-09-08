package Jobsheet3;

import java.util.Scanner;

public class MenghitungCicilanLaptop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double sisa, bunga, pokok, cicilan;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        sisa = x - y;
        bunga = 0.02 * sisa;
        pokok = sisa / z;
        cicilan = pokok + bunga;

        System.out.println("Cicilan per bulan adalah Rp. " + cicilan);
    }
}
