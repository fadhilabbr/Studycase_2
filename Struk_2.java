import java.util.Scanner;

public class Struk_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = inputData(input);
        int hargaTiket = Integer.parseInt(data[3]);
        int totalBayar = hargaTiket;
        input.close();

        cetakStruk(data[0], data[1], data[2], hargaTiket, totalBayar);
    }

    // Method untuk input data pemesanan
    public static String[] inputData(Scanner input) {
        String[] data = new String[4]; // [nama, travel, no_telp, harga_tiket]
        System.out.println("MASUKKAN DATA PEMESANAN TIKET FILKOM TRAVEL");
        System.out.print("Nama Customer  : ");
        data[0] = input.nextLine();
        System.out.print("Travel         : ");
        data[1] = input.nextLine();
        System.out.print("No Telp        : ");
        data[2] = input.nextLine();
        System.out.print("Harga Tiket    : Rp ");
        data[3] = String.valueOf(input.nextInt());
        return data;
    }

    // Method untuk mencetak struk pembayaran
    public static void cetakStruk(String nama, String travel, String noTelp, int hargaTiket, int totalBayar) {
        System.out.println("===================================");
        System.out.println("         STRUK PEMBAYARAN");
        System.out.println("          FILKOM TRAVEL");
        System.out.println("===================================");
        System.out.println("Nama Customer  : " + nama);
        System.out.println("Travel         : " + travel);
        System.out.println("No Telp        : " + noTelp);
        System.out.println("Harga Tiket    : Rp " + hargaTiket);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("===================================");
        System.out.println("       Terima Kasih Atas");
        System.out.println("       Kepercayaan Anda");
        System.out.println("===================================");
    }
}