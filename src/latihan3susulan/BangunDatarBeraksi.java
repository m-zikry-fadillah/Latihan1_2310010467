package latihan3susulan;

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        BangunDatar Zikry = new BangunDatar();

        
        Zikry.alas = 10;
        Zikry.tinggi = 6;
        Zikry.jariJari = 7;

        Zikry.hitungLuasSegitiga();
        System.out.println("Hasil luas segitiga: " + Zikry.getHasil());

        Zikry.hitungLuasLingkaran();
        System.out.println("Hasil luas lingkaran: " + Zikry.getHasil());
    }
}
