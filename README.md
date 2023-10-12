# pbo-post-test-2
Nama  : Fina Anriani

NIM   : 2209116051

Kelas : Sistem Informasi A 2022



1. Struktur Package:
   - Kode tersebut terorganisir dalam dua package: `com.tokojilbab` dan `toko.jilbab.entity`.
   - Package `com.tokojilbab` berisi kelas utama `TokoJilbab` yang berfungsi sebagai titik masuk untuk program.
   - Package `toko.jilbab.entity` berisi dua kelas: `Jilbab` dan `Jilbab_Data`.

2. Kelas Utama (`TokoJilbab`):
   - Kelas `TokoJilbab` berisi metode `main`, yang merupakan titik awal program.
   - Di dalam metode `main`, sebuah `ArrayList` dengan nama `daftarJilbab` diinisialisasi untuk menyimpan objek-objek `Jilbab`.
   - Program berjalan dalam sebuah loop di mana ia menampilkan menu pilihan dan meminta input dari pengguna menggunakan objek `Scanner`.
   - Tergantung pada pilihan pengguna, berbagai metode dipanggil untuk melakukan operasi seperti menambahkan jilbab baru, melihat semua jilbab, memperbarui informasi jilbab, atau menghapus jilbab.
   - Program terus berulang dalam loop sampai pengguna memilih untuk keluar.

3. Kelas `Jilbab`:
   - Kelas `Jilbab` mewakili sebuah entitas jilbab dengan atribut-atribut seperti `id`, `nama`, `jenis`, dan `harga`.
   - Konstruktor dari kelas `Jilbab` digunakan untuk menginisialisasi atribut-atribut tersebut.
   - Kelas ini menyediakan metode-metode getter untuk mengakses nilai-nilai atribut.
   - Juga disediakan metode setter untuk memperbarui atribut `harga`.

4. Interface `Jilbab_Data`:
   - Interface `Jilbab_Data` mendefinisikan sebuah kontrak yang diimplementasikan oleh kelas `Jilbab`.
   - Interface ini menentukan metode-metode yang harus diimplementasikan oleh kelas apa pun yang ingin merepresentasikan data jilbab.
   - Dalam kasus ini, interface tersebut mendeklarasikan metode-metode untuk mendapatkan `id`, `nama`, `jenis`, dan `harga` dari sebuah jilbab.

Secara keseluruhan, kode tersebut merupakan contoh aplikasi sederhana berbasis konsol untuk mengelola data jilbab di sebuah toko. Kode tersebut memperlihatkan konsep-konsep seperti kelas, objek, koleksi (ArrayList), input pengguna (Scanner), dan alur kontrol dasar menggunakan loop dan pernyataan kondisional. Kode tersebut mengikuti prinsip-prinsip berorientasi objek dengan memisahkan konsep menjadi kelas-kelas dan interface yang berbeda.
