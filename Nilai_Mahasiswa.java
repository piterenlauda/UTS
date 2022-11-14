/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop_sk_b_21102058_peterenlargalauda;
import java.util.Scanner;
/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class Nilai_Mahasiswa {
    Scanner dtain = new Scanner(System.in);
    
    //properties
    private int NilaiAngka;
    private String Nama, NIM, NilaiHuruf, Pernyataan;
    
    //methods
    public void SetNama(String nama){
        this.Nama = nama;
    }
    
    public void SetNIM(String nim){
        this.NIM = nim;
    }
    
    public void SetNilaiAngka(int na, int i, int t){
        i = 1;
        t = 0;
        System.out.print("Berapa banyak nilai yang ingin dimasukan?: ");
        String bn = dtain.nextLine();
        while (i <= Integer.parseInt(bn)){
            System.out.print("Masukan nilai ke-"+i+": ");
            String n = dtain.nextLine();
            i++;
            t = t + Integer.parseInt(n);
        }
        this.NilaiAngka = t/Integer.parseInt(bn);
        na = t/Integer.parseInt(bn);
        System.out.println("Total nilai setelah direrata: "+na);
    }
    
    public void SetNilaiHuruf(int n){
        
        if (n <= 100 & n >= 80){
            String nh = "A";
            System.out.println(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 80 & n >= 70){
            String nh = "B";
            System.out.println(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 70 & n >= 60){
            String nh = "C";
            System.out.println(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 60 & n >= 50){
            String nh = "D";
            System.out.println(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 50 & n >= 0){
            String nh = "E";
            System.out.println(nh);
            this.NilaiHuruf = nh;
        }
        else{
            String nh = "Input nilai anda salah, silakan ulangi program!";
            System.out.println(nh);
            this.NilaiHuruf = nh;
        }
    }
    
    public void SetPernyataan(String pt){
        
        if (pt == "A" || pt == "B" || pt == "C"){
            int aw;
            String p = "Selamat anda lulus!";
            for(aw=0;aw<5;aw++){
                System.out.println(p);   
            }
            this.Pernyataan = p;
        }
        else if (pt == "D" || pt == "E"){
            int aw;
            String p = "Maaf anda tidak lulus!";
            for(aw=0;aw<5;aw++){
                System.out.println(p);   
            }
            this.Pernyataan = p;
        }
        else{
            System.out.println("Mohon maaf, silakan ulangi program!");
        }
    }
    
    public String GetNama(){
        return this.Nama;
        
    }
    public String GetNIM(){
        return this.NIM;
    }
    
    public int GetNilaiAngka (){
        return this.NilaiAngka;
    }
    
    public String GetNilaiHuruf (){
        return this.NilaiHuruf;
    }
    
    public String GetPernyataan (){
        return this.Pernyataan;
    }
}