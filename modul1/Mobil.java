package modul1;
public class Mobil {
    private String noPlat; 
    private String warna; 
    private String manufaktur; 
    private int kecepatan; 
    private double waktu;
    private int jarak;
    public void setNoPlat(String s){ 
    noPlat = s; 
    }
    public void setWarna(String s){ 
    warna = s; 
    } 
    public void setManufaktur(String s){ 
    manufaktur = s; 
    } 
    public void setKecepatan(int i){
        kecepatan = (ubahKecepatan(i)/3600);
    } 
    public void displayMessage(){ 
        System.out.println("Mobil anda adalah bermerek "+manufaktur); 
        System.out.println("mempunyai nomor plat "+noPlat); System.out.println("serta memililki warna "+warna); System.out.println("dan mampu menempuh kecepatan "+kecepatan + " m/ s"); 
        System.out.println("Waktu Tempuh mobil : " + waktu + " Sekon");
        setJarak();
        ubahJarak();
        System.out.println("Jarak yang ditempuh : " + jarak + "(KM)");
        System.out.println();
    } 
    public void setWaktu(double i){
        waktu = rubahSekon(i);
    }
    private double rubahSekon(double i){
        return (i*3600);
    }
    private int ubahKecepatan(int i){
        return (i*1000);
    }
    public void setJarak() {
        jarak = kecepatan * (int)waktu;
    }
    public void ubahJarak(){
        jarak = jarak / 1000;
    }
}



    