import java.util.Scanner;

public class latihan {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int status = 1;
        while (status == 1) {
            int nilaiAlgo, nilaiSd;

            System.out.println("Masukan Nilai Algo");
            nilaiAlgo = input.nextInt();

            System.out.println("Masukan Nilai Sd");
            nilaiSd = input.nextInt();

            int hasil = (nilaiAlgo + nilaiSd) / 2;

            System.out.println("Hasil dari penjumlahan kedua nilai adalah " + hasil);

            if (hasil >= 75 && hasil <= 100) {
                System.out.println("Selamat Anda lulus");
            } else if (hasil >= 0 && hasil <= 74) {
                System.out.println("Lakukan remedial");
            } else {
                System.out.println("Anda tidak lulus");
            }

            System.out.println("apakah masih mau cek?");
            status = input.nextInt();
        }
    }
}
