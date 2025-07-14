import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Profit atau Rugi");

        System.out.print("Masukkan total pemasukan bulan kemarin: ");
        double bulanKemarin = input.nextDouble();

        System.out.print("Masukkan total pemasukan bulan ini: ");
        double bulanIni = input.nextDouble();

        if (bulanIni > bulanKemarin) {
            System.out.println("Anda mendapatkan profit sebesar: " + (bulanIni - bulanKemarin));
        } else if (bulanIni < bulanKemarin) {
            System.out.println("Anda mengalami kerugian sebesar: " + (bulanKemarin - bulanIni));
        } else {
            System.out.println("Tidak ada perubahan, pemasukan tetap sama.");
        }
    }
}
