package latihan;

import java.util.Scanner;.java.util.Scanner;

public class SoalLatihan1 {
    public static void main(String[] args) {
        int[] bilangan = new int [3];
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = Scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = Scanner.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = Scanner.nextInt();


        if (bil1 > bil2) {
            System.out.println("Bilangan yang lebih besar adalah: " + bil1);
        } else if (bil2 > bil1) {
            System.out.println("Bilangan yang lebih besar adalah: " + bil2);
        } else {
            System.out.println("Kedua bilangan sama besar.");
            System.exit(0);
        }




    }
}
