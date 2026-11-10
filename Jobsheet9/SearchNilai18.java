public class SearchNilai18 {
    public static void main(String[] args) {
        // Array nilai mahasiswa
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean ditemukan = false;
        
        // Linear search
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        
        // Mencoba dengan key yang tidak ada
        System.out.println("\n--- dicoba lagi dengan key = 100 ---");
        key = 100;
        ditemukan = false;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
