import java.util.Scanner;;

public class TugasFORdanIF {
    public static void main(String[] args) {
        int pushUp;
        Scanner input = new Scanner(System.in);

        // input jumlah push up
        System.out.println("Masukan jumlah push up Kamu :");
        pushUp = input.nextInt();

        // Perulangan atau push up yang sudah di lakukah
        for (int i = 1; i < pushUp; i++) {
            System.out.println("Push up ke : " + i);
            if (i % 5 == 0) {
                System.out.println("Kerja bagus kamu sudah melakukan " + i + " push up");
            }
        }

        // Pesan yang akan sampai sesuai dengan jumlah push up
        if (pushUp <= 5 && pushUp >= 1) {
            System.out.println("Push up kamu :" + pushUp);
            System.out.println("Lemah coba untuk Tambahkan Push Up");
        } else if (pushUp > 5) {
            System.out.println("Push up kamu :" + pushUp);
            System.out.println("Usaha yang bagus semoga tetap konsisten");
        } else {
            System.out.println("Lakukan Push up Sekarang");
        }
    }
}
