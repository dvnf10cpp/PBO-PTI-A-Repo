package source.pertemuan12;

class Siswa {
    static int kkm;
    String nama;
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Devan", "22");

        Perpustakaan perpus = new Perpustakaan(pegawai);

        pegawai.menambahPelanggan("Hayasaka", "99001110009");
        pegawai.menambahPelanggan("Miyuki", "99001100008");
        pegawai.menambahPelanggan("Kei", "990011110077");
        pegawai.menambahBuku("Heavens", "Tiancan", 3);
        pegawai.menambahBuku("Kaguya Sama", "Akasaka", 3);
        pegawai.menambahBuku("Solo Leveling", "Chugong", 1);

        perpus.pinjam("Hayasaka", "Overlord");
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Kei", "Solo Leveling");

        perpus.pinjam("Hayasaka", "Kaguya Sama");

        pegawai.menambahBuku("Overlord", "Maruyama", 3);

        pegawai.menambahBuku("Kaguya Sama", "Akasaka", 3);
        pegawai.menambahBuku("Solo Leveling", "Chugong", 1);

        perpus.pinjam("Kei", "Heavens");
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Kei", "Kaguya Sama");

        pegawai.menambahPelanggan("Shinomiya", "2");
        pegawai.menambahPelanggan("Miyuki", "1");

        perpus.pinjam("Shinomiya","Solo Leveling");
        perpus.pinjam("Shirogane", "Kaguya Sama");
        
        perpus.tampilkanInfoPerpustakaan();
    }

}
