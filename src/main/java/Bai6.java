

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai6 {
    private static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
    System.out.println("nhap vao so nguyen duong n: ");     
    int x=input.nextInt();
    
    System.out.println(" cac so nguyen to nhon hon \n:"+x);
    if(x>=2)
           System.out.print(2);
    for (int i = 3; i < x; i+=2) {
            if(isPrimeNumber(i)){
                System.out.print(" " + i);
            }
        }
    
    }

    private static boolean isPrimeNumber(int x) {
       if(x<2)
           return false;
       int squareRoot = (int) Math.sqrt(x);
       for(int i= 2; i<=squareRoot;i++){
           if(x%i==0)
               return false;
            }
       return true;
       }
       
    }
  

    
