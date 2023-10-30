package Tugas1;

import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------Kalkulator Sederhana------");
        System.out.print("Masukkan angka pertama : ");
        double a = input.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        double b = input.nextInt();

        System.out.println("----------Pilih Operasi---------");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian   (*)");
        System.out.println("4. Pembagian   (/)");
        System.out.print("Masukkan pilihan (1/2/3/4) : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                double jumlah = a + b;
                System.out.println("Hasil Penjumlahan : " + jumlah);
                break;
            case 2:
                double kurang = a - b;
                System.out.println("Hasil Pengurangan : " + kurang);
                break;
            case 3:
                double kali = a * b;
                System.out.println("Hasil Perkalian : " + kali);
                break;
            case 4:
                if (b != 0) {
                    double bagi = a / b;
                    System.out.println("Hasil Pembagian : " + bagi);
                } else {
                    System.out.println("Error: Tidak dapat melakukan pembagian oleh nol.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Pilihan tidak valid.");
                return;
        }

        input.close();
    }
}