import java.util.Scanner;

public class pertemuan3 {
    public static void main(String[] arg) {
        String namaDepan, namTengah, namaBelakang;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nama Depan");
        namaDepan = input.nextLine();
        System.out.println("Masukan Nama Tengah (Jika Tidak ada Tekan Enter)");
        namTengah = input.nextLine();
        System.out.println("Masukan Nama Belakang");
        namaBelakang = input.nextLine();

        System.out.println(namaDepan + " " + namTengah + " " + namaBelakang);

    }
}