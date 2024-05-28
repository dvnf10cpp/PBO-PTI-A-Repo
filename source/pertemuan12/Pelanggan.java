package source.pertemuan12;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] BukuPinjaman = new Buku[3];
    // [null, Buku(PBO), null]

    Pelanggan(String nama, String nomorPelanggan) {
        setNama(nama); // this.nama = nama;
        setNomorPelanggan(nomorPelanggan);
    }

    void tambahBuku(Buku bukuPinjam) {
        boolean bukunyaAda = false;

        for(int i = 0; i < Perpustakaan.listBuku.length; i++) {
            if(Perpustakaan.listBuku[i] == null) {
                continue;
            }

            if(Perpustakaan.listBuku[i].getJudul().equals(bukuPinjam.getJudul())
             && Perpustakaan.listBuku[i].getJumlah() > 0) {
                bukunyaAda = true;
             }
        }

        if (!bukunyaAda) {
            return;
        }

        /*
         * [Buku(PBO), Buku(ASD), Buku(DAP)]
         * +Buku(BASDAT) // gabakal masuk
         */

        for(int i = 0; i < BukuPinjaman.length; i++) {
            if (BukuPinjaman[i] == null) {
                BukuPinjaman[i] = bukuPinjam;
            }
        }
    }

    void tampilkanInfoPelanggan() {
        System.out.println("Nama : " + getNama());
        System.out.println("Nomor Pelanggan " + getNomorPelanggan());

        boolean adaBuku = false;

        for(int i = 0; i < this.BukuPinjaman.length; i++) {
            if (BukuPinjaman[i] == null) {
                continue;
            }

            System.out.println("Judul " + BukuPinjaman[i].getJudul());
            adaBuku = true;
        }

        if (!adaBuku) {
            System.out.println("Tidak Ada");
        }
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomorPelanggan() {
        return nomorPelanggan;
    }
    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }
}