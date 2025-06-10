package latihan3;

// Nama  : [Muhammad Zikry Fadillah]
// NPM   : [2310010467]
// Kelas : [3A Reg Bjm]

public class Rumus {
    // Atribut
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    // Constructor: inisialisasi semua atribut ke nol
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }

    // Method mutator untuk menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }

    // Method mutator untuk menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
    }

    // Method accessor untuk mengembalikan nilai hasil
    public int getHasil() {
        return hasil;
    }
}
