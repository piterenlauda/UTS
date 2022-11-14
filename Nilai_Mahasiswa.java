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
    private int NilaiAngka;
    private String Nama, NIM, NilaiHuruf, Pernyataan;
    
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
        
        if (n >= 80){
            String nh = "Anda mendapat nilai huruf A";
            System.out.print(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 80 & n >= 70){
            String nh = "Anda mendapat nilai huruf B";
            System.out.print(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 70 & n >= 60){
            String nh = "Anda mendapat nilai huruf C";
            System.out.print(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 60 & n >= 50){
            String nh = "Anda mendapat nilai huruf D";
            System.out.print(nh);
            this.NilaiHuruf = nh;
        }
        else if (n < 50 & n >= 0){
            String nh = "Anda mendapat nilai huruf E";
            System.out.print(nh);
            this.NilaiHuruf = nh;
        }
        else{
            String nh = "Input nilai anda salah, silakan ulangi program!";
            System.out.print(nh);
            this.NilaiHuruf = nh;
        }
    }
    
    public void SetPernyataan(String pt){
        
        if (pt == "A"){
            int aw;
            String p;
            for(aw=0;aw<5;aw++){
                p = "Selamat anda lulus!";
                this.Pernyataan = p;
            }
        }
        else if (pt == "B"){
            int aw;
            String p;
            for(aw=0;aw<4;aw++){
                p = "Selamat anda lulus!";
                this.Pernyataan = p;
            }
        }
        else if (pt == "C"){
            int aw;
            String p;
            for(aw=0;aw<3;aw++){
                p = "Selamat anda lulus!";
                this.Pernyataan = p;
            }
        }
        else if (pt == "D"){
            int aw;
            String p;
            for(aw=0;aw<2;aw++){
                p = "Selamat anda lulus!";
                this.Pernyataan = p;
            }
        }
        else{
            System.out.print("Mohon maaf, silakan ulangi program!");
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