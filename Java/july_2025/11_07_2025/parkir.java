import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Waktu Parkir Kendaraan");

        System.out.print("Masukkan waktu masuk (jam): ");
        int waktuMasukJam = input.nextInt();
        System.out.print("Masukkan waktu masuk (menit): ");
        int waktuMasukMenit = input.nextInt();

        System.out.print("Masukkan waktu keluar (jam) : ");
        int waktuKeluarJam = input.nextInt();
        System.out.print("Masukkan waktu keluar (menit) : ");
        int waktuKeluarMenit = input.nextInt();

        // Menghitung total menit masuk
        int hasilMasukJam = (waktuMasukJam * 60) + waktuMasukMenit;
        int hasilKeluarJam = (waktuKeluarJam * 60) + waktuKeluarMenit;
        int hasil;

        if (waktuMasukJam < waktuMasukMenit) {
            hasil = ( 720 + hasilKeluarJam) - hasilMasukJam;
            System.out.printf("Total waktu parkir adalah %d jam %d menit\n", hasil / 60, hasil % 60);
        } else {
             hasil = hasilKeluarJam - hasilMasukJam;
            System.out.printf("Total waktu parkir adalah %d jam %d menit\n", hasil / 60, hasil % 60);
        }




    }
}
