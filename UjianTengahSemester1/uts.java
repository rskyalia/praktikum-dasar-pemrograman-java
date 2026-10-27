package UjianTengahSemester1;

import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sudut1, sudut2, sudut3;
        String jenisSegitiga;

        System.out.print("Masukan Sudut Pertama  : ");
        sudut1 = sc.nextInt();
        System.out.print("Masukan Sudut Kedua    : ");
        sudut2 = sc.nextInt();
        System.out.print("Masukan Sudut Ketiga   : ");
        sudut3 = sc.nextInt();

        if (sudut1 == 60 && sudut2 == 60 && sudut3 == 60 ) {
            jenisSegitiga = "Sama Kaki";
            System.out.println(jenisSegitiga);
        } else if (sudut1 == 50 && sudut2 == 50 && sudut3 == 80) {
            jenisSegitiga = "Sama Sisi";
            System.out.println(jenisSegitiga);
        } else if (sudut1 == 90 && sudut2 == 60 && sudut3 == 30) {
            jenisSegitiga = "Siku Siku";
            System.out.println(jenisSegitiga);
        } else {
            System.out.println("Bukan Segitiga");
        }


        sc.close();
    }

}
