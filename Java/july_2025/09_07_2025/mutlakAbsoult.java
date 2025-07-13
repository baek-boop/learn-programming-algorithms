import java.util.Scanner;

public class mutlakAbsoult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Mutlak Absolut");

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();

        // Validasi input
        if (bilangan < 0) {
            System.out.println("Nilai mutlak dari " + bilangan + " adalah " + (bilangan * -1));
        } else {
            System.out.println("Nilai mutlak dari " + bilangan + " adalah " + bilangan);
        }
    }
}
