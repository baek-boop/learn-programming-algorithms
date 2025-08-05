import java.util.Scanner;

public class kalkulatorUmurHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Kalkulator Umur dalam Hari");

        System.out.print("Masukkan umur anda dalam tahun: ");
        int tahun = input.nextInt();

        int hasil = tahun * 365;

        // Validasi input umur
        if (tahun < 0) {
            System.out.println("Umur tidak boleh kurang dari 0.");
        } else {
            System.out.println("Umur anda dalam hari adalah: " + hasil + " hari.");
        }
    }
}
