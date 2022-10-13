/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Anang Setiaji
 */
public class Siswa {
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String iKzuu){
        this.nama = iKzuu;
    }
    
    public int getnilai(){
        return this.nilai;
    }
    
    public void setnilai(int nilai){
        this.nilai = 98;
    }
    
    public String getkelas(){
        return this.kelas;
    }
    
    public void setkelas(String XIRPLB){
        this.kelas = XIRPLB;
    }
    
    public void getAll(){
        System.out.println("Nama    : "+nama);
        System.out.println("Nilai   : "+nilai);
        System.out.println("Kelas   : "+kelas);
    }
}
