public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di matakuliah Pemrograman Berorientasi Objek";
        int tahun = 2022;
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        hitungLuasKubus();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r=15;
        lingkaran.tampilkanLuasLingkaran();
    }
     
    //hitung volume kubus => V = s3
    public static void hitungLuasKubus(){
        int v = 0;
        int s = 10;
        v = s*s*s;
        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang Sisi = " + s + " cm");
        System.out.println("Volume Kubus = s*s*s = " + v + " cm3");

    }
}
