/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;
public class latihan2 {
    
    public static void main(String asg[]){

        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float per_makan, per_transport, per_belanja;

        System.out.print("Masukan Nominal Makan :");
        makan = input.nextFloat();
        System.out.print("Masukan Nominal Transport :");
        transport = input.nextFloat();
        System.out.print("Masukan Nominal Belanja :");
        belanja = input.nextFloat();

        total = makan + transport + belanja;
        System.out.println("Total Pengeluaran : "+ total);

        System.out.println("Persentasi Pengeluaran");

        per_makan = (makan / total) * 100;
        per_transport = (transport / total) * 100;
        per_belanja = (belanja / total) * 100;

        System.out.println("Makan = " + per_makan + "%");
        System.out.println("Belanja = " + per_belanja + "%");
        System.out.println("Transport = " + per_transport + "%");

    }

}
