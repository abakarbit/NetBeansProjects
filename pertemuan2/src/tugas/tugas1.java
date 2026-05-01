/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;
public class tugas1 {
    
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nama;
        int usia;

        System.out.print("Input Nama : ");
        nama = input.nextLine();

        System.out.print("Input Usia : ");
        usia = input.nextInt();

   
        String kategori;
        if (usia < 0) {
            kategori = "Usia tidak valid";
        } else if (usia < 13) {
            kategori = "Anak-anak";
        } else if (usia < 18) {
            kategori = "Remaja";
        } else if (usia < 60) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("\n=== DATA ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Usia     : " + usia);
        System.out.println("Kategori : " + kategori);
    }
}
