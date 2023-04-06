/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MayBay mb = new MayBay();
        mb.batDau();
        mb.catCanh();
        mb.haCanh();
        mb.dungLai();
        
        XeOto oto = new XeOto();
        oto.layTenHangSanXuat();
        oto.batDau();
        oto.layVanToc();
        oto.dungLai();
        
        XeDap xd = new XeDap();
        xd.dungLai();
        xd.dungLai();
        xd.layVanToc();
    }
    
}
