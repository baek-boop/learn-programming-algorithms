import java.util.Scanner;
public class konversiNilaiHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Nilai Huruf Mutu");

        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        // Validasi input nilai
        if (nilai < 0) {
            System.out.println("Nilai tidak boleh kurang dari 0.");
        } else if (nilai > 100) {
            System.out.println("Nilai tidak boleh lebih dari 100.");
        } else {
            String hurufMutu;
            if (nilai >= 90) {
                hurufMutu = "A";
            } else if (nilai >= 80) {
                hurufMutu = "B";
            } else if (nilai >= 70) {
                hurufMutu = "C";
            } else if (nilai >= 60) {
                hurufMutu = "D";
            } else {
                hurufMutu = "E";
            }
            System.out.println("Huruf Mutu Nilai: " + hurufMutu);
        }


    }
}
