import java.util.Scanner;

public class AplikasiPemesananKafe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Daftar menu dan harga kafe
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        
        System.out.println("========================================");
        System.out.println("   APLIKASI PEMESANAN KAFE KAMPUS");
        System.out.println("========================================");
        
        // Tampilkan daftar menu
        System.out.println("\n=== DAFTAR MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        
        // Fitur pencarian menu
        System.out.println("\n=== FITUR PENCARIAN MENU ===");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = input.nextLine();
        
        boolean ditemukan = false;
        int indexMenu = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                System.out.println("Menu '" + menu[i] + "' tersedia dengan harga Rp " + harga[i]);
                ditemukan = true;
                indexMenu = i;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Maaf, menu '" + cariMenu + "' tidak tersedia di kafe kami.");
        }
        
        // Fitur pemesanan
        System.out.println("\n=== PEMESANAN ===");
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = input.nextInt();
        input.nextLine(); // Clear buffer
        
        String[] pesanan = new String[jumlahItem];
        int[] hargaPesanan = new int[jumlahItem];
        int totalBiaya = 0;
        
        for (int i = 0; i < jumlahItem; i++) {
            boolean validMenu = false;
            
            while (!validMenu) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = input.nextLine();
                
                // Validasi menu ada dalam daftar
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        validMenu = true;
                        System.out.println("  -> " + menu[j] + " ditambahkan (Rp " + harga[j] + ")");
                        break;
                    }
                }
                
                if (!validMenu) {
                    System.out.println("  -> Menu tidak valid! Silakan pilih dari daftar menu yang tersedia.");
                }
            }
        }
        
        // Tampilkan ringkasan pesanan
        System.out.println("\n========================================");
        System.out.println("        RINGKASAN PESANAN");
        System.out.println("========================================");
        System.out.println("No.  Menu                    Harga");
        System.out.println("----------------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d %-20s Rp %,d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("========================================");
        System.out.printf("TOTAL BIAYA:               Rp %,d%n", totalBiaya);
        System.out.println("========================================");
        System.out.println("\nTerima kasih telah memesan di Kafe Kampus!");
        
        input.close();
    }
}
