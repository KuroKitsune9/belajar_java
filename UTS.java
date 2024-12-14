import java.util.Scanner;

public class UTS {
    // Nama barang dan harga
    static int Laptop = 5_000_000;
    static int Televisi = 4_000_000;
    static int Monitor = 2_000_000;
    static int Handphone = 1_000_000;
    static int earphone = 1_000_000;

    // Pilihan barang dan jumlah barang
    static int pilihan;
    static int jumlahBarang;

    // Total pembayaran
    static int totalBayar = 0;

    // Perulangan untuk belanja
    static boolean perulangan = true;

    // Scanner untuk input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di toko Elektronik Kami!!!");

        while (perulangan) {
            System.out.println("==============Barang===============");
            System.out.println("1. Laptop\t" + Laptop);
            System.out.println("2. Televisi\t" + Televisi);
            System.out.println("3. Monitor\t" + Monitor);
            System.out.println("4. Handphone\t" + Handphone);
            System.out.println("5. Earphone\t" + earphone);
            System.out.println("===================================");

            pilihan = input.nextInt();

            System.out.println("Masukan Jumlah Barang");
            jumlahBarang = input.nextInt();

            int hargaBarang = 0;
            String namaBarang = "";

            if (pilihan == 1) {
                hargaBarang = Laptop;
                namaBarang = "Laptop";
            } else if (pilihan == 2) {
                hargaBarang = Televisi;
                namaBarang = "Televisi";
            } else if (pilihan == 3) {
                hargaBarang = Monitor;
                namaBarang = "Monitor";
            } else if (pilihan == 4) {
                hargaBarang = Handphone;
                namaBarang = "Handphone";
            } else if (pilihan == 5) {
                hargaBarang = earphone;
                namaBarang = "Earphone";
            } else {
                System.out.println("Barang Tidak Tersedia");
                continue;
            }

            int totalHargaBayar = hargaBarang * jumlahBarang;
            int diskon = 0;

            if (jumlahBarang >= 5 && jumlahBarang <= 9) {
                diskon = 1_000_000;
                totalHargaBayar -= diskon;
                System.out.println("Anda mendapatkan diskon 1 juta karena sudah membeli lebih dari 5 barang.");
            } else if (jumlahBarang >= 10 && jumlahBarang <= 14) {
                diskon = 1_500_000;
                totalHargaBayar -= diskon;
                System.out.println("Anda mendapatkan diskon 1,5 juta karena sudah membeli lebih dari 10 barang.");
            } else if (jumlahBarang >= 15) {
                diskon = 2_000_000;
                totalHargaBayar -= diskon;
                System.out.println("Anda mendapatkan diskon 2 juta karena sudah membeli lebih dari 15 barang.");
            }

            totalBayar += totalHargaBayar;

            System.out.println("==================== STRUK PEMBELIAN ====================");
            System.out.println("Nama Barang         : " + namaBarang);
            System.out.println("Jumlah Barang       : " + jumlahBarang);
            System.out.println("Harga per unit      : Rp " + hargaBarang);
            System.out.println("Harga Sebelum Diskon: Rp " + (hargaBarang * jumlahBarang));
            System.out.println("Diskon              : Rp " + diskon);
            System.out.println("Total Bayar         : Rp " + totalHargaBayar);
            System.out.println("--------------------------------------------------------");

            System.out.println("Masih ingin Berbelanja?");
            System.out.println("1. Ya");
            System.out.println("0. Tidak");
            int lanjut = input.nextInt();
            if (lanjut == 1) {
                perulangan = true;
            } else {
                perulangan = false;
            }
        }

        System.out.println("==================== TOTAL PEMBAYARAN ====================");
        System.out.println("Jumlah Total yang harus dibayar : Rp " + totalBayar);
        System.out.println("=========================================================");

        input.close();
    }
}
