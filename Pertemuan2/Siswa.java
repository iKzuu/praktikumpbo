/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author Anang Setiaji
 */
public class Siswa {
    public String x;
    private String y,z;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
    
    public String getZ(){
        return z;
    }
    
    public void setZ(String Z) {
        this.z = Z;
    }
    
    public void cetak() {
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        System.out.println(" z = " + z);
    }
}
