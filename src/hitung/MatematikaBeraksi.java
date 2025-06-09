package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika zikry = new Matematika(2,3);

        System.out.println("Hasil penjumlahan: " + zikry.setPenjumlahan());
        System.out.println("Hasil pengurangan: " + zikry.setPengurangan());
        System.out.println("Hasil perkalian: " + zikry.setPerkalian());
        System.out.println("Hasil pembagian: " + zikry.setPembagian());
    }
}
