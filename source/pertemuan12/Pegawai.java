package source.pertemuan12;

public class Pegawai {
    private String nama;
    private String nomorPegawai;

    Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomorPegawai() {
        return nomorPegawai;
    }
    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    void tampilkanInfoPegawai() {
        System.out.println("Nama : " + getNama());
        System.out.println("Nomor Pegawai : " + getNomorPegawai());
    }

    void menambahPelanggan(String nama, String nomorPelanggan) {
        Pelanggan pelanggan = new Pelanggan(nama, nomorPelanggan);

        for(int i = 0; i < Perpustakaan.listPelanggan.length; i++) {
            if (Perpustakaan.listPelanggan[i] == null) {
                continue;
            }

            Pelanggan pel = Perpustakaan.listPelanggan[i];

            if (pel.getNama().equals(nama)) {
                return;
            }
        }
        // Pelanggan[] list = new Pelanggan[5];
        // [pelanggan1, pelanggan2, pelanggan3, null, null]
        /*
         * menambah(pelanggan1)
         * menambah(pelanggan2)
         * menambah(pelanggan3)
         */

        for(int i = 0; i < Perpustakaan.listPelanggan.length; i++) {
            if (Perpustakaan.listPelanggan[i] == null) {
                Perpustakaan.listPelanggan[i] = pelanggan;
                return;
            }
        }
    }

    void menambahBuku(String judul, String penulis, int jumlah) {
        Buku buku = new Buku(judul, penulis, jumlah);

        for(int i = 0; i < Perpustakaan.listBuku.length; i++) {
            if (Perpustakaan.listBuku[i] == null) {
                continue;
            }

            if (Perpustakaan.listBuku[i].getJudul().equals(judul)) {
                Buku bukuLama = Perpustakaan.listBuku[i];
                /*
                 * Masukkan buku ke dalam list buku
                 * Apabila buku yang ingin dimasukkan memiliki judul yang 
                 * sudah ada pada list buku, maka kita tambahkan stoknya
                 * Apabila tidak ada, maka kita tambahkan buku baru ke list buku
                 */

                int jumlahBaru = bukuLama.getJumlah() + jumlah;


                bukuLama.setJumlah(jumlahBaru);

                return;
            }
        }

        /*
         * Buku[] list = new Buku[4]
         * [Buku(Pemdas,+3), Buku(Pbo, +2), null, null]
         * +Buku(Pemdas)
         * +Buku(Pbo)
         * +Buku(Pemdas)
         * +Buku(Pemdas)
         * +Buku(Pbo)
         */

        for(int i = 0; i < Perpustakaan.listBuku.length; i++) {
            if (Perpustakaan.listBuku[i] == null) {
                Perpustakaan.listBuku[i] = buku;
                return;
            }
        }        
    }
}
