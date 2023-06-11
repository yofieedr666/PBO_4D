
package tugas4Yofie;

public class hewanberaksi {
    public static void main(String[] args) {
        //Dalam blok `main()`, dua objek "hewan" dibuat menggunakan konstruktor. Objek `hewan1` dibuat tanpa parameter, 
        //sehingga konstruktor tanpa parameter dijalankan dan pesan "tanpa parameter" dicetak ke konsol. Objek `hewan2` 
        //dibuat dengan memberikan argumen "macan", "daging", dan 4 ke dalam konstruktor, sehingga konstruktor dengan 
        //parameter dijalankan dan pesan "dengan parameter" dicetak ke konsol.
        hewan hewan1 = new hewan();
        hewan hewan2 = new hewan("macan","daging",4);
        

        //Metode-metode mutator (`setnama()`, `setmakanan()`, `setjumlahKaki()`) 
        //digunakan untuk mengatur nilai variabel instans hewan1 dengan nilai yang diberikan.
        hewan1.setnama("badak");
        hewan1.setmakanan("rumput");
        hewan1.setjumlahKaki(4);
        //Metode-metode accessor (`getnama()`, `getmakanan()`, `getjumlahKaki()`) digunakan untuk mengambil
        //nilai variabel instans hewan2 dan mencetaknya ke konsol.
        System.out.println("nama        :"+hewan2.getnama());
        System.out.println("makan       :"+hewan2.getmakanan());
        System.out.println("jumlah kaki :"+hewan2.getjumlahKaki());
        
    }
}


