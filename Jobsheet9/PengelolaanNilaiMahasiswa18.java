import java.util.Scanner;

public class PengelolaanNilaiMahasiswa18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMhs = input.nextInt();
        
        // Deklarasi array dengan ukuran sesuai input
        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        
        // Input nilai mahasiswa
        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        
        // Hitung rata-rata
        double rataRata = (double) total / nilaiMhs.length;
        
        // Cari nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        
        // Tampilkan semua nilai dengan status kelulusan
        System.out.println("\n=== DAFTAR NILAI DAN STATUS KELULUSAN ===");
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status;
            if (nilaiMhs[i] > 70) {
                status = "LULUS";
                jumlahLulus++;
            } else {
                status = "TIDAK LULUS";
                jumlahTidakLulus++;
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }
        
        // Tampilkan statistik
        System.out.println("\n=== STATISTIK NILAI ===");
        System.out.println("Total nilai        : " + total);
        System.out.println("Nilai rata-rata    : " + rataRata);
        System.out.println("Nilai tertinggi    : " + nilaiTertinggi);
        System.out.println("Nilai terendah     : " + nilaiTerendah);
        System.out.println("Jumlah lulus       : " + jumlahLulus + " mahasiswa");
        System.out.println("Jumlah tidak lulus : " + jumlahTidakLulus + " mahasiswa");
        
        input.close();
    }
}
