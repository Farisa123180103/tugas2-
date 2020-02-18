
package jenis;

import java.util.Scanner;

public class Mobil {
    public void jaz (){
        System.out.println("Jenis Mobil: Honda Jazz");
        int harga = 500000;
        System.out.println("Harga sewa: "+harga+"/hari");
        Scanner time = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int lama = time.nextInt();
        System.out.println("Total Pembayaran: "+harga*lama);
    }
    public void avanza (){
        System.out.println("Jenis Mobil: Toyota Avanza");
        int harga = 550000;
        System.out.println("Harga sewa: "+harga+"/hari");
        Scanner time = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int lama = time.nextInt();
        System.out.println("Total Pembayaran: "+harga*lama);
    }
    public void terios (){
        System.out.println("Jenis Mobil: Dayhatsu Terios");
        int harga = 600000;
        System.out.println("Harga sewa: "+harga+"/hari");
        Scanner time = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int lama = time.nextInt();
        System.out.println("Total Pembayaran: "+harga*lama);
    }
    
}
