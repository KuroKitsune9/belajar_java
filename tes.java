import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        // deklarasi variabel
        int Wicked = 35_000;
        int Moana2 = 40_000;
        int Laufey = 120_000;
        int pilihanFilm;
        int jumlahKursiWicked = 10;
        int jumlahKursiMoana2 = 10;
        int jumlahKursiLaufey = 10;
        int tiketYangDiBooking = 0;
        int metodeBayar = 0;
        double diskon = 0;
        int harga = 0;
        double totalHarga = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Halo selamat datang di Bioskop Kesayangan mu, mau nonton apa hari ini?");
        System.out.println("1. Wicked");
        System.out.println("2. Moana 2");
        System.out.println("3. Laufey");
        System.out.print("Silahkan pilih film yang akan anda tonton : ");

        pilihanFilm = input.nextInt();
        if (pilihanFilm == 1) {
            harga = Wicked;
            System.out.print("Input jumlah tiket yang ingin dibeli : ");
            tiketYangDiBooking = input.nextInt();
            if (tiketYangDiBooking <= jumlahKursiWicked) {
                if (tiketYangDiBooking > 1) {
                    totalHarga = Wicked * tiketYangDiBooking;
                    System.out.println("Total Harga : " + "Rp. " + totalHarga);
                    System.out.println("Metode Pembayaran : ");
                    System.out.println("1. E-Wallet (POTONGAN HARGA 10%)");
                    System.out.println("2. Virtual Account Banking (POTONGAN HARGA 30%)");
                    System.out.print("Silahkan pilih metode pembayaran : ");
                    metodeBayar = input.nextInt();
                    if (metodeBayar == 1) {
                        diskon = totalHarga * 0.1;
                    }
                    if (metodeBayar == 2) {
                        diskon = totalHarga * 0.3;
                    }
                    double totalSetelahDiskon = totalHarga - diskon;
                    System.out.println("Total Diskon : " + "Rp. " + diskon);
                    System.out.println("Total Haga Sebelum Diskon : " + "Rp. " + totalHarga);
                    System.out.println("Total Harga Setelah Diskon :" + "Rp. " + totalSetelahDiskon);
                    System.out.println("Total Tiket Yang Di Beli : " + tiketYangDiBooking + " Tiket");
                    System.out.println("Terima Kasih");
                }
            }
        }
        if (pilihanFilm == 2) {
            harga = Moana2;
            System.out.print("Input jumlah tiket yang ingin dibeli : ");
            tiketYangDiBooking = input.nextInt();
            if (tiketYangDiBooking <= jumlahKursiMoana2) {
                if (tiketYangDiBooking > 1) {
                    totalHarga = Moana2 * tiketYangDiBooking;
                    System.out.println("Total Harga : " + "Rp. " + totalHarga);
                    System.out.println("Metode Pembayaran : ");
                    System.out.println("1. E-Wallet (POTONGAN HARGA 10%)");
                    System.out.println("2. Virtual Account Banking (POTONGAN HARGA 30%)");
                    System.out.print("Silahkan pilih metode pembayaran : ");
                    metodeBayar = input.nextInt();
                    if (metodeBayar == 1) {
                        diskon = totalHarga * 0.1;
                    }
                    if (metodeBayar == 2) {
                        diskon = totalHarga * 0.3;
                    }
                    double totalSetelahDiskon = totalHarga - diskon;
                    System.out.println("Total Diskon : " + "Rp. " + diskon);
                    System.out.println("Total Haga Sebelum Diskon : " + "Rp. " + totalHarga);
                    System.out.println("Total Harga Setelah Diskon :" + "Rp. " + totalSetelahDiskon);
                    System.out.println("Total Tiket Yang Di Beli : " + tiketYangDiBooking + " Tiket");
                    System.out.println("Terima Kasih");
                }
            }
        }
        if (pilihanFilm == 3) {
            harga = Laufey;
            System.out.print("Input jumlah tiket yang ingin dibeli : ");
            tiketYangDiBooking = input.nextInt();
            if (tiketYangDiBooking <= jumlahKursiLaufey) {
                if (tiketYangDiBooking > 1) {
                    totalHarga = Laufey * tiketYangDiBooking;
                    System.out.println("Total Harga : " + "Rp. " + totalHarga);
                    System.out.println("Metode Pembayaran : ");
                    System.out.println("1. E-Wallet (POTONGAN HARGA 10%)");
                    System.out.println("2. Virtual Account Banking (POTONGAN HARGA 30%)");
                    System.out.print("Silahkan pilih metode pembayaran : ");
                    metodeBayar = input.nextInt();
                    if (metodeBayar == 1) {
                        diskon = totalHarga * 0.1;
                    }
                    if (metodeBayar == 2) {
                        diskon = totalHarga * 0.3;
                    }
                    double totalSetelahDiskon = totalHarga - diskon;
                    System.out.println("Total Diskon : " + "Rp. " + diskon);
                    System.out.println("Total Haga Sebelum Diskon : " + "Rp. " + totalHarga);
                    System.out.println("Total Harga Setelah Diskon :" + "Rp. " + totalSetelahDiskon);
                    System.out.println("Total Tiket Yang Di Beli : " + tiketYangDiBooking + " Tiket");
                    System.out.println("Terima Kasih");
                }
            }
        }
        input.close();
    }
}