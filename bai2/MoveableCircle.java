/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class MoveableCircle implements Moveable{
    private int radius;
    MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint moveablePoint) {
        this.radius = radius;
        this.center = center;
    }

    public String toString() {
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
