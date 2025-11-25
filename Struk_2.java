import java.util.Scanner;

public class Struk_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = new String[4];

        System.out.println("MASUKKAN DATA PEMESANAN TIKET FILKOM TRAVEL");

        System.out.print("Nama Customer  : ");
        data[0] = input.nextLine();

        System.out.print("Travel         : ");
        data[1] = input.nextLine();

        System.out.print("No Telp        : ");
        data[2] = input.nextLine();

        System.out.print("Harga Tiket    : Rp ");
        data[3] = input.nextLine();

        input.close();

        int hargaTiket = Integer.parseInt(data[3]);
        int totalBayar = hargaTiket;

        System.out.println("===================================");
        System.out.println("         STRUK PEMBAYARAN");
        System.out.println("          FILKOM TRAVEL");
        System.out.println("===================================");
        System.out.println("Nama Customer  : " + data[0]);
        System.out.println("Travel         : " + data[1]);
        System.out.println("No Telp        : " + data[2]);
        System.out.println("Harga Tiket    : Rp " + hargaTiket);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("===================================");
        System.out.println("       Terima Kasih Atas");
        System.out.println("       Kepercayaan Anda");
        System.out.println("===================================");
    }
}
