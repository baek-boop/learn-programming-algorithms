import java.util.Scanner;

public class cekTak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Tak");

        System.out.print("Masukkan IP tak anda: ");
        double ip = input.nextDouble();

        if (ip < 2.0){
            System.out.println("Poor");
        } else if (ip >= 2.0 && ip <= 2.75){
            System.out.println("Fair");
        } else if (ip >= 2.76 && ip <= 3.0){
            System.out.println("Satisfactory");
        } else if (ip >= 3.01 && ip <= 3.5){
            System.out.println("Good");
        } else if (ip >= 3.51 && ip <= 4.0){
            System.out.println("Excellent");
        } else {
            System.out.println("Invalid IP");
        }
    }
}
