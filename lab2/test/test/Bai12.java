/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Bai12 {
    
    public Bai12() {
    }
     public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        try(
            FileOutputStream os = new FileOutputStream("Intdata.txt")){
            //file duoc tao luu cung vi tri file chuong trinh
            Random rd = new Random();
            int n = 100;
            int[] a = new int[n];
            random(a,rd);
            for (int i=0;i<a.length;i++){
                String s = a[i]+" ";
                for(int j=0;j<s.length();j++)
                    os.write(s.charAt(j));
            }
        }
        try ( // mo 1 file abc.txt de doc vao chuong trinh (input)
                FileInputStream is = new FileInputStream("Intdata.txt")){
                int ibyts = is.available();
                byte ibuf[]=new byte[ibyts];
                int byrd = is.read(ibuf,0,ibyts);
                StringTokenizer strToken= new StringTokenizer(new String(ibuf)," ,\t,\r");
                System.out.println("Chuoi ky tu la: "+new String(ibuf));

        }
    }
    static void random(int a[], Random rd){
        for (int i=0;i<a.length;i++)
            a[i] = rd.nextInt();
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
