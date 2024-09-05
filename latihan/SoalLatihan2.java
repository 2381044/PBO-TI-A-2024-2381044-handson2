package latihan;

import java.util.Scanner;

public class SoalLatihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int bil1 = input.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int bil2 = input.nextInt();

        int terbesar;

        if(bil1 > bil2) {
            terbesar = bil1;
        } else {
            terbesar = bil2;
        }
        System.out.println("Angka terbesar adalah: " + terbesar);
    }
}
