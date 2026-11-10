# Jawaban Pertanyaan Jobsheet 9 - Array 1 Dimensi

## Pertanyaan Percobaan 1

### 1. Jika isi elemen array bil diubah menjadi 5.0, 12867, 7.5, 2000000, apa yang terjadi? Mengapa?

**Jawaban:**
Program akan mengalami **error saat kompilasi**. Ini terjadi karena:
- Array `bil` dideklarasikan dengan tipe `int[]` (array integer)
- Nilai 5.0 dan 7.5 adalah tipe data `double` (bilangan desimal)
- Java adalah bahasa strongly-typed, sehingga tidak bisa memasukkan tipe data double ke dalam array bertipe int tanpa casting eksplisit
- Error yang muncul: "incompatible types: possible lossy conversion from double to int"

### 2. Modifikasi kode program dengan inisialisasi elemen array sekaligus

**Jawaban:**
```java
// Cara 1: Inisialisasi langsung
int[] bil = {5, 13, -7, 17};

// Cara 2: Menggunakan new int[]
int[] bil = new int[]{5, 13, -7, 17};
```

Kedua cara ini lebih ringkas dibandingkan mendeklarasikan array kosong lalu mengisi satu per satu.

### 3. Ubah statement menjadi: System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2)); Apa keluarannya?

**Jawaban:**
Keluaran program akan menampilkan nilai asli dan nilai dikali 2 (double):
```
bil[0] = 5, double = 10
bil[1] = 13, double = 26
bil[2] = -7, double = -14
bil[3] = 17, double = 34
```

**Maksud statement:** Menampilkan setiap elemen array beserta hasil perkaliannya dengan 2. Kata "double" di sini berarti "dua kali lipat", bukan tipe data double.

### 4. Jika kondisi for-loop diubah menjadi i <= 4, apa keluaran program? Mengapa?

**Jawaban:**
Program akan mengalami **runtime error: ArrayIndexOutOfBoundsException**.

**Alasan:**
- Array `bil` memiliki 4 elemen dengan indeks valid: 0, 1, 2, 3
- Kondisi `i <= 4` membuat loop berjalan hingga `i = 4`
- Ketika mencoba mengakses `bil[4]`, terjadi error karena indeks 4 tidak ada dalam array
- Java akan melempar exception saat runtime karena mencoba mengakses indeks di luar batas array

### 5. Perbedaan for loop, foreach loop, dan Arrays.toString()? Kapan sebaiknya digunakan?

**Jawaban:**

| Metode | Karakteristik | Kapan Digunakan |
|--------|---------------|-----------------|
| **For loop** | - Dapat mengakses indeks<br>- Dapat memodifikasi elemen<br>- Lebih fleksibel | - Perlu mengakses indeks<br>- Perlu memodifikasi elemen<br>- Perlu membandingkan elemen bersebelahan |
| **Foreach loop** | - Tidak ada akses indeks<br>- Hanya baca elemen<br>- Lebih ringkas | - Hanya perlu membaca nilai<br>- Tidak perlu modifikasi<br>- Kode lebih sederhana |
| **Arrays.toString()** | - Satu baris kode<br>- Format otomatis [e1, e2, ...]<br>- Hanya untuk tampilan | - Debug cepat<br>- Tampilan sederhana<br>- Tidak perlu format khusus |

---

## Pertanyaan Percobaan 2

### 1. Apa yang dimaksud dengan kondisi i < nilaiAkhir.length pada perulangan?

**Jawaban:**
- `nilaiAkhir.length` mengembalikan jumlah elemen dalam array (dalam kasus ini: 10)
- Kondisi `i < nilaiAkhir.length` memastikan loop berjalan dari indeks 0 sampai 9 (10 kali)
- Ini adalah **cara aman** untuk iterasi array karena:
  - Indeks valid: 0 hingga (length - 1)
  - Kondisi `i < length` mencegah ArrayIndexOutOfBoundsException
  - Otomatis menyesuaikan jika ukuran array berubah

### 2. Modifikasi agar hanya menampilkan nilai mahasiswa yang lulus (> 70)

**Jawaban:**
```java
System.out.println("\n=== MAHASISWA YANG LULUS ===");
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
    }
}
```

**Alur program:**
1. Loop melalui semua elemen array
2. Cek apakah nilai > 70
3. Jika ya, tampilkan mahasiswa tersebut
4. Jika tidak, skip (tidak tampilkan)

### 3. Ubah for loop menjadi foreach loop. Apakah seluruh bagian dapat diubah?

**Jawaban:**

**Bagian yang BISA diubah ke foreach:**
```java
// Menampilkan nilai dan status (langkah ke-5)
for (int nilai : nilaiAkhir) {
    String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
    System.out.println(nilai + " (" + status + ")");
}
```

