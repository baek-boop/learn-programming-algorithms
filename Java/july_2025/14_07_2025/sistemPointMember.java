import java.util.Scanner;

public class sistemPointMember {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Sistem Point Member");

        System.out.print("Masukkan total belanja andea: ");
        int totalBelanja = input.nextInt();

        // Validasi input total belanja
        if (totalBelanja <= 0 ) {
            System.out.println("Total belanja tidak boleh kurang dari atau sama dengan 0.");
        } else {
            if (totalBelanja >= 500000) {
                System.out.println("Anda mendapatkan 100 point.");
            } else if (totalBelanja >= 250000   ) {
                System.out.println("Anda mendapatkan 50 point.");
            } else {
                System.out.println("Anda mendapatkan 10 point.");
            }
        }
    }
}
