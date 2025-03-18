package soalPraktikum;
public class MainApp {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Joko","Teknologi1","Teknologi","Merupakan buku teknologi cpu");
        Buku buku2 = new Buku("Joko","Teknologi1","Teknologi","Buku ini berisi tentang RAM");
        Buku buku3 = new Buku("Tono","Teknologi3","Teknologi","merupakan buku yang berisi tentang dijkstra");
        Buku buku4 = new Buku("Maso","Teknologi4","Teknologi","Merupakan buku teknologi komputer");
        Buku buku5 = new Buku("Budi","Teknologi5","Teknologi","Merupakan buku teknologi ram");

        //buat 5 filsafat
        Buku buku6 = new Buku("Budi","Filsafat1","Filsafat","Merupakan buku tentang filsafat1");
        Buku buku7= new Buku("Sinta","Filsafat2","Filsafat","Merupakan buku tentan filsafat2");
        Buku buku8= new Buku("tono","Filsafat3","Filsafat","Merupakan buku tentang filsafat3");
        Buku buku9 = new Buku("dimas","Filsafat4","Filsafat","Merupakan buku tentang filsafat4");
        Buku buku10= new Buku("sima","Filsafat5","Filsafat","Merupakan buku tentang filsafat5");

        //buat 5 sejarah
        Buku buku11= new Buku("sima","Sejarah1","Sejarah","Merupakan buku tentang Sejarah1");
        Buku buku12= new Buku("siga","Sejarah2","Sejarah","Merupakan buku tentang Sejarah2");
        Buku buku13= new Buku("masi","Sejarah3","Sejarah","Merupakan buku tentang Sejarah3");
        Buku buku14= new Buku("gasi","Sejarah4","Sejarah","Merupakan buku tentang Sejarah4");
        Buku buku15= new Buku("tsimaa","Sejarah5","Sejarah","Merupakan buku tentang Sejarah5");

        //buat 5 agama
        Buku buku16= new Buku("desi","Agama1","Agama","Merupakan buku tentang Agama1");
        Buku buku17= new Buku("desai","Agama2","Agama","Merupakan buku tentang Agama2");
        Buku buku18= new Buku("side","Agama3","Agama","Merupakan buku tentang Agama3");
        Buku buku19= new Buku("isagi","Agama4","Agama","Merupakan buku tentang Agama4");
        Buku buku20= new Buku("kaiser","Agama5","Agama","Merupakan buku tentang Agama5");

        //buat 5 psikologi
        Buku buku21= new Buku("bachira","Psikologi1","Psikologi","Merupakan buku tentang Psikologi1");
        Buku buku22= new Buku("Megumi","Psikologi2","Psikologi","Merupakan buku tentang Psikologi2");
        Buku buku23= new Buku("Ade","Psikologi3","Psikologi","Merupakan buku tentang Psikologi3");
        Buku buku24= new Buku("bachira","Psikologi4","Psikologi","Merupakan buku tentang Psikologi4");
        Buku buku25= new Buku("zenitsu","Psikologi5","Psikologi","Merupakan buku tentang Psikologi5");

        //buat 5 politik
        Buku buku26= new Buku("bachira","Politik1","Politik","Merupakan buku tentang Politik1");
        Buku buku27= new Buku("anto","Politik2","Politik","Merupakan buku tentang Politik2");
        Buku buku28= new Buku("budi","Politik3","Politik","Merupakan buku tentang Politik3");
        Buku buku29= new Buku("bachira","Politik4","Politik","Merupakan buku tentang Politik4");
        Buku buku30= new Buku("bachira","Politik5","Politik","Merupakan buku tentang Politik5");

        //buat 5 fiksi
        Buku buku31= new Buku("gojo","Fiksi1","Fiksi","Merupakan buku tentang Fiksi1");
        Buku buku32= new Buku("gojo satoru","Fiksi2","Fiksi","Merupakan buku tentang Fiksi2");
        Buku buku33= new Buku("itadori","Fiksi3","Fiksi","Merupakan buku tentang Fiksi3");
        Buku buku34= new Buku("tanjirou","Fiksi4","Fiksi","Merupakan buku tentang Fiksi4");
        Buku buku35= new Buku("nezuko","Fiksi5","Fiksi","Merupakan buku tentang Fiksi5");

        //memprint semua
        buku1.displayMessage();
        buku2.displayMessage();
        buku3.displayMessage();
        buku4.displayMessage();
        buku5.displayMessage();

        buku6.displayMessage();
        buku7.displayMessage();
        buku8.displayMessage();
        buku9.displayMessage();
        buku10.displayMessage();

        buku11.displayMessage();
        buku12.displayMessage();
        buku13.displayMessage();
        buku14.displayMessage();
        buku15.displayMessage();

        buku16.displayMessage();
        buku17.displayMessage();
        buku18.displayMessage();
        buku19.displayMessage();
        buku20.displayMessage();

        buku21.displayMessage();
        buku22.displayMessage();
        buku23.displayMessage();
        buku24.displayMessage();
        buku25.displayMessage();

        buku26.displayMessage();
        buku27.displayMessage();
        buku28.displayMessage();
        buku29.displayMessage();
        buku30.displayMessage();

        buku31.displayMessage();
        buku32.displayMessage();
        buku33.displayMessage();
        buku34.displayMessage();
        buku35.displayMessage();

        buku1.copy(buku2);
        buku1.copy(buku3);
    }
}
