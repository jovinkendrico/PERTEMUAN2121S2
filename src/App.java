import bangunruang.Lingkaran;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di matakuliah \"Pemrograman Berorientasi Objek\"";
        Integer tahun = 2022;
        int tahun2 = 2022;
        String penutup = "Sampai Jumpa";
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        //Scanner Inputan Keyboard
        Scanner keyboard = new Scanner(System.in);
        int s = 0;
        System.out.print("Masukkan Panjang Sisi Kubus = ");
        s = keyboard.nextInt();
        hitungLuasKubus(s);

        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan Panjang Jari-Jari Lingkaran = ");
        lingkaran.r = keyboard.nextInt();
        lingkaran.tampilkanLuasLingkaran();
    }
     
    //hitung volume kubus => V = s3
    public static void hitungLuasKubus(int s){
        Double v = 0.0;
        v = Math.pow(s, 3);
        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang Sisi = " + s + " cm");
        System.out.println("Volume Kubus = s*s*s = " + v + " cm3");

    }
}
