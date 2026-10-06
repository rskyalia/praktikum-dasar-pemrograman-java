import java.util.Scanner;

public class StudiKasus218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();
        String jenis = jenisKegiatan.trim().toLowerCase();

        String status;

        if (jenis.equals("belmawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkatJuara = sc.nextInt();

            if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {
                if (jumlahDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan (Juara " + peringkatJuara + ").";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
            }

        } else if (jenis.equals("pkm")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
            int statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan (PKM lolos pendanaan).";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            }

        } else {
            status = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        }

        System.out.println("Status : " + status);
    }
}
