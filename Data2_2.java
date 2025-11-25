import java.util.Scanner;

public class Data2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI FILKOM TRAVEL");
        System.out.print("PADA MAU KEMANA NIHH??? ");
        String destinasi = input.nextLine();

        System.out.print("MASUKKAN JUMLAH PENUMPANG : ");
        int jumlahPenumpang = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlahPenumpang];
        String[] noTelp = new String[jumlahPenumpang];
        String[] alamat = new String[jumlahPenumpang];

        for (int i = 0; i < jumlahPenumpang; i++) {
            System.out.println("\nMASUKKAN DATA DIRI PENUMPANG KE-" + (i + 1));
            System.out.print("NAMA     : ");
            nama[i] = input.nextLine();
            System.out.print("NO. TELP : ");
            noTelp[i] = input.nextLine();
            System.out.print("ALAMAT   : ");
            alamat[i] = input.nextLine();
        }

        input.close();

        System.out.println("\n=== DATA PENUMPANG ===");
        System.out.println("DESTINASI: " + destinasi);
        for (int i = 0; i < jumlahPenumpang; i++) {
            System.out.println("\nPenumpang " + (i + 1));
            System.out.println("Nama   : " + nama[i]);
            System.out.println("NoTelp : " + noTelp[i]);
            System.out.println("Alamat : " + alamat[i]);
        }
    }
}
