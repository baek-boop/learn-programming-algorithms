import java.util.Scanner;

public class energi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Energi");

        System.out.print("Masukkan E0 : ");
        int E0 = input.nextInt();

        System.out.print("Masukkan c : ");
        int c = input.nextInt();

        System.out.print("Masukkan E1 : ");
        int E1 = input.nextInt();

        int cc = 0;

        // validasi input
        if (E0 < 0 && c < 0  && E1 < 0) {
            System.out.println("Masukkan tidak boleh negatif");
        } else {
             cc = (E0 - E1) / c;
        }

        System.out.println(cc);




    }
}
