import java.util.Scanner;

public class Data2_1 {

    static String[] judul = {
        "SUNRISE HUNTER BROMO",
        "SOUTH MALANG BEACH HOPPING",
        "EXPLORE FUN KOTA BATU",
        "JOGJA ISTIMEWA GETAWAY (3 HARI 2 MALAM)"
    };

    static String[] deskripsi = {
        "Melihat sunrise di Pananjakan dengan latar Bromo, Batok, dan Semeru.",
        "Menjelajahi pantai-pantai indah di Malang Selatan.",
        "Bermain dan berwisata di Kota Batu, termasuk Jatim Park.",
        "Wisata budaya Jogja selama 3 hari 2 malam."
    };

    static String[] sarana = {
        "- Sunrise Pananjakan\n- Lautan pasir\n- Kawah Bromo",
        "- Pantai Balekambang\n- Pantai Goa Cina",
        "- Jatim Park\n- Museum Angkut\n- Alun-alun Kota Batu",
        "- Malioboro\n- Borobudur\n- Prambanan"
    };

    static String[] harga = {
        "Rp 350.000/orang",
        "Rp 250.000/orang",
        "Rp 300.000/orang",
        "Rp 950.000/orang"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilMenu();
            System.out.print("Masukkan pilihan (0 untuk keluar): ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan >= 1 && pilihan <= 4) {
                tampilDetail(pilihan - 1);
                if (konfirmasi(input)) {
                    System.out.println("TERIMA KASIH TELAH MEMESAN!");
                    break;
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak tersedia.\n");
            }

        } while (pilihan != 0);

        System.out.println("=== TERIMA KASIH TELAH MENGGUNAKAN FILKOM TRAVEL ===");
        input.close();
    }

    static void tampilMenu() {
        System.out.println("=== MENU TRAVEL ===");
        for (int i = 0; i < judul.length; i++) {
            System.out.println((i + 1) + ". " + judul[i]);
        }
        System.out.println("0. Keluar");
    }

    static void tampilDetail(int i) {
        System.out.println("\n=== DETAIL PAKET ===");
        System.out.println("Judul     : " + judul[i]);
        System.out.println("Deskripsi : " + deskripsi[i]);
        System.out.println("\nItinerary :\n" + sarana[i]);
        System.out.println("\nHarga     : " + harga[i] + "\n");
    }

    static boolean konfirmasi(Scanner input) {
        System.out.print("Lanjut pesan? (Y/n) : ");
        String jawab = input.nextLine();
        return jawab.equalsIgnoreCase("Y");
    }
}
