# README: Program Kalkulator Sederhana

## Deskripsi Singkat
Program ini adalah kalkulator sederhana yang memungkinkan pengguna untuk melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian antara dua angka. Program ini meminta pengguna untuk memasukkan dua angka dan operasi yang diinginkan, lalu menghasilkan hasil operasi tersebut. Program ini ditulis dalam bahasa pemrograman Java.

## Cara Menjalankan Program
1. Pastikan Anda memiliki Java Development Kit (JDK) terinstal di komputer Anda.
2. Salin kode program di bawah ini ke dalam berkas teks dengan ekstensi ".java". Anda dapat menggunakan teks editor atau Integrated Development Environment (IDE) seperti Eclipse atau IntelliJ IDEA.

```java
import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------Kalkulator Sederhana------");
        System.out.print("Masukkan angka pertama : ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua   : ");
        double b = input.nextDouble();

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
```

3. Buka terminal atau command prompt dan arahkan ke direktori di mana Anda menyimpan berkas program tersebut.
4. Kompilasi program dengan menjalankan perintah berikut:

```
javac KalkulatorSederhana.java
```

5. Jalankan program dengan perintah:

```
java KalkulatorSederhana
```

6. Ikuti petunjuk yang muncul di layar untuk memasukkan angka-angka dan memilih operasi yang diinginkan. Program akan menghasilkan hasil operasi tersebut.

## Informasi Tambahan
- Program ini hanya mendukung operasi sederhana (penjumlahan, pengurangan, perkalian, dan pembagian) antara dua angka.
- Program akan memberikan pesan kesalahan jika pengguna mencoba untuk membagi oleh nol atau memasukkan pilihan yang tidak valid.

Selamat menggunakan program Kalkulator Sederhana! Jika Anda memiliki pertanyaan atau masalah, jangan ragu untuk menghubungi kami.