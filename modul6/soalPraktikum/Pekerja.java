package soalPraktikum;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Pekerja extends Manusia {
    private double gaji;
    private int jumlahAnak;
    private LocalDate tahunMasuk;
    private double bonus;
    private long lamaKerja;
    private LocalDate currentDate = LocalDate.of(2025,3,19);
    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak,String nama,String nik,boolean jenisKelamin, boolean menikah){
        super(nama,nik,jenisKelamin, menikah);
        setGaji(gaji);
        setJumlahAnak(jumlahAnak);
        setTahunMasuk(tahun,bulan,tanggal);
        countKerja();
        super.addPendapatan(gaji);
        super.addPendapatan(getBonus());
    }
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }
    public void setTahunMasuk(int tahun, int bulan, int hari){
        this.tahunMasuk = LocalDate.of(tahun,bulan,hari);
    }
    public double getGaji(){
        return this.gaji;
    }
    public int getJumlahAnak(){
        return this.jumlahAnak;
    }
    public LocalDate getTahunMasuk(){
        return this.tahunMasuk;
    }
    public double getBonus(){
        return this.bonus;
    }
    public void setBonus(double a){
        this.bonus = a;
    }
    public void countKerja(){
        this.lamaKerja = ChronoUnit.YEARS.between(tahunMasuk, currentDate);
        if(lamaKerja <= 5) setBonus((getGaji() * 0.05) + (jumlahAnak * 20));
        else if(lamaKerja <= 10) setBonus((getGaji() * 0.1) + (jumlahAnak * 20));
        else setBonus((getGaji() * 0.15) + (jumlahAnak * 20));
    }
    public void addBonus(double a){
        this.gaji += a;
    }
    public String toString(){
        return
        super.toString() + 
        "tahun masuk    : " + getTahunMasuk() + "\n" +
        "jumlah anak    : " + getJumlahAnak() + "\n" +
        "gaji           : " + getGaji() + "\n"
        ;
    }
}
