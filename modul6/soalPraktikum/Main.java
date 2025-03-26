package soalPraktikum;

public class Main {
    public static void main(String[] args){
        Manusia a = new Manusia("Fikri","2451",true,true);
        Manusia b = new Manusia("Sinta","872",false,true);
        Manusia c = new Manusia("Balmon","23949",true, false);
        Manusia d = new Manusia("Desi","10323",false, false);

        System.out.println("= = = Printing Human Object = = =");
        System.out.println(a.toString()); 
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println("= = = = = = = = = = = = = = = = =");

        MahasiswaFILKOM mhsa = new MahasiswaFILKOM("245150207111048",2.0,"Fikri 1", "21226",true,false);
        MahasiswaFILKOM mhsb = new MahasiswaFILKOM("245150207111048",3.3,"Fikri 2", "21226",true,false);
        MahasiswaFILKOM mhsc = new MahasiswaFILKOM("245150207111048",3.7,"Fikri 1", "21226",true,false);
        System.out.println("= = = Printing Mahasiswa Object = = =");
        System.out.println(mhsa.toString());
        System.out.println(mhsb.toString());
        System.out.println(mhsc.toString());
        System.out.println("= = = = = = = = = = = = = = = = = = =");

        Pekerja pka = new Pekerja(1000, 2023,
        2, 1, 2, "pkb", "111", true, true);
        Pekerja pkb = new Pekerja(1000, 2014,
        5, 1, 0, "pka", "111", true, true);
        Pekerja pkc = new Pekerja(1000, 2005,
        3, 2, 20, "pkc", "111", true, true);
        System.out.println("= = = Printing Pekerja Object = = =");
        System.out.println(pka.toString());
        System.out.println(pkb.toString());
        System.out.println(pkc.toString());
        System.out.println("= = = = = = = = = = = = = = = = = =");


        System.out.println("= = = Printing Manager Object = = =");
        Manager mn1 = new Manager("HRD", 7500,
        2010, 1, 2, 0, "managera", "111", true,
        true);
        System.out.println(mn1.toString());
        System.out.println("= = = = = = = = = = = = = = = = = =");

    }
}
