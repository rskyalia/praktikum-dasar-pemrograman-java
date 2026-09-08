package Tugas2;
import java.util.Scanner;
public class index {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang tanah (m): ");
        int panjangTanah = input.nextInt();
        System.out.print("Masukkan lebar tanah (m): ");
        int lebarTanah = input.nextInt();
        System.out.print("Masukkan diameter kolam (m): ");
        int diameterKolam = input.nextInt();
        System.out.print("Masukkan sisi taman (m): ");
        int sisiTaman = input.nextInt();
        double phi = 3.14;
        int luasTanah = panjangTanah * lebarTanah;
        double jariJari = diameterKolam / 2.0;
        double luasKolam = phi * jariJari * jariJari;
        int luasTaman = sisiTaman * sisiTaman;
        double luasDigunakan = luasKolam + luasTaman;
        double luasTidakDigunakan = luasTanah - luasDigunakan;

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Luas Tanah = " + luasTanah + " m2");
        System.out.println("Luas Kolam = " + luasKolam + " m2");
        System.out.println("Luas Taman = " + luasTaman + " m2");
        System.out.println("Luas Tanah yang tidak digunakan = "
                + luasTidakDigunakan + " m2");

        input.close();
    }
}