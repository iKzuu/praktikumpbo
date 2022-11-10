/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;
import java.util.Scanner;

/**
 *
 * @author Anang Setiaji
 */
public class pangkat {
    private int angka;
    
    public int getAngka(){
        return angka;
    }
    
    public void setangka(int angka){
        this.angka=angka;
    }
    
    void akarpangkat2(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        angka = angka*angka;
        
        System.out.println("Hasil dari akar pangkat 2 adalah : " + angka);
    }
}
