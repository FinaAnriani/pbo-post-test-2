package com.tokojilbab;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoJilbab {

    public static void main(String[] args) {
        // Inisialisasi ArrayList untuk menyimpan objek Jilbab
        ArrayList<Jilbab> daftarJilbab = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Tambah Jilbab");
            System.out.println("2. Lihat Semua Jilbab");
            System.out.println("3. Perbarui Jilbab");
            System.out.println("4. Hapus Jilbab");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahJilbab(scanner, daftarJilbab);
                    break;
                case 2:
                    lihatSemuaJilbab(daftarJilbab);
                    break;
                case 3:
                    perbaruiJilbab(scanner, daftarJilbab);
                    break;
                case 4:
                    hapusJilbab(scanner, daftarJilbab);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        // Menutup scanner setelah digunakan
        scanner.close();
    }

    private static void tambahJilbab(Scanner scanner, ArrayList<Jilbab> daftarJilbab) {
        System.out.print("Masukkan ID Jilbab: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consuming newline
        System.out.print("Masukkan Nama Jilbab: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Jilbab: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Harga Jilbab: ");
        double harga = scanner.nextDouble();

        Jilbab jilbabBaru = new Jilbab(id, nama, jenis, harga);
        daftarJilbab.add(jilbabBaru);

        System.out.println("Jilbab berhasil ditambahkan.");
    }

    private static void lihatSemuaJilbab(ArrayList<Jilbab> daftarJilbab) {
        System.out.println("=== Lihat Jilbab ===");
        for (Jilbab jilbab : daftarJilbab) {
            System.out.println("ID: " + jilbab.getId() + "\nNama: " + jilbab.getNama() +
                    "\nJenis: " + jilbab.getJenis() + "\nHarga: " + jilbab.getHarga());
        }
    }

    private static void perbaruiJilbab(Scanner scanner, ArrayList<Jilbab> daftarJilbab) {
        System.out.print("Masukkan ID Jilbab yang ingin diperbarui: ");
        int idPerbarui = scanner.nextInt();

        Jilbab jilbab = cariJilbabById(daftarJilbab, idPerbarui);

        if (jilbab != null) {
            System.out.print("Masukkan Harga baru: ");
            double hargaBaru = scanner.nextDouble();
            jilbab.setHarga(hargaBaru);
            System.out.println("Harga Jilbab berhasil diperbarui.");
        } else {
            System.out.println("Jilbab dengan ID tersebut tidak ditemukan.");
        }
    }

    private static void hapusJilbab(Scanner scanner, ArrayList<Jilbab> daftarJilbab) {
        System.out.print("Masukkan ID Jilbab yang ingin dihapus: ");
        int idHapus = scanner.nextInt();

        Jilbab jilbab = cariJilbabById(daftarJilbab, idHapus);

        if (jilbab != null) {
            daftarJilbab.remove(jilbab);
            System.out.println("Jilbab berhasil dihapus.");
        } else {
            System.out.println("Jilbab dengan ID tersebut tidak ditemukan.");
        }
    }

    private static Jilbab cariJilbabById(ArrayList<Jilbab> daftarJilbab, int id) {
        for (Jilbab jilbab : daftarJilbab) {
            if (jilbab.getId() == id) {
                return jilbab;
            }
        }
        return null;
    }
}

class Jilbab {
    private int id;
    private String nama;
    private String jenis;
    private double harga;

    public Jilbab(int id, String nama, String jenis, double harga) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
