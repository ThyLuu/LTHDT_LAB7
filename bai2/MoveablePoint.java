/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class MoveablePoint implements Moveable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public String toString(){
        return null;
    }

    @Override
    public void moveUp() {
        System.out.println("Di chuyen len");
    }

    @Override
    public void moveDown() {
        System.out.println("Di chuyen xuong");
    }

    @Override
    public void moveLeft() {
        System.out.println("Di chuyen qua trai");
    }

    @Override
    public void moveRight() {
        System.out.println("Di chuyen qua phai");
    }
}
