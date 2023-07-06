/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasjava;

/**
 *
 * @author Devina Sawitri
 */
public class nomer3 {
public static void main(String[] args) throws Exception {
        try{
            int result = divideNumber(5, 0);
            System.out.println("Result:"+result);
        } catch (ArithmeticException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
public static int divideNumber(int dividend, int divisor){
    if (divisor ==0 ){
        throw new ArithmeticException("cannot divide the given number by zero");
    }
    return dividend/divisor;
}
}

