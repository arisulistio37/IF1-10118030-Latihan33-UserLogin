/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan33.userlogin;

/**
 *
 * @author Ari Sulistio
 */
public class User {
    private String username, password;
    private boolean status;
    
    private boolean cekAkun(String parUserName, String parPassword){
        username ="AriSulistio";
        password = "terbaikselalu";
        
        status = parUserName.equals(username)&&parPassword.equals(password);
        return status;
    }
    private void hasilLogin(boolean status, String parUserName){
    if (status == true){
        System.out.println("*******HALLO "+parUserName.toUpperCase()+"********");
        System.out.println("Selamat Datang di Aplikasi ini");
    }
    else{
        System.out.println("Ooops, Username atau Password anda salah");
    }    
   }
    public void pengecekanLogin (String parUserName, String parPassword){
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(status, parUserName);
    }
}
