import java.util.Scanner;

public class makananOnline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Makanan Online");

        System.out.print("Masukkan harga makanan: ");
        int hargaMakanan = input.nextInt();

        System.out.print("Masukkan jarak (dalam km): ");
        int jarak = input.nextInt();

        // Validasi input jarak
        if (jarak < 0) {
            System.out.println("Jarak tidak boleh kurang dari 0.");
        } else {
            int ongkir;
            if (jarak <= 3) {
                ongkir =  jarak * 8000;
            } else if (jarak <= 8) {
                ongkir = jarak  * 12000;
            } else {
                ongkir = (jarak * 15000) / 2;
            }

            int totalBiaya = hargaMakanan + ongkir;

            System.out.println("Total biaya makanan online: " + totalBiaya);
        }

    }
}
