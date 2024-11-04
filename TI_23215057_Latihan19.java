/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * 
 * Nama  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk menghitung bunga perbulan dari tabungan dalam periode 6 bulan
 */
import java.text.DecimalFormat;

public class TI_23215057_Latihan19 {
    public static void main(String[] args) {
        double saldoAwal = 2500000; // Saldo awal
        double bunga = 15; // Bunga per bulan dalam persen
        int lama = 6; // Lama periode dalam bulan

        DecimalFormat df = new DecimalFormat("'Rp' #,##0");

        // Loop untuk menghitung saldo setiap bulan
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * (bunga / 100);
            System.out.println("Saldo di bulan ke-" + i + " = " + df.format(saldoAwal));
        }
    }
}
