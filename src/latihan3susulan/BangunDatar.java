package latihan3susulan;

/**
 * Nama  : Ziyy Fall
 * NPM   : 202143501234
 * Kelas : TI-2B
 */

public class BangunDatar {
    // Atribut bertipe bilangan desimal
    double alas;
    double tinggi;
    double jariJari;
    double hasil;

    // Method untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + hasil);
    }

    // Method untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran = " + hasil);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        // Mengisi nilai atribut
        bd.alas = 8;
        bd.tinggi = 5;
        bd.jariJari = 7;

        // Memanggil method untuk menghitung dan menampilkan hasil
        bd.hitungLuasSegitiga();
        bd.hitungLuasLingkaran();
    }
}
