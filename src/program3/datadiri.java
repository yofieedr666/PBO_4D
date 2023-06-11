package program3;

public class datadiri {
 String nama, umur, pekerjaan; //variable data

 // method constuctor
 
 datadiri (String nama, String umur, String pekerjaan){
    this.nama = nama;
    this.umur = umur;
    this.pekerjaan = pekerjaan;
     
 }
 
 //method mutator
 void show (){
    System.out.println("Nama : "+this.nama);
    System.out.println("Umur : "+this.umur);
    System.out.println("Pekerjaan : "+this.pekerjaan);
 }

//method accecor
 String getnama(){
     return this.nama;
}
  String getumur(){
     return this.umur;
}
   String getpekerjaan(){
     return this.pekerjaan;
}
}


