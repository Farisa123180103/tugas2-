
package jenis;

import java.util.Scanner;

public class Motor {
    public void beat(){
        System.out.println("Jenis Motor: Honda Beat");
        int harga = 30000;
        System.out.println("Harga sewa: "+harga+"/hari");
        Scanner time = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int lama = time.nextInt();
        System.out.println("Total Pembayaran: "+harga*lama);
    }
    public void vario(){
        System.out.println("Jenis Motor: Honda Vario");
        int harga = 40000;
        System.out.println("Harga sewa: "+harga+"/hari");
        Scanner time = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int lama = time.nextInt();
        System.out.println("Total Pembayaran: "+harga*lama);
    }
}
