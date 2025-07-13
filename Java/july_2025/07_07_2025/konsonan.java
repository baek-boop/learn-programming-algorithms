import java.util.Scanner;

public class konsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Huruf Konsonan");

        System.out.print("Masukkan sebuah huruf: ");
        char huruf = input.next().charAt(0);

        // Validasi input
        if (huruf == ' ') {
            System.out.println("Input kosong");
        } else if (huruf >= 'a' && huruf <= 'z' || huruf >= 'A' && huruf <= 'Z') {
            // Cek apakah huruf adalah konsonan
            if (huruf != 'a' && huruf != 'e' && huruf != 'i' && huruf != 'o' && huruf != 'u' &&
                huruf != 'A' && huruf != 'E' && huruf != 'I' && huruf != 'O' && huruf != 'U') {
                System.out.println("Huruf " + huruf + " adalah konsonan.");
            } else {
                System.out.println("Huruf " + huruf + " bukan konsonan.");
            }
        } else {
            System.out.println("Input tidak valid, masukkan hanya huruf alfabet.");

        }
    }
}
