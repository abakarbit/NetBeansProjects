/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

public class tugas1 {
    
     public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String makanan;
        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Ayam Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Nasi Goreng");
        System.out.println("4. Bakso");
        System.out.print("Masukkan Pilihan: ");
        
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                makanan = "Ayam Goreng";
                break;
            case 2:
                makanan = "Mie Goreng";
                break;
            case 3:
                makanan = "Nasi Goreng";
                break;
            case 4:
                makanan = "Bakso";
                break;
            default:
                makanan = "Tidak ada makanan";
        }
        
        System.out.println("Anda memilih: " + makanan);
    }
    
    
}
