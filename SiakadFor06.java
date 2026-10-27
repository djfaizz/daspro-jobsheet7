import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            }
        


            System.out.println("Nilai tertinggi saat ini: " + tertinggi);
            System.out.println("Nilai terendah saat ini: " + terendah);

    }
}

        
            