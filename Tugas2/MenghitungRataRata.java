package Tugas2;

/**
 * Kelas RataRata digunakan untuk menghitung rata-rata dari sejumlah angka.
 */
public class MenghitungRataRata {

    /**
     * Metode ini menghitung rata-rata dari sejumlah angka.
     *
     * @param angka Array dari angka yang akan dihitung rata-ratanya.
     * @return Rata-rata dari angka-angka yang diberikan.
     */
    public static double hitungRataRata(double[] angka) {
        if (angka.length == 0) {
            throw new IllegalArgumentException("Tidak ada angka yang dapat dihitung rata-ratanya.");
        }
        
        double total = 0;
        for (double nilai : angka) {
            total += nilai;
        }

        return total / angka.length;
    }

    /**
     * Metode utama untuk menjalankan program dan menguji perhitungan rata-rata.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        double[] angka = { 10.5, 20.0, 30.5, 40.0, 50.5 };
        double rataRata = hitungRataRata(angka);
        System.out.println("Rata-rata: " + rataRata);
    }
}

