/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;


import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float makan, transport, belanja;
        float total, diskon, totalBayar;
        float persenMakan, persenTransport, persenBelanja;

  
        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextFloat();
        System.out.print("Masukkan pengeluaran transport: ");
        transport = input.nextFloat();
        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextFloat();

     
        total = makan + transport + belanja;

     
        persenMakan = (makan / total) * 100;
        persenTransport = (transport / total) * 100;
        persenBelanja = (belanja / total) * 100;


        diskon = total * 10 / 100;
        totalBayar = total - diskon;


        System.out.println("Total pengeluaran: " + total);
        System.out.println("\n");
        System.out.println("Makan: " + persenMakan + "%");
        System.out.println("Transport: " + persenTransport + "%");
        System.out.println("Belanja: " + persenBelanja + "%");
        System.out.println("\n");
        System.out.println("Total setelah diskon: " + totalBayar);
    }
}