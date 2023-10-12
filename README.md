# pbo-post-test-2
Nama  : Fina Anriani

NIM   : 2209116051

Kelas : Sistem Informasi A 2022

Tema Project : Toko Jilbab



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



Output:

1. Saat program dijalankan, akan tampil output awal yang berisi menu pilihan seperti dibawah ini.
   
   ![pboawalan](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/1b264e40-528a-46b1-ac12-fc669a5e6d16)

2.  Saat pengguna memilih menu 1, program akan meminta pengguna untuk memasukkan detail jilbab baru, seperti ID, nama, jenis, dan harga. Setelah pengguna memasukkan detail jilbab baru, program akan memberikan konfirmasi bahwa jilbab berhasil ditambahkan.

![tambahjilbab](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/81aa6e3b-25b9-4193-8d84-c07acb4efd70)

3. Saat pengguna memilih menu 2, program akan menampilkan daftar jilbab yang telah ditambahkan sebelumnya. Output ini menampilkan informasi dari setiap jilbab yang ada dalam daftar jilbab, seperti ID, nama, jenis, dan harga.

![lihat](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/f094c4c9-f715-4cb1-993c-ab1b3d4f3e21)

4. Saat pengguna memilih menu 3, program akan meminta pengguna untuk memasukkan ID jilbab yang ingin diperbarui harganya. Output ini meminta pengguna untuk memasukkan ID jilbab yang ingin diperbarui harganya. Setelah pengguna memasukkan ID jilbab, program akan meminta pengguna untuk memasukkan harga baru. Output ini meminta pengguna untuk memasukkan harga baru yang akan diterapkan pada jilbab yang dipilih. Setelah harga jilbab berhasil diperbarui, program akan memberikan konfirmasi bahwa data jilbab berhasil diperbaharui.

![perbarui](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/ece5de19-ee2d-45ec-9082-62e8514f38c0)

5. Saat pengguna memilih menu 4, program akan meminta pengguna untuk memasukkan ID jilbab yang ingin dihapus. Setelah jilbab berhasil dihapus, program akan memberikan konfirmasi bahwa jilbab telah berhasil dihapus dari daftar jilbab.

![hapus](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/a2b9d3bb-9eda-4223-843f-81047dbba723)\

6. Saat pengguna memilih menu 5, program akan menampilkan pesan penutup dan program akan berakhir. Output ini merupakan pesan penutup yang ditampilkan setelah pengguna memilih menu keluar.

![keluar](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/abd061b2-9ff1-4c96-9190-472a0df2d6ce)
