package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus
        Rumus rumus = new Rumus();

        // Mengisi nilai atribut
        rumus.sisi = 4;
        rumus.panjang = 5;
        rumus.lebar = 3;

        // Menghitung luas persegi
        rumus.hitungLuasPersegi();
        System.out.println("Luas Persegi: " + rumus.getHasil());

        // Menghitung luas persegi panjang
        rumus.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + rumus.getHasil());
    }
}
