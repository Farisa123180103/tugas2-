
package rental;

import java.util.Scanner;

public class InfoSewa {
    public void dt(){
        Scanner data = new Scanner(System.in);
        System.out.print("Nama    : ");
        String cust = data.nextLine();
        System.out.print("No KTP  : ");
        String ktp = data.nextLine();
        System.out.print("Alamat  : ");
        String alamat = data.nextLine();
        System.out.print("No HP   : ");
        String hp = data.nextLine();
    }
}
