package latihan2susulan;

public class BiodataBeraksi {
    public static void main(String[] args) {
       
        Biodata ziyy = new Biodata(
            "Zikry",
            "2310010467",
            "Teknik Informatika",
            2023
        );

        
        System.out.println("Nama Lengkap: " + ziyy.getNamaLengkap());
        System.out.println("NPM         : " + ziyy.getNpm());
        System.out.println("Program Studi: " + ziyy.getProgramStudi());
        System.out.println("Angkatan    : " + ziyy.getAngkatan());
    }
}
