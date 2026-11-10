# Jobsheet 9 - Array 1 Dimensi

## Informasi Mahasiswa
- **Nama**: Muhammad Alif Syabani
- **NIM**: 18
- **Kelas**: 1B

## Daftar Program

### Percobaan 1: ArrayBilangan18.java
Program untuk memahami deklarasi, inisialisasi, dan menampilkan elemen array menggunakan berbagai metode (for loop, foreach, Arrays.toString()).

**Cara menjalankan:**
```bash
javac ArrayBilangan18.java
java ArrayBilangan18
```

### Percobaan 2: ArrayNilai18.java
Program SIAKAD untuk input nilai mahasiswa dan menampilkan status kelulusan (LULUS/TIDAK LULUS).

**Cara menjalankan:**
```bash
javac ArrayNilai18.java
java ArrayNilai18
```

### Percobaan 3: ArrayRataNilai18.java
Program untuk menghitung total, rata-rata, nilai tertinggi, terendah, dan predikat kelas dari nilai mahasiswa.

**Cara menjalankan:**
```bash
javac ArrayRataNilai18.java
java ArrayRataNilai18
```

### Percobaan 4A: SearchNilai18.java
Program untuk mencari nilai dalam array menggunakan algoritma Linear Search.

**Cara menjalankan:**
```bash
javac SearchNilai18.java
java SearchNilai18
```

### Percobaan 4B: SortNilai18.java
Program untuk mengurutkan array menggunakan algoritma Bubble Sort (ascending).

**Cara menjalankan:**
```bash
javac SortNilai18.java
java SortNilai18
```

### Tugas 1: PengelolaanNilaiMahasiswa18.java
Program lengkap untuk mengelola nilai mahasiswa dengan fitur:
- Input jumlah mahasiswa dinamis
- Input nilai mahasiswa
- Hitung rata-rata, nilai tertinggi, dan terendah
- Tampilkan status kelulusan setiap mahasiswa
- Hitung jumlah mahasiswa lulus dan tidak lulus

**Cara menjalankan:**
```bash
javac PengelolaanNilaiMahasiswa18.java
java PengelolaanNilaiMahasiswa18
```

### Tugas 2: AplikasiPemesananKafe18.java
Program aplikasi pemesanan kafe kampus dengan fitur:
- Pencarian menu (Linear Search)
- Validasi menu yang dipesan
- Pencatatan pesanan
- Perhitungan total biaya
- Tampilan ringkasan pesanan yang rapi

**Cara menjalankan:**
```bash
javac AplikasiPemesananKafe18.java
java AplikasiPemesananKafe18
```

## Konsep yang Dipelajari

1. **Deklarasi dan Inisialisasi Array**
   - Array kosong: `int[] arr = new int[size];`
   - Array dengan nilai: `int[] arr = {1, 2, 3};`

2. **Mengakses Elemen Array**
   - Indeks dimulai dari 0
   - Menggunakan `arr[index]`
   - Panjang array: `arr.length`

3. **Perulangan pada Array**
   - For loop: untuk akses indeks dan modifikasi elemen
   - Foreach loop: untuk membaca elemen tanpa indeks
   - Arrays.toString(): untuk menampilkan semua elemen

4. **Operasi Aritmatika**
   - Menghitung total (akumulasi)
   - Menghitung rata-rata
   - Mencari nilai maksimum dan minimum

5. **Algoritma Pencarian**
   - Linear Search: mencari elemen satu per satu

6. **Algoritma Pengurutan**
   - Bubble Sort: mengurutkan dengan membandingkan elemen bersebelahan

## Catatan Penting

- **ArrayIndexOutOfBoundsException**: Terjadi saat mengakses indeks di luar rentang array
- **Casting ke double**: Diperlukan saat menghitung rata-rata agar hasil tidak di-truncate
- **break statement**: Menghentikan perulangan ketika kondisi terpenuhi
- **Array bersifat fixed size**: Ukuran tidak bisa berubah setelah diinisialisasi

## Struktur Folder
```
Jobsheet9/
├── ArrayBilangan18.java
├── ArrayNilai18.java
├── ArrayRataNilai18.java
├── SearchNilai18.java
├── SortNilai18.java
├── PengelolaanNilaiMahasiswa18.java
├── AplikasiPemesananKafe18.java
├── Dokumen/
│   └── (untuk laporan praktikum)
└── README.md
```

## Status Pengerjaan
- [x] Percobaan 1: ArrayBilangan18
- [x] Percobaan 2: ArrayNilai18
- [x] Percobaan 3: ArrayRataNilai18
- [x] Percobaan 4A: SearchNilai18 (Linear Search)
- [x] Percobaan 4B: SortNilai18 (Bubble Sort)
- [x] Tugas 1: PengelolaanNilaiMahasiswa18
- [x] Tugas 2: AplikasiPemesananKafe18

---
**Tanggal Pengerjaan**: 10 November 2026
