package source.pertemuan12;

public class Perpustakaan {
    static Buku[] listBuku = new Buku[100];
    static Pelanggan[] listPelanggan = new Pelanggan[20];

    public Pegawai pegawaiPerpus;

    Perpustakaan(Pegawai pegawai) {
        this.pegawaiPerpus = pegawai;
    }

    void pinjam(String namaPelanggan, String judulBuku) {
        // CARI BUKUNYA DLU
        Buku buku = cariBuku(judulBuku);

        // APABILA NILAINYA NULL, BERARTI TIDAK BUKU DENGAN JUDUL YG SESUAI NILAI PARAMETER
        if (buku == null) {
            return;
        }

        // CARI PELANGGAN DLU
        Pelanggan pelanggan = cariPelanggan(namaPelanggan);

        // APABILA NULL, TIDAK ADA PELANGGAN YANG MEMILIKI NILAI NAMA PELANGGAN SESUAI DGN PARAMETER NAMAPELANGGAN
        if (pelanggan == null) {
            return;
        }

        int jumlahBaru = buku.getJumlah() - 1;

        buku.setJumlah(jumlahBaru);
        pelanggan.tambahBuku(buku);
    }

    Pelanggan cariPelanggan(String namaPelanggan) {
        for(int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] == null) continue;

            if (listPelanggan[i].getNama().equals(namaPelanggan)) {
                Pelanggan pelanggan = listPelanggan[i];
                return pelanggan;
            }
        }

        return null;
    }

    Buku cariBuku(String judulBuku) {
        /*
         * [Buku(PBO), Buku(ASD), Buku(PEMDAS), null,Buku(BASDAT)]
         * +PEMDAS
         * return Buku(PEMDAS)
         * +DAP
         * return null
         */
        for(int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] == null) continue;

            if (listBuku[i].getJudul().equals(judulBuku)) {
                Buku bukuDicari = listBuku[i];

                if (bukuDicari.getJumlah() <= 0) {
                    return null;
                }

                return bukuDicari;
            }
        }

        return null;
    }

    void tampilkanInfoPerpustakaan() {
        pegawaiPerpus.tampilkanInfoPegawai();

        System.out.println("INFO BUKU");
        for(int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] == null) {
                continue;
            }

            listBuku[i].tampilkanInfoBuku();
            System.out.println("-".repeat(40));
        }

        System.out.println("INFO PELANGGAN");
        for(int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] == null) {
                continue;
            }

            listPelanggan[i].tampilkanInfoPelanggan();
            System.out.println("-".repeat(40));
        }
    }
}
