

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);
    
    public static void mulai() {
        System.out.println("SISTEM UAP");
        System.out.println("=".repeat(40));
        System.out.println("\n");

        System.out.print("Masukkan masa tanam (bulan) : ");
        int masaInBulan = in.nextInt(); in.nextLine();
        int masaInHari = masaInBulan * 30;

        for(int i = 0; i < 3; i++) {
            menanam();
        }

        for(int i = 1; i <= masaInHari; i++) {
            for(int j = 0; j < tanamans.size(); j++) {
                Tanaman t = tanamans.get(j);

                if (t.status().equals("Hidup")) {
                    t.berkembang();

                    if (i % 90 == 0) {
                        Perawatan p = (Perawatan)t;
                        p.treatment();
                    }

                } else if(lokasi.contains(j)) {
                    continue;
                } else if(t.status().equals("Mati")) {
                    lokasi.add(j);
                    System.out.println("Tanaman " + t.getClass().getName() + " sudah mati");
                    menanam();
                }
             }
        }
    }

    public static void menanam() {
        System.out.println("Mau menanam apa ? ");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        System.out.print("Pilih : ");
        int pilihan = in.nextInt();
        Tanaman taman = null;
        switch(pilihan) {
            case 1 -> {
                taman = new Tomat();
                System.out.println("Tomat berhasil ditanam");
            }
            case 2 -> {
                taman = new Stroberi();
                System.out.println("Tomat berhasil ditanam");
            }
            case 3 -> {
                taman = new Persik();
                System.out.println("Tomat berhasil ditanam");
            }
            default -> {
                System.out.println("Invalid");
            }
        }
        if (taman == null) return;

        tanamans.add(taman);
    }

    public static void info() {
        System.out.println("INFO TANAMAN");
        for(int i = 0; i < tanamans.size(); i++) {
            System.out.println("-".repeat(40));
            System.out.println("Tanaman ke " + (i + 1));
            System.out.println(tanamans.get(i));
        }
    }
}
