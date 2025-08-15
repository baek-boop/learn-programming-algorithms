import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Tiket Bioskop");

        System.out.println("Mau menonton film dihari apa? ");
        System.out.println("1. Senin\n2. Selasa\n3. Rabu\n4. Kamis\n5. Jumat\n6. Sabtu\n7. Minggu");
        System.out.print("Masukkan pilihan hari (1-7): ");
        int hari = input.nextInt();

        if (hari == 1 || hari == 2 || hari == 3 || hari == 4) {
            System.out.println("harga tiket bioskop adalah Rp. 35.000");
        } else if (hari == 5) {
            System.out.println("harga tiket bioskop adalah Rp. 40.000");
        } else if (hari == 6 || hari == 7) {
            System.out.println("harga tiket bioskop adalah Rp. 50.000");
        } else {
            System.out.println("Pilihan tidak valid, silakan pilih hari yang benar.");

        }
    }
}
