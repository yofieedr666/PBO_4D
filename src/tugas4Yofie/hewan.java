
package tugas4Yofie;
//   Deklarasi kelas dimulai dengan kata kunci "public" yang menunjukkan bahwa kelas ini dapat diakses dari kelas lain. 
//   Nama kelas adalah "hewan" dan diawali dengan huruf kecil.
public class hewan {
    //Variabel-variabel instans "nama", "makanan", dan "jumlahKaki" dideklarasikan 
    //sebagai variabel privat dan terproteksi. Variabel privat (private) 
    //hanya dapat diakses secara langsung oleh kelas itu sendiri, sementara variabel 
    //terproteksi (protected) dapat diakses oleh kelas yang sama, kelas turunan (subclass), atau kelas dalam paket yang sama.
    private String nama,makanan;
    protected int jumlahKaki;

    //konruktor
    //dengan parameter
    //Konstruktor ini tidak menerima parameter dan mencetak pesan "tanpa parameter" ke konsol.
   //Konstruktor adalah metode khusus yang digunakan untuk membuat objek dari kelas. 
    //Dalam kasus ini, terdapat konstruktor dengan tiga parameter "nama", "makanan", dan "jumlahKaki".
    //Ketika objek "hewan" dibuat menggunakan konstruktor ini, nilai-nilai tersebut dapat 
   //disetel sesuai dengan argumen yang diberikan. Dalam konstruktor ini, kita juga mencetak pesan "dengan parameter" ke konsol
    public hewan(String nama, String makanan, int jumlahKaki) {
        System.out.println("dengan parameter");
        this.nama = nama;
        this.makanan = makanan;
        this.jumlahKaki = jumlahKaki;
    }

    //tanpa parameter
    public hewan(){
        System.out.println("tanpa parameter");
    }
    //mutator
    //Metode mutator ("setter") digunakan untuk mengatur nilai variabel instans. 
    //Dalam contoh ini, metode "setnama" digunakan untuk mengubah nilai variabel "nama" 
    //dengan nilai yang diberikan sebagai argumen.

    public void setnama(String nama) {
        this.nama = nama;
    }
   //Metode accessor ("getter") digunakan untuk 
   //mengakses nilai variabel instans. Dalam contoh ini, metode "getnama" digunakan untuk 
    //mengembalikan nilai variabel "nama".
    public void setmakanan(String makanan) {
        this.makanan = makanan;
    }

    public void setjumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    
    //accessor

    public String getnama() {
        return nama;
    }

    public String getmakanan() {
        return makanan;
    }

    public int getjumlahKaki() {
        System.out.println("superclass");
        return jumlahKaki;
    }
    // Metode ini mengembalikan nilai variabel "jumlahKaki" dan mencetak
    // pesan "superclass" ke konsol. Metode ini menggunakan kata kunci "protected" 
    // untuk memperbolehkan akses oleh kelas turunan (subclass).
    
}    


