package Jobsheet2;
import java.util.Scanner;

public class Tugas18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gajiPokok;
        int jumlahAnak;
        int tunjanganAnak;
        int totalTunjangan;
        int potonganPensiun;
        int gajiBersih;
    
        gajiPokok = 8000000;
        jumlahAnak = 2;
        tunjanganAnak = 400000;
        totalTunjangan = tunjanganAnak*jumlahAnak;
        potonganPensiun = gajiPokok*10/100;
        gajiBersih = gajiPokok+totalTunjangan-potonganPensiun;

        System.out.println(gajiBersih);
        


    }
}