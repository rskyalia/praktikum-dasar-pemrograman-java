package Tugas1;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gajiPokok;
        int jumlahAnak;
        int tunjanganAnak;
        int totalTunjangan;
        int potonganPensiun;
        int gajiBersih;
    
        gajiPokok = 5000000;
        jumlahAnak = 4;
        tunjanganAnak = 100000;
        totalTunjangan = tunjanganAnak*jumlahAnak;
        potonganPensiun = gajiPokok*10/100;
        gajiBersih = gajiPokok+totalTunjangan-potonganPensiun;

        System.out.println(gajiBersih);
        


    }
}