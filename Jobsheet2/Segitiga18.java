package Jobsheet2;

import java.util.Scanner;

public class Segitiga18 {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("berapa alasnya : ");
        int alas = inpScanner.nextInt();
        System.out.print("berapa tingginya : ");
        int tinggi = inpScanner.nextInt();
        float luas = alas * tinggi / 2;
        System.out.println("luasnya adalah = " + luas);
    }
}
