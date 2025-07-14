import java.util.Scanner;

public class diskonAkhirTahun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Diskon Akhir Tahun");

        System.out.println("Masukkan total belanja Anda: ");
        int totalBelanja = input.nextInt();

        System.out.println("Apakah bersedia dibuatkan kartu member? (true/flase): ");
        boolean member = input.nextBoolean();

        double hasil;

        if (totalBelanja >= 100000 && !member) {
            hasil = totalBelanja - (totalBelanja * 0.10);
            System.out.printf("Total belanja Anda setelah diskon 10%% adalah: Rp. %.2f\n", hasil);
        } else if (totalBelanja >= 200000) {
            hasil = totalBelanja - 75000 - (totalBelanja * 0.10);
            System.out.println("Selamat! Anda mendapatkan diskon Rp. 75.000 karena menjadi member, silakan bayar: Rp. " + hasil);
        } else {
            System.out.println("Maaf, Anda tidak mendapatkan diskon, silakan bayar: Rp. " + totalBelanja);
        }
    }
}
