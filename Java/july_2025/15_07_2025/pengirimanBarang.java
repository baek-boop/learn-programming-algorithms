import java.util.Scanner;

public class pengirimanBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Pengiriman Barang Berdasarkan Berat");

        System.out.print("Masukkan jumlah berat barang (kg): ");
        double totalBerat = input.nextDouble();

        double biaya;

        if (totalBerat <= 1.0) {
            biaya = 10000;
        } else if (totalBerat <= 5.0) {
            biaya = 10000 + ((totalBerat - 1) * 5000);
        } else {
            biaya = 30000 + ((totalBerat - 5) * 4000);
        }

        System.out.println("Biaya pengiriman: Rp" + biaya);
    }
}
