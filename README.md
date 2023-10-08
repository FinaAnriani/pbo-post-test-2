# pbo-post-test-2
Nama  : Fina Anriani
NIM   : 2209116051
Kelas : Sistem Informasi A 2022

Project tersebut adalah implementasi Java yang menggunakan tema "Toko Jilbab". 

Berikut adalah penjelasan singkat tentang setiap bagian koding tersebut:

1.	Package utama: com.tokojilbab
    •	TokoJilbab adalah kelas utama yang berfungsi sebagai program utama. Di dalamnya, terdapat logika untuk menampilkan menu dan mengelola data jilbab.
  	  ![image](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/a79d891a-ea1b-4034-9134-49ed75ff6d9c)

    •	Kode ini menggunakan objek Scanner untuk menerima input dari pengguna melalui konsol.
  	  ![image](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/e9d697d9-c927-4ba7-86ab-949dc44a4fca)

    •	Terdapat beberapa metode untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada daftar jilbab.
  	  ![1pbo](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/7efbd94a-f0c7-4abb-b9cc-5cf553566204)

    •	Metode tambahJilbab() digunakan untuk menambahkan jilbab baru ke dalam daftar.
  	  ![pil1pbo](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/3bb84f3c-08d7-4067-abc3-99002355a043)

    •	Metode editJilbab() digunakan untuk mengubah data jilbab yang sudah ada.
  	  ![pil2pbo](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/853d8757-fdde-4d92-a5ed-83ad5a18db02)

    •	Metode hapusJilbab() digunakan untuk menghapus jilbab dari daftar.
  	  ![pil3pbo](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/5185814b-15f6-4b1e-9131-2e8665bbea0f)

    •	Metode tampilkanJilbab() digunakan untuk menampilkan daftar jilbab yang sudah ada.
  	  ![pil4pbo](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/88bfbd3d-71b3-498a-b32c-544a6fa15bb9)

    •	Metode cariJilbabById() digunakan untuk mencari jilbab berdasarkan ID.
  	  ![image](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/684a490a-85af-44f5-aa8e-3c392314a6c3)

  
2.	Package entitas: com.tokojilbab.entity
   ![image](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/b49f7ead-d9f0-4815-a8cf-f76190874011)

    •	Di dalam package ini terdapat tiga kelas entitas: Jilbab, Pegawai, dan Pembeli.
  	  ![image](https://github.com/FinaAnriani/pbo-post-test-2/assets/127528115/f3d03c15-7604-49e2-bf88-5d4d2154e757)

    •	Setiap kelas memiliki atribut-atribut yang merepresentasikan data yang terkait dengan entitas tersebut, seperti ID, nama, harga, posisi, dan alamat.
    •	Setiap kelas memiliki konstruktor untuk menginisialisasi nilai awal atribut-atributnya.
    •	Setiap kelas juga memiliki metode getter dan setter untuk mengakses dan mengubah nilai atribut-atributnya.
