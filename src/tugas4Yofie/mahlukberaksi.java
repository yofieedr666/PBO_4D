
package tugas4Yofie;

public class mahlukberaksi {
    public static void main(String[] args) {
        mahluk mahluk1 = new mahluk();
        
        mahluk1.setnama("human");
        mahluk1.setmakanan("nasi");
        mahluk1.setjumlahKaki(2);
        
        System.out.println("nama        :"+mahluk1.getnama());
        System.out.println("makan       :"+mahluk1.getmakanan());
        System.out.println("jumlah kaki :"+mahluk1.getjumlahKaki());
    }
}