import java.util.Scanner;

public class tamasya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Tamasya");

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        int jumlahMobil= 0;

        // validasi input
        if (jumlahMahasiswa < 0) {
            System.out.println("Jumlah mahasiswa tidak boleh negatif");
        } else {
            jumlahMobil = jumlahMahasiswa / 7;

            if (jumlahMahasiswa % 7 != 0 ) {
                jumlahMobil++;
            }
        }

        System.out.println("Mobil yang di butuhkan untuk ke bandara adalah : " + jumlahMobil);

    }
}
