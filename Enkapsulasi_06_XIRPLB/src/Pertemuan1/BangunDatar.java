/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

import java.util.Scanner;

/**
 *
 * @author ANANG SETIAJI
 */
public class BangunDatar {
    private int panjang,lebar,luas;
    
    void persegipanjang(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Panjang          : ");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar            : ");
        lebar = input.nextInt();
        
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang Adalah  : "+luas);
    }
}
