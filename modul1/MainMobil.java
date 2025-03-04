package modul1;
import java.util.*;
public class MainMobil {
    public static void inputData(Mobil mobil, int a, Scanner input){
        System.out.println("===== Input Data Mobil ke-" +a+ " =====");
        int kecepatan; String manufaktur, plat, warna;
        double waktu;
        System.out.print("Masukkan kecepatan mobil : ");
        kecepatan = input.nextInt();
        manufaktur = input.nextLine();
        mobil.setKecepatan(kecepatan); 
        System.out.print("Masukkan Manufaktur mobil : ");
        manufaktur = input.nextLine();
        mobil.setManufaktur(manufaktur); 
        System.out.print("Masukkan plat mobil : ");
        plat = input.nextLine();
        mobil.setNoPlat(plat); 
        System.out.print("Masukkan warna mobil : ");
        warna = input.nextLine();
        mobil.setWarna(warna); 
        System.out.print("Masukkan waktu  tempuh mobil (jam) : ");
        waktu = input.nextDouble();
        input.nextLine();
        mobil.setWaktu(waktu);
        System.out.println("======= Proses Input selesai ========\n");
    }
    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    Mobil m1 = new Mobil(); 
    Mobil m2 = new Mobil();
    inputData(m1,1,input);
    inputData(m2,2,input);

    System.out.println();
    m1.displayMessage();
    m2.displayMessage();

    //merubah warna dari objek m1 
    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau"); 
    m1.setWarna("Hijau"); 
    //menampilkan hasil perubahan 
    m1.displayMessage(); 
    } 
}
    
    