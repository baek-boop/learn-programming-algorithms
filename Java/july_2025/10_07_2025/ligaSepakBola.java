import java.util.Scanner;

public class ligaSepakBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Gol Liga Sepak Bola");

        // Deklarasi variabel untuk menyimpan gol dari setiap tim
        int jumlahGolTim1, jumlahGolTim2, jumlahGolTim3, jumlahGolTim4;

        System.out.print("Masukkan jumlah gol tim 1: ");
        jumlahGolTim1 = input.nextInt();

        System.out.print("Masukkan jumlah gol tim 2: ");
        jumlahGolTim2 = input.nextInt();

        System.out.print("Masukkan jumlah gol tim 3: ");
        jumlahGolTim3 = input.nextInt();

        System.out.print("Masukkan jumlah gol tim 4: ");
        jumlahGolTim4 = input.nextInt();

        // Inisialisasi variabel untuk melacak gol tertinggi dan terendah
        int golTertinggi = jumlahGolTim1;
        String timGolTertinggi = "Tim 1";

        int golTerendah = jumlahGolTim1;
        String timGolTerendah = "Tim 1";

        // Pengecekan untuk gol tertinggi
        if (jumlahGolTim2 > golTertinggi) {
            golTertinggi = jumlahGolTim2;
            timGolTertinggi = "Tim 2";
        }
        if (jumlahGolTim3 > golTertinggi) {
            golTertinggi = jumlahGolTim3;
            timGolTertinggi = "Tim 3";
        }
        if (jumlahGolTim4 > golTertinggi) {
            golTertinggi = jumlahGolTim4;
            timGolTertinggi = "Tim 4";
        }

        // Pengecekan untuk gol terendah
        if (jumlahGolTim2 < golTerendah) {
            golTerendah = jumlahGolTim2;
            timGolTerendah = "Tim 2";
        }
        if (jumlahGolTim3 < golTerendah) {
            golTerendah = jumlahGolTim3;
            timGolTerendah = "Tim 3";
        }
        if (jumlahGolTim4 < golTerendah) {
            golTerendah = jumlahGolTim4;
            timGolTerendah = "Tim 4";
        }

        System.out.println("\n-------------------------------------");
        System.out.println("Hasil Analisis Gol:");
        System.out.println("Tim dengan gol terbanyak adalah " + timGolTertinggi + " dengan " + golTertinggi + " gol.");
        System.out.println("Tim dengan gol tersedikit adalah " + timGolTerendah + " dengan " + golTerendah + " gol.");
    }
}