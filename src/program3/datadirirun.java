package program3;

public class datadirirun {
    public static void main(String[] args) {
        datadiri datadiri1 = new datadiri("Yofie","20","Mahasiswa");
        datadiri datadiri2 = new datadiri("Yofie","20","Barista");
        
        //output contructor
        System.out.println(datadiri1.nama);
        System.out.println(datadiri1.umur);
        System.out.println(datadiri1.pekerjaan);
        System.out.println("===================");
       //output mutator
       datadiri2.show();
       System.out.println("===================");
       //output accecor
       System.out.println(datadiri1.getnama());
       System.out.println(datadiri1.getumur());
       System.out.println(datadiri1.getpekerjaan());
       
       
    }
}
