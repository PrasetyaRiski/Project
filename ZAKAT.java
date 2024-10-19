package javaapplication4;

import java.util.Scanner;

public class ZAKAT {
   public ZAKAT() {
   }

   public static void main(String[] args) {

      String input;  
      System.out.println("Program Kalkulator Zakat Maal (By Prasetya Riski Wa'afan)");

       try (Scanner scanner = new Scanner(System.in)) {
           do {
               System.out.println("Pilih jenis harta yang ingin Anda hitung zakatnya:");
               System.out.println("1. Uang");
               System.out.println("2. Emas");
               System.out.println("3. Perak");
               System.out.print("Masukkan pilihan Anda (1/2/3): ");
               
               while (!scanner.hasNextInt()) {
                   System.out.println("Input tidak valid. Masukkan angka yang benar.");
                   scanner.next();
               }
               
               int pilihan = scanner.nextInt();
               scanner.nextLine();
               
               switch (pilihan) {
                   case 1 -> hitungZakatUang(scanner);
                   case 2 -> hitungZakatEmas(scanner);
                   case 3 -> hitungZakatPerak(scanner);
                   default -> System.out.println("Pilihan tidak valid.");
               }
               
               System.out.print("Apakah Anda ingin menghitung zakat lagi? (ya/tidak): ");
               input = scanner.nextLine();
               
           } while (input.equalsIgnoreCase("ya"));
           
           System.out.println("Terima kasih telah menggunakan Program Kalkulator Zakat Maal.");
       }
   }

   // Fungsi zakat uang
   private static void hitungZakatUang(Scanner scanner) {
      System.out.print("Masukkan jumlah uang yang Anda miliki: ");

      while (!scanner.hasNextDouble()) {
         System.out.println("Input tidak valid. Masukkan angka yang benar.");
         scanner.next(); 
      }

      double duit = scanner.nextDouble();
      scanner.nextLine();  

      // Nisab untuk uang
      if (duit >= 6859394) {
         double zakat = duit * 0.025;
         System.out.printf("Jumlah zakat yang harus Anda bayarkan adalah: %.2f\n", zakat);
      } else {
         System.out.println("Jumlah harta belum mencapai nisab. Anda tidak wajib membayar zakat.");
      }
   }

   // Fungsi  zakat emas
   private static void hitungZakatEmas(Scanner scanner) {
      System.out.print("Masukkan jumlah emas yang Anda miliki (dalam gram): ");

      while (!scanner.hasNextDouble()) {
         System.out.println("Input tidak valid. Masukkan angka yang benar.");
         scanner.next(); 
      }

      double emas = scanner.nextDouble();
      scanner.nextLine();  

      // Nisab untuk emas (85 gram)
      if (emas >= 85) {
         double zakat = emas * 0.025;
         System.out.printf("Jumlah zakat yang harus Anda bayarkan adalah: %.2f gram\n", zakat);
      } else {
         System.out.println("Jumlah harta belum mencapai nisab. Anda tidak wajib membayar zakat.");
      }
   }

   // Fungsi untuk menghitung zakat perak
   private static void hitungZakatPerak(Scanner scanner) {
      System.out.print("Masukkan jumlah perak yang Anda miliki (dalam gram): ");

      while (!scanner.hasNextDouble()) {
         System.out.println("Input tidak valid. Masukkan angka yang benar.");
         scanner.next(); 
      }

      double perak = scanner.nextDouble();
      scanner.nextLine();  

      // Nisab untuk perak (595 gram)
      if (perak >= 595) {
         double zakat = perak * 0.025;
         System.out.printf("Jumlah zakat yang harus Anda bayarkan adalah: %.2f gram\n", zakat);
      } else {
         System.out.println("Jumlah harta belum mencapai nisab. Anda tidak wajib membayar zakat.");
      }
   }
}