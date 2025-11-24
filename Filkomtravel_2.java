import java.util.Scanner;

public class Filkomtravel_2 {

    static Scanner input = new Scanner(System.in);
    static String[] dataPenumpang = new String[3]; 
    static String[] dataTiket = new String[3];

    public static void main(String[] args) {
        boolean jalan = true;
        while (jalan) {
            System.out.println("\n=== APLIKASI TIKET TERPADU ===");
            System.out.println("1. Lihat paket wisata");
            System.out.println("2. Input data penumpang");
            System.out.println("3. Input data tiket");
            System.out.println("4. Cetak struk");
            System.out.println("0. Keluar");

            int pilih = readInt("Pilih menu: ");

            switch (pilih) {
                case 1:
                    tampilPaketWisata();
                    break;
                case 2:
                    inputPenumpang();
                    break;
                case 3:
                    inputTiket();
                    break;
                case 4:
                    cetakStruk();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void tampilPaketWisata() {
        System.out.println("\n=== DAFTAR PAKET WISATA ===");
        System.out.println("1. Gunung Bromo  - Rp 350.000");
        System.out.println("2. Batu Night Spectacular - Rp 120.000");
        System.out.println("3. Jatim Park 3 - Rp 150.000");
    }

    static void inputPenumpang() {
        System.out.println("\n=== INPUT DATA PENUMPANG ===");
        dataPenumpang[0] = readStr("Nama: ");
        dataPenumpang[1] = readStr("Telepon: ");
        dataPenumpang[2] = readStr("Alamat: ");

        System.out.println("Data penumpang berhasil disimpan!");
    }

    static void inputTiket() {
        System.out.println("\n=== INPUT DATA TIKET ===");

        dataTiket[0] = readStr("Tujuan: ");
        dataTiket[1] = readStr("Tanggal (dd/mm/yyyy): ");
        dataTiket[2] = readStr("Harga tiket: ");

        System.out.println("Data tiket berhasil disimpan!");
    }

    static void cetakStruk() {

        if (dataPenumpang[0] == null || dataTiket[0] == null) {
            System.out.println("Data belum lengkap! Input penumpang & tiket dulu.");
            return;
        }

        int harga = Integer.parseInt(dataTiket[2]);

        System.out.println("\n=========== STRUK PEMBELIAN ===========");
        System.out.println("Nama Penumpang : " + dataPenumpang[0]);
        System.out.println("Telepon        : " + dataPenumpang[1]);
        System.out.println("Alamat         : " + dataPenumpang[2]);
        System.out.println("----------------------------------------");
        System.out.println("Tujuan         : " + dataTiket[0]);
        System.out.println("Tanggal        : " + dataTiket[1]);
        System.out.println("Harga Tiket    : Rp " + harga);
        System.out.println("Total Bayar    : Rp " + harga);
        System.out.println("========================================");
    }


    static int readInt(String message) {
        System.out.print(message);
        while (!input.hasNextInt()) {
            System.out.print("Masukkan angka valid! " + message);
            input.next();
        }
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    static String readStr(String message) {
        System.out.print(message);
        return input.nextLine();
    }
}
