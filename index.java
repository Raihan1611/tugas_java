import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      // Meminta inputan dari user
      System.out.print("Masukkan jarak tempuh (dalam km): ");
      double jarak = input.nextDouble();

      System.out.print("Masukkan konsumsi bensin (dalam km/liter): ");
      double konsumsi = input.nextDouble();

      System.out.print("Masukkan harga bensin per liter (dalam rupiah): ");
      double harga = input.nextDouble();

      // Menghitung waktu tempuh
      double waktu = jarak / konsumsi;

      // Menghitung konsumsi bensin
      double bensin = jarak / konsumsi;

      // Menghitung biaya bensin
      double biaya = bensin * harga;

      // Menampilkan hasil perhitungan
      System.out.println("Waktu tempuh: " + waktu + " jam");
      System.out.println("Konsumsi bensin: " + bensin + " liter");
      System.out.println("Biaya bensin: Rp " + biaya);
   }
}

