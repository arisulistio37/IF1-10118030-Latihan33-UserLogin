/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : program ini berisi tentang user login
 */
public class IF110118030Latihan33UserLogin {
    private static String userName;
    private static String passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User login = new User();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Username Anda = ");
        userName = scanner.next();
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        login.pengecekanLogin(userName, passWord);
    }
    
}
