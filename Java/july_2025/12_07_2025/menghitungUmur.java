import java.util.Scanner;

public class menghitungUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Umur");

        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = input.nextInt();

        int hasil = 2025 - tahunLahir;

        if (hasil < 0) {
            System.out.println("Tahun lahir tidak valid.");
        } else {
            System.out.println("Umur Anda adalah: " + hasil + " tahun.");
        }
    }
}
