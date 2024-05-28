package source.pertemuan12;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    Buku(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void tampilkanInfoBuku() {
        System.out.println("Judul : " + getJudul());
        System.out.println("Penulis : " + getPenulis());
        System.out.println("Jumlah : " + getJumlah());
    }
}
