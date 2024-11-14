import java.util.Scanner;

public class TokoKelotong {
    // Nama Barang
    static int indomie = 2_500;
    static int beras = 25_000;
    static int minyak = 10_000;
    static int telur = 7_500;
    static int tepung = 5_000;

    // Pilihan
    static int pilihan;

    // Jumlah Barang yang di beli
    static int jumlahBarang;

    // Total Bayar
    static int totalBayar = 0;

    // Perulangn
    static boolean ulang = true;

    // Scanner
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat datang di Toko Muharafi dalilah");
        while (ulang) {
            System.out.println("==============Menu===============");
            System.out.println("1. Indomie\t" + indomie);
            System.out.println("2. Beras\t" + beras);
            System.out.println("3. Minyak\t" + minyak);
            System.out.println("4. Telur\t" + telur);
            System.out.println("5. Tepung\t" + tepung);
            System.out.println("=================================");
            System.out.println("Silahkan Pilih");
            pilihan = input.nextInt();
            int hargaBarang = 0;
            String namaBarang = "";

            System.out.println("Masukan jumlah barang");
            jumlahBarang = input.nextInt();

            if (pilihan == 1) {
                hargaBarang = indomie;
                namaBarang = "Indomie";
            } else if (pilihan == 2) {
                hargaBarang = beras;
                namaBarang = "Beras";
            } else if (pilihan == 3) {
                hargaBarang = minyak;
                namaBarang = "Minyak";
            } else if (pilihan == 4) {
                hargaBarang = telur;
                namaBarang = "Telur";
            } else if (pilihan == 5) {
                hargaBarang = tepung;
                namaBarang = "Tepung";
            } else {
                System.out.println("Menu Tidak Tersedias");
            }

            System.out.println("Masih Ingin Membeli?");
            System.out.println("1. Ya");
            System.out.println("0. Tidak");
            int lanjut = input.nextInt();
            if (lanjut == 1) {
                ulang = true;
            } else {
                ulang = false;
            }

            int totalHargaBayar = hargaBarang * jumlahBarang;
            totalBayar += totalHargaBayar;
        }

        System.out.println("Jumlah Total Yang Harus Di Bayar: " + totalBayar + " ");
        input.close();
    }
}