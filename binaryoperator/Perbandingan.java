package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Sama dengan
        boolean hasilSamaDengan = (a == b);
        System.out.println("a == b " + hasilSamaDengan);

        // Tidak Sama dengan
        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a != b: " + hasilTidakSamaDengan);

        //Lebih besar dari
        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b: " + hasilLebihBesarDari);

        //Lebih Kecil dari
        boolean hasilLebihKecilDari = (a < b);
        System.out.println("a < b: " + hasilLebihKecilDari);

        //Lebih Besar atau sama dengan
        boolean hasilLebihBesarSamaDengan = (a>= b);
        System.out.println("a >= b: " + hasilLebihBesarSamaDengan);

        //Lebih Kecil atau sama dengan
        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b: " + hasilLebihKecilSamaDengan);

    }
}
