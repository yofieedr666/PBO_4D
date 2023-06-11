/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedeapplication;

/**
 *
 * @author USER
 */
public class siswadata {
    public static void main (String []args){
        
        siswa siswadata = new siswa();
        siswa siswadata2 = new siswa();
        
        siswadata.nama = "Yofie Elyandra Dwirizky";
        siswadata.umur = 20;
        siswadata.jurusan = "Teknik Informatika";
        siswadata.semester = 4;
        
        
        System.out.println("NAMA : "+ siswadata.nama);
        System.out.println("UMUR : "+ siswadata.umur);
        System.out.println("JURUSAN : "+ siswadata.jurusan);
        System.out.println("SEMESTER : "+ siswadata.semester);

        
        siswadata2.nama = "Grisha Palevi";
        siswadata2.umur = 19;
        siswadata2.jurusan = "Teknik Informatika";
        siswadata2.semester = 4;
        
        System.out.println("NAMA : "+ siswadata2.nama);
        System.out.println("UMUR : "+ siswadata2.umur);
        System.out.println("JURUSAN : "+ siswadata2.jurusan);
        System.out.println("SEMESTER : "+ siswadata2.semester);
        
    }
}
