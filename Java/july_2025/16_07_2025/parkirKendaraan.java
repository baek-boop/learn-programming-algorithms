import java.util.Scanner;

public class parkirKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Parkir Kendaraan");

        System.out.print("Masukkan jumlah waktu parkir (dalam jam): ");
        int jamParkir = input.nextInt();

        // Validasi input jam parkir
        if (jamParkir < 0) {
            System.out.println("Waktu parkir tidak boleh kurang dari 0.");
        } else {
            int biaya = 0;

            if (jamParkir <= 2) {
                biaya =  (jamParkir * 5000);
            } else if (jamParkir <= 8) {
                biaya = (jamParkir * 3000);
            } else {
                biaya = 20000;
            }

            System.out.println("Total biaya parkir adalah: Rp " + biaya);
        }

    }
}
