package soalPraktikum;

public class Buku {
    private String penulis[];
    private int banyakPenulis;
    private String judul;
    private String kategori;

    public void setjumlahPenulis(int a) {
        banyakPenulis = a;
        penulis = new String[a]; // Inisialisasi array penulis sesuai jumlahnya
    }

    public void setJudul(String b) {
        judul = b;
    }

    public void setKategori(String a) {
        kategori = a;
    }

    public void setPenulis(String b, int a) {
        if (a >= 0 && a < banyakPenulis) { // Cek agar tidak out of bounds
            penulis[a] = b;
        } else {
            System.out.println("Indeks penulis melebihi batas!");
        }
    }

    public void displayMessage(int a) {
        System.out.println("===== Buku-" + (a + 1) + " =====");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: ");
        for (int i = 0; i < banyakPenulis; i++) {
            System.out.println("  " + (i + 1) + ". " + penulis[i]);
        }
        System.out.println("Kategori: " + kategori);
        System.out.println("===================\n");
    }
}
