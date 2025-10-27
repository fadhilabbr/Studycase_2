import java.util.Scanner;

public class Data2_1 {
    // Program reimplementation of Data1_1 using arrays and methods

    static String[] judul = {
        "SUNRISE HUNTER BROMO",
        "SOUTH MALANG BEACH HOPPING",
        "EXPLORE FUN KOTA BATU",
        "JOGJA ISTIMEWA GETAWAY (3 HARI 2 MALAM)"
    };

    static String[] deskripsi = {
        "Nikmati keindahan matahari terbit keemasan dari puncak Pananjakan dengan latar belakang gagahnya Gunung Bromo, Batok, dan Semeru.",
        "Jelajahi surga tersembunyi di pesisir selatan Malang. Dari pantai dengan pura di atas karang hingga pantai dengan ombak yang tenang.",
        "Habiskan hari penuh tawa dan keseruan di Kota Batu! Pilih taman rekreasi favoritmu dan abadikan momen di spot-spot foto yang Instagramable.",
        "Selami kekayaan budaya Jawa di kota Yogyakarta. Dari kemegahan candi kuno hingga keramaian jalan Malioboro yang legendaris."
    };

    static String[] sarana = {
        "- Penjemputan dari Malang (tengah malam).\n- Perjalanan dengan Jeep 4x4 menuju Pananjakan.\n- Menikmati momen matahari terbit (sunrise).\n- Turun ke lautan pasir dan mendaki kawah Bromo.\n- Mengunjungi Pasir Berbisik dan Bukit Teletubbies.",
        "- Penjemputan dari Malang (pagi hari).\n- Mengunjungi Pantai Balekambang (Little Tanah Lot).\n- Mengunjungi Pantai Goa Cina.\n- Menikmati sunset sebelum kembali ke Malang.",
        "- Penjemputan dari Malang.\n- Kunjungan ke theme park pilihan: Jatim Park 2 atau Jatim Park 3.\n- Mengunjungi Museum Angkut.\n- Singgah di Alun-Alun Kota Batu dan Pos Ketan Legenda.",
        "- Hari 1: Perjalanan Malang - Jogja, check-in, wisata malam di Malioboro.\n- Hari 2: Mengunjungi Candi Borobudur, Keraton Yogyakarta, dan Taman Sari.\n- Hari 3: Belanja oleh-oleh, mengunjungi Candi Prambanan, kembali ke Malang."
    };

    static String[] harga = {
        "Mulai dari Rp 350.000/orang",
        "Mulai dari Rp 250.000/orang",
        "Mulai dari Rp 300.000/orang",
        "Mulai dari Rp 950.000/orang"
    };

    static String[] fasilitas = {
        "Transportasi Jeep 4x4, Tiket masuk, Driver/Pemandu, Masker.",
        "Transportasi AC (Mobil), Tiket masuk semua pantai, Driver, Air mineral.",
        "Transportasi AC, Tiket masuk untuk 2 destinasi pilihan, Driver.",
        "Transportasi Kereta Api/Travel, Akomodasi hotel 2 malam, Transportasi lokal, Tiket masuk wisata."
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            showMenu();
            System.out.print("Masukkan pilihan anda : ");
            int pil = -1;
            if (input.hasNextInt()) {
                pil = input.nextInt();
                input.nextLine();
            } else {
                // consume invalid token
                input.nextLine();
            }

            if (pil >= 1 && pil <= judul.length) {
                showDetails(pil - 1);
                // wait for Enter to proceed to confirmation
                System.out.println();
                boolean confirmed = confirmPurchase(input);
                if (confirmed) {
                    System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                    running = false;
                } else {
                    // user chose not to confirm; continue loop
                    running = true;
                }
            } else if (pil == 0) {
                System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                break;
            } else {
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }
        }

        input.close();
    }

    static void showMenu() {
        System.out.println("Menu : ");
        for (int i = 0; i < judul.length; i++) {
            System.out.println((i + 1) + " : " + judul[i]);
        }
        System.out.println("0 : keluar");
    }

    static void showDetails(int index) {
        System.out.println("\n--- DETAIL PAKET: " + judul[index] + " ---");
        System.out.println("Deskripsi: " + deskripsi[index]);
        System.out.println("\nItinerary/Aktivitas:");
        System.out.println(sarana[index]);
        System.out.println("\nHarga: " + harga[index]);
        System.out.println("\nFasilitas: " + fasilitas[index]);
    }

    static boolean confirmPurchase(Scanner input) {
        String cek = "";
        do {
            System.out.print("Apakah kamu yakin ?(Y/n) : ");
            cek = input.nextLine();
            if (cek.equalsIgnoreCase("Y")) {
                return true;
            } else if (cek.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("MASUKAN ANDA TIDAK VALID");
            }
        } while (true);
    }
}
