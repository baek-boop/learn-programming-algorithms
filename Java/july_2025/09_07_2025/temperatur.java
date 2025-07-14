import java.util.Scanner;

public class temperatur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Cek Kondisi Temperatur");

        System.out.println("Masukkan suhu dalam Celcius 1: ");
        double suhu1 = input.nextDouble();

        System.out.println("Masukkan suhu dalam Celcius 2: ");
        double suhu2 = input.nextDouble();

        System.out.println("Masukkan suhu dalam Celcius 3: ");
        double suhu3 = input.nextDouble();

        System.out.println("Masukkan suhu dalam Celcius 4: ");
        double suhu4 = input.nextDouble();

        System.out.println("Masukkan suhu dalam Celcius 5: ");
        double suhu5 = input.nextDouble();

        if (suhu1 >= suhu2 && suhu3 >= suhu4 && suhu5 >= suhu1) {
            System.out.println("Suhu stabil naik");
        } else if (suhu1 <= suhu2 && suhu3 <= suhu4 && suhu5 <= suhu1) {
            System.out.println("Suhu stabil turun");
        } else {
            System.out.println("Suhu tidak stabil");
        }
    }
}
