package modul1.soalPraktikum;
import java.util.Scanner;
public class MainApp {
    public static void inputData(Koleksi koleksi, Buku buku[], int counter, Scanner in) {
        System.out.println("===Input Buku Kategori " + koleksi.getKategori() + "===");

        String a;
        int b;
        for (int i = 0; i < 5; i++) {
            buku[counter] = new Buku(); // Inisialisasi objek baru
            buku[counter].setKategori(koleksi.getKategori());

            System.out.println("=== Input Buku ke-" + (i + 1) + " ===");
            System.out.print("Masukkan judul buku: ");
            a = in.nextLine();
            buku[counter].setJudul(a);
            koleksi.setBuku(buku[counter], i);

            System.out.print("Masukkan jumlah penulis: ");
            b = in.nextInt();
            buku[counter].setjumlahPenulis(b);
            in.nextLine(); // Konsumsi newline

            for (int y = 0; y < b; y++) {
                System.out.print("Masukkan penulis ke-" + (y + 1) + ": ");
                a = in.nextLine();
                buku[counter].setPenulis(a, y);
            }

            counter++;
            System.out.println("============\n");
        }
        System.out.println("=============");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner dibuat di main()
        Buku buku[] = new Buku[35];

        Koleksi koleksi1 = new Koleksi();
        koleksi1.setKategori("Teknologi");
        Koleksi koleksi2 = new Koleksi();
        koleksi2.setKategori("Filsafat");
        Koleksi koleksi3 = new Koleksi();
        koleksi3.setKategori("Sejarah");
        Koleksi koleksi4 = new Koleksi();
        koleksi4.setKategori("Agama");
        Koleksi koleksi5 = new Koleksi();
        koleksi5.setKategori("Psikologi");
        Koleksi koleksi6 = new Koleksi();
        koleksi6.setKategori("Politik");
        Koleksi koleksi7 = new Koleksi();
        koleksi7.setKategori("Fiksi");

        inputData(koleksi1, buku, 0, in);
        inputData(koleksi2, buku, 5, in);
        inputData(koleksi3, buku, 10, in);
        inputData(koleksi4, buku, 15, in);
        inputData(koleksi5, buku, 20, in);
        inputData(koleksi6, buku, 25, in);
        inputData(koleksi7, buku, 30, in);

        koleksi1.displayMessage(0);
        koleksi2.displayMessage(5);
        koleksi3.displayMessage(10);
        koleksi4.displayMessage(15);
        koleksi5.displayMessage(20);
        koleksi6.displayMessage(25);
        koleksi7.displayMessage(30);

        in.close(); // Scanner ditutup setelah semua input selesai
    }
}
