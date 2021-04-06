/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.*;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap he so  2, a = ");
        float ParameterA = scanner.nextFloat();
        System.out.print("Nhap he so 1, b = ");
        float ParameterB = scanner.nextFloat();
        System.out.print("Nhap he so do, c = ");
        float ParameterC= scanner.nextFloat();
        Bai1.giaiPTBac2(ParameterA, ParameterB, ParameterC);
    }
     

    public static void giaiPTBac2(float a, float b, float c) {
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        float d=a+b+c;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trình vô nghi?m!");
            } else {
                System.out.println("Phuong trình có m?t nghi?m: "
                        + "x = " + (-c / b));
            }
            return;
        }
        if(d==0){
            x1 = (-b / (2 * a));
            System.out.println("Phuong trình có nghiem kép: "+ "x1 = x2 = " + x1);
            return;
        }
        // tính delta
        
       
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trình có 2 nghiem là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trình có nghiem kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trình vô nghiệm!");
        }
    }
    
}
       
  
