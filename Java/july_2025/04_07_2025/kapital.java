import java.util.Scanner;

public class kapital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah huruf : ");
        char huruf = input.next().charAt(0);

        // validasi input
        if (huruf == ' ') {
            System.out.println("input kosong");
        } else {
                if ((huruf >= 'A' && huruf <= 'Z' || huruf >= 'a' && huruf <= 'z') && (Character.isUpperCase(huruf))) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
        }
    }
}
