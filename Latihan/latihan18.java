package Latihan;

import java.util.Scanner;

public class latihan18 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Masukkan Angka");
        int masukanAngka = sc.nextInt();
        if (masukanAngka == 1) {
            System.out.println("Kambing");
        } else if (masukanAngka == 2) {
            System.out.println("Kelelawar");
        } else if (masukanAngka == 3) {
            System.out.println("Kucing");
        } else {
            System.out.println("Animal not in list");
        }
    }
}
