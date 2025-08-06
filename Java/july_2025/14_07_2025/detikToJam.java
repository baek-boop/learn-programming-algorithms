import java.util.Scanner;

public class detikToJam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Detik ke Jam");

        System.out.println("Masukkan jumlah detik: ");
        int jumlah = input.nextInt();

        // Validasi input jumlah detik
        if (jumlah < 0) {
            System.out.println("Jumlah detik tidak boleh kurang dari 0.");
        } else {
            int jam = jumlah / 3600;
            int sisaDetik = jumlah % 3600;
            int menit = sisaDetik / 60;
            sisaDetik = sisaDetik % 60;

            System.out.println(jumlah + " detik adalah " + jam + " jam, " + menit + " menit, dan " + sisaDetik + " detik.");
        }
    }
}
