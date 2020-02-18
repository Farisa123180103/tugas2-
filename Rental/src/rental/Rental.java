//Nim: 123180103
package rental;

import java.util.Scanner;
import jenis.*;


public class Rental {

    public static void main(String[] args) {
        System.out.println("=====RENTAL KENDARAAN=====");
        InfoSewa info = new InfoSewa();
        info.dt();
        int ulang = 0;
        do{
        System.out.println("=====JENIS KENDARAAN=====");
        System.out.print("1. MOTOR \n2. MOBIL\n PILIH: ");
        Scanner sewa = new Scanner(System.in);
        String nama;
        int pilih = sewa.nextInt();
        switch (pilih){
            case 1:
                Motor bike = new Motor();
                int ulang2 = 0;
                do{
                System.out.println("=====JENIS MOTOR=====");
                System.out.print("1. HONDA BEAT \n2. HONDA VARIO\n PILIH: ");
                int pilih1 = sewa.nextInt();
                switch(pilih1){
                    case 1:
                        bike.beat();
                        break;
                    case 2:
                        bike.vario();
                        break;
                    default:
                    System.out.println("kode yang anda masukkan salah.. silahkan coba lagi");
                    ulang2=1;
                    break;
                }
                }while(ulang2==1);
                break;
            case 2: 
                Mobil car = new Mobil();
                int ulang3 = 0;
                do{
                System.out.println("=====JENIS MOBIL=====");
                System.out.print("1. HONDA JAZZ \n2. TOYOTA AVANZA\n3. DAYHATSU TERIOS\n PILIH: ");
                int pilih2 = sewa.nextInt();
                switch(pilih2){
                    case 1:
                        car.jaz();
                        break;
                    case 2:
                        car.avanza();
                        break;
                    case 3:
                        car.terios();
                        break;
                    default:
                    System.out.println("kode yang anda masukkan salah.. silahkan coba lagi");
                    ulang3=1;
                    break;
                }
                }while(ulang3==1);
               
                break;
            default:
                System.out.println("kode yang anda masukkan salah.. silahkan coba lagi");
                ulang=1;
        }
        }while(ulang==1);
        
        
        
    }
    
}