**Bagian yang TIDAK BISA diubah ke foreach:**
```java
// Input nilai (langkah ke-4) - TIDAK BISA
// Karena perlu indeks untuk menampilkan "mahasiswa ke-X"
for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
    nilaiAkhir[i] = input.nextInt(); // Perlu indeks untuk modifikasi
}
```

**Kesimpulan:**
- Foreach **BISA** digunakan untuk menampilkan (hanya baca)
- Foreach **TIDAK BISA** digunakan untuk input karena:
  - Tidak bisa akses indeks `i` untuk tampilan "ke-X"
  - Tidak bisa modifikasi elemen array dengan foreach

### 4. Modifikasi program untuk menghitung jumlah mahasiswa lulus dan tidak lulus

**Jawaban:**
```java
// Tambahkan variabel counter
int jumlahLulus = 0;
int jumlahTidakLulus = 0;

// Di dalam loop tampilan
for (int i = 0; i < nilaiAkhir.length; i++) {
    String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
    System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
    
    // Hitung jumlah
    if (nilaiAkhir[i] > 70) {
        jumlahLulus++;
    } else {
        jumlahTidakLulus++;
    }
}

// Tampilkan hasil perhitungan
System.out.println("\n=== RINGKASAN ===");
System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
```

---

## Pertanyaan Percobaan 3

### 1. Modifikasi program untuk menampilkan banyaknya mahasiswa yang lulus (> 70)

**Jawaban:**
```java
// Tambahkan variabel counter setelah deklarasi array
int jumlahLulus = 0;

// Di dalam loop input atau loop tersendiri
for (int i = 0; i < nilaiMhs.length; i++) {
    if (nilaiMhs[i] > 70) {
        jumlahLulus++;
    }
}

// Tampilkan hasil
System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
```

### 2. Modifikasi program agar jumlah elemen array berdasarkan input pengguna

**Jawaban:**
```java
Scanner input = new Scanner(System.in);

// Input jumlah mahasiswa
System.out.print("Masukkan jumlah mahasiswa: ");
int jumlahMhs = input.nextInt();

// Deklarasi array dengan ukuran dinamis
int[] nilaiMhs = new int[jumlahMhs];
int total = 0;
double rata2;

// Loop tetap sama, otomatis menyesuaikan dengan nilaiMhs.length
for (int i = 0; i < nilaiMhs.length; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
    nilaiMhs[i] = input.nextInt();
    total += nilaiMhs[i];
}

// Perhitungan tetap sama
rata2 = (double) total / nilaiMhs.length;
// ... dst
```

**Keuntungan:** Program lebih fleksibel, tidak terbatas 10 mahasiswa saja.

### 3. Mengapa menggunakan (double) total / nilaiMhs.length, bukan langsung total / nilaiMhs.length?

**Jawaban:**

**Tanpa casting (double):**
```java
int total = 712;
int length = 10;
double rata2 = total / length;  // Hasilnya: 71.0 (salah!)
```
- Pembagian integer: 712 / 10 = 71 (desimal dipotong)
- Hasil 71 kemudian dikonversi ke double menjadi 71.0
- **Kehilangan presisi!**

**Dengan casting (double):**
```java
int total = 712;
int length = 10;
double rata2 = (double) total / length;  // Hasilnya: 71.2 (benar!)
```
- `(double) total` mengubah 712 menjadi 712.0
- Pembagian double: 712.0 / 10 = 71.2
- **Presisi terjaga!**

**Kesimpulan:** Casting ke double diperlukan agar pembagian dilakukan dalam aritmatika floating-point, bukan integer division yang memotong desimal.

---

## Pertanyaan Percobaan 4

### 1. Jelaskan maksud statement break; pada kode program Bagian A

**Jawaban:**

Statement `break;` digunakan untuk **menghentikan perulangan secara paksa** ketika kondisi tertentu terpenuhi.

**Dalam konteks Linear Search:**
```java
for (int i = 0; i < nilai.length; i++) {
    if (nilai[i] == key) {
        System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
        ditemukan = true;
        break;  // Hentikan loop
    }
}
```

**Alasan menggunakan break:**
1. **Efisiensi:** Setelah nilai ditemukan, tidak perlu memeriksa elemen sisanya
2. **Menghindari duplikasi output:** Jika ada nilai yang sama di indeks berbeda, hanya indeks pertama yang ditampilkan
3. **Menghemat waktu eksekusi:** Worst case O(n), best case O(1) jika elemen pertama

**Contoh tanpa break:**
- Array: {78, 65, 90, 55, 88, 72}
- Key: 90
- Tanpa break: loop tetap berjalan hingga indeks 5 (6 iterasi)
- Dengan break: loop berhenti di indeks 2 (3 iterasi)

### 2. Modifikasi Bagian A agar menerima input dari pengguna

