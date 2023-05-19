/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg211000521;
import salary.*;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbsensiUser User = new AbsensiUser();
        AbsensiDetail_Pb DetailPb = new AbsensiDetail_Pb();
        AbsensiBulan Bulan = new AbsensiBulan();
        AbsensiTanggal Tanggal = new AbsensiTanggal();
        AbsenHari Hari = new AbsenHari();
        AbsenData Data = new AbsenData();
        AbsenCatetan Catetan = new AbsenCatetan();
        AbsensiDetail_User DetailUser = new AbsensiDetail_User();  
        
        //SET
        User.setidUser (1);
        User.setlevelUser("VIP");
        User.setemailUser("anandarisna777@gmail.com");
        User.setpwdUser ("nandacantik");
      
        
        //Get
        System.out.println("Id User     : " +  User.getidUser());
        System.out.println("Level User  : " + User.getlevelUser());
        System.out.println("Email User  : " + User.getemailUser());
        System.out.println("Password : " + User.getpwdUser());
       
    }
    
}
