import java.util.Scanner;

public class HotelBooking {

    // Record untuk menyimpan data kamar
    static record Room(String roomType, int pricePerNight, boolean isAvailable) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data kamar menggunakan array
        Room[] rooms = {
                new Room("Standard", 500000, true),
                new Room("Deluxe", 1000000, true),
                new Room("Suite", 2000000, true)
        };

        System.out.println("Selamat datang di Hotel Java");
        System.out.println("============================");

        boolean running = true;

        while (running) {
            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Lihat daftar kamar");
            System.out.println("2. Pesan kamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayRooms(rooms);
                case 2 -> bookRoom(scanner, rooms);
                case 3 -> {
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    running = false;
                }
                default -> System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }

    // Fungsi untuk menampilkan daftar kamar
    static void displayRooms(Room[] rooms) {
        System.out.println("\nDaftar Kamar:");
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            System.out.printf("%d. %s - Rp%d per malam - %s\n",
                    i + 1, room.roomType, room.pricePerNight,
                    room.isAvailable ? "Tersedia" : "Dipesan");
        }
    }

    // Fungsi untuk memesan kamar
    static void bookRoom(Scanner scanner, Room[] rooms) {
        System.out.println("\nPilih kamar untuk dipesan:");
        displayRooms(rooms);
        System.out.print("Masukkan nomor kamar: ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Nomor kamar tidak valid!");
            return;
        }

        Room selectedRoom = rooms[roomNumber - 1];

        if (!selectedRoom.isAvailable) {
            System.out.println("Kamar sudah dipesan!");
            return;
        }

        System.out.print("Berapa malam Anda akan menginap? ");
        int Malam = scanner.nextInt();
        int totalPrice = selectedRoom.pricePerNight * Malam;

        System.out.printf("Total harga untuk %d malam di kamar %s adalah Rp%d.\n",
                Malam, selectedRoom.roomType, totalPrice);

        System.out.print("Konfirmasi pesanan? (ya/tidak): ");
        String confirmation = scanner.next();

        if (confirmation.equalsIgnoreCase("ya")) {
            rooms[roomNumber - 1] = new Room(selectedRoom.roomType, selectedRoom.pricePerNight, false);
            System.out.println("Pesanan Anda berhasil!");
        } else {
            System.out.println("Pesanan dibatalkan.");
        }
    }
}
