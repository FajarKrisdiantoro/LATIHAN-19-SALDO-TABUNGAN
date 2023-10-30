/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
NAMA : FAJAR KRISDIANTORO
NIM  : 22205004
PRODI: TI REG SORE
*/
package SaldoTabungan19;

/**
 *
 * @author LENOVO
 */
import java.text.NumberFormat;
import java.util.Locale;
public class PBOSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double saldoAwal = 2500000; // Saldo awal dalam Rupiah
        double bungaBulanan = 15; // Suku bunga bulanan dalam persen
        int lamaBulan = 6; // Jumlah bulan

        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("Saldo awal: " + rupiahFormat.format(saldoAwal));

        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = saldoAwal * (bungaBulanan / 100);
            saldoAwal += bunga;
            System.out.println("Saldo bulan " + bulan + ": " + rupiahFormat.format(saldoAwal));
        }
    }
}