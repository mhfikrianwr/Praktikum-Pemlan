package modul1.soalPraktikum;

public class Koleksi {
    private String kategori;
    private Buku buku[];

    public Koleksi() {
        buku = new Buku[5]; // Inisialisasi array dengan ukuran 5
    }

    public void setKategori(String a) {
        kategori = a;
    }

    public String getKategori() { // Tambahkan getter untuk kategori
        return kategori;
    }

    public void setBuku(Buku book, int a) {
        if (a >= 0 && a < buku.length) { // Cek batas array
            buku[a] = book;
        } else {
            System.out.println("Indeks buku melebihi batas koleksi!");
        }
    }

    public void displayMessage(int a) {
        System.out.println("=== Koleksi buku " + kategori + " ===");
        for (int i = 0; i < 5; i++) {
            if (buku[i] != null) { // Pastikan elemen tidak null sebelum digunakan
                buku[i].displayMessage(i);
            } else {
                System.out.println("Buku ke-" + (i + 1) + " belum diisi.");
            }
        }
        System.out.println("=====================\n");
    }
}
