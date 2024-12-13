/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujitsu U938
 */
import java.util.Scanner;

public class dataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan mata kuliah: ");
        String mataKuliah = scanner.nextLine();

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        System.out.println("\nData Nilai Mahasiswa:");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Mata Kuliah    : " + mataKuliah);
        System.out.println("Nilai          : " + nilai);
        
        scanner.close();
    }
}

