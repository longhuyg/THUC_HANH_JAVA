/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**1
 *
 * @author Administrator
 */
public class bai3 {
    
    
    
    
     public static void main(String[] args) {
           Scanner x= new Scanner(System.in);
          System.out.print("Nhap ma sinh vien: ");
          String masv=x.nextLine();
          
          
          System.out.print("Nhap ma ho ten : ");
          String hoten=x.nextLine();
          
          System.out.print("Nhap tuoi :");
          byte tuoi=x.nextByte();
          
          System.out.print("Nhap nam sinh : :");
          int  namsinh=x.nextInt();
          
          System.out.print("Nhap Diem trung binh : :");
          float DTB=x.nextFloat();
     }
}
