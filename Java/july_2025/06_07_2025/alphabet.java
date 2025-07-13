import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Huruf Alphaber");

        System.out.print("Masukkan sebuah huruf: ");
        char inputHuruf = input.next().charAt(0);

        if (inputHuruf >= 'a' && inputHuruf <= 'z' || inputHuruf >= 'A' && inputHuruf <= 'Z') {
            System.out.println("Huruf " + inputHuruf + " adalah huruf alfabet.");
        } else {
            System.out.println("Huruf " + inputHuruf + " bukan huruf alfabet.");
        }

    }
}
