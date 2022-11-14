/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_oop_sk_b_21102058_peterenlargalauda;
import java.util.Scanner;
/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class UTS_OOP_SK_B_21102058_PeterEnlargaLauda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        Nilai_Mahasiswa NM = new Nilai_Mahasiswa();
        
        //set Identitas Mahasiswa
        System.out.print("Masukan Nama Mahasiswa: ");
        NM.SetNama(dtain.nextLine());
        System.out.print("Masukan NIM Mahasiswa: ");
        NM.SetNIM(dtain.nextLine());
        
        //get Identitas Mahasiswa
        System.out.println(NM.GetNama());
        System.out.println(NM.GetNIM());
        
        //set Nilai Angka Mahasiswa
        NM.SetNilaiAngka(0,1,0);
        
        //get Nilai Angka Mahasiswa
        System.out.println("Nilai Angka: "+ NM.GetNilaiAngka());
        
        //set Nilai Angka Mahasiswa
        NM.SetNilaiAngka(0,1,0);
        
        //get Nilai Angka Mahasiswa
        System.out.println("Nilai Angka: "+ NM.GetNilaiAngka());
        
     
    }
    
}
