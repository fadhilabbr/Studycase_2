import java.util.Scanner;

public class Data2_2 {

    // Class untuk menyimpan data penumpangg
    static class Penumpang {
        String nama;
        String noTelp;
        String alamat;

        Penumpang(String nama, String noTelp, String alamat) {
            this.nama = nama;
            this.noTelp = noTelp;
            this.alamat = alamat;
        }

       
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI FILKOM TRAVEL");
        System.out.print("PADA MAU KEMANA NIHH??? ");
        String destinasi = input.nextLine();

        System.out.print("MASUKKAN JUMLAH PENUMPANG : ");
        int jumlahPenumpang = input.nextInt();
        input.nextLine(); 

        Penumpang[] daftarPenumpang = new Penumpang[jumlahPenumpang];

        for (int i = 0; i < jumlahPenumpang; i++) {
            System.out.println("\nMASUKKAN DATA DIRI PENUMPANG KE-" + (i + 1));
            daftarPenumpang[i] = inputDataPenumpang(input);
        }

        input.close();
    }

    // Method untuk input data penumpang
    public static Penumpang inputDataPenumpang(Scanner input) {
        System.out.print("NAMA     : ");
        String nama = input.nextLine();
        System.out.print("NO. TELP : ");
        String noTelp = input.nextLine();
        System.out.print("ALAMAT   : ");
        String alamat = input.nextLine();
        return new Penumpang(nama, noTelp, alamat);
    }
}