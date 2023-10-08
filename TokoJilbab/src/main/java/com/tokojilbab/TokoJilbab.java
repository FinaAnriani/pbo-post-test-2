package com.tokojilbab;

import tokojilbab.entity.Jilbab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TokoJilbab {
    private static List<Jilbab> jilbabList = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== TOKO JILBAB ===");
            System.out.println("1. Tambah Jilbab");
            System.out.println("2. Edit Jilbab");
            System.out.println("3. Hapus Jilbab");
            System.out.println("4. Tampilkan Jilbab");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahJilbab();
                    break;
                case 2:
                    editJilbab();
                    break;
                case 3:
                    hapusJilbab();
                    break;
                case 4:
                    tampilkanJilbab();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);
    }

    private static void tambahJilbab() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama jilbab: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga jilbab: ");
        double harga = scanner.nextDouble();

        Jilbab jilbab = new Jilbab(nextId, nama, harga);
        jilbabList.add(jilbab);
        nextId++;

        System.out.println("Jilbab berhasil ditambahkan.");
        System.out.println();
    }

    private static void editJilbab() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID jilbab yang akan diubah: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Jilbab jilbab = cariJilbabById(id);

        if (jilbab != null) {
            System.out.print("Masukkan nama jilbab baru: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan harga jilbab baru: ");
            double harga = scanner.nextDouble();

            jilbab.setNama(nama);
            jilbab.setHarga(harga);

            System.out.println("Jilbab berhasil diubah.");
        } else {
            System.out.println("Jilbab tidak ditemukan.");
        }

        System.out.println();
    }

    private static void hapusJilbab() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID jilbab yang akan dihapus: ");
        int id = scanner.nextInt();

        Jilbab jilbab = cariJilbabById(id);

        if (jilbab != null) {
            jilbabList.remove(jilbab);
            System.out.println("Jilbab berhasil dihapus.");
        } else {
            System.out.println("Jilbab tidak ditemukan.");
        }

        System.out.println();
    }

    private static void tampilkanJilbab() {
        System.out.println("=== DAFTAR JILBAB ===");
        for (Jilbab jilbab : jilbabList) {
            System.out.println("ID: " + jilbab.getId());
            System.out.println("Nama: " + jilbab.getNama());
            System.out.println("Harga: " + jilbab.getHarga());
            System.out.println();
        }
    }

    private static Jilbab cariJilbabById(int id) {
        for (Jilbab jilbab : jilbabList) {
            if (jilbab.getId() == id) {
                return jilbab;
            }
        }
        return null;
    }
}

