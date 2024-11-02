import java.util.Scanner;

public class konversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double suhu, jawaban;

        System.out.println("Pilih untuk konversi suhu");
        System.out.println("Tekan 1 untuk konversi suhu dari farenheit ke celcius");
        System.out.println("Tekan 2 untuk konversi suhu dari celcius ke farenheit");
        System.out.println("Masukan: ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukan Suhu dalam Farenheit");
            suhu = input.nextDouble();
            jawaban = (suhu - 32) * 5 / 9;
            System.out.println("Hasilnya adalah: " + jawaban + " " + "Celius");
        } else if (pilihan == 2) {
            System.out.println("Masukan Suhu dalam Celcius");
            suhu = input.nextDouble();
            jawaban = (suhu * 9 / 5) + 32;
            System.out.println("Hasilnya adalah: " + jawaban + " " + "Farenheit");
        } else {
            System.out.println("Rumus tidak temukan");
        }
    }
}
