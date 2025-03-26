package soalPraktikum;

public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah;
    private double pendapatan = 0;
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean Menikah){
        setNama(nama);
        setNik(nik);
        setJenisKelamin(jenisKelamin);
        setMenikah(Menikah);
        addTunjangan();
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }
    public String getJenisKelamin(){
        if(jenisKelamin) return "Laki-laki";
        else return "Perempuan";
    }
    public void addTunjangan(){
        if(this.menikah){
            if(this.jenisKelamin){
                this.pendapatan += 25;
            }
            else this.pendapatan += 20;
        }else this.pendapatan += 15;
    }
    public void addPendapatan(double b){
        this.pendapatan += b;
    }
    public double getTunjangan(){
        if(this.menikah){
            if(this.jenisKelamin){
                return 25;
            }
            else return 20;
        }else return 15;
    }
    public double getPendapatan(){
        return pendapatan;
    }

    public String toString(){
        return 
        "nama           : " + this.getNama() + "\n" +
        "nik            : " + this.getNik() + "\n" + 
        "jenisKelamin   : " + this.getJenisKelamin() + "\n" +
        "pendapatan     : " + this.getPendapatan() + "\n"
        ;
    }
}
