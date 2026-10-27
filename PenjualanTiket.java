import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiketTerjual = 0;
        int jumlahPelanggan;
        double totalPenjualan = 0;
        double totalHarga;
        double diskon;

        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + i);

            do {
                System.out.print("Masukkan jumlah tiket: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid!");
                }
            } while (jumlahTiket < 0);

            totalHarga = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga: Rp" + totalHarga);
        }

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}