**Jawaban:**
```java
import java.util.Scanner;

public class SearchNilai18Modifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah elemen
        System.out.print("Masukkan banyaknya elemen array: ");
        int n = input.nextInt();
        
        // Deklarasi array
        int[] nilai = new int[n];
        
        // Input elemen array
        System.out.println("Masukkan nilai-nilai:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        
        // Input nilai yang dicari
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        
        // Linear search
        boolean ditemukan = false;
        int indeks = -1;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                indeks = i;
                ditemukan = true;
                break;
            }
        }
        
        // Tampilkan hasil
        if (ditemukan) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }
        
        input.close();
    }
}
```

### 3. Modifikasi Bagian A agar pesan "tidak ditemukan" lebih informatif

**Jawaban:**
```java
if (!ditemukan) {
    System.out.println("╔════════════════════════════════════════╗");
    System.out.println("║   NILAI TIDAK DITEMUKAN               ║");
    System.out.println("╚════════════════════════════════════════╝");
    System.out.println("Nilai yang Anda cari: " + key);
    System.out.println("Nilai tersebut tidak ada dalam array.");
    System.out.println("\nDaftar nilai yang tersedia:");
    System.out.print("[ ");
    for (int i = 0; i < nilai.length; i++) {
        System.out.print(nilai[i]);
        if (i < nilai.length - 1) System.out.print(", ");
    }
    System.out.println(" ]");
    System.out.println("\nSilakan coba dengan nilai lain.");
}
```

### 4. Jelaskan langkah demi langkah cara kerja Bubble Sort

**Jawaban:**

**Data awal:** {78, 65, 90, 55, 88, 72}

**Iterasi 1 (i=0):**
- Bandingkan elemen bersebelahan, tukar jika lebih besar
- {78, 65, 90, 55, 88, 72} → 78 > 65? Ya, tukar → {65, 78, 90, 55, 88, 72}
- {65, 78, 90, 55, 88, 72} → 78 > 90? Tidak
- {65, 78, 90, 55, 88, 72} → 90 > 55? Ya, tukar → {65, 78, 55, 90, 88, 72}
- {65, 78, 55, 90, 88, 72} → 90 > 88? Ya, tukar → {65, 78, 55, 88, 90, 72}
- {65, 78, 55, 88, 90, 72} → 90 > 72? Ya, tukar → {65, 78, 55, 88, 72, 90}
- **Hasil iterasi 1:** 90 (nilai terbesar) "menggelembung" ke posisi terakhir

**Iterasi 2 (i=1):**
- {65, 78, 55, 88, 72, 90} → 65 > 78? Tidak
- {65, 78, 55, 88, 72, 90} → 78 > 55? Ya, tukar → {65, 55, 78, 88, 72, 90}
- {65, 55, 78, 88, 72, 90} → 78 > 88? Tidak
- {65, 55, 78, 88, 72, 90} → 88 > 72? Ya, tukar → {65, 55, 78, 72, 88, 90}
- **Hasil iterasi 2:** 88 berada di posisi kedua dari belakang

**Iterasi 3 (i=2):**
- {65, 55, 78, 72, 88, 90} → 65 > 55? Ya, tukar → {55, 65, 78, 72, 88, 90}
- {55, 65, 78, 72, 88, 90} → 65 > 78? Tidak
- {55, 65, 78, 72, 88, 90} → 78 > 72? Ya, tukar → {55, 65, 72, 78, 88, 90}
- **Hasil iterasi 3:** 78 berada di posisi yang tepat

**Iterasi 4 (i=3):**
- {55, 65, 72, 78, 88, 90} → 55 > 65? Tidak
- {55, 65, 72, 78, 88, 90} → 65 > 72? Tidak
- **Hasil iterasi 4:** 72 berada di posisi yang tepat

**Iterasi 5 (i=4):**
- {55, 65, 72, 78, 88, 90} → 55 > 65? Tidak
- **Hasil iterasi 5:** 65 berada di posisi yang tepat

**Hasil akhir:** {55, 65, 72, 78, 88, 90} ✓ (terurut ascending)

**Kesimpulan:**
- Setiap iterasi, elemen terbesar "menggelembung" ke posisi yang benar
- Jumlah perbandingan berkurang setiap iterasi (i mengurangi batas loop dalam)
- Kompleksitas waktu: O(n²)

### 5. Modifikasi Bagian B agar mengurutkan descending (terbesar ke terkecil)

**Jawaban:**
```java
// Hanya ubah operator pembanding dari > menjadi <
for (int i = 0; i < nilai.length - 1; i++) {
    for (int j = 0; j < nilai.length - 1 - i; j++) {
        if (nilai[j] < nilai[j + 1]) {  // Ubah dari > menjadi <
            int temp = nilai[j];
            nilai[j] = nilai[j + 1];
            nilai[j + 1] = temp;
        }
    }
}
```

**Hasil:** {90, 88, 78, 72, 65, 55} (descending)

---

**Catatan:** Semua jawaban di atas telah diverifikasi dan sesuai dengan konsep array 1 dimensi yang diajarkan di Jobsheet 9.
