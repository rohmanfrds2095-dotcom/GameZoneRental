/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamezonerental;
import java.util.Scanner;
public class GameZoneRental {
    
    static int hitungBiayaSewa(int pilihanKonsol, int durasi){
        if(pilihanKonsol == 1){
            return 8000 * durasi;
        }else{
            return 12000 * durasi;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangTransaksi = true;

        while(ulangTransaksi){
            System.out.println("===== GAMEZONE RENTAL PS =====");
            System.out.print("Nama Pelanggan : ");
            String nama = input.nextLine();

            System.out.println("1. PlayStation 4 - Rp8000/jam");
            System.out.println("2. PlayStation 5 - Rp12000/jam");
            System.out.print("Pilihan konsol : ");
            int pilihKonsol = input.nextInt();

            System.out.print("Lama Bermain (jam) : ");
            int lamaJam = input.nextInt();

            int biayaSewa = hitungBiayaSewa(pilihKonsol, lamaJam);
            int diskon = 0;
            if(lamaJam >= 3){
                diskon = (int)(0.1 * biayaSewa);
            }

            System.out.print("Tambah Minuman (Y/T): ");
            char pilihMinum = input.next().charAt(0);
            int biayaMinuman = 0;
            if(pilihMinum == 'Y' || pilihMinum == 'y'){
                biayaMinuman = 5000;
            }

            int totalBayar = biayaSewa - diskon + biayaMinuman;
            String namaKonsol = pilihKonsol == 1 ? "PlayStation 4" : "PlayStation 5";

            // Cetak struk transaksi
            System.out.println("\n======== STRUK GAMEZONE ========");
            System.out.println("Pelanggan : " + nama);
            System.out.println("Konsol    : " + namaKonsol);
            System.out.println("Durasi    : " + lamaJam + " jam");
            System.out.println("Biaya Sewa: Rp" + biayaSewa);
            System.out.println("Diskon    : Rp" + diskon);
            System.out.println("Minuman   : Rp" + biayaMinuman);
            System.out.println("TOTAL BAYAR : Rp" + totalBayar);

            System.out.print("\nTransaksi Baru (Y/T): ");
            char pilihUlang = input.next().charAt(0);
            if(pilihUlang == 'T' || pilihUlang == 't'){
                ulangTransaksi = false;
                System.out.println("Terima kasih!");
            }
            input.nextLine();
        }
    }
}


