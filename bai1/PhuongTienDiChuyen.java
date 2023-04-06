/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public abstract class PhuongTienDiChuyen {
    private String loaiPhuongTien;
    HangSanXuat hangSanXuat;
    
    public String layTenHangSanXuat(){
        System.out.println("Ten hang san xuat");
        return null;
    }
    
    public void batDau(){
        System.out.println("Bat dau");
    }
    
    public void tangToc(){
        System.out.println("Tang toc");
    }
    
    public void dungLai(){
        System.out.println("Dung lai");
    }
    
    abstract double layVanToc(); 
}
