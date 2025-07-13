import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Segitiga Siku-Siku");

        System.out.println("Masukkan panjang sisi segitiga: ");

        System.out.print("Masukkan sisi a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan sisi b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan sisi c: ");
        double c = input.nextDouble();

        // validasi input
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Panjang sisi segitiga tidak boleh negatif atau nol");
        } else {
           if (a == b && b == c) {
               System.out.println("Segitiga tersebut adalah segitiga sama sisi.");
           } else if (a == b || b == c || a == c) {
               System.out.println("Segitiga tersebut adalah segitiga sama kaki.");
           } else if (a != b && b != c && a != c) {
               System.out.println("Segitiga tersebut adalah segitiga sembarang.");
           } else {
               System.out.println("Segitiga tersebut bukan segitiga siku-siku.");
           }
        }


    }
}
