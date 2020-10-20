/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan16.penugasan;

/**
 *
 * @author 
 * NAMA     : Muhammad Farhan R
 * KELAS    : IF1
 * NIM      : 10119023
 * Deskripsi Program : latihan melakukan penugasan
 */
public class IF110119023Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c + "\n");
        
        c = a + b;
        System.out.println("C = a + b = " + c);
        
        c += a; // c = c + a
        System.out.println("c += a = " + c);
        
        c -= a; // c = c - a
        System.out.println("c -= a = " + c);
        
        c *= a; // c = c * a
        System.out.println("c *= a = " + c);
        
        // reset nilai a dan c
        a = 10;  
        c = 15;
        c /= a; //hasil bagi
        System.out.println("c /= a = " + c);
        
        // reset nilai a dan c
        a = 10;
        c = 15;       
        c %= a; //sisa bagi
        System.out.println("c %= a = " + c + "\n");
        
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        
        c >>= a;
        System.out.println("c >>= a = " + c);
        
        c &= 2;
        System.out.println("a &= 2 = " + c);
        
        c ^= a;
        System.out.println("c ^= a = " + c);
        
        c |= a;
        System.out.println("c |= a = " + c);
    }
    
}
