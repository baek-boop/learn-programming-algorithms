import java.util.Scanner;

public class avatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Transportasi avatar");

        int appaBesar = 3;
        int appaKecil = 5;

        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = input.nextInt();

        while (jumlahPenumpang > 0) {
            if (jumlahPenumpang >= 5 && appaBesar > 0) {
                jumlahPenumpang -= 5;
                appaBesar--;
                System.out.println("Menggunakan Appa Besar. Sisa penumpang: " + jumlahPenumpang);
            } else if (jumlahPenumpang >= 3 && appaKecil > 0) {
                jumlahPenumpang -= 3;
                appaKecil--;
                System.out.println("Menggunakan Appa Kecil. Sisa penumpang: " + jumlahPenumpang);
            } else {
                System.out.println("Tidak ada Appa yang dapat menampung sisa penumpang: " + jumlahPenumpang);
                break;
            }
        }

        System.out.println("Sisa Appa Besar: " + appaBesar);
        System.out.println("Sisa Appa Kecil: " + appaKecil);
    }
}
