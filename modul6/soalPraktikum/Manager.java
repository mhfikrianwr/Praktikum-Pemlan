package soalPraktikum;

public class Manager extends Pekerja {
    private String departemen;
    public Manager(String departemen, double gaji, int tahun, int bulan, int hari,int jumlahAnak, String nama,String nik, boolean jenisKelamin, boolean menikah){
        super(gaji,tahun,bulan,hari,jumlahAnak,nama,nik,jenisKelamin,menikah);
        setDepartemen(departemen);
        addPendapatan(0.1 * gaji);
    }
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    public String getDepartemen(){
        return this.departemen;
    }
    public String toString(){
        return
        super.toString() +
        "departemen     : " + this.getDepartemen() + "\n"
        ;  
    }
}