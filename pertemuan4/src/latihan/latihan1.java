/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;
public class latihan1 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        System.out.print("Masukan realisasi: ");
        realisasi = input.nextFloat();
        System.out.print("Masukan kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("Masukan tugas: ");
        tugas = input.nextFloat();
        System.out.print("Masukan uts: ");
        uts = input.nextFloat();
        System.out.print("Masukan Uas :");
        uas = input.nextFloat();

        b_kehadiran = kehadiran/realisasi*10;
        b_tugas = tugas*20/100;
        b_uts = uts*30/100;
        b_uas = uas*40/100;
        total = b_kehadiran+b_tugas+b_uts+b_uas;

        System.out.print(total);



    }

}
