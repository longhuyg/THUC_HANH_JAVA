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
public class bai5 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("nhap vao so nguyen duong x: ");
    int x=input.nextInt();
    System.out.println("nhap vao so nguyen duong y: ");
    int y=input.nextInt();
    System.out.println("nhap vao uoc chuong lon nhat cua" +x+ "va" +y+ "la:" +UCLN(x,y));
   System.out.println("nhap vao Boi chung nho nhat cua" +x+ "va" +y+ "la:" +BSCNN(x,y));
    } 
    public static int  UCLN(int x, int y){
        if(y==0)
            return x;
     
        return UCLN(y,x%y);
    }
    public static int BSCNN(int x, int y){
        return (x*y)/UCLN(x, y);
       
    }
}
          
          
          
  
    
    
