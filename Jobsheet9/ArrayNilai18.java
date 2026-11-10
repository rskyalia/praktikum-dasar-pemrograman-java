import java.util.Scanner;

public class ArrayNilai18 {
    public static void main(String[] args) {
        // Deklarasi array dan Scanner
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        
        // Input nilai mahasiswa
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        
        // Menampilkan nilai dan status kelulusan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        
        input.close();
    }
}
