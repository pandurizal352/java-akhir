/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasjava;

/**
 *
 * @author Devina Sawitri
 */

//memngimport libary-libary yang di perlukan untuk membaca file
import java.io.FileReader;
import java.io.BufferedReader;

public class nomer2 {
     public static void main(String [] args){
         //Buat array karakter dengan ukuran 403:
        char[] array = new char[403];
        try{
            FileReader file = new FileReader("C:/Users/Devina Sawitri/Documents/NetBeansProjects/uasjava/src/uasjava/pandu.txt");
            //FileReader untuk membaca file "pandu.txt" di lokasi yang ditentukan
            BufferedReader input = new BufferedReader(file);
            //BufferedReader yang akan digunakan untuk membaca data dari file yang telah dibuka:
            input.read(array);
            // read pada objek input, dan simpan hasilnya ke dalam array array:
            System.out.println("Data in this file: ");
            //Tampilkan teks "Data in this file:" untuk memberikan konteks pada data yang akan ditampilkan:
            System.out.println(array);
            //menampilkan isi array menggunakan metode println dari objek System.out:
            input.close();
            //Tutup objek input untuk menghentikan pembacaan file
        }
        catch(Exception e){
            e.getStackTrace();
        }
        //Blok catch akan menangkap dan menampilkan pesan kesalahan jika terjadi pengecualian saat membaca atau menutup file
    } 
}