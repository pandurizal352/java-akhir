/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasjava; //2103015025 pandu fahrizal
// Definisikan interface Animal
interface Animal {
    void color(); // untuk Method abstrak color()
}
// Implementasikan interface Animal dengan class Cat
class Cat implements Animal {
    public void color() {
        System.out.println("The cat is yellow");//untuk mencentak 
    }
}
public class Uasjava {
    public static void main(String[] args) {
        // untuk Membuat objek dari class Cat
        Cat cat = new Cat();
        // untuk Memanggil method color() dari objek cat
        cat.color();
    }    
}
