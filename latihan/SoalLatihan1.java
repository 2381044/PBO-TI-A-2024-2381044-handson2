package latihan;

import java.util.Scanner;

public class SoalLatihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan angka pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int bil3 = input.nextInt();

        int terbesar;

        if (bil1 >= bil2 && bil1 >= bil3) {
            terbesar = bil1;
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }
        System.out.println("Angka terbesar adalah : " + terbesar);

    }
}
