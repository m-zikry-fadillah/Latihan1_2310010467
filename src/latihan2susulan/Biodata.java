package latihan2susulan;

public class Biodata {
    // Atribut
    private String namaLengkap;
    private String npm;
    private String programStudi;
    private int angkatan;

    // Constructor
    public Biodata(String namaLengkap, String npm, String programStudi, int angkatan) {
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }

    // (Optional) Tambahkan getter jika ingin menampilkan datanya nanti
    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNpm() {
        return npm;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public int getAngkatan() {
        return angkatan;
    }
}
