/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    
    public void catCanh(){
        System.out.println("Cat canh");
    }
    
    public void haCanh(){
        System.out.println("Ha canh");
    }

    @Override
    double layVanToc() {
        return 0;
    }
}
