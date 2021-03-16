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
public class bai4 {
    public static void main(String[] args) {
               
 
  Scanner input=new Scanner(System.in);
  System.out.println("nhapvao so thu nhat: ");
  int x=input.nextInt();
  System.out.println("nhapvao so thu hai: ");
  int y=input.nextInt();
  System.out.println("tong cua hai so vua nhap la: "+(x+y));
  System.out.println("hieu cua hai so vua nhap la: "+(x-y));
  System.out.println("tich cua hai so vua nhap la: "+(x*y));
  System.out.println("thuong cua hai so vua nhap la: "+(float)x/y);
    }
}
