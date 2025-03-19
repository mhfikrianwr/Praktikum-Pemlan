package soalPraktikum;
import java.util.Scanner;
public class Account {
    private String nama, nomor;
    private double saldo;
    private boolean baru = false;
    private String pin;
    private String jenis;
    private double cashback;
    private boolean valid = true; 
    public Account(String nama, String nomor,double saldo,String pin){
        this.nama = nama;
        this.nomor = nomor;
        this.saldo = saldo;
        this.jenis = decideType(nomor);
        this.pin = pin;
    }
    private String decideType(String nomor){
        String ans = "";
        ans = ans + nomor.charAt(0) + nomor.charAt(1);
        switch(ans){
            case "38" :
            this.jenis = "silver";
            this.cashback = 1;
            break;
            case "56" :
            this.cashback = 0.98;
            this.jenis = "gold";
            break;
            case "74" :
            this.jenis = "platinum";
            this.cashback = 0.95;
            break;
        }
        return ans;
    }
    public void login(){
        Scanner in = new Scanner(System.in);
        if(!valid){
            System.out.println("-------Login gagal !!!");
            System.out.println("Tidak dapat login ke akun!!! akun ini telah diblokir !!!");
            System.out.println("------\n");
            return;
        }
        int counter = 0;
        while(true){
            String nomor,pin;
            System.out.print("Masukkan nomor akun anda : "); nomor = in.nextLine();
            System.out.print("Masukkan pin akun anda : "); pin = in.nextLine();
            System.out.println();
            if(!nomor.equals(this.nomor) || !pin.equals(this.pin)){
                counter++;
                System.out.println("---Login gagal!!!");
                System.out.println("Nomor atau Pin anda salah !!!");
                System.out.println("-----\n");
            }else{
                break;
            }
            if(counter == 3){
                valid = false;
                break;
            }
        }
        if(!valid){
            System.out.println("Anda sudah mencoba 3 kali !!! akun anda telah diblokir");
            return;
        }
        while(true){
            System.out.println("---Selamat datang " + this.nama + " ---");
            System.out.print("1. Pembelian\n2. Top Up\n3. Keluar\nMasukkan pilihan anda : ");
            int pilihan = in.nextInt();
            in.nextLine();
            if(pilihan == 3) break;
            else if(pilihan == 1) pembelian();
            else topUp();
        }
    }
    private void topUp(){
        Scanner in = new Scanner(System.in);
        double nominal;
        System.out.print("Masukkan nominal : ");
        nominal = in.nextDouble();
        this.saldo += nominal;
        System.out.println("---top up sukes!!!---");
        System.out.println("Top up berhasil! saldo akun anda bertambah sebanyak Rp "  +  nominal + " !!!");
        System.out.println("Saldo anda sekarang adalah " + this.saldo);
        System.out.println("-------\n");
    }
    public void pembelian(){
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nominal pembelian : ");
        double nominal = in.nextDouble();
        switch(jenis){
            case "silver":
            if(nominal > 1000000) this.cashback = 0.95;
            break;
            case "gold": 
            if(nominal > 1000000) this.cashback = 0.93;
            break;
            case "platinum":
            if(nominal > 1000000) this.cashback = 0.90;
            break;
        }
        nominal *= this.cashback;
        if(saldo - nominal < 10000){
            System.out.println("--- Pembelian gagal\nSaldo anda tidak cukup !!!");
            System.out.println("--------");
        }else{
            System.out.println("--- Pembelian berhasil !!! ");
            this.saldo -= nominal;
            System.out.println("Sisa saldo anda adalah : Rp " + this.saldo);
            System.out.println("---------\n");
        }
    }
}
