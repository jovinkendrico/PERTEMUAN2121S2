package bangunruang;
public class Lingkaran {

    //Atribut
    public final float PI = 22.0f/17;
    public int r = 10;
    public float luas = 0;
        //Luas Lingkaran => a = pi*r2

    //Method hitung luas lingkaran
    public void hitungLuasLingkaran(){
        luas = PI*r*r;
    }

    //Menampilkan Luas Lingkaran
    public void tampilkanLuasLingkaran(){
        hitungLuasLingkaran();
        System.out.println("Luas Lingkaran = (jari = " + r + "cm) = " + luas +" cm");
    }
    
}
