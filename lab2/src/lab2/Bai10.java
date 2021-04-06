/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class Bai10 {
    public static void main(String[] args) throws Exception
    {
        String fileName="";
        File f = new File("");
        fileName = f.getAbsolutePath()+"\\src\\data.txt";
        f = new File(fileName);
        if(f.exists())
        {
            System.out.println("File da ton tai");
            System.exit(0);
        }
        //ghi du lieu vao file
        PrintWriter pw = new PrintWriter(f);
        pw.print("Coppyright by Duong Thanh Phet - ");
        pw.println(2021);
        pw.print("https://thayphet.net");
        pw.close();
        System.out.println("Da ghi file xong");
        //doc file
        Scanner inp = new Scanner(f);
        while(inp.hasNext())
        {
            String ten = inp.nextLine();
            System.out.print(ten+"");
            String maso = inp.nextLine();
            System.out.println(maso);
        }
    }
}
