import java.util.Scanner;

public class diskonClo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Diskon CLO");

        System.out.print("Masukan total belanja : ");
        int total = input.nextInt();

        System.out.print("Apakah anda sedang ujina CLO? (true/false) : ");
        boolean ujianCLO = input.nextBoolean();

        int diskonCLO = 0;
        int totalAkhir = 0;

        // validasi input
        if (total < 0) {
            System.out.println("Total belanja tidak boleh negatif");
        } else {
            if (ujianCLO) {
                diskonCLO = (int) (total * 0.35);
                totalAkhir = total - diskonCLO;
                System.out.println("Total belanja setelah diskon CLO 35% adalah : " + totalAkhir);
            } else {
                System.out.println("Maaf anda tidak mendapatkan diskon CLO. Total belanja anda: " + total);
            }
        }
    }
}
