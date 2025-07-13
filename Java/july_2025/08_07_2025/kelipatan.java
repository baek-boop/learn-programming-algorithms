import java.util.Scanner;
public class kelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Kelipatan 3 atua 5 atau 3 dan 5");

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();

        if (bilangan < 0) {
            System.out.println("Masuakkan sebuah bilangan bulat positif");
        } else if (bilangan % 3 == 0 && bilangan % 5 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah kelipatan 3 dan 5");
        } else if (bilangan % 3 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah kelipatan 3");
        } else if (bilangan % 5 == 0)  {
            System.out.println("Bilangan " + bilangan + " adalah kelipatan 5");
        } else {
            System.out.println("Bilangan " + bilangan + " bukan kelipatan 3 atau 5");
        }
    }
}
