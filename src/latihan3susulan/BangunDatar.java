package latihan3susulan;

/**
 * Nama  : Muhammad Zikry Fadillah
 * NPM   : 2310010467
 * Kelas : 4A Reguler Banjarmasin
 */

public class BangunDatar {
    // Atribut bertipe bilangan desimal
    double alas;
    double tinggi;
    double jariJari;
    double hasil;

    // Constructor untuk inisialisasi semua atribut ke nol
    public BangunDatar() {
        alas = 0;
        tinggi = 0;
        jariJari = 0;
        hasil = 0;
    }

    // Method mutator untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + hasil);
    }

    // Method mutator untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran = " + hasil);
    }

    // Method accessor untuk mengembalikan nilai hasil
    public double getHasil() {
        return hasil;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        // Uji nilai awal (semua harus 0)
        System.out.println("Nilai awal atribut:");
        System.out.println("Alas = " + bd.alas);
        System.out.println("Tinggi = " + bd.tinggi);
        System.out.println("Jari-jari = " + bd.jariJari);
        System.out.println("Hasil = " + bd.getHasil());

        // Set nilai untuk perhitungan
        bd.alas = 10;
        bd.tinggi = 5;
        bd.jariJari = 7;

        // Hitung dan cetak hasil
        bd.hitungLuasSegitiga();
        bd.hitungLuasLingkaran();
    }
}
