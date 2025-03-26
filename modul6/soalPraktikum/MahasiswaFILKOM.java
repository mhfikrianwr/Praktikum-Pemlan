package soalPraktikum;

public class MahasiswaFILKOM extends Manusia {
    private String nim, prodi, angkatan;
    private double ipk;
    private String status = "";
    public MahasiswaFILKOM(String nim,double ipk, String nama,String nik ,boolean jenisKelamin, boolean menikah){
        super(nama,nik,jenisKelamin,menikah);
        setNim(nim);
        setIpk(ipk);
        setAngkatan();
        setProdi(nim);
        setStatus();
        if(ipk > 3.0 && ipk <= 3.5) super.addPendapatan(50);
        else if(ipk >3.5 && ipk <= 4.0) super.addPendapatan(75);
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    public String getNim(){
        return this.nim;
    }
    public void setAngkatan(){
        String a = "20";
        char b = nim.charAt(0);
        char c = nim.charAt(1);
        a += b; a+=c;
        this.angkatan = a;
    }
    public void setStatus(){
        this.status += this.prodi + ", " + this.angkatan;
    }
    public String getStatus(){
        return this.status;
    }
    public void setBeasiswa(double a){
        super.addPendapatan(a);
    }
    public double getBeasiswa(){
        if(ipk >= 3.0 && ipk < 3.5) return 50;
        else if(ipk >= 3.5 && ipk <= 4.0) return 75;
        else return 0;
    }
    public void setProdi(String nim){
        char a = nim.charAt(6);
        if(a == '2') this.prodi = "Teknik Informatika";
        else if(a == '3') this.prodi = "Teknik Komputer";
        else if(a == '4') this.prodi = "Sistem Informasi";
        else if(a == '6') this.prodi = "Pendidikan Teknologi Informasi";
        else this.prodi = "Teknologi Informasi";
    }
    public double getIpk(){
        return this.ipk;
    }
    public String toString(){
        return
        super.toString() +
        "nim            : " + this.getNim() + "\n" +
        "ipk            : " + this.getIpk() + "\n" +
        "status         : " + this.getStatus() + "\n";
    }
}
