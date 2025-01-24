import java.util.Scanner;

public class Uas_Algorithm_Kel_3 {
    // Function untuk discount
    public static double discount(int metodeBayar, double totalHarga) {
        double diskon = 0;
        if (metodeBayar == 1) {
            diskon = totalHarga * 0.0;
        } else if (metodeBayar == 2) {
            diskon = totalHarga * 0.1;
        } else if (metodeBayar == 3) {
            diskon = totalHarga * 0.2;
        }
        return diskon;
    }

    public static void main(String[] args) {
        // Deklarasi Variabel Nama Barang
        String[] namaAlatTulis = {
                "Buku Tulis", "Buku Big Boss", "Sampul Coklat", "Plastik Buku", "Pulpen", "Pensil", "Tippex",
                "Penghapus", "Spidol", "Stabilo"
        };

        int[] hargaAlatTulis = {
                6500, 10000, 1000, 500, 5500, 3000, 5000, 5000, 9000, 15000
        };

        String[] barangYangDibeli = new String[10];

        int[] hargaBarangYangDibeli = new int[10];

        // Deklarasi Variabel Perulangan
        String statusBerulang = "Ya";
        int pilihanBarang = 0;
        double totalHarga = 0;
        int totalBarang = 0;
        int metodeBayar = 0;
        int loop = 0;

        // Input Scanner
        Scanner input = new Scanner(System.in);

        // Sambutan
        System.out.println("Selamat Datang Di Toko Buku TiGa, mau beli apa hari ini?");

        // Perulangan
        while (statusBerulang.equals("Ya")) {

            // pilihan barang yang dijual dengan memanggil array
            for (int i = 0; i < hargaAlatTulis.length; i++) {
                System.out.println((i + 1) + ". " + namaAlatTulis[i] + " : Rp" + ". " + hargaAlatTulis[i]);
            }
            System.out.print("Silahkan pilih nomor barang yang ingin anda beli : ");

            // User Memilih Barang
            pilihanBarang = input.nextInt();
            if (pilihanBarang > 6) {
                System.out.println("Pilihan Tidak Ada");
                continue;
            }

            // menjumlahkan harga yang di beli oleh cust
            totalHarga = totalHarga + hargaAlatTulis[pilihanBarang - 1];
            hargaBarangYangDibeli[loop] = hargaAlatTulis[pilihanBarang - 1];
            barangYangDibeli[loop] = namaAlatTulis[pilihanBarang - 1];

            // Kondisi Perulangan
            System.out.print("apakah ingin beli lagi?(Ya/Tidak) : ");
            statusBerulang = input.next();

            // Penjumlahan Barang Yang Di Beli
            totalBarang++;

            // loop index / untuk ngetrack looping ke berapa
            loop++;
        }

        // Metode Pembayaran serta diskon berdasarkan metode pembayaran
        System.out.println("Metode Pembayaran :");
        System.out.println("1. Tunai (Tanpa Potongan Harga)");
        System.out.println("2. E-Wallet (Potongan Harga 10%)");
        System.out.println("3. Virtual Account Banking (potongan harga 20%)");
        System.out.print("Silahkan pilih metode pembayaran yang ingin anda gunakan : ");

        // User memilih metode pembayaran
        metodeBayar = input.nextInt();
        double totaldiscount = discount(metodeBayar, totalHarga);

        // Variabel menghitung total setelah diskon
        double totalSetelahDiskon = totalHarga - totaldiscount;

        // TOTAL
        System.out.println("\n============ Struk Belanja ============");
        for (int i = 0; i < hargaBarangYangDibeli.length; i++) {
            if (barangYangDibeli[i] == null) {
                break;
            }
            if (hargaBarangYangDibeli[i] == 0) {
                break;
            }

            {
                System.out.println(barangYangDibeli[i] + "                     " + hargaBarangYangDibeli[i]);
            }
        }
        System.out.println("             Toko Buku TiGa\n");
        input.close();
        System.out.println("\n---------------------------------------");
        System.out.println("\nTotal Diskon : " + "Rp. " + totaldiscount);
        System.out.println("Total Haga Sebelum Diskon : " + "Rp. " + totalHarga);
        System.out.println("Total Harga Setelah Diskon :" + "Rp. " + totalSetelahDiskon);
        System.out.println("Total Barang Yang Di Beli : " + totalBarang + " Item");
        System.out.println("\n---------------------------------------");
        System.out.println("            Terima Kasih\n");
    }
}
