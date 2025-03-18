package soalPraktikum;
import java.util.Scanner;
public class Buku {
    private String penulis;
    private String judul;
    private String kategori;
    private String sinopsis;
    public Buku(){

    }
    public Buku(String penulis, String judul,String kategori,String sinopsis){
        this.setJudul(judul);
        this.setPenulis(penulis);
        this.setKategori(kategori);
        this.setSinopsis(sinopsis);
    }
    public void setSinopsis(String a){
        int panjangSinopsis = a.length();
        Scanner in = new Scanner(System.in);
        while(panjangSinopsis < 10){
            System.out.print("Sinopsis terlalu Pendek!! Masukkan sinopsis yang baru");
            a = in.nextLine();
        }
        this.sinopsis = a;
    }
    public void setJudul(String b) {
        judul = b;
    }

    public void setKategori(String a) {
        kategori = a;
    }

    public void setPenulis(String b) {
        penulis = b;
    }

    public void displayMessage() {
        System.out.println("===================");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Kategori: " + kategori);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("===================\n");
    }
    public void jumlahKata(){
        int b = sinopsis.length();
        int banyakKata = 0;
        for(int i=0; i<b; i++){
            if(sinopsis.charAt(i) != ' ') banyakKata++;
        }
        System.out.println("Jumlah kata dari sinopsis buku ini : " + banyakKata);
    }
    public int cekKesamaan(Buku buku2){
        int percentage = 0;
        if(this.judul.equalsIgnoreCase(buku2.judul)) percentage += 25;
        if(this.penulis.equalsIgnoreCase(buku2.penulis)) percentage += 25;
        if(this.kategori.equalsIgnoreCase(buku2.kategori)) percentage += 25;
        if(this.sinopsis.equalsIgnoreCase(buku2.sinopsis)) percentage += 25;
        return percentage;
    }
    public void copy(Buku buku2){
        int percentage = this.cekKesamaan(buku2);
        if(percentage == 100){
            System.out.println(this.judul + " mengopy buku " + buku2.judul + " tingkat kesamaan 100% !");
        }else{
            System.out.println(this.judul + " tidak mengopy buku " + buku2.judul + " tingkat kesamaan" + percentage + "% !");
        }
    }
    public void hitungRoyalti(int harga){
        System.out.print("Berapa buku judul yang terjual bulan ini : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double persen = 0.1;
        in.nextLine();
        int hargaTotal = n * harga;
        System.out.println("Buku terjual bulan ini : " + n);
        System.out.println("Penjualan bulan ini : " +"Rp." +hargaTotal);
        System.out.println("Royalti yang didapat (10%) : " + (hargaTotal * persen));
    }
    public void hitungRoyalti(double persen, int harga){
        System.out.print("Berapa buku yang terjual bulan ini : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = (int) persen;
        persen /= 100;
        int hargaTotal = n * harga;
        System.out.println("Buku terjual bulan ini : " + n);
        System.out.println("Penjualan bulan ini : " +"Rp." +hargaTotal);
        System.out.println("Royalti yang didapat (" + b +"%"+ ") : "  + (hargaTotal*persen));
    }
}